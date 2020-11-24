package 贪心法.多机调度问题;

public class mechany {
	
	public static int greedy(int[] a,int m) {
		int n = a.length-1;
		int sum = 0;
		if(n<=m) {
			for(int i=0;i<n;i++)
				sum+=a[i];
			System.out.println("为每个作业分配一台机器");
			return sum;
		}
		JobNode[] d = new JobNode[n];
		for(int i=0;i<n;i++)
			d[i] = new JobNode(i+1, a[i+1]);
		sort(d);
		MinHeap H = new MinHeap(m);
		for(int i=1;i<=m;i++) {
			MachineNode md = new MachineNode(i, 0);
			H.put(md);
 		}
		
		for(int i=n;i>=1;i--) {
			MachineNode x = H.removeMin();
			System.out.println("将机器"+x.id+"从"+x.availe+"到"+(x.availe+d[i-1].time)+"的时间段分配给作业"+d[i-1].id);
			x.availe += d[i-1].time;
			sum = x.availe;
			H.put(x);
		}
		return sum;
		
	}


	private static void sort(JobNode[] d) {
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
