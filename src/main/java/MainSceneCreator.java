import draganddrop.DragAndDropFeature;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class MainSceneCreator {

    public Scene createMainScene (){
        SplitPane mainPane = new SplitPane();
        SplitPane rightPane = new SplitPane();
        rightPane.setOrientation(Orientation.VERTICAL);

        Text textField = new Text("drag");
        Label here = new Label("here");

        VBox target = new VBox(here, new TextArea("abc"));
        target.setFillWidth(true);
        DragAndDropFeature.addDragAndDropFeature(textField, target);
        target.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        HBox leftBox = new HBox( new VBox(textField), target);
        leftBox.setFillHeight(true);
        rightPane.getItems().addAll(new VBox(new Label("panel")), new TextArea("console"));
        mainPane.getItems().addAll(leftBox, rightPane);

        return new Scene(mainPane);
    }

}
