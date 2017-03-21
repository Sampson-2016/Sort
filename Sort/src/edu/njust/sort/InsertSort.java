package edu.njust.sort;
/**
 * 将前面的视为有序的数组，每添加一个数字，对之前的进行比较，插入到合理的位子。
 * @author sampson
 *
 */
public class InsertSort extends Sort{
	public  void sort(int [] array) {
		int len=array.length;
		for(int i=1;i<len;i++){
			int temp=array[i];
			int j=i;
			if(array[j-1]>temp){
				while (j>=1&&array[j-1]>temp) {
					array[j]=array[j-1];
					j--;
				}
				array[j]=temp;	
			}
		
			
		}
	}
}
