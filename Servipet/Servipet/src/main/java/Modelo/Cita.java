package Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.*;
@Entity
public class Cita {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    private String razon;

    private String diagnostico;

    private LocalDate fecha ;

    private LocalTime hora;

    private short quienAsiste;

    private long DocumentoAsiste;

    private short QuienAtiende;

    private short MascotaAsiste;

    private byte estadoCita;

    private byte estado;



}
