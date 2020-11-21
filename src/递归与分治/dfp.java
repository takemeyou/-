package 递归与分治;

public class dfp {
	
	public static void main(String[] args) {
		int[][] a= {{3,2,3},{5,2,6}};
		int[][] b= {{4,2,5,3},{3,2,5,2},{1,2,3,1}};
		int[][] c = new int[20][20];
		matriMultiply(a,b,c,2,3,3,4);
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
			
	}
	
	
	/**
	 * @param a
	 * @param b
	 * @param c相乘后的新矩阵
	 * @param ra 矩阵a的行
	 * @param ca 矩阵a的列
	 * @param rb 矩阵b的行
	 * @param cb 矩阵b的列
	 */
	public static void matriMultiply(int[][] a,int[][] b,int[][] c,int ra,int ca,int rb,int cb) {
		if(ca != rb)
			System.out.println("此矩阵不能相乘");
		for(int i=0;i<ra;i++) {
			for(int j=0;j<cb;j++) {
				int sum=a[i][0]*b[0][j];
				for(int k=1;k<ca;k++) {
					sum += a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
	}
}













