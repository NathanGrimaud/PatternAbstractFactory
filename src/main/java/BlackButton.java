/**
 * Created by Mr Grimu on 04/01/2017.
 */
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;


public class BlackButton implements IButtonFactory {
    public Button createButton() {
        Button btn = new Button();
        btn.setBackground(new Background(new BackgroundFill(
                Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        return btn;
    }
}
