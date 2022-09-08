package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethodTest {
    //default method ,
    @Test
    void testDefaultMethod(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i < 1000; i++) {
            numbers.add(i);
        }
        numbers.forEach(System.out::println); // default method iterator
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        });
        numbers.forEach(System.out::println);
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 !=0;
            }
        }

        );
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // default method map .
        // putifabsent , add jika data belum ada
    }
}
