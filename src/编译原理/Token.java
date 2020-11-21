package ±‡“Î‘≠¿Ì;

import java.io.LineNumberInputStream;

public abstract class Token {
	
	private int lineNumber;
	private static final String EOL = "\\n";
	public Token(int line) {
		lineNumber = line;
	}

	public static final Token EOF = new Token(-1) {};
	
}
