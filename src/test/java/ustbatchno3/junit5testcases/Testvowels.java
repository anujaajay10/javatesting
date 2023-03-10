package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

//import count.CountVowelstest;
import org.junit.Test;
/**
 * @author Administrator
 *
 */
public class Testvowels {
	
	@Test
	public void counttesting() {
		
		String input ="sharath";
		
		int expected=2;
		int actual=Testvowels.vowelscount(input);
		assertEquals(expected,actual);
		
	}

	private static int vowelscount(String input) {
		String str = input;
		int len=str.length();
		int i;
		int count=0;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
			
		}
		return count;
	
	}
	
	
	

}
