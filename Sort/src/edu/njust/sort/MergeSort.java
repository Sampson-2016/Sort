package edu.njust.sort;
/**
 * 归并排序
 * @author sampson
 *
 */
public class MergeSort extends Sort{
	public  void sort(int []array) {
		Merge(array, 0, array.length-1);
	}
	
	public static void Merge(int array[],int p,int r) {
		if(p<r){
		int q=(p+r)/2;
		Merge(array, p, q);
		Merge(array, q+1, r);
		Merge1(array, p, q, r);
		}
	}
	public static void Merge1(int []array,int p,int q,int r) {
		int n1,n2,i,j,k;
		n1=q-p+1;
		n2=r-q;
		int []L=new int[n1];
		int []R=new int[n2];
		for(i=0;i<n1;i++){
			L[i]=array[p+i];
		}
		for (j = 0; j < n2; j++) {
			R[j]=array[q+1+j];
		}
		
		for(k=p,i=0,j=0;i<n1&&j<n2;k++){
			if(L[i]<R[j]){
				array[k]=L[i++];
			}
			else {
				array[k]=R[j++];
			}
		}
		if(i<n1){
			for (j = i; j < n1; j++,k++) {
				array[k]=L[j];
			}
		}
		if(j<n2){
			for(i=j;i<n2;i++,k++){
				array[k]=R[i];
			}
		}
	}
}
