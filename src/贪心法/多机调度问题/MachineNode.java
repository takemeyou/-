package ̰�ķ�.�����������;

public class MachineNode implements Comparable{

	
	int id;
	int availe;
	
	
	public int compareTo(Object o) {
		int xa = ((MachineNode)o).availe;
		if(availe<xa)
			return -1;
		if(availe == xa)
			return 0;
		return 1;
	}


	public MachineNode(int id, int i) {
		this.id = id;
		this.availe = i;
	}
	
	

}
