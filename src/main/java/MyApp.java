import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApp extends Application {

    private MainSceneCreator mainSceneCreator = new MainSceneCreator();

    public void start(Stage stage) throws Exception {
        Scene mainScene = mainSceneCreator.createMainScene();
        stage.setTitle("my app");
        stage.show();
        stage.setScene(mainScene);
        stage.setMaximized(true);
    }


}
