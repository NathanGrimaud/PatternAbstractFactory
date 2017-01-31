import javafx.scene.control.Button;

public class RedBorderButton implements IButtonFactory {
    private  IButtonFactory _btn;
    public RedBorderButton(IButtonFactory button){_btn = button;}
    public Button createButton() {
        Button button = _btn.createButton();
        button.setStyle(
                "-fx-border-color: red;-fx-border-width: 12px;"
        );
        return button;
    }
}
