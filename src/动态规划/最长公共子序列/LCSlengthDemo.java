package ��̬�滮.�����������;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class LCSlengthDemo {

	public Vector vector;
	int dp[][] = new int[10][10];
	
	
	void lcslength(int m,int n,String[] a,String[] b) {
		int i,j;
		for(i=0;i<=m;i++) {
			dp[i][0] = 0;
		}
		for(j=0;j<=n;j++) {
			dp[0][j] = 0;
		}
		for(i=1;i<=m;i++) {
			for(j=1;j<=n;j++) {
				/**
				 * �������������۲�Ҫ�Ƚϵ��ַ�����������
				 */
				//String p1 = a[i-1];
				//String p2 = a[j-1];
				if(a[i-1] == b[j-1]) {
					dp[i][j] = dp[i-1][j-1] +1;
				}else {
					/**
					 * ��aΪ������bΪƥ�䴮(�Ƚϴ�)��������a�е�һ��Ԫ����b�е�ÿһ��Ԫ�ؽ��бȽϡ�
					 * Ϊʲô��dp[i][j-1]��dp[i-1][j]���бȽ��أ�
					 *����Ϊdp[i][j-1]�Ǽ�¼����������ڵ�һ��λ��(��¼����a�������ڱȽϵ��ַ��ĵ�ǰ���ȣ�,��dp[i-1][j]�����������һ��λ�ã���¼����b�Ƚϴ���ǰ�ַ��ĳ��ȣ���
					 */
					dp[i][j] = Max(dp[i][j-1],dp[i-1][j]);//
				}
			}
		}
		
	}
	
	
	public String[] buildubs(int m,int n,String[] a) {
		//int[][] dp = new int[10][10];
		String[] str = new String[n>m?n:m];
		int k = dp[m][n];
		int i=m,j=n;
		while(k>0) {
			if(dp[i][j] == dp[i-1][j])
				i--;
			else if(dp[i][j] == dp[i][j-1])
				j--;
			else {
				//String s = a[i-1];
				//vector.add(a[i-1]);
				str[k]=a[i-1];
				i--;
				j--;
				k--;
			}
		}
		return str;
	}
	
	
	
	private int Max(int i, int j) {
		return i>j?i:j;
	}


	public static void main(String[] args) {
		//char[] a = "abcbdb".toCharArray();
		//System.out.println(a[2]);
		//char[] b = "acbbabdbb".toCharArray();
		//String[] a = {'a','b','c','b','d','b'};
		String[] a = {"a","b","c","b","d","b"};
		String[] b = {"a","c","b","b","a","b","d","b","b"};
		String[] s;
		int m = a.length;
		int n = b.length;
		LCSlengthDemo lcSlengthDemo = new LCSlengthDemo();
		lcSlengthDemo.lcslength(m,n,a,b);//����dp����
		s = lcSlengthDemo.buildubs(m,n,a);//��dp�����еĽ����һ��һ��String[]�У���Ľ�
		for (String st : s) {
			if(st!= null)
				System.out.println(st);
		}
			
	}
}
