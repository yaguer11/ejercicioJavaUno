public class Alumno {
    private String nombre;
    private int edad;
    private double[] notas;


    public Alumno(String nombre, int edad, double nota1, double nota2, double nota3){
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new double[] { nota1, nota2, nota3};
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void notas(){
        for(int i=0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }

    
}
