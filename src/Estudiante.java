//6. Clase estudiante
public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private String semestre;

    //Constructor
    public Estudiante(String nombre, String matricula, String carrera, String semestre){
        setNombre(nombre);
        setMatricula(matricula);
        setCarrera(carrera);
        setSemestre(semestre);
    }

    //getters y setters
    public String getNombre(){
        return nombre;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getCarrera(){
        return carrera;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

}
