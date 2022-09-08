package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.List;

public class KonversiToArray {

    @Test
    void toArrayTest(){

        List<String> zam = List.of("mohammad" , "zam", "zami", "programer", "zaman", "now");
        String names [] = zam.toArray(new String[]{});
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
