package BasicSorting;

public class BubbleSort {

	public static void PrintArr(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void BubbleSort(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 7, 9, 4, 3, 6 };
		System.out.println("Original Array:");
		PrintArr(arr);
		System.out.println("Bubble Sorted Array:");
		BubbleSort(arr);
		PrintArr(arr);

	}

}
