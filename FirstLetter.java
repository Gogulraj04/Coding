package javaproject;

public class FirstLetter {

	public static void main(String[] args) {
		String s="KSR INSTITUTE OF TECHNOLOGY";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.print(arr[i]+" ");
			}
			if(arr[i]==' ') {
				System.out.print(arr[i+1]+" ");
			}
		}

	}

}
