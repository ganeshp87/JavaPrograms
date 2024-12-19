import java.util.Arrays;

public class BubbleSort {
	
	static int arr[]= {5,2,8,9,3,4};
	static int temp;
	
	public static void main(String args[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) { //should not touch the last arranged index so used(length-i)
				if(arr[j]<arr[j-1]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
