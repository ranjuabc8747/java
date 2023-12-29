package map;

public class bbb {
	 public static void main(String[] args) {
	        int[] a = {6, 15, 9, 13, 7};
	        int maxDifference = findMaxDifference(a);
	        System.out.println("Maximum difference: " + maxDifference);
	    }

	    public static int findMaxDifference(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            // Array should have at least two elements to find a difference
	            return -1; // or throw an exception
	        }

	        int minElement = arr[0];
	        int maxDifference = arr[1] - arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] - minElement > maxDifference) {
	                maxDifference = arr[i] - minElement;
	            }

	            if (arr[i] < minElement) {
	                minElement = arr[i];
	            }
	        }

	        return maxDifference;
	    }
	}


