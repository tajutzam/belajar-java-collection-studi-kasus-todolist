package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Spliterator;

public class SplititeratorTest {


    @Test
    void testSplit(){
        List<String> zam = List.of("mohammad" , "zam", "zami", "programer", "zaman", "now");
        Spliterator<String> spliterator = zam.spliterator(); // data dipecah menjadi 6 ,
        Spliterator<String> spliterator1 = spliterator.trySplit(); // data dipecah menjadi 3 , dan spliterato jadi 3

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator1.estimateSize());
    }

}
