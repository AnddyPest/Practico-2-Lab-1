
package practico.pkg2.lab.pkg1;
import java.util.Random;

public final class RelojFit extends Reloj {
    
    public RelojFit(String dia, String hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }
 
    
 public void cuentaPasos(int pasos){
    Random paso = new Random();
     System.out.println("Comienza a correr");
     
    int pasoPorSegundo = 1 + paso.nextInt(3);
     
     
 }
 
 public void frecuenciaAl(){
     Random frec = new Random();
     int frecuencia = 70 + frec.nextInt(121);
     System.out.println("La frecuencia cardíaca es de "+frecuencia+" pulsaciones por minuto.");
 }
    
}
