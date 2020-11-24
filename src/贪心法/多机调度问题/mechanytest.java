package 贪心法.多机调度问题;

import java.util.Comparator;
import java.util.stream.BaseStream;


public class mechanytest {
	
	public abstract class Node implements Comparator<Integer>{
		int id;
		boolean group;
		int time;
		
		public int compare(int o1, int o2) {
			return 01<02?o2:o1;
		}	
	}
	
	
	public int solve(int[] a,int[] b,int[] best,int n) {
		int i,j,k = 0;
		Node[] cNodes = new Node[50];
		for(i=0;i<n;i++) {
			cNodes[i].id = i;
			cNodes[i].group = (a[i]<=b[i]);
			cNodes[i].time = a[i]<=b[i]?a[i]:b[i];
		}
		
		sort();//按time递增排序
		j=0;
		k=n-1;
		for(i=0;i<n;i++) {
			if(cNodes[i].group == true) {
				best[j++] = cNodes[i].id;
				
			}else {
				best[k--] = cNodes[i].id;
			}
		}
		
		
		int f1 = 0;
		int f2 = 0;
		for(i=0;i<n;i++) {
			f1+=a[best[i]];
			f2 = max(f2,f1) + b[best[i]];
		}
		
		return f2;
		
		
		
	}
	
	
	private int max(int f2, int f1) {
		
		return f2>f1?f2:f1;
	}


	private void sort() {
		
		
	}



	public static void main(String[] args) {
		
		
		
		mechany sd = new mechany();
		int n=4;
		int[] best=new int[] {0};
		int[] a= new int[] {5,12,4,8};
		int[] b = new int[] {6,2,14,7};
		
		//sd.solve(a, b, best, n);
		
		
 		
		
		
	}
	
	

}
