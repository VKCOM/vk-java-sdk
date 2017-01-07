package contactus.core.update;

import contactus.core.Data;
import contactus.domain.Message;
import contactus.domain.MessageFlag;
import javafx.application.Platform;

import java.util.Collections;
import java.util.Set;

public class SetMessageFlags implements Update {
    private final long messageId;
    private final Set<MessageFlag> flags;

    public SetMessageFlags(long messageId, Set<MessageFlag> flags) {
        this.messageId = messageId;
        this.flags = flags;
    }

    @Override
    public void accept(Data data) {
        Platform.runLater(() -> {
            Message message = data.updateMessage(messageId, m -> Message.copyOf(m).flags(flags).build());
            data.updateLastIncomingMessages(Collections.singleton(message.getUserId()));
        });
    }
}
