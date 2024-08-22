package practico.pkg2.lab.pkg1;
import java.util.Scanner;
public class Persona {

    String nombre;
    String apellido;
    int edad;
    double altura;
    Reloj reloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void comer() {
        System.out.println(this.nombre+" "+this.apellido+" está comiendo.");
    }
    
    public void hablar() {
        Scanner hablar = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese que dirá "+this.nombre+" "+this.apellido+".");
        System.out.println(this.nombre+" "+this.apellido+" dice: "+hablar.nextLine());
    }
    
    public void decirHora() {
        System.out.println("La hora actual es: "+reloj.getHora());
    }
}
