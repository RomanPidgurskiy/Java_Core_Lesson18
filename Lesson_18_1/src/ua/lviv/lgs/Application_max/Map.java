package ua.lviv.lgs.Application_max;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Map extends MyEntry {
	private HashMap map;
	
	public Map(Object object_k, Object object_v) {
		super(object_k, object_v);
		this.map = new HashMap();
	}
	
	public void add(Object object_k, Object object_v) {
		map.put(object_k, object_v);
	}
	
	public void removeKey (Object object_k) {
		map.remove(object_k);
	}
	
	public void removeValue (Object object_v) {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			if (next.getValue().equals(object_v)) {
				next.setValue(null);
			}
		}
	}
	
	public void setKeys () {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Key is "+next.getKey().toString());
		}
	}
	
	public void listValue () {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Value is "+next.getValue().toString());
		}
	}
	
	public void allMap () {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Key is "+next.getKey().toString()+" value is "+next.getValue().toString());
		}
	}

}
