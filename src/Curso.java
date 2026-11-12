import java.util.ArrayList;

public class Curso {
    private String nombreMateria;
    public ArrayList<Alumno> alumnos;
   

    public Curso(String nombreMateria){
        this.nombreMateria = nombreMateria;
        this.alumnos = new ArrayList<>();
        
    }

    public void mostarAlumnos(){
        System.out.println(nombreMateria);
        for(Alumno a : alumnos){
            System.out.println(a.getNombre());
        }
    }
    
}
