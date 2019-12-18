package CalculadoraPrima;

import static org.junit.Assert.*;
import org.junit.Test;

import CalculadoraPrima.Prima;

public class PrimaTest {

	@Test
	public void testCalculoPrima() {
		Prima pr = new Prima(18,30);
		double result = pr.calculoPrima();
		assertEquals(1350, pr.calculoPrima(), 0);
		
		pr = new Prima(18,20);
		result = pr.calculoPrima();
		
		assertEquals(1400, pr.calculoPrima(), 0);
		
		pr = new Prima(28,29);
		result = pr.calculoPrima();
		
		assertEquals(850, pr.calculoPrima(), 0);
		
		pr = new Prima(30,25);
		result = pr.calculoPrima();
		
		assertEquals(900, pr.calculoPrima(), 0);
		
		pr = new Prima(35,27);
		result = pr.calculoPrima();
		
		assertEquals(400, pr.calculoPrima(), 0);
		
		pr = new Prima(40,22);
		result = pr.calculoPrima();
		
		assertEquals(500, pr.calculoPrima(), 0);
		
		pr = new Prima(48,20);
		result = pr.calculoPrima();
		
		assertEquals(400, pr.calculoPrima(), 0);
		
		pr = new Prima(51,28);
		result = pr.calculoPrima();
		
		assertEquals(250, pr.calculoPrima(), 0);
		
		pr = new Prima(65,26);
		result = pr.calculoPrima();
		
		assertEquals(550, pr.calculoPrima(), 0);
		
		pr = new Prima(70,20);
		result = pr.calculoPrima();
		
		assertEquals(750, pr.calculoPrima(), 0);
	}

}
