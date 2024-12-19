import java.util.Arrays;

public class SelctionSort {
	
	static int[] arr= {5,2,8,9,3,4};
	static int temp;
	
	
	public static void main(String args[]) {
		int minIndex;
		
		for(int i=0;i<arr.length;i++) {
			  minIndex = i;
			  
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					temp= arr[minIndex];
					arr[minIndex]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
