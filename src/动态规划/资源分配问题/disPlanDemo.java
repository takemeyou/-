package 动态规划.资源分配问题;

/**
 * 问题描述：
 * @author 罗文涛
 *
 */
public class disPlanDemo {
	public int[][] dp = new int[10][10];
	public int[][] punm = new int[10][10];
	
	
	
	public void plan(int m,int n,int[][] v) {
		
		//int p1,p2;
		int maxf,maxj,j;
		for(j=0;j<=n;j++) {
			dp[m+1][j] = 0;
		}
		
		for(int i=m;i>=1;i--) {
			for(int s=1;s<=n;s++) {
				maxf = 0;
				maxj = 0;
				for(j=0;j<=s;j++) {
					if((v[i][j]+dp[i+1][s-j]) >= maxf) {
						maxf = v[i][j]+dp[i+1][s-j];
						maxj = j;
					}
				}
				
				
				dp[i][s] = maxf;
				punm[i][s] = maxj;
				
				
			}
		}
	}
	
	
	
	public void displan(int n,int m) {
		int k,r,s;
		s = punm[1][n];
		r = n-s;
		System.out.println("最优资源分配方案如下：");
		for(k=1;k<=m;k++) {
			System.out.println(s);
			s = punm[k+1][r];
			r = r-s;
		}
		
		System.out.println("盈利为:  "+dp[1][n]);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int m=3,n=5;
		int[][] v = new int[][]{{0,0,0,0,0,0,0,0,0,0},{0,3,7,9,12,13},{0,5,10,11,11,11},{0,4,6,11,12,12}};
		
		disPlanDemo disdp = new disPlanDemo();
		disdp.plan(m,n,v);
		disdp.displan(n,m);
		
		
		
		
		
		//优化
		
		
		
	}
}
