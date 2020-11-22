package ±‡“Î‘≠¿Ì;

import java.io.IOException;

public class ParseException extends Exception{
	
	public ParseException(Token t) {
		this("",t);
	}

	public ParseException(String string, Token t) {
		super("syntax error around"+location(t)+"."+string);
	}
	
	private static String location(Token t) {
		if(t==t.EOF) {
			return "the last line";
		}
		else {
			return "\""+t.getText()+"\"at line"+t.getLineNumber();
		}
	}
	
	
	public ParseException(IOException e) {
		super(e);
	}
	public ParseException(String msg) {
		super(msg);
	}
	

}
