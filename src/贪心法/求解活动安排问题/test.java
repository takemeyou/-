package 贪心法.求解活动安排问题;

public class test {
	
	public static void main(String[] args) {
		int[] arr1 = {5,2,7,12,4,6,9,3};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		test test = new test();
		
		test.quick(arr1, arr2, 0, 7);
		
		for (int i : arr1) {
			System.out.println(i);
		}
		System.out.println("--------------");
		for (int j : arr2) {
			System.out.println(j);
		}
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
