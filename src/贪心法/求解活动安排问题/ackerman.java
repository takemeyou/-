package ̰�ķ�.�����������;

import java.util.Scanner;

public class ackerman {
	boolean[] a = new boolean[15];
	public static void main(String[] args) {
		ackerman ackerman  = new ackerman();
		 int number,i,mid,nums,mu;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�����ĸ�����");
		 number = sc.nextInt();
		 int[] start = new int[number];
		 int[] finish = new int[number];
		 System.out.println("�����Ŀ�ʼʱ�䣺");
		 for(i=0;i<number;i++)
			 start[i] = sc.nextInt();
		 
		 System.out.println("�����Ľ���ʱ�䣺");
		 for(i=0;i<number;i++)
			 finish[i] = sc.nextInt();
		 
		 
		  ackerman.quick(finish,start,0,number-1);
		  System.out.println("�����"+'\n'+"��ʼʱ��          ����ʱ��");
		  for(i=0;i<number;i++)
				 System.out.println(start[i]+"          "+finish[i]);
		  
		  
		 ackerman.greedySelector(start,finish);
		 for (int j = 0; j <= start.length; j++) {
			if(ackerman.a[j]) {
				mu = j+1;
				System.out.println("�� "+ mu +" �����ѡ�У���ʼʱ��Ϊ��"+start[j]+",����ʱ��Ϊ:"+finish[j]);
			}
		}
		 
		 System.out.println("18������� ������ 235120008");
	}
	
	

	private int greedySelector(int[] start, int[] finish) {
		int n=start.length-1,i;
		a[0]=true;
		int j =0;
		for(i=1;i<=n;i++) {
			if(start[i] >= finish[j])
			{
				a[i] = true;
				j=i;
			}else {
				a[i] = false;
			}
		}
		return j;
	}


	private void quick(int[] a,int[] b,int low,int high) {
		if(low<high) {
			int mid = sort(a,b,low,high);
			quick(a,b,0,mid-1);
			quick(a,b,mid+1,high);
		}
	}
	public static int sort(int[] a,int[] b,int low,int high){
		int tmp,tmp1;
		tmp=a[low];
		while(low<high) {
			while(a[high]>=tmp && low<high) {
				high--;
			}
			a[low] = a[high];
			{
				tmp1 = b[low];
				b[low] = b[high];
				b[high] = tmp1;
			}
			while(a[low] <= tmp && low<high) {
				low++;
			}
			a[high] = a[low];
			{
				tmp1 = b[low];
				b[low] = b[high];
				b[high] = tmp1;
			}
		}
		a[low] = tmp;
		return low;
		
	}
	

}