package practico.pkg2.lab.pkg1;

public class Reloj {

    String dia;
    String hora;
    String modelo;
    long numSerie;

    public Reloj(String modelo, long numSerie) {
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
        
    }
}
