package ustbatchno3.junit5testcases;
	import static org.junit.Assert.assertEquals;

	import java.time.LocalDate;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.junit.Test;


	public class Garmentdetailstest {
		@Test
		
			
			public void garment() {
				Garment g11 =new Garment("tshirt",30,200,6000);
				Garment g21=new Garment("shirt",25,250,6250);
				Garment g31=new Garment("jeans",13,200,2600);
				Garment g41=new Garment("jacket",10,200,2000);
				List<Garment> garments1=Arrays.asList(g11,g21,g31,g41);
				Map<LocalDate, List<Garment>> m=new HashMap<>();
				LocalDate date=LocalDate.of(2023, 1, 1);
				List<LocalDate> l=Arrays.asList(date);
				m.put(date, garments1);
				assertEquals(garments1, Garmentdetails.check(date,m,l));
			}
		
	}