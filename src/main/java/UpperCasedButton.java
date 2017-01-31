import javafx.scene.control.Button;

public class UpperCasedButton implements IButtonFactory {
    private  IButtonFactory _btn;
    public UpperCasedButton(IButtonFactory button){_btn = button;}
    public Button createButton() {
        Button button = _btn.createButton();
        button.setText(button.getText().toUpperCase());
        return button;
    }
}
