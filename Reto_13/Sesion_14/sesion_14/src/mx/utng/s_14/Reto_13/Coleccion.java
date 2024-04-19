package mx.utng.s_14.Reto_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Santiago Ronaldo Chavez Pinon
 * @category GDS0622
 * @since 10-02-2024
 */


public class Coleccion {
    public static void main(String[] args) {
        List<String> listafrutas = new ArrayList<>();
        System.out.println(listafrutas.isEmpty());

        listafrutas.add("Platanos");
        listafrutas.add("Sandia");
        listafrutas.add("Pera");
        listafrutas.add("Manzana");
        listafrutas.add("Naranja");
        listafrutas.add("Kiwi");

      System.out.println("=======Orden invertido=======");
      Collections.reverse(listafrutas);
      System.out.println(listafrutas);

      System.out.println("=======Orden alfabetico=======");
      Collections.sort(listafrutas);
      System.out.println(listafrutas);

      System.out.println("=======Lista aleatoria=======");
      Collections.shuffle(listafrutas);
      System.out.println(listafrutas);

      System.out.println("=======Buscar Pera y Naranja=======");
      Collections.sort(listafrutas);
      System.out.println(Collections.binarySearch(listafrutas, "Pera"));
      int indice = Collections.binarySearch(listafrutas, "Pera");
      int indice1 = Collections.binarySearch(listafrutas, "Naranja");
      if(indice >= 0 && indice1 >=0){
        System.out.println("Existe Pera en"+(indice+1));
        System.out.println("Y tambien existe Naranja"+(indice1+1));

      }else{
        System.out.println("No existe");
      }

      System.out.println("=======Agrega tres manzanas nuevas=======");
      Collections.addAll(listafrutas, "Manzana", "Manzana", "Manzana");
      for(String string : listafrutas){
      System.out.println(string);

      }

      System.out.println("=======Contar Manzana=======");
      System.out.println(Collections.frequency(listafrutas, "Manzana"));


      System.out.println("=========Elemento mas grande========");
      System.out.println(Collections.max(listafrutas));

      System.out.println("=========Elemento mas chico========");
      System.out.println(Collections.min(listafrutas));


    }
    
}
