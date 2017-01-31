/**
 * Created by Mr Grimu on 11/01/2017.
 */
public class ThemeFactory {
    public static IThemeFactory getTheme(ThemeType type){

        switch (type){
            case Bleu:
                return new BlueTheme();
            case Noir:
                return new BlackTheme();
            default:
                return new BlackTheme();
        }
    }
}
