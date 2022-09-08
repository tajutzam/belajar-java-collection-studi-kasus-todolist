package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    // turunan dari set , namun elemen2 di sorted set akan di urutkan sesuai dengan kemauan kita
    // jika element turunan dari comparable maka akan diurutkan sesuai comparable tersebbut

    @Test
    void testWithComparator(){

        SortedSet<Data> data = new TreeSet<>(new DataComparator().reversed()); // with comparator .reverse untuk membaliknaya
        // sorted bisa di sorting ketika hanya implement comparator
        data.add(new Data("a"));
        data.add(new Data("b"));
        data.add(new Data("z"));
        data.add(new Data("x"));
        for (var datas : data){
            System.out.println(datas.getName());
        }
    }

    @Test
    void imutableSortedSet(){

        SortedSet<Data> data = new TreeSet<>(new DataComparator());
        SortedSet<Data> dataSortedSet = Collections.unmodifiableSortedSet(data); // immutable

    }

}
