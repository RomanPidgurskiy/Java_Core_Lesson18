package ua.lviv.lgs.Application_min;

public class Integer {
	
	String str;
	
	public Integer(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str ="_String_getStr";
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Integer [str=" + str + ", getStr()=" + getStr() + "]";
	}

}
