package com.tedu.day04;

public class Demo001 {
	public static void main(String[] args) {
		/*String Name = "java.com";
		String email = ".123456@qqcom";
		int a = Name.lastIndexOf('.'); 
		System.out.println(a);
		String len = Name.substring(a+1,Name.length());
		System.out.println(len);
		if(a!=-1&&a!=0&&len.equals("com")) {
			System.out.println("111");
		}else {
			System.out.println("222");
		}
		
		int index1 = email.indexOf("@");
		int index2 = email.indexOf(".");
		System.out.println(index1+"   "+index2);
		if(index2!=-1&&index2>index1) {
			System.out.println("333");
		}else {
			System.out.println("444");
		}*/
		
		
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append("123456");
		System.out.println(sBuilder);
		for(int i = sBuilder.length()-3;i>0;i-=3) {
			sBuilder.insert(i, ",");
		}
		System.out.println(sBuilder);
	}

}
