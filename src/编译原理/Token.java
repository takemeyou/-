package ����ԭ��;

import java.io.LineNumberInputStream;

public abstract class Token {
	
	private int lineNumber;
	static final String EOL = "\\n";
	public Token(int line) {
		lineNumber = line;
	}

	public static final Token EOF = new Token(-1) {};
	
	public int getLineNumber() {
		return lineNumber;
	}
	//Stone����֧���������͵ĵ���
	public boolean isIdentifier() {			//�Ƿ��Ǳ�ʶ������������������������������������+��-������������ŵȱ�����
		return false;
	}
	public boolean isNumber() {				//�Ƿ�������������
		return false;
	}
	public boolean isString() {				//�Ƿ����ַ�������������""���������ַ����г�Ϊ�ַ���
		return false;
	}
	public int getNumber() throws StoneException {
		throw new StoneException("not number token");
	}
	public String getText() {
		return " ";
	}
}
