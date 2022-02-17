import java.util.*;
public class BubbleSort {

	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int i=0,sz;
        System.out.println("Enter Size");
        sz = sc.nextInt();
        int arr[] = new int[sz];
        while(i<sz) {
        	arr[i] = sc.nextInt();
        	i++;
        }
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

	}

}
