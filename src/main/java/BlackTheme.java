import javafx.scene.control.Button;

/**
 * Created by Mr Grimu on 04/01/2017.
 */
public class BlackTheme  implements IThemeFactory  {

    public Button getButton() {
        return new RedBorderButton(new AlertButton(new BlackButton())).createButton();
    }
    public String toString(){
        return "Black theme";
    }
}
