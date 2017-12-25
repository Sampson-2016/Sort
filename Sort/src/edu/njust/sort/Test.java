package edu.njust.sort;

public class Test {
	//test
	public static void main(String[] args) {
		int a[]={1,5,6,2,3,9,6,4,7,0};
		Sort sort=new HeapSort();
		sort.sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
