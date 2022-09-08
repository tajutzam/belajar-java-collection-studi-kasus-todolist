package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    // algoritma pengurutan , dijava sudah ada
    // sort , ini dilakukan secara sequential

    @Test
    void testSorting(){
        // algoritma pengurutan ,
        // sort hanya untuk list ,
        // kenapa ? karena set deque dan map itu sudah ada implementasinya untuk sorted

        List<String> list = new ArrayList<>();
        list.addAll(List.of("list 2" , "list 1 " , "list 3 ", "list 4" , "list 5"));
        // akan di sort ,
        Collections.sort(list);
        list.forEach(System.out::println);
    }
    @Test
    void testSortWithComparator(){
        Comparator<String> refrese = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        List<String> list = new ArrayList<>();
        list.addAll(List.of("list 2" , "list 1 " , "list 3 ", "list 4" , "list 5"));
        Collections.sort(list, refrese);
        list.forEach(System.out::println);
    }

    @Test
    void binarySearchTest(){
        List<Integer> list = new ArrayList<>();

        for(var i =0 ; i<1000; i++){
            list.add(i);
        }
        // untuk menggunakan binarySeacrh , harus data terurut binary search mencari data dengan metode memotong
        int indek = Collections.binarySearch(list, 500);
        System.out.println(list.get(indek));
    }
}
