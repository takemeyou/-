package 编译原理;

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
	//Stone语言支持三种类型的单词
	public boolean isIdentifier() {			//是否是标识符，包括变量名、函数名、或类名，还有+、-等运算符即括号等标点符号
		return false;
	}
	public boolean isNumber() {				//是否是整型字面量
		return false;
	}
	public boolean isString() {				//是否是字符串字面量，被""括起来的字符序列称为字符串
		return false;
	}
	public int getNumber() throws StoneException {
		throw new StoneException("not number token");
	}
	public String getText() {
		return " ";
	}
}
