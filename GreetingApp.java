import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreetingApp extends Application {

    @Override
    public void start(Stage stage) {
        TextField nameBox = new TextField();
        nameBox.setPromptText("Enter your name");
        Label messageLabel = new Label("Enter your name");
        Button greetButton = new Button("Greet");

        greetButton.setOnAction(e -> messageLabel.setText("Hello, " + nameBox.getText() + "!"));

        VBox root = new VBox(10);
        root.getChildren().addAll(nameBox, greetButton, messageLabel);
        stage.setScene(new Scene(root, 400, 250));
        stage.setTitle("Greeting Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
