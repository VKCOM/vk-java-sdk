package contactus.core.update;

import contactus.core.Data;
import contactus.domain.Message;
import javafx.application.Platform;

import java.util.Collections;

public class DeleteMessage implements Update {
    private final long messageId;

    public DeleteMessage(long messageId) {
        this.messageId = messageId;
    }

    @Override
    public void accept(Data data) {
        Platform.runLater(() -> {
            Message message = data.removeMessage(messageId);
            data.updateLastIncomingMessages(Collections.singleton(message.getUserId()));
        });
    }

}
