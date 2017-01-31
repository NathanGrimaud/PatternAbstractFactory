/**
 * Created by Mr Grimu on 11/01/2017.
 */
public class Singleton {

    private static Singleton _singleton;
    private void Singelton(){ }

    public static Singleton getInstance(){

        if(_singleton == null)
            _singleton = new Singleton();
        return _singleton;
    }
}
