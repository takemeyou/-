package ����ԭ��;

import java.util.HashSet;

public class Parser {

	/**
	 * ���﷨���������δ����������﷨�����ս������patƥ��ı�ʶ����
	 * @param string
	 * @param eol
	 * @return
	 */
	public Object sep(String string, String eol) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨����������ս��
	 * @param class1
	 * @return
	 */
	public Object number(Class<NumberLiteral> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨����������ս������������r��ı�ʶ����
	 * @param class1
	 * @param reserved
	 * @return
	 */
	public Object identifier(Class<Name> class1, HashSet<String> reserved) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨����������ս�����ַ�����������
	 * @param class1��
	 * @return
	 */
	public Object string(Class<StringLiteral> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨���������˫Ŀ������ʽ
	 * @param class1
	 * @param factor������
	 * @param operators���������
	 * @return
	 */
	public Parser expression(Class<BinaryExpr> class1, Parser factor, Operators operators) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨��������ӷ��ս��p
	 * @param expr
	 * @return
	 */
	public Parser ast(Parser expr) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ִ���﷨����
	 * @param lexer
	 * @return
	 */
	public ASTree parse(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * ���﷨������������ɸ���or��ϵ���ӵķ��ս��p
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
	 * ���﷨�����а����ڳ����﷨�����ս������patƥ��ı�ʶ����
	 * @param string
	 * @return
	 */
	public Parser sep(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨������������ɸ���or��ϵ���ӵķ��ս��p
	 * @param ast
	 * @param primary
	 * @return
	 */
	public Parser or(Parser ast, Parser primary) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ���﷨��������ӿ�ʡ�Եķ��ս��statement0
	 * @param statement0
	 * @return
	 */
	public Parser option(Parser statement0) {
		
		return new Parser();
	}
	/**
	 * ���﷨��������ӷ��ս��p
	 * @param bolck
	 * @return
	 */
	public Object ast(Object bolck) {
		
		return null;
	}

	/**
	 * ���﷨������������ɸ���or��ϵ���ӵķ��ս��p
	 * @param option
	 * @param ast
	 * @param simple
	 * @return
	 */
	public Parser or(Object option, Object ast, Parser simple) {
		
		return null;
	}
	/**
	 * ���﷨������������ɸ������ظ�����0�εķ��ս��p
	 * @param option
	 * @param ast
	 * @param simple
	 * @return
	 */
	public Parser repeat(Object option, Object ast, Parser simple) {
		
		return null;
	}

	/**
	 *  ���﷨������������ɸ������ظ�����0�εķ��ս��p
	 * @param option
	 * @return
	 */
	public Parser repeat(Parser option) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ����﷨���򣬽��ڵ��ำֵΪclass1
	 * @param class1
	 * @return
	 */
	public Parser reset(Class class1) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * ����﷨����
	 * @return
	 */
	public Parser reset() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Ϊ�﷨������ʼ����Or����µķ�֧ѡ��
	 * @param p
	 */
	public void insertChoice(Parser p) {
		
	}
	
	/**
	 * ���﷨����������ս������patƥ��ı�ʶ����
	 * @param pat
	 */
	public void token(String pat) {
		
	}
	/**
	 * ���﷨��������ӿ�ʡ�Եķ��ս��p(���ʡ�ԣ�����Ϊһ�Ž��и��ڵ�ĳ����﷨������
	 * @param p
	 */
	public void maybe(Parser p) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
