package Singleton;

import lombok.*;

//uso de lombok
@Data
@Builder
@AllArgsConstructor


public class Libro {
    private String nombre;
    private String autor;



    public String toString(){
        return "\nAutor: "+autor +"    Nombre: " +nombre;
    }
}
