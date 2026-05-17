public class Carro extends Vehiculo {

    //Atributos adicionales para Carro
    private int puertas;
    private String combustible;


    //Constructores
    public Carro(String marca, String modelo, int año, int puertas, String combustible){
        super(marca, modelo, año);
        setPuertas(puertas);
        setCombustible(combustible);
    }

    public Carro(){
        super();
        setPuertas(0);
        setCombustible("");
    }

    //Getters y Setters
    public int getPuertas(){
        return puertas;
    }

    public String getCombustible(){
        return combustible;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public void setCombustible(String combustible){
        this.combustible = combustible;
    }

    //Metodo para mostrar los datos del carro, incluyendo los datos heredados de Vehiculos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Puertas: " + getPuertas());
        System.out.println("Combustible: " + getCombustible());
    }
}
