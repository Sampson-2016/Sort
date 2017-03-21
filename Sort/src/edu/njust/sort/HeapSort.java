package edu.njust.sort;
/**
 * 堆排序
 * @author sampson
 *
 */
public class HeapSort extends Sort {
	
	@Override
	void sort(int[] array) {
		for(int i=(array.length-1);i>=0;i--){
			buildMaxHeap(array, i);
			swap(array, 0, i);
		}

	}
	public void buildMaxHeap(int[] array,int lastIndex) {
		for(int i=(lastIndex-1)/2;i>=0;i--){
			int k=i;
			while (2*k+1<=lastIndex) {
				int biggerIndex=2*k+1;
				if(biggerIndex<lastIndex){
					if(array[biggerIndex]<array[biggerIndex+1]){
						biggerIndex++;
					}
				}
				if(array[k]<array[biggerIndex]){
					swap(array, k, biggerIndex);
					k=biggerIndex;
				}else {
					break;
				}
				
			}
		}
		
		
	}
	
	public void  swap(int []array,int x,int y) {
		int temp=array[x];
		array[x]=array[y];
		array[y]=temp;
	}
}
