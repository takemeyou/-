package 动态规划.最长公共子序列;

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
				 * 设置两个变量观察要比较的字符串是哪两个
				 */
				//String p1 = a[i-1];
				//String p2 = a[j-1];
				if(a[i-1] == b[j-1]) {
					dp[i][j] = dp[i-1][j-1] +1;
				}else {
					/**
					 * 设a为主串，b为匹配串(比较串)，就是用a中的一个元素与b中的每一个元素进行比较。
					 * 为什么是dp[i][j-1]和dp[i-1][j]进行比较呢？
					 *答：因为dp[i][j-1]是记录的是左边相邻的一个位置(记录的是a主串正在比较的字符的当前长度）,而dp[i-1][j]是相邻上面的一个位置（记录的是b比较串当前字符的长度）。
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
		lcSlengthDemo.lcslength(m,n,a,b);//构造dp数组
		s = lcSlengthDemo.buildubs(m,n,a);//将dp数组中的解放在一个一个String[]中，求的解
		for (String st : s) {
			if(st!= null)
				System.out.println(st);
		}
			
	}
}
