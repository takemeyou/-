package 贪心法.流水作业调度;


public class solveDemo {
	
	int[] best;
	
	public abstract class node{
		int position;
		boolean group;
		int time;
		
	}
	
	
	int solve(int[] a,int[] b) {
		int i,j,k;
		node c[];
		for(i=0;i<n;i++) {
			c[i].position = i;
			c[i].group = (a[i]<=b[i]);
			c[i].time = a[i]<=b[i]?a[i]:b[i];
		}
		//需要对time进行递增
		
		j=0;k=n-1;
		for(i=0;i<n;i++) {
			if(c[i].group == 1)
				best[j++] = c[i].position;
			else
				best[k--] = c[i].position;
		}
		
		int f1 = 0;
		int f2 = 0;
		for(i=0;i<n;i++) {
			f1 += a[best[i]];
			f2 = max(f2,f1)+b[best[i]];
		}
		return f2;
		
	}
	

	
	public static void main(String[] args) {
		int a[] = new int[30];
		int b[] = new int[30];
		
		int n=4;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
