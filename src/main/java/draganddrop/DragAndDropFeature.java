package draganddrop;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DragAndDropFeature {


    public static void addDragAndDropFeature(Node source, VBox target){
        DragDetectedHandler dragDetectedHandler = new DragDetectedHandler(source);
        DragDroppedHandler dragDroppedHandler = new DragDroppedHandler(target, source);
        DragEnteredHandler dragEnteredHandler = new DragEnteredHandler(target);
        DragExitedHandler dragExitedHandler = new DragExitedHandler(target);
        DragOverHandler dragOverHandler = new DragOverHandler(target);

        source.setOnDragDetected(dragDetectedHandler);
        target.setOnDragDropped(dragDroppedHandler);
        target.setOnDragEntered(dragEnteredHandler);
        target.setOnDragExited(dragExitedHandler);
        target.setOnDragOver(dragOverHandler);
    }

}
