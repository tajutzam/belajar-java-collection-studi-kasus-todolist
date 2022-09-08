package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MapTest {

    // map sama dengan array cuma key nya bebas
    // implementasi map , Hashmap , weakhashmap , identityhashmap , LinkedHashmap , enumHashMap

    @Test
    void testHashMap(){
        // hashmap , distribusi key nya menggunakan hashcode , pastikan ketika membuat class buat hashcode nya
        // agar distribusi map optimal
        // di hashmap pengecekan data dyplikcat menggunakan equals
        Map<Integer , Integer> number = new HashMap<>();
        for(var i = 1 ; i <= 10 ; i++){
            number.put(i , i); // insert or update ,
        }

        // untuk mengambilnya gunakan get (key)
        for(var i =1 ; i<=number.size(); i++){
            System.out.println(number.get(i));
        }

    }

    @Test
    void testWeakHashmap(){
        // weakhashmap sama dengan hashmap , namun wakhashmap akan menghapus data yang tidak digunakan secara otomatis

        Map<Integer , Integer > number = new WeakHashMap<>();
        for(var i =0 ; i < 1000 ; i++){
            number.put(i , i);
        }
        System.gc(); // run garbage collector
        System.out.println(number.size()); // data tidak lagi 1000 , karena sudah dihapus karena menggunakan weakhashmap
    }

    @Test
    void testIDentityHashmap(){
        // sama dengan hashmap , pengecekan data bukan menggunakan equals namun ==
        // jika lokasi memori berbeda maka dia di anggap berbeda
        String key1 = "first.name";
        String name ="name";
        String dot=".";
        String first ="first";
        String key2 = first+dot+name;

        Map<String , String> identity = new IdentityHashMap<>();
        identity.put(key1 ,"mohammad");
        identity.put(key2 , "mohammad");

        System.out.println(identity.get(key1) == identity.get(key2));
    }

    @Test
    void immutableMap(){

        Map<String, String> name = new HashMap<>();
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(name); // modif ke immutable
        Map<String, String> singleTon = Collections.singletonMap("one" , "one");
        Map<String, String> emptyMap = Collections.emptyMap();

    }
}
