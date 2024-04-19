package mx.utng.s_14.Ej_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Colecciones {
    public static void main(String[] args) {
        //uso de listas
        //Tipo de elemento
        List<String> listaCadenas = new ArrayList<>();
        System.out.println (listaCadenas.isEmpty());


        listaCadenas.add("Venado");
        listaCadenas.add("Cocodrilo");
        listaCadenas.add("Cocodrilo");
        listaCadenas.add("Pinguino");
        listaCadenas.add("Camaleon");
        listaCadenas.add("Conejo");

        //Imprime la lista con todos los elementos
        System.out.println(listaCadenas);
        //Imprima cada elemnto con un salto de linea
        System.out.println("========Fori=======");
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
            
        }

        System.out.println("========ForEach========");
        //Imprime la lista con un foreach
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
            
        }
        //Uso de un conjunto
        //No se repiten los datos
        Set<String> conjuntoCadenas = new HashSet<>();

        conjuntoCadenas.add("Venado");
        conjuntoCadenas.add("Cocodrilo");
        conjuntoCadenas.add("Cocodrilo");
        conjuntoCadenas.add("Pinguino");
        conjuntoCadenas.add("Camaleon");
        conjuntoCadenas.add("Conejo");
        System.out.println("========Mostrando un SET");
        for (String cadena: conjuntoCadenas) {
            System.out.println(cadena);
        }

        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("mil"));
        listaNumeros.add(new Numero("cien"));
        listaNumeros.add(new Numero("dos"));


        System.out.println("Lista de numeros===========");
        for (Numero cadena : listaNumeros) {
            System.out.println(cadena.getNombre());
            
        }

        Set<Numero> conjuntoNumeros = new HashSet<>();
        conjuntoNumeros.add(new Numero("uno"));
        conjuntoNumeros.add(new Numero("dos"));
        conjuntoNumeros.add(new Numero("tres"));
        conjuntoNumeros.add(new Numero("mil"));
        conjuntoNumeros.add(new Numero("cien"));
        conjuntoNumeros.add(new Numero("dos"));
        System.out.println("Set Numero============");
        for (Numero numero : conjuntoNumeros) {
            System.out.println(numero.getNombre());
            
        }



    }
    
}
