package desafio.bonus;

public class DesafioBonus {

	private double valorpago;
	private double valorRecebido;

	public DesafioBonus(double valorpago, double valorRecebido) {
		this.valorpago = valorpago;
		this.valorRecebido = valorRecebido;
	}

	public int[] devolveTroco() throws DesafioException {

		double troco = this.valorRecebido - this.valorpago;
		double dinheiro[] = { 100.0, 50.0, 10.0, 5.0, 1.0, 0.50, 0.10, 0.05, 0.01 };
		int quantidadeNotas[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0};

		if(troco < 0) {
			throw new DesafioException("Valor insuficiente");
		}
		
		
		for (int i = 0; i < dinheiro.length; i++) {
			int quantidade = (int) (troco / dinheiro[i]);

			quantidadeNotas[i] = quantidade;
			
			troco -= quantidade*dinheiro[i];
			
			
		}

		return quantidadeNotas;

	}

	public double getValorpago() {
		return valorpago;
	}

	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
}
