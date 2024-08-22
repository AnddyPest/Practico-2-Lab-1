package practico.pkg2.lab.pkg1;

<<<<<<< HEAD
public class Reloj {
    
=======
public final class Reloj {

>>>>>>> beb8cacc24f36233ee3a86a464fb0a21be81d19f
    String dia;
    String mes;
    String hora;
    String modelo;
    long numSerie;

    public Reloj(String dia,String hora,String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public void incrementarDia() {
        
    }
    
    public void incrementarHora() {
        
    }
    
    public void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n");
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", numSerie=" + numSerie + '}';
    }
    
    
}
