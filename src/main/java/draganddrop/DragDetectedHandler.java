package draganddrop;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.text.Text;

public class DragDetectedHandler implements EventHandler<MouseEvent> {
    private Node source;

    public DragDetectedHandler(Node source) {
        this.source = source;
    }

    @Override
    public void handle(MouseEvent event) {
        Dragboard db = source.startDragAndDrop(TransferMode.ANY);

        ClipboardContent content = new ClipboardContent();
        content.putString("content");
        db.setContent(content);

        event.consume();
    }
}
