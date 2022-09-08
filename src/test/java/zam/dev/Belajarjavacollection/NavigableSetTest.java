package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class NavigableSetTest {

    @Test
    void navigabelSetTest(){
        // adalah turunan dari set , dan disini kita disediakan mencari lebih besar dari kurang dari atau membalikan
        // bisa dilakukan disini

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Mohammad tajut" , "zam zami" , "safira putri"));

        // decending set
        NavigableSet<String> descendingSet = names.descendingSet();
        for(var name : descendingSet){
            System.out.println(name);
        }
        Iterator<String> iterator = names.descendingIterator();
        // lambda foreach
        iterator.forEachRemaining(System.out::println);
        var headSh = names.headSet("zam zami" , true);
        // misal , data 1 , 2 ,3 ,4 ,5
        // menggunakan headshet akan mengambil misal headhshet (4) akan ambil data 1 2 3 ,
        headSh.forEach(System.out::println);

    }

    @Test
    void imutableNavigableSet(){

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("zam" , "zami"));
        NavigableSet<String> unmodifiableNavigableSet = Collections.unmodifiableNavigableSet(names);
        unmodifiableNavigableSet.add("zam"); // error
    }
}
