public class Main {
    public static void main(String[] args) {
        //Creo personajes
        Personaje personaje1 = new Personaje("Tronchatoro");
        Personaje personaje2 = new Personaje("Pepe Grillo");
        Personaje personaje3 = new Personaje("Esperancita");

        JuegoPersonajes juego1 = new JuegoPersonajes();

        //Agrego personajes al juego
        juego1.addPersonaje(personaje1);
        juego1.addPersonaje(personaje2);
        juego1.addPersonaje(personaje3);


        //jugar


        System.out.println( juego1.jugar(personaje1) ?"Ha ganado!!!":"Perdio :(");


    }
}