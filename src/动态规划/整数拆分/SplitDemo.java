package ��̬�滮.�������;

public class SplitDemo {
	
	/**
	 * 
	 * @param n:��ʾ��Ҫ���в�ֵ�����
	 * @param k:��ʾ��������ֵ����ֵ
	 * �Ե�����
	 */
	public int split(int n,int k) {
		int i,j;
		int[][] dp = new int[20][20];
		for(i=1;i<=n;i++) {
			for(j=1;j<=k;j++) {
				if(i==1 || j==1) {
					dp[i][j] = 1;
				}else if(i<j) {
					dp[i][j] = dp[i][i];
				}else if(i==j) {
					dp[i][j] = dp[i][j-1]+1;
				}else {
					dp[i][j] = dp[i][j-1] + dp[i-j][j];
				}
			}
		}
		return dp[n][k];
		
	}
	
	
	
	
	
	/**
	 * �Ż�����:�ݹ�
	 * @param args
	 */
	public int split2(int n,int k) {
		int i,j;
		int[][] dp = new int[20][20];
		
		if(dp[n][k] != 0)
			return dp[n][k];
		if(n==1 || k==1) {
			dp[n][k] = 1;
			return dp[n][k];
		}else if(n<k) {
			dp[n][k] = split2(n,n);
			return dp[n][k];
		}else if(n==k) {
			dp[n][k] = split2(n,k-1)+1;
			return dp[n][k];
		}else {
			dp[n][k] = split2(n,k-1) + split2(n-k,k);
			return dp[n][k];
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int n=5,k=5;
		SplitDemo splitDemo = new SplitDemo();
		
		//while(n!=0) {
			int tmp = splitDemo.split(n,k);
			System.out.println("n["+n+"]+["+k+"]="+tmp);
			//n--;
		//}
	}

}
