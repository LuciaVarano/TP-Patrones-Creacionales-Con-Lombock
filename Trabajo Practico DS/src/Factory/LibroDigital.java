package Factory;

import lombok.*;

//uso de lombok

@Builder
@NoArgsConstructor
@AllArgsConstructor


public class LibroDigital extends Libro{
        private String nombre;
        private String autor;

        @Override
        public String LogisticaLibro() {
            return "Libro Digital - " +nombre + " de " +autor;
        }

    }
