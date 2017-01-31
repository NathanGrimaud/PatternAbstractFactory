import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class AlertButton implements IButtonFactory {

    private IButtonFactory _btn;
    public AlertButton(IButtonFactory parent){_btn = parent;}


    public Button createButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Decorator button");
        alert.setHeaderText("Important message");
        alert.setContentText("i'm here because of the decorator");
        alert.showAndWait();
        return _btn.createButton();
    }
}
