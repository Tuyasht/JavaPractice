package day30_ShortVideoPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {


        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8) );
      /*
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) < 5 ){
                list.remove(i);
            }
        }

        System.out.println(list);// output 1,2,3,4,5,5,6,6,7,7,8,8
      */
//removeIf(Predicate):  removes all the elements from the ArrayList that are matching with the given predicate condition

        list.removeIf(each -> each < 5);

        System.out.println(list); // output [ 5,5,6,6,7,7,8,8]


        System.out.println("===========================================================================");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java", "Python", "C#", "JavaScript", "Junit", "JQuery", "C++","Ruby"));

        names.removeIf(p-> p.startsWith("J") );

        System.out.println(names);

    }
}
