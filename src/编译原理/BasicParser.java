package 编译原理;


import java.util.HashSet;


/**
 * stone语言的语法分析器
 * @author 罗文涛
 *
 */
public class BasicParser {
	
	HashSet<String> reserved = new HashSet<String>();
	Operators operators = new Operators();
	Parser expr0 = rule();
	Parser primary = rule(PrimayExpr.class).or(((Parser) rule().sep("(")).ast(expr0).sep(")"),
					rule().number(NumberLiteral.class),
					rule().identifier(Name.class,reserved),
					rule().string(StringLiteral.class));
	Parser factor = rule().or(rule(NegativeExpr.class).sep("-").ast(primary),primary);
	Parser expr = expr0.expression(BinaryExpr.class,factor,operators);
	Parser statement0 = rule();
	Parser block = rule(BlockStmnt.class)
			.sep("{").option(statement0)
			.repeat(((Parser) ( rule().sep(";",Token.EOL))).option(statement0)).sep("}");
	
	Parser simple = rule(PrimayExpr.class).ast(expr);
	
	Parser statement = statement0.or(rule(IfStmnt.class)
			.sep("if").ast(expr).ast(block).option(rule().sep("else").ast(block)),
			rule(WhileStmnt.class).sep("while").ast(expr).ast(block),simple);
			
	Parser program = (Parser) rule().or(statement,rule(NullStmnt.class)).sep(";",Token.EOL);
	
	public BasicParser() {
		reserved.add(";");
		reserved.add("}");
		reserved.add(Token.EOL);
		
		Operators.add("=",1,Operators.RIGHT);
		Operators.add("==",2,Operators.LEFT);
		Operators.add(">",2,Operators.LEFT);
		Operators.add("<",2,Operators.LEFT);
		Operators.add("+",3,Operators.LEFT);
		Operators.add("-",3,Operators.LEFT);
		Operators.add("*",4,Operators.LEFT);
		Operators.add("/",4,Operators.LEFT);
		Operators.add("%",4,Operators.LEFT);
	}

	//创建Parser对象
	private Parser rule() {
		
		return null;
	}
	//创建Parser对象
	private Parser rule(Class class1) {
		
		return null;
	}

	public ASTree oarse(Lexer lexer) {
		return program.parse(lexer);
	}
	
	
	
	
	
	


}
