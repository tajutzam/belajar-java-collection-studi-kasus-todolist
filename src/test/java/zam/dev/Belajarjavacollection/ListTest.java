package zam.dev.Belajarjavacollection;

import java.util.*;

import org.junit.jupiter.api.Test;

public class ListTest {

	/*
	 * LIST boleh ada data duplikat , 
	 * list memiliki indek , 
	 * list berurut sesuai kita kapan memasukan data
	 * list sama dengan array , namun list bisa dinamic 
	 * list interface dan harus menggunakan turunana untuk membuat list
	 * 	- method method di list 
	 * 	- set(indek , value)
	 *  - get(indek) 
	 *  - add(indek , value)
	 *  - sort(comparator) 
	 *  - remove(indek) 
	 *  - addAll(list.of)
	 *  
	 *  implementasi  list
	 *  -array list -> isinya didalamnya ada sebuah array saat kita membuat array list ada sebuah array dengan kapasitas 10
	 *  
	 *  -linked list -> linked list , adalah implementasi list dari struktur data double linked list , data akan di simpan di dalam node
	 *  				dan ada next dan previous nya
	 *  
	 */
	
	@Test
	void testList() {
		
		List<String> names = new ArrayList<>();
//		List<String> names = new LinkedList<>();
		names.add("zam");
		names.add("mouse");
		names.add("tajut");
		
		for(var name : names) {
			System.out.println(name);
		}
		
		names.remove(2); /// tajut akan di hapus
		System.out.println("tajut dihapus");
		for(var name : names) {
			System.out.println(name);
		}
		System.out.println(names.get(1) + " dirubah");
		names.set(1, "cat");
		for(var name : names) {
			System.out.println(name);
		}
	}
	
	@Test
	void immutableList() {
		
		// immmutable list ini artin
		List<String> myName = new ArrayList<>();
		myName.add("zam");
		// empty list
		Collection<String> unmodifiableCollection = Collections.unmodifiableList(myName);
		for(var name : unmodifiableCollection){
			System.out.println(name);
		}
//		unmodifiableCollection.add("oke"); // error karena immutable
		List<String> elements  =List.of("zam"); // immutable

	}
	
	
}







