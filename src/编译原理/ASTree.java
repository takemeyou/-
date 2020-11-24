package ±‡“Î‘≠¿Ì;

import java.util.Iterator;

public abstract class ASTree {

	public abstract ASTree child(int i);
	public abstract int numChildren();
	public abstract Iterator<ASTree> children();
	
	public String location() {
		
		return null;
	}
	public Iterator<ASTree> iterator(){
		return children();
	}
	public Object token() {
		
		return null;
	}
	
	
	
	

}
