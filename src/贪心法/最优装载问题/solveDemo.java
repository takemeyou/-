package 贪心法.最优装载问题;

public class solveDemo {
	
	public int solve(int n,int W,int[] w,int[] x) {
		int maxw = 0;
		
		int restw = W;
		for(int i=1;i<=n && w[i]<=restw;i++) {
			x[i] = 1;
			restw -= w[i];
			maxw += w[i];
		}
		return maxw;
	}
	
	
	
	
	public static void main(String[] args) {
		solveDemo sdDemo = new solveDemo();
		
		int w[] = {0,2,3,4,5,6};//集装箱重量,需要重小到大排序，若无序，则需要写排序算法
		int n=5,W=10;
		
		
		int maxw = 0;
		int x[] = new int[20];
		maxw = sdDemo.solve(n,W,w,x);
		
		for(int i=0;i<=n;i++) {
			if(x[i] == 1) {
				System.out.println("选取重量为："+w[i]);
			}
		}
		System.out.println("总重量为："+maxw);
		
		
		
	}

}
