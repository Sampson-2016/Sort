package edu.njust.sort;
/**
 * 希尔排序
 * @author sampson
 *
 */
public class ShellSort extends Sort {
	public   void sort(int [] array) {
		int length=array.length;
		for(int h=length/2;h>0;h/=2){
			for(int i=h;i<length;i+=h){
				int temp=array[i];
				int j;
				for(j=i-h;j>=0;j=j-h){
					if(temp<array[j]){
						array[j+h]=array[j];
					}else {
						break;
					}
				}
				array[j+h]=temp;
			}
		}
	}
}
