/**
 * Created by Mr Grimu on 04/01/2017.
 */

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class main extends Application {
    private ChoiceBox choice;
    private Button button;
    private final Group group = new Group();
    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(group, 1024, 576);
        this.choice = createChoiceBox();
        this.choice.setLayoutY(100);
        group.getChildren().add(choice);
        this.button = getDefaultTheme().getButton();

        group.getChildren().add(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {

        Singleton sing = Singleton.getInstance();
        System.out.println(sing == Singleton.getInstance());

        launch(args);
    }
    public IThemeFactory getDefaultTheme(){
        return new BlueTheme();
    }
    public ChoiceBox createChoiceBox(){
        ObservableList<IThemeFactory> obs = FXCollections.observableArrayList(
                new BlackTheme(),
                new BlueTheme()
        );
        final ChoiceBox choice = new ChoiceBox(obs);
        choice.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                group.getChildren().remove(button);
                IThemeFactory selectedTheme = (IThemeFactory) choice.getValue();
                button = selectedTheme.getButton();
                group.getChildren().add(button);
            }
        });
        return choice;
    }
}