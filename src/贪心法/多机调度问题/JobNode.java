package ̰�ķ�.�����������;

public class JobNode implements Comparable{
	int id,time;

	public JobNode(int id, int time) {
		super();
		this.id = id;
		this.time = time;
	}

	public int compareTo(Object o) {
		int xt = ((JobNode)o).time;
		if(time <xt)
			return -1;
		if(time == xt)
			return 0;
		return 1;
	}
	
	
	
	
	
	
	
}
