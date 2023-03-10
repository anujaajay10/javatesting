package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import java.time.LocalDate;

public class GoldCoinCalculatorTest {

    @Test
    public void testEmployeeWorks80Days() {
    	Empgoldcoins s= new Empgoldcoins();
		assertEquals("*****",s.findcoins(LocalDate.of(2023, 2, 14)));
		assertEquals("***",s.findcoins(LocalDate.of(2023, 4, 14)));
		assertEquals("*",s.findcoins(LocalDate.of(2023, 7, 14)));
		assertEquals("0",s.findcoins(LocalDate.of(2023, 12, 14)));
    }
}
  