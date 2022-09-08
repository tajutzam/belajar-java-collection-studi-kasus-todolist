package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassTest {

    // colections , ini adalah class untuk static method
    @Test
    void testCollections(){

        List<String> names = new ArrayList<>();
        names.addAll(List.of("mohammad" , "tajut" , "zam" , "zami"));
        for(var name : names){
            System.out.println(name);
        }
        Collections.reverse(names);
        for(var name : names){
            System.out.println(name);
        }
    }
}
