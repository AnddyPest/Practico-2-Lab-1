package practico.pkg2.lab.pkg1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Reloj {


    String dia;
    
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
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(dia,patron);
        fecha = fecha.plusDays(1);
        dia = fecha.format(patron);
        System.out.println("Se incremento el dia");
    }
    
    public void incrementarHora() {
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(this.hora,patron);
        hora = hora.plusHours(1);
        this.hora = hora.format(patron);
        System.out.println("Se incremento una hora al reloj");
    }
    
    public void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n");
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", numSerie=" + numSerie + '}';
    }
    
    
}
