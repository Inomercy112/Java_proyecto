package Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Categoria {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    private String nombreCategoria;

    

}
