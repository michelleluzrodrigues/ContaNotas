package desafio.gft.service.bonus;

import org.junit.Assert;
import org.junit.Test;

import desafio.bonus.DesafioBonus;
import desafio.bonus.DesafioException;

public class BonusTest {

	@Test
	public void testaTroco() throws DesafioException {
		DesafioBonus desafio = new DesafioBonus(130.0, 200);
		 int[] quantidadeNotas= desafio.devolveTroco();
		
		Assert.assertEquals(0, quantidadeNotas[0], 0.001);
		Assert.assertEquals(1, quantidadeNotas[1], 0.001);
		Assert.assertEquals(2, quantidadeNotas[2], 0.001);
		Assert.assertEquals(0, quantidadeNotas[3], 0.001);
		Assert.assertEquals(0, quantidadeNotas[4], 0.001);
		Assert.assertEquals(0, quantidadeNotas[5], 0.001);
		Assert.assertEquals(0, quantidadeNotas[6], 0.001);
		Assert.assertEquals(0, quantidadeNotas[7], 0.001);
		Assert.assertEquals(0, quantidadeNotas[8], 0.001);

	}
	
	@Test
	public void trocoIgual() throws DesafioException {
		DesafioBonus desafio = new DesafioBonus(200, 200);
		 int[] quantidadeNotas= desafio.devolveTroco();
		
		Assert.assertEquals(0, quantidadeNotas[0], 0.001);
		Assert.assertEquals(0, quantidadeNotas[1], 0.001);
		Assert.assertEquals(0, quantidadeNotas[2], 0.001);
		Assert.assertEquals(0, quantidadeNotas[3], 0.001);
		Assert.assertEquals(0, quantidadeNotas[4], 0.001);
		Assert.assertEquals(0, quantidadeNotas[5], 0.001);
		Assert.assertEquals(0, quantidadeNotas[6], 0.001);
		Assert.assertEquals(0, quantidadeNotas[7], 0.001);
		Assert.assertEquals(0, quantidadeNotas[8], 0.001);
	}
	
	@Test
	public void trocoUmaNotaDeCada() throws DesafioException {
		DesafioBonus desafio = new DesafioBonus(200, 366.66);
		 int[] quantidadeNotas= desafio.devolveTroco();
		
		Assert.assertEquals(1, quantidadeNotas[0], 0.001);
		Assert.assertEquals(1, quantidadeNotas[1], 0.001);
		Assert.assertEquals(1, quantidadeNotas[2], 0.001);
		Assert.assertEquals(1, quantidadeNotas[3], 0.001);
		Assert.assertEquals(1, quantidadeNotas[4], 0.001);
		Assert.assertEquals(1, quantidadeNotas[5], 0.001);
		Assert.assertEquals(1, quantidadeNotas[6], 0.001);
		Assert.assertEquals(1, quantidadeNotas[7], 0.001);
		Assert.assertEquals(1, quantidadeNotas[8], 0.001);
	}
	
	
	@Test( expected = DesafioException.class)
	public void valorPagoInsuficiente() throws DesafioException {
		DesafioBonus desafio = new DesafioBonus(200, 150);
		 desafio.devolveTroco();

	}
	

}
