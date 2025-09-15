package Prototype;
import lombok.*;


//uso de lombok
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

 public class Prestamo implements Cloneable {
    private String Libro;
    private String Nombre;
    private String FechaInicio;
    private String FechaFin;


    @Override
    public Prestamo clone(){
        try{
            return (Prestamo) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public void Mostrar(){
        System.out.println("Prestamo de: "+Nombre+ "\nlibro del prestamo: "+Libro+ "\nFecha inicial del prestamo: "+FechaInicio+ "\nFecha fin del prestamo: " +FechaFin);
    }
}
