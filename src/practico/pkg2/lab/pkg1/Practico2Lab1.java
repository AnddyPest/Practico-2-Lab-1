
package practico.pkg2.lab.pkg1;


public class Practico2Lab1 {

    public static void main(String[] args) {

        
        
       Reloj Casio = new Reloj("12/12/2002","12:30","casio",122123);
       Reloj Rolex = new RelojFit("12/04/2003", "14:39", "Rolex", 0);
       Persona persona = new Persona( "fernando","lopez",22,1.78, Casio );
       
       
       persona.comer();
       persona.decirHora();
       persona.reloj.incrementarDia();
       persona.reloj.incrementarHora();
       persona.cambiarReloj(Rolex);
    }

}
