package zam.dev.Belajarjavacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	private Collection<String> names = new ArrayList<>();
	
	@Test
	void testCollection() {
		
		/* collection , ini adalah parent dari semua collection , iterable 
		 * digunakan untuk for each , sedangkan collection ini kontrak untuk memanipulasi data array
		 * seperti menambah menghapus dan lain2 
		 * tidak hanya collection , nanti collection akan di pecah menjadi list set dan queue
		*/
	}
	
	@Test
	void menambahData() {
		names.add("Mohammad Tajut Zam Zami");
		names.addAll(List.of("Zam " , " Dev"));
	}
	
	@Test
	void showData(){
		names.add("Mohammad Tajut Zam Zami");
		for(var name : names) {
			System.out.println(name);
		}
		System.out.println(names.contains("Mohammad Tajut Zam Zami"));
	}
}
