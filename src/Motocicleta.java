public class Motocicleta extends Vehiculos {

    //Atributos adicionales para Motocicleta
    private String cilindrada;
    private boolean deportiva;

    //Constructores
    public Motocicleta(String marca, String modelo, int año, String cilindrada, boolean deportiva){
        super(marca, modelo, año);
        setCilindrada(cilindrada);
        setDeportiva(deportiva);
    }

    public Motocicleta(){
        setCilindrada("");
        setDeportiva(false);
    }

    //Getters y Setters
    public String getCilindrada(){
        return cilindrada;
    }

    public boolean getDeportiva(){
        return deportiva;
    }

    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setDeportiva(boolean deportiva){
        this.deportiva = deportiva;
    }

    //Metodo para mostrar los datos de la motocicleta, incluyendo los datos heredados de Vehiculos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println("Deportiva: " + (getDeportiva() ? "Sí" : "No"));
    }
}
