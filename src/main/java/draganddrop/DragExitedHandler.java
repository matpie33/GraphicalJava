package draganddrop;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class DragExitedHandler implements EventHandler<DragEvent> {

    private VBox target;

    public DragExitedHandler(VBox target) {
        this.target = target;
    }

    @Override
    public void handle(DragEvent event) {
        target.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        event.consume();
    }
}
