package it.pxxy.datastruct;

public class LcsTest {
	
	public static int lcsLength(char[] x,char[] y,int[][] b) {
		
		int m = x.length-1;
		int n = y.length-1;
		int[][] c = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			c[i][0] = 0;
		}
		
		for(int i=1;i<=n;i++) {
			c[0][i] = 0;
		}
		
		
		
		for(int i=0;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(x[i] == y[j]) {
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = 1;
				}else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = 2;
				}else {
					c[i][j] = c[i][j-1];
					b[i][j]=3;
				}
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		return c[m][n];
	}
}
