package ua.lviv.lgs.Application_max;

public class MyEntry<K,V> {
	
	K object_k;
	V object_v;
	
	public MyEntry(K object_k, V object_v) {
		super();
		this.object_k = object_k ;
		this.object_v = object_v ;
	}
	
	
	public K getObject_k() {
		return object_k;
	}
	public void setObject_k(K object_k) {
		this.object_k = object_k;
	}
	public V getObject_v() {
		return object_v;
	}
	public void setObject_v(V object_v) {
		this.object_v = object_v;
	}
	@Override
	public String toString() {
		return "MyEntry [object_k=" + object_k + ", object_v=" + object_v + "]";
	}
	
	

}
