import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by Mr Grimu on 04/01/2017.
 */
public enum ButtonType {
    Noir,
    Bleu;

    public static ObservableList toObservable() {
        ObservableList obs = FXCollections.observableArrayList();
        for (ButtonType type: ButtonType.values()){
            obs.add(type);
        }
        return obs;
    }
}
