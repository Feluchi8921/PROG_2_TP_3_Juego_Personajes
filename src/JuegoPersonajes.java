import java.util.ArrayList;

public class JuegoPersonajes {

    //Atributos
    public ArrayList<Personaje> personajes = new ArrayList<>();

    //Constructor

    public JuegoPersonajes() {
    }

    //Metodos

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

   //jugar
    public boolean jugar(Personaje personajeSeleccionado){

       //Creo un rival
       Personaje rival= new Personaje("Rival");
       rival.getNivel();

       //Comparto los rivales
        if(personajeSeleccionado.getFuerza()>rival.getFuerza()){
            return true;
        }
        return false;
    }

    public void addPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}
