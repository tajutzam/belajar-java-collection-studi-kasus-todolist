package zam.dev.Belajarjavacollection;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private List<String> hobies = new ArrayList<>(); // akan error jika orang mereturn list ini

	public Person(){
		hobies.add("hobi saya");
	}
	public void showHobies(){
		for(var hobi : hobies){
			System.out.println(hobi);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobies() {
		return hobies;
	}

	
	
	
}
