
public class Quick_sort {


	    // Method to partition the array
	    int partition(int arr[], int low, int high) {
	        int pivot = arr[high]; // Choose the last element as the pivot
	        int i = (low - 1); // Index of the smaller element

	        for (int j = low; j < high; j++) {
	            // If the current element is smaller than or equal to the pivot
	            if (arr[j] <= pivot) {
	                i++;

	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap arr[i + 1] and arr[high] (or pivot)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1; // Return the partitioning index
	    }

	    // Main method to sort an array using QuickSort
	    void sort(int arr[], int low, int high) {
	        if (low < high) {
	            // Partition the array and get the pivot index
	            int pi = partition(arr, low, high);

	            // Recursively sort elements before and after the partition
	            sort(arr, low, pi - 1);
	            sort(arr, pi + 1, high);
	        }
	    }

	    // Method to print the array
	    public static void printArray(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    // Main method to test the algorithm
	    public static void main(String args[]) {
	        int arr[] = {10, 7, 8, 9, 2, 4};

	        System.out.println("Given Array:");
	        printArray(arr);

	        Quick_sort quickSort = new Quick_sort();
	        quickSort.sort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	}



