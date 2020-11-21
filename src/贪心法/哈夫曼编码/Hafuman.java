package ̰�ķ�.����������;

import java.util.Queue;

public class Hafuman {
	
	TreeNode[] ht;
	Queue qu;
	
	//���ڵ�����
	public abstract class TreeNode{
		char data;//�ڵ��ַ�
		int weight;//Ȩ��
		int parent;
		int lchild;
		int rchild;
		
	}
	//���ȶ��нڵ�����
	public abstract class Node{
		int position;
		char data;
		int weight;
	}
	
	
	//�����������
	public void createTree() {
		Node e,e1,e2;
		
		for(int k=0;k<2*n-1;k++) {
			ht[k].lchild = ht[k].rchild = ht[k].parent = -1;
		}
		for(int i=0;i<n;i++) {
			e.position = i;
			e.data = ht[i].data;
			e.weight = ht[i].weight;
			
		}
		//�����������
		for(int j=n;j<2*n-1;j++) {
			e1 = qu.top();
			qu.pop();
			e2 = qu.top();
			qu.pop();
			ht[j].weight = e1.weight + e2.weight;
			ht[j].lchild = e1.position;
			ht[j].rchild = e2.position;
			ht[e1.position].parent = j;
			ht[e2.position].parent = j;
			e.position = j;
			e.weight = e1.weight + e2.weight;
			qu.push();
		}
		
		
		
	}
	
	//�������������
	void createCode() {
		String code;
		for(int i=0;i<n;i++) {
			code = " ";
			int curno = i;
			int f = ht[curno].parent;
			while(f!= -1) {
				if(ht[f].lchild == curno)
					code = '0'+code;
				else
					code = '1' + code;
				curno = f;
				f = ht[curno].parent;
			}
			
			htcode[ht[i].data] = code;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
