import java.util.ArrayList;
//on n'herite pas de classe singleton
public abstract class Planet extends Astre implements IOrbitable {
    private String nom;
    private  ArrayList<Satellite>listeDeSat= new ArrayList<Satellite>(); //ttes les planetes avec staticont meme nom de satelitte

//constructeur sert pour les enfants
    public Planet(String nom) {
        super();
        this.nom=nom;
    }

    public ArrayList<Satellite> getListeDeSat() {
        return listeDeSat;
    }
}
