package edu.njust.sort;

/**
 * 选择排序,从小到大
 * 经过一轮比较，得到最小记录，然后和第一个位置交换数据
 * @author sampson
 *
 */
public class SelectionSort extends Sort {
	public  void sort(int [] array){
		int len=array.length;
		for(int i=0;i<len;i++){
			int temp=array[i];
			int min=i;
			for(int j=i+1;j<len;j++){
				if(temp>array[j]){
					min=j;
					temp=array[j];
				}
			}
			array[min]=array[i];
			array[i]=temp;
		}
			
	}
	
}
