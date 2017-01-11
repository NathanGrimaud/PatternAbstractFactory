import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * Created by Mr Grimu on 04/01/2017.
 */
public class BlueButton extends Button implements IButtonFactory {
    public Button createButton() {
        Button btn = new Button();
        btn.setBackground(new Background(new BackgroundFill(
                Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        return btn;
    }
    public String toString(){
        return "Blue";
    }
}
