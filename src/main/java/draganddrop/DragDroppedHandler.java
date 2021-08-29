package draganddrop;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class DragDroppedHandler implements EventHandler<DragEvent> {
    private VBox target;


    private Node source;

    public DragDroppedHandler(VBox target, Node source) {
        this.target = target;
        this.source = source;
    }

    @Override
    public void handle(DragEvent event) {
        target.getChildren().add(source);
        target.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        event.setDropCompleted(true);
        event.consume();
    }
}
