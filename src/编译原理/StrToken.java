package ±‡“Î‘≠¿Ì;

public class StrToken extends Token {

	private String literal;
	
	public StrToken(int line,String str) {
		super(line);
		literal = str;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isString() {
		return true;
	}
	public String getText() {
		return literal;
	}

}
