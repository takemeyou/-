package ̰�ķ�.����װ������;

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
		
		int w[] = {0,2,3,4,5,6};//��װ������,��Ҫ��С������������������Ҫд�����㷨
		int n=5,W=10;
		
		
		int maxw = 0;
		int x[] = new int[20];
		maxw = sdDemo.solve(n,W,w,x);
		
		for(int i=0;i<=n;i++) {
			if(x[i] == 1) {
				System.out.println("ѡȡ����Ϊ��"+w[i]);
			}
		}
		System.out.println("������Ϊ��"+maxw);
		
		
		
	}

}
