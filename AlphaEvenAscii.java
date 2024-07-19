package javaproject;

public class AlphaEvenAscii {

	public static void main(String[] args) {
		String s="Gogul";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)%2==0) {
				System.out.println(s.charAt(i));
			}
		}

	}

}
