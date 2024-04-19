import mx.utng.s07.ListasTareas;
import mx.utng.s07.menu;
import mx.utng.s07.Lector;
public class App {
    public static void main(String[] args) throws Exception {
      menu Menu = new menu();
      Lector lector = new Lector();
      ListasTareas lista = new ListasTareas();

      byte opcionSeleccionada = 0;

      do {
        Menu.muestraOpciones();
        opcionSeleccionada = lector.leeOpcion();

        System.out.println("\n\nLa opcion seleccionada es: "+ opcionSeleccionada);
        //Santiago Ronaldo Chavez Piñon

        switch (opcionSeleccionada) {
            case 1: 
            lista.crearNuevaLista();
                
                break;
                case 2:
                lista.verListaTareas();
                break;
                case 3:
                lista.verTareasDeLista();
                break;
                case 4:
                lista.actualizarListaTareas();;
                break;
                case 5:
                lista.eliminarListaTareas();;
                break;
                case 6:
                System.out.println("Saliendo de la aplicacion....Bye Bye");
                break;
        
            default:
            System.out.println("Opcion desconocida");
                break;
        }
      } while (opcionSeleccionada != 6);
    }
}
