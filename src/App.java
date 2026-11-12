public class App {
    public static void main(String[] args) {

        double[] notasLuci = {7,9,8};
        double[] notasJuan = {7,7,7};

        Alumno a1 = new Alumno("Luci",18,notasLuci);
        Alumno a2 = new Alumno("Juan",20,notasJuan);

        Curso algoritmo = new Curso("Algoritmos y Estructuras de Datos I");

        algoritmo.alumnos.add(a1);
        algoritmo.alumnos.add(a2);
        
        

        algoritmo.mostarAlumnos();

        System.out.println(algoritmo.alumnos.size());

        
    }
}
