package com.zoumf77;

public class ArrayDemo {
	public static void main(String[] args){
		 //初始化,同时有大小和值了。
		 char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
		            'i', 'n', 'a', 't', 'e', 'd'};
		   
		 //截取
		  char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		        
		  System.out.println(new String(copyTo));
		  
		  //先说明大小，然后赋值
		  int[] rank=new int[10];    
		  for(int i=0;i<10;i++){
			  rank[i]=i;
		  }
		  
		//排序，默认是升序，要想倒序的话，需实现Comparator接口,基础数据无法倒排序哈
		  String[] name={"house","bag","bottle","bowl","ipad","phone"};	
		  
		 
		  java.util.Arrays.sort(name);
		  
		  for(String s:name){
			  System.out.print(s+" ");
		  }
		  
	}
}
