package ustbatchno3.junit5testcases;

public class Vowels {

	public static void main(String[] args) {
		int count = 0;
		String str="I am going to Spain";
	    int length=str.length();
	    String str1=str.toLowerCase();
	    for(int i=0;i<length;i++)
	    {
	    	if(str1.charAt(i)=='a'|| str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
	    	{
		  count++;
		}

	}
		System.out.println("Number of vowels is:"+count);
	}}
	

