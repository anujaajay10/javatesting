package ustbatchno3.junit5testcases;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

import ustbatchno3.junit5testcases.Frequency;

public class FrequencyTest {
	
	@Test
	public void freqtest() {
		List<String> s = Arrays.asList("anuja","meera","anuja","aysha");
		Map<String,Long> expected = new HashMap<String,Long>();
		expected.put("anuja", (long) 2);
		expected.put("meera",(long) 1);
		expected.put("aysha",(long) 1);
		
		Map<String,Long> actual = Frequency.frequencycount(s);
		assertEquals(expected,actual);
	}
}

