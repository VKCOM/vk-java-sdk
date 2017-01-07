package contactus.core.update;

import contactus.core.Data;
import contactus.domain.Message;
import contactus.domain.MessageFlag;
import javafx.application.Platform;

import java.util.Collections;
import java.util.Set;

public class RemoveMessageFlags implements Update {
    private final long messageId;
    private final Set<MessageFlag> flags;
    private final long userId;

    public RemoveMessageFlags(long messageId, Set<MessageFlag> flags, long userId) {
        this.messageId = messageId;
        this.flags = flags;
        this.userId = userId;
    }

    @Override
    public void accept(Data data) {
        Platform.runLater(() -> {
            Message message = data.updateMessage(messageId, m -> Message.copyOf(m).removeFlags(flags).build());
            data.updateLastIncomingMessages(Collections.singleton(message.getUserId()));
        });
    }
}
