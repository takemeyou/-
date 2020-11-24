package ±‡“Î‘≠¿Ì;

public class Name extends ASTList{
	public Name(Token t) {
		super(t);
		
	}
	
	public String name() {
		return token().getText();
	}

	private Token token() {
		// TODO Auto-generated method stub
		return null;
	}
	
}