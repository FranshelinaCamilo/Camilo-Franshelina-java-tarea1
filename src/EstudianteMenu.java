import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteMenu {
    
    //Metodo para registrar e imprimir estudiantes
    public static void registrarEstudiantes(Scanner sc){

        System.out.print("|> ¿Cuantos estudiantes desea registrar?: ");
        int cantEstudiantes = sc.nextInt();
        sc.nextLine(); 

        if(cantEstudiantes <= 0){
            System.out.println("|> Cantidad invalida.");
            return;
        }        

        //ArrayList de estudiantes para guardar su informacion
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>(cantEstudiantes);

        //Ciclo para registrar varios estudiantes
        for(int i = 0; i < cantEstudiantes; i++){

            System.out.print("|> Nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("|> Matricula del estudiante: ");
            String matricula = sc.nextLine();

            System.out.print("|> Carrera del estudiante: ");
            String carrera = sc.nextLine();

            System.out.print("|> Semestre del estudiante: ");
            String semestre = sc.nextLine();

            System.out.println();

            Estudiante est = new Estudiante(nombre, matricula, carrera, semestre);
            estudiantes.add(est);
        }
        imprimirDatos(estudiantes);
    }

    public static void imprimirDatos (ArrayList<Estudiante> estudiantes){
        //Imprime los datos alamcenados de los estudiantes 
        System.out.println("\n=========================================");
        System.out.println("         Estudiantes registrados");
        System.out.println("=========================================");
        for(Estudiante estudiante: estudiantes){
            System.out.println("Nombre: " + estudiante.getNombre()
                                + "\nMatricula: " + estudiante.getMatricula()
                                + "\nCarrera: " + estudiante.getCarrera()
                                + "\nSemestre: " + estudiante.getSemestre());
            System.out.println("-----------------------------------------");
        }
    }
    
}
