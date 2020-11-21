package 动态规划.斐波那契;

/**
 * 斐波那契数列
 * @author 罗文涛
 *
 */
public class Fib {

	
	public static void main(String[] args) {
		Fib o = new Fib();
		int[] dp=new int[20];
		
		dp[0]=0;
		dp[1]=1;System.out.println(dp[1]);
		dp[2]=1;System.out.println(dp[2]);
		for(int i=3;i<=15;i++) {
			dp[i] = dp[i-1]+dp[i-2];
			System.out.println(dp[i]);
		}
	}
	
	public int fib(int n,int[] dp) {
		
		
		
		
		
		return dp[n];
	}
	
	
	
	
	
}
