package Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private short id;

    private String NombreMascota;

    private LocalDate FechaNacimientoMascota;

    private short PesoKg;

    private String Antecedentes;

    private short dueño;

    private byte Tipo;

    private byte Tamaño;

    private byte Estado;



}
