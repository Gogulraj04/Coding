package javaproject;
import java.util.*;
public class EventCharacterPrint {

	public static void main(String[] args) {
		String s= "KSR COLLEGE OF TECHNOLOGY NAMAKKAL";
		String s1="";
		char[] arr=s.toCharArray();
		int count=0;
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				System.out.println(s1 +" - "+count);
				if(count%2==0) {
					list.add(s1);
				}
				count=0;
				s1="";
				continue;
			}
			else {
				count++;
				s1=s1+arr[i];
			}
			
		}
		for(String a:list) {
			System.out.print(a+" ");
		}
	}
}
