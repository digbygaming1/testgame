import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LifeQuest");

        Label statusLabel = new Label("Character Status: \nName: Alex\nAge: 0\nEducation: None\nCareer: None\nRelationship Status: Single\nFinancial Status: $0\nHappiness: 50\nHealth: Healthy");
        Label eventsLabel = new Label("Recent Events: \nYear 1: Another year has passed.");

        ComboBox<String> decisionBox = new ComboBox<>();
        decisionBox.getItems().addAll("Hobbies", "School", "Higher Education", "Work", "Career Advancement", "Start Family", "Retirement", "Travel");
        decisionBox.setValue("Hobbies");

        Button submitButton = new Button("Submit Decision");
        submitButton.setOnAction(e -> {
            String decision = decisionBox.getValue();
            eventsLabel.setText("You chose: " + decision);
        });

        Button newLifeButton = new Button("Embrace a New Beginning");
        newLifeButton.setOnAction(e -> {
            statusLabel.setText("Character Status: \nName: Alex\nAge: 0\nEducation: None\nCareer: None\nRelationship Status: Single\nFinancial Status: $0\nHappiness: 50\nHealth: Healthy");
            eventsLabel.setText("Recent Events: \nYear 1: Another year has passed.");
        });

        VBox vbox = new VBox(statusLabel, eventsLabel, decisionBox, submitButton, newLifeButton);
        vbox.setSpacing(10);
        vbox.setStyle("-fx-padding: 10; -fx-background-color: #2e2e2e; -fx-text-fill: white;");

        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
