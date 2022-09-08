package zam.dev.Belajarjavacollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    // tumpukan // stack

    // add tambah data
    // offer tambah data tapi tidak error jika data penuh tapi false
    // remove ambil data urutan pertama dan hapus jika data tidak ada maka dia akan trow error
    // poll jika data tidak ada maka dia
    // implementasi
    // arrayDeque(menggunakan array) , LinkedLinkList(node) , PriorityQueue(diurutkan menggunakan comparator)
    @Test
    void testQueue(){
        Queue<String> stack = new ArrayDeque<>();
        // kapasitas 10 , jika kapasitas abis maka akan grow / perbesar kapasitas
        Queue<String> priorityQueue = new PriorityQueue<>();
        // urut sesuai dengan sort
        stack.offer("zam satu");
        stack.offer("zam dua");
        stack.offer("zam tiga");

        // artinya zam satu akan keluar terlbih dahulu
        for(var name = stack.poll(); name != null ; name = stack.poll()){
            System.out.println(name);
        }
        System.out.println(stack.size());
    }
}
