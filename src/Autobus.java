public class Autobus extends Vehiculos {
    
    //Atributos adicionales para Autobus
    private int capacidadPasajeros;
    private boolean tieneBaño;
    private String aireAcondicionado;

    //Constructores
    public Autobus(String marca, String modelo, int año, int capacidadPasajeros, boolean tieneBaño, String aireAcondicionado){
        super(marca, modelo, año);
        setCapacidadPasajeros(capacidadPasajeros);
        setTieneBaño(tieneBaño);
        setAireAcondicionado(aireAcondicionado);
    }

    public Autobus(){
        setCapacidadPasajeros(0);
        setTieneBaño(false);
        setAireAcondicionado("");
    }

    //Getters y Setters
    public int getCapacidadPasajeros(){
        return capacidadPasajeros;
    }

    public boolean getTieneBaño(){
        return tieneBaño;
    }

    public String getAireAcondicionado(){
        return aireAcondicionado;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros){
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setTieneBaño(boolean tieneBaño){
        this.tieneBaño = tieneBaño;
    }

    public void setAireAcondicionado(String aireAcondicionado){
        this.aireAcondicionado = aireAcondicionado;
    }

    //Metodo para mostrar los datos del autobus, incluyendo los datos heredados de Vehiculos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Capacidad de pasajeros: " + getCapacidadPasajeros());
        System.out.println("Tiene baño: " + (getTieneBaño() ? "Sí" : "No"));
        System.out.println("Aire acondicionado: " + getAireAcondicionado());
    }
}
