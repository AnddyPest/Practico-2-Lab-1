
package practico.pkg2.lab.pkg1;
import java.util.Random;
import java.util.Scanner;

public final class RelojFit extends Reloj {
    
    public RelojFit(String dia, String hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }
 
    
 public void cuentaPasos(){
    Random paso = new Random();
    String seguir;
    int pasos=0;
    int pasoPorSegundo = 1 + paso.nextInt(3);
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese el tiempo que desea correr (segundos)...");
    int j = leer.nextInt();
    leer.next();
    do{
    System.out.println("Correrá durante "+j+" segundos.");
        for(int i=1;i==j;i++) {
            pasos = pasos+(i*pasoPorSegundo);
        }
        System.out.println("Desea seguir corriendo? S/N");
        seguir = leer.nextLine();
            if(seguir.equalsIgnoreCase("s")){
                System.out.println("Cuanto tiempo desea añadir? (segundos)");
                j=leer.nextInt();
            }else{
                System.out.println("Muy bien hecho! El deporte es salud!");
            }
    }while(seguir.equalsIgnoreCase("s"));
    System.out.println("Has dado "+pasos+" pasos. Sigue así, mejorarás tu salud!");
     
 }
 
 public void frecuenciaAl(){
     Random frec = new Random();
     int frecuencia = 70 + frec.nextInt(121);
     System.out.println("La frecuencia cardíaca es de "+frecuencia+" pulsaciones por minuto.");
 }
    
}
