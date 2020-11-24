package ±‡“Î‘≠¿Ì;

import java.util.List;

public class BinaryExpr extends ASTList{

	public BinaryExpr(List<ASTree> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}
	
	
	public ASTree left() {
		return child(0);
	}
	
	public String operator() {
		
		return ((Token) token()).getText();
	}
	private Object token() {
		// TODO Auto-generated method stub
		return null;
	}


	public ASTree right() {
		return child(2);
	}

}
