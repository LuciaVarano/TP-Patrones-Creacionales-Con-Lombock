
import Factory.FactoryLibro;
import Singleton.Database;
import Singleton.Libro;
import Builder.*;
import Prototype.*;
import Abstractfactory.*;



public class BibliotecaOnline {

    public static void main(String[] args) {
        System.out.println("-------------------------------EJERCICIO 1----------------------------------------");
        //EJERCICIO 1
        Database base1 = Database.getInstance();
        Database base2 = Database.getInstance();

        base1.agregarLibro(new Libro("El principito","nico"));
        base1.agregarLibro(new Libro("La princesita","lucia"));

        base2.getLibros();


        System.out.println("-------------------------------EJERCICIO 2----------------------------------------");
        //EJERCICIO 2

        Factory.Libro l1 = FactoryLibro.MostrarLibro("LibroFisico");
        Factory.Libro l2 = FactoryLibro.MostrarLibro("LibroDigital");

        System.out.println(l1.LogisticaLibro());
        System.out.println(l2.LogisticaLibro());

        /*tengo la clase Libro de la cual libro fisico y libro online heredan su metodo para
        mostrar que tipo de libro son (fisico o virtual)
        en la clase factorylibro creo y cargo los tipos de libros para despues poder mostrarlos
        en el main*/

        System.out.println("-------------------------------EJERCICIO 3----------------------------------------");
        //EJERCICIO 3
        AbstractFactory factory1 =new CreacionAdmin();

        InterfazUI interfaz1 =factory1.crearTipoUI();
        MetodoEnvio envio1 =factory1.CrearTipoEnvio();

        interfaz1.UsuarioInterfaz();
        envio1.Metodoenvio();


        AbstractFactory factory2 =new CreacionUsuario();

        InterfazUI interfaz2 =factory2.crearTipoUI();
        MetodoEnvio envio2 =factory2.CrearTipoEnvio();

        interfaz2.UsuarioInterfaz();
        envio2.Metodoenvio();

    /*tengo 2 fabricas unas para admins y otra para usuarios normales
      primero especifico que tipo de usuario voy a crear despues implementos los metodos
      de la interface para declarar el tipo de usuario y el tipo de envio
      en este caso (usuario-envio normal) y (admin-envio express)
      con la interzace abstractFactory controlo las otras 2 interfaces*/


        System.out.println("-----------------------------EJERCICIO 4------------------------------------------");
        //EJERCICIO 4
        Usuario usuario =new Usuario.Builder()
                .setMail("nico@gmail.com")
                .setNombre("nico")
                .setDireccion("humahuaca")
                .setTelefono(2616935851.0)
                .setNacimiento("8 de febrero")
                .build();
        usuario.mostrar();

        /*este metodo sirve para no crear objetos con todos sus atributos,sino con los que necesitemos
         en el momento,y para evitar trabajar con constructores tan grandes*/



        System.out.println("-----------------------------EJERCICIO 5------------------------------------------");
        //EJERCICIO 5
        Prestamo base = new Prestamo("caperusita roja","nico","1 de gosto;","29 de agosto");
        base.Mostrar();
        Prestamo copia = base.clone();
        copia.setNombre("PEPE");
        copia.Mostrar();

        //uso el metodo clonar y muestro la copia para verificar que funciona
    }
}