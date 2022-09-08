package zam.dev.Belajarjavacollection;

import java.util.List;

import org.junit.jupiter.api.Test;

public class IterableIteratorTest {

	@Test
     void IterableTest() {
		
		// Iterable adalah parent dari semua collection / super interface 
		// iterable hanya mendukung untuk perulangan foreach 
		
	    // kode iterable
		Iterable<String> names = List.of("Mohammad" , "Tajut" , "zam zami");
		// kenapa bisa ? karena ada method namanya iterator , 
		
		for(var name : names) {
			System.out.println(name);
		}
	 }
}
