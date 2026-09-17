import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextToLabel extends Application {

    @Override
    public void start(Stage stage) {
        TextField textBox = new TextField();
        textBox.setPromptText("Enter some text");
        Label label = new Label();
        Button button = new Button("Move Text");

        button.setOnAction(e -> {
            label.setText(textBox.getText());
            textBox.clear();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(textBox, button, label);
        stage.setScene(new Scene(root, 400, 250));
        stage.setTitle("Text to Label");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
