package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapTest {

    // turunan sorted map , cuma disini kita punya akses seperti navigable set

    @Test
    void maptest(){
        NavigableMap<String , String> map = new TreeMap<>();
        map.put("zam" , "zam");
        map.put("dev" , "dev");
        map.put("eko" , "eko");
        map.put("ek1o" , "ek1o");

        for(var key : map.keySet()){
            System.out.println(key);
        }
        // di navigable ada berbagai method untuk memudahkan cari data bandingkan data
        // misal .
        String eko = map.floorKey("dev"); // dibawah nya
        System.out.println(eko);

        Map.Entry<String, String> eko1 = map.ceilingEntry("dev"); // get key ,dalam bentuk entry
        System.out.println("key : " + eko1.getKey());

        String key = map.ceilingKey("eko");
        System.out.println(key); // get . key dalam bentuk string

        SortedMap<String , String > sorted = map.headMap("eko" , true); // ambil data dari head sampe value
        sorted.forEach((s, s2) -> {
            System.out.println("value "+ s2);
        });
//        for(var sort : sorted.keySet()){
//            System.out.println(sort);
//        }

        Map.Entry<String, String> stringStringEntry = map.firstEntry();
        Map.Entry<String, String> lastEntry = map.lastEntry();
        // isi data map , key = value
        System.out.println(stringStringEntry);
        System.out.println(lastEntry);
        Map.Entry<String, String> higherEntry = map.higherEntry("eko"); // yang ada dibawah key ,
        System.out.println(higherEntry.getValue());
        String lowerKey = map.lowerKey("eko"); // mencari data di atas nya
        System.out.println(lowerKey);

    }
}
