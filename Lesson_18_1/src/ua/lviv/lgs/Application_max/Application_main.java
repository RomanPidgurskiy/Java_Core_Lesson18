package ua.lviv.lgs.Application_max;

public class Application_main {
	
	
public static void main(String[] args) {
	
	Map maps = new Map(20, 10);
	
	maps.add("_String",435);
	maps.add(23,33);
	maps.add(5.3,2.18);	
	maps.allMap();
	
	System.out.println("--RemoveKey --");
	maps.removeKey(5.3);
	maps.allMap();
	System.out.println("--setKeys --");
	maps.setKeys();
	System.out.println("--listValue --");
	maps.listValue();
	
	
}

}
