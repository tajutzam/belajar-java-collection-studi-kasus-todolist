package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SortedMapTest {


    // data key nya diurutkan , gunakan treemap
    @Test
    void sortedMapTest(){
        Map<Integer , Data > sortMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // sorted key , berdasarkan comparator
            }
        });
        sortMap.put(2 , new Data("zam"));
        sortMap.put(1 , new Data("oke"));
        for(var key : sortMap.keySet()){
            System.out.println(key);
        }
        SortedMap<Integer ,String> mutable = new TreeMap<>();
        mutable.put(1 , "zam") ;
        SortedMap<Integer,String> imutable = Collections.unmodifiableSortedMap(mutable); // tidak boleh ada comparator
    }
}
