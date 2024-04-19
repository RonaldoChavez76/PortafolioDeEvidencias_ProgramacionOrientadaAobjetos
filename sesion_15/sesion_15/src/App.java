import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       List<String> materias = new ArrayList<>();
       materias.add("POO");
       Collections.addAll(materias, "FSC", "BD", "MMDS","I","IR", "FM");
       System.out.println(materias);
       for(String materia : materias){
        System.out.println(materia);
       }

       Collections.reverse(materias);
       System.out.println(materias);

       System.out.println("Mas pequeña: "+Collections.min(materias));

       System.out.println("Mas grande: "+Collections.max(materias));

       Collections.sort(materias);
       System.out.println(materias);

       System.out.println("Metodologia y Modelado se encuentra en la posicion: "
       +(Collections.binarySearch(materias, "MMDS")+1));

       Collections.addAll(materias, "POO", "POO", "POO");
       System.out.println(materias);
       Collections.shuffle(materias);
       System.out.println(materias);
       System.out.println("Hay "+Collections.frequency(materias, "POO")+" POO en la lista");



       /*materias.add("Matematicas");
       materias.add("Ciencias Naturales");
       materias.add("Geografia");
       materias.add("Historia");*/

    }
}
