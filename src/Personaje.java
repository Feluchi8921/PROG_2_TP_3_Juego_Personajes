public class Personaje {
    //Atributos
    private String nombreReal;
    private String nombreSuperHeroe;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private int peso;
    private double altura;
    private int edad;
    private boolean heroe;
    private boolean villano;

    //Constantes
    public static final int NIVEL_FACIL=1;
    public static final int NIVEL_MEDIO=2;
    public static final int NIVEL_DIFICIL=3;

    //Constructor

    public Personaje(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
        getNivel();
    }

    //Getters and Setters

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isHeroe() {
        return heroe;
    }

    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    public boolean isVillano() {
        return villano;
    }

    public void setVillano(boolean villano) {
        this.villano = villano;
    }

    //Nivel
    public void getNivel(){
        int nivel = (int)(Math.random()*3+1);
        if(nivel==NIVEL_FACIL){
            setVisionNocturna(600);
            setVelocidad(700);
            setFuerza(600);
            setPeso(80);
            setAltura(1.71);
            setEdad(22);
        }
        if(nivel==NIVEL_MEDIO){
            setVelocidad(500);
            setFuerza(400);
            setPeso(30);
            setAltura(1.60);
            setEdad(30);
        }
        else if(nivel==NIVEL_DIFICIL){
            setVelocidad(300);
            setFuerza(600);
            setPeso(400);
            setAltura(1.50);
            setEdad(23);
        }
    }


}