class Robozinho {
	
	 public void aplicaCalculo() {
	 	
	 	FreteGratis freteGratis = escolheFrete()
	 	DescontoFidelidade descontoFidelidade = escolheDesconto();

	 	CalculadoraValorTotal calculadoraValorTotal = new CalculadoraValorTotal(frete, descontoFidelidade);
	 }

	 public Frete escolheFrete(){
	 	return null;
	 }

	 public DescontoFidelidade escolheDesconto(){
		return null;
	 }

}