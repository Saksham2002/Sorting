import java.util.*;
public class DevSort {
	
	 public void pushSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
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
			DevSort ob = new DevSort();
	        Scanner sc = new Scanner(System.in);
	        int i=0,sz;
	        System.out.println("Enter Size");
	        sz = sc.nextInt();
	        int arr[] = new int[sz];
	        while(i<sz) {
	        	arr[i] = sc.nextInt();
	        	i++;
	        }
	        ob.pushSort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	        sc.close();
		}

}
