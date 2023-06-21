import java.util.ArrayList;

public class Soleil extends Astre {
    private static Soleil instance;
    public static ArrayList<Planet> listeDePlanet = new ArrayList<Planet>();

    private Soleil(){

    }
    public static Soleil getInstance()
    {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }
    public static void add(Planet planet)
    {
        Soleil.listeDePlanet.add(planet);
    }


    @Override
    public void Orbiter(Astre a) {

    }
}
