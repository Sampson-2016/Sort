package edu.njust.sort;
/**
 * 快速排序
 * @author sampson
 *
 */
public class QuickSort extends Sort {
	public void sort(int [] array) {
		quickSort(array, 0, array.length-1);
	}
	public static void quickSort(int []array, int start,int end){
		int index=array[start];
		int i=start,j=end;
		if(start>=end)
			return;
		while (start<end) {
			while(start<end&&index<=array[end]){
				end--;
			}
			if(start<end){
				array[start]=array[end];
				start++;
			}
			while(start<end&&index>array[start]){
				start++;
			}
			if(start<end){
				array[end]=array[start];
				end--;
			}
		}
		array[start]=index;
		quickSort(array, i, start-1);
		quickSort(array, start+1, j);
	}
}
