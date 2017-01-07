package contactus.core.update;

import contactus.core.Data;
import contactus.domain.Message;
import javafx.application.Platform;

import java.util.Collections;

public class AddMessage implements Update {
    private final Message message;

    public AddMessage(Message message) {
        this.message = message;
    }

    @Override
    public void accept(Data data) {
        Platform.runLater(() -> {
            data.addMessages(Collections.singletonList(message));
            data.updateLastIncomingMessages(Collections.singleton(message.getUserId()));
        });
    }
}
