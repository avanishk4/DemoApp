package com.avanish.testdemo;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] ar= {25,30,40,70,10};
           int max=ar[0];
           for(int i=0;i<ar.length;i++)
           {
        	   if(ar[i]>max)
        	   {
        		   max=ar[i];
        	   }
           }
           System.out.println(max);
           
           int min=ar[0];
           for(int i=0;i<ar.length;i++)
           {
        	   if(ar[i]<min)
        	   {
        		   min=ar[i];
        	   }
           }
           System.out.print(min);
	}

}
