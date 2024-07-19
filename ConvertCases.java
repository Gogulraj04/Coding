package javaproject;

public class ConvertCases {

	public static void main(String[] args) {
		String s="Gogul RaJ";
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(s.charAt(i))) {
				ans=ans+Character.toLowerCase(s.charAt(i));
			}else {
				ans=ans+Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(ans);
	}

}
