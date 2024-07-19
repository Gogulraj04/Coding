package javaproject;

public class Count {

	public static void main(String[] args) {
		String s="!@Gogul1";
		int vowels=0,num=0,special=0,upper=0,lower=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
				vowels++;
			}
			else if(Character.isUpperCase(s.charAt(i))){
				upper++;
			}
			if(Character.isLowerCase(s.charAt(i))){
				lower++;
			}
			else if(s.charAt(i)>47 && s.charAt(i)<58) {
				num++;
			}
			else if(s.charAt(i)>=32 && s.charAt(i)<=47 || s.charAt(i)>=58 && s.charAt(i)<=65 || s.charAt(i)>=91 && s.charAt(i)<=96 || s.charAt(i)>=123 && s.charAt(i)<=126) {
				special++;
			}
		}
		System.out.println("Numbers : "+num+"\n"+"Special Character : "+special+"\n"+"UpperCase : "+upper+"\n"+"LowerCase : "+lower+"\n"+"Vowels : "+vowels);
	}

}
