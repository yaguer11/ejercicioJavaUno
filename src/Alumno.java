public class Alumno {
    private String nombre;
    private int edad;
    private double[] notas;


    public Alumno(String nombre, int edad, double[] notas){
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void notas(){
        for(int i=0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }


    public double promedio(){
          double prom = 0;
          for(double n : notas){
            prom = prom + n;
          }
          return prom/notas.length;
    }
        
    

    
}
