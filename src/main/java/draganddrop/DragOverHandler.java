package draganddrop;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class DragOverHandler implements EventHandler<DragEvent> {

    private VBox target;

    public DragOverHandler(VBox target) {
        this.target = target;
    }

    @Override
    public void handle(DragEvent event) {
        if (event.getGestureSource() != target ) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }
}
