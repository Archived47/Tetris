import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

    @Override
    public void start(Stage primaryStage) {
        PlayField pane = new PlayField();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("JezzBall");

        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            (pane).running = false;
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
