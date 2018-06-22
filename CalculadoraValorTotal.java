class CalculaValorTotal{
	
	private Frete frete;
	private Desconto desconto;

	public CalculaValorTotal(Frete frete, Desconto desconto){
		this.frete = frete;
		this.desconto = desconto;
	}

	public double calcula(Compra compra){
		double desconto = desconto.calcular(compra);
		double frete = frete.calcular(compra);

		double valorTotal = compra.getValor() - desconto + frete;

		return valorTotal;
	}

}