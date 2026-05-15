//6. Clase estudiante
public class Estudiante {
    String Nombre;
    String Matricula;
    String Carrera;
    String Semestre;

    //Constructor
    public Estudiante(String nombre, String matricula, String carrera, String semestre){
        setNombre(nombre);
        setMatricula(matricula);
        setCarrera(carrera);
        setSemestre(semestre);
    }

    //getters y setters
    public String getNombre(){
        return Nombre;
    }

    public String getMatricula(){
        return Matricula;
    }

    public String getCarrera(){
        return Carrera;
    }

    public String getSemestre(){
        return Semestre;
    }

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    public void setMatricula(String matricula){
        this.Matricula = matricula;
    }

    public void setCarrera(String carrera){
        this.Carrera = carrera;
    }

    public void setSemestre(String semestre){
        this.Semestre = semestre;
    }
}
