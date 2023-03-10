package ustbatchno3.junit5testcases;

import java.util.List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class Frequency
{
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("anuja", "meera","anuja", "anuja", "aysha", "aysha", "finla");
		 Map<String,Long> frequencyMap = frequencycount(list);
		 System.out.println(frequencyMap);
	}
	public static Map<String, Long> frequencycount(List<String> name) {
    {
       
 
        Map<String, Long> frequencyMap = name.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        //frequencyMap.forEach((word, frequency) -> System.out.println(word + " : " + frequency));
        return frequencyMap;
    }
	

	
	
	}



	

	
}