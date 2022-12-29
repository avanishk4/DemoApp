
public class demoapp {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		for (int ele:a) {
			System.out.println(ele);
		}

	}
	String name= "sachin";
	int count =name.toUpperCase().length();
	System.out.println(count);
	
	StringBuffer sb=new StringBuffer("viratkohli");
	int length =sb.append("INDRCB").reverse().length();
	System.out.println(length);

}
