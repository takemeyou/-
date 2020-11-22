package ±‡“Î‘≠¿Ì;

public class IdToken extends Token {

	private String text;
	
	

	public IdToken(int line, String id) {
		super(line);
		text = id;
	}

	public boolean idIdentifier() {
		return true;
	}
	
	public String getText() {
		return text;
	}

}


