import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class MainSceneCreator {

    public Scene createMainScene (){
        SplitPane mainPane = new SplitPane();
        SplitPane rightPane = new SplitPane();
        rightPane.setOrientation(Orientation.VERTICAL);

        VBox leftBox = new VBox(new Label("left pane"));
        rightPane.getItems().addAll(new VBox(new Label("panel")), new TextArea("console"));
        mainPane.getItems().addAll(leftBox, rightPane);

        return new Scene(mainPane);
    }

}
