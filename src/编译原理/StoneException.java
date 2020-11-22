package ±‡“Î‘≠¿Ì;

//import stone.ast.ASTree;

public class StoneException extends RuntimeException {

	//String msg;

	public StoneException(String msg) {
		super(msg);
		
	}
	public StoneException(String msg,ASTree t) {
		super(msg+" "+t.location());
	}
	
	
}
