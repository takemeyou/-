package 编译原理;

import java.util.HashSet;

public class Parser {

	/**
	 * 先语法规则中添加未包含与抽象语法树的终结符（与pat匹配的标识符）
	 * @param string
	 * @param eol
	 * @return
	 */
	public Object sep(String string, String eol) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加终结符
	 * @param class1
	 * @return
	 */
	public Object number(Class<NumberLiteral> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 先语法规则中添加终结符（除保留字r外的标识符）
	 * @param class1
	 * @param reserved
	 * @return
	 */
	public Object identifier(Class<Name> class1, HashSet<String> reserved) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加终结符（字符串字面量）
	 * @param class1：
	 * @return
	 */
	public Object string(Class<StringLiteral> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加双目运算表达式
	 * @param class1
	 * @param factor：因子
	 * @param operators：运算符表
	 * @return
	 */
	public Parser expression(Class<BinaryExpr> class1, Parser factor, Operators operators) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加非终结符p
	 * @param expr
	 * @return
	 */
	public Parser ast(Parser expr) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 执行语法分析
	 * @param lexer
	 * @return
	 */
	public ASTree parse(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 向语法规则中添加若干个由or关系连接的非终结符p
	 * @param sep
	 * @param number
	 * @param identifier
	 * @param string
	 * @return
	 */
	public Parser or(Object sep, Object number, Object identifier, Object string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中包含于抽象语法树的终结符（与pat匹配的标识符）
	 * @param string
	 * @return
	 */
	public Parser sep(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加若干个有or关系连接的非终结符p
	 * @param ast
	 * @param primary
	 * @return
	 */
	public Parser or(Parser ast, Parser primary) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 向语法规则中添加可省略的非终结符statement0
	 * @param statement0
	 * @return
	 */
	public Parser option(Parser statement0) {
		
		return new Parser();
	}
	/**
	 * 向语法规则中添加非终结符p
	 * @param bolck
	 * @return
	 */
	public Object ast(Object bolck) {
		
		return null;
	}

	/**
	 * 向语法规则中添加若干个有or关系连接的非终结符p
	 * @param option
	 * @param ast
	 * @param simple
	 * @return
	 */
	public Parser or(Object option, Object ast, Parser simple) {
		
		return null;
	}
	/**
	 * 向语法规则中添加若干个至少重复出现0次的非终结符p
	 * @param option
	 * @param ast
	 * @param simple
	 * @return
	 */
	public Parser repeat(Object option, Object ast, Parser simple) {
		
		return null;
	}

	/**
	 *  向语法规则中添加若干个至少重复出现0次的非终结符p
	 * @param option
	 * @return
	 */
	public Parser repeat(Parser option) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 清空语法规则，将节点类赋值为class1
	 * @param class1
	 * @return
	 */
	public Parser reset(Class class1) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 清空语法规则
	 * @return
	 */
	public Parser reset() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 为语法规则起始处的Or添加新的分支选项
	 * @param p
	 */
	public void insertChoice(Parser p) {
		
	}
	
	/**
	 * 向语法规则中添加终结符（与pat匹配的标识符）
	 * @param pat
	 */
	public void token(String pat) {
		
	}
	/**
	 * 向语法规则中添加可省略的非终结符p(如果省略，则作为一颗仅有根节点的抽象语法树处理）
	 * @param p
	 */
	public void maybe(Parser p) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
