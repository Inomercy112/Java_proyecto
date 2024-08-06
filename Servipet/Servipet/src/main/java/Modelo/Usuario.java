package Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)

    private short id ;

    private long Documento;

    private String NombreUsuario;

    private String CorreoUsuario;

    private LocalDate FechaNacimiento;

    private String Direccion;

    private int Telefono;

    private byte Rol;

    private byte Estado;

}
