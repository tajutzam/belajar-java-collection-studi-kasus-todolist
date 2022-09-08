package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

    //deque sama seperti qeue , tapi
    // di deque kamu bisa menentukan dari depan atau belakang

    @Test
    void testDeque(){
        // misal seperti orang yang menumpuk ulangan paling akhir , dia yang keluar
        Deque<String> ulangan = new ArrayDeque<>();
        ulangan.offer("zam");
        ulangan.offer("pira");

        for(var name = ulangan.pollLast() ; name!=null; name = ulangan.pollLast()){
            // pira keluar dlu
            System.out.println(name);
        }
    }
}
