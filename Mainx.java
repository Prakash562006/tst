import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click Me!");
        btn.setOnAction(e -> btn.setText("Hello from JavaFX!"));

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Simple JavaFX App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
