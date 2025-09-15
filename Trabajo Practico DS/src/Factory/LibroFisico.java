package Factory;

import lombok.*;

//uso de lombok
@Builder
@NoArgsConstructor
@AllArgsConstructor



public class LibroFisico extends Libro {
    private String nombre;
    private String autor;


    @Override
    public String LogisticaLibro() {
        return "Libro Físico - " +nombre + " de " +autor;
    }
}
