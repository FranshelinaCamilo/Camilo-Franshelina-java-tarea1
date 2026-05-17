/// 8. Herencia de Vehiculos

public class Vehiculo {
    //Atributos 
    private String marca;
    private String modelo;
    private int año;

    //Constructores
    public Vehiculo(String marca, String modelo, int año){
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
    }

    public Vehiculo(){
        setMarca("");
        setModelo("");
        setAño(0);
    }

    //Getters y Setters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAño(){
        return año;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAño(int año){
        this.año = año;
    }

    //Metodo para mostrar los datos del vehículo
    public void mostrarDatos(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
    }
}
