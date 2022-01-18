package day30_ShortVideoPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 50, 150, 10, 20, 30, 40, 50, 60, 70 ));

        System.out.println(numbers);//before Coll.sort() [100,200,50,150,10,20,30,40,50,60,70]
        Collections.sort(numbers);
        System.out.println(numbers);//after Coll.sort()[10,20,30,40,50,60,70,100,150,200]

        System.out.println("==================================================================");

        Integer max = Collections.max(numbers); // return type is integer & reassigned to integer
        System.out.println("max = " + max); // output max = 200

        System.out.println("===================================================================");

        Integer min = Collections.min(numbers); // return type is integer & reassigned to integer
        System.out.println("min = " + min); // output max = 200

        System.out.println("==================================================================");

        Collections.reverse(numbers);
        System.out.println(numbers); //200,150,100,70,60,50,50,40,30,20,10

        System.out.println("=====================================================================");

        Collections.swap(numbers, 1, 2); // give the index number of element
        System.out.println(numbers);

       Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers);

        System.out.println("========================================================================");

        int count = Collections.frequency(numbers, 50);
        System.out.println(count);


    }
}
/*
       Collection: Utility class of the Collection.
                   presented in "java.util" package

       methods:
              sort(list): sorts the list in ascending order
              max(list):  returns the max number
              min(list):  returns the min number
              reverse(list) reverse the list
              swap(list, index1, index2): swaps the elements at the given indexes
              frequency(list, element): return the frequency of the elements from the list
 */