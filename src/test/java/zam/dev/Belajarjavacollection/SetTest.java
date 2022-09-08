package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {
    // set adalah salah satu interface di java yang datanya tidak boleh duplicate
    // data akan hanya di terima satu
    // untuk mengambil data di set kita tidak boleh mengambil nya
    // kita harus melakukan implemntasi satu persatu
    // implementasi set
    //      - Hashset -> tidak menjadmin data terurut waktu kita menambahkan data
    //      - enumset // tidak dibahas
    //      - linked hashset -> menjadmin data terurut sesuai kita menambahkan data

    @Test
    void testSet(){
        // Set<String> names = new HashSet<>(); // data tidak dipastikan berurut
        Set<String> names = new LinkedHashSet<>(); // hasil berurut
        names.add("zam");
        names.add("pira");
        names.add("safira putri");
        names.add("zam");

        for(var name : names){
            System.out.println(name);
        }
    }
     @Test
    void immutableTest(){
        Set<String> mutable = new HashSet<>();
        Collection<String> unmodifiableSet = Collections.unmodifiableSet(mutable); // menjadikan immutable
        Set<String> emptySet = Collections.EMPTY_SET;
        Set<String> singleTonSet = Collections.singleton("Mohammad");
        Set<String> nameImutable = Set.of("zam" , "dev");
        for (var nm : nameImutable){
            System.out.println(nm);
        }
        for (var name : singleTonSet){
            System.out.println(name);
        }

     }
}
