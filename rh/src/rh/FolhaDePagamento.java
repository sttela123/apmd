package RH;

public class FolhaDePagamento {
	
	private double pagamentoTotal = 0;
	
	public void registrar(Empregado empregado) {
		pagamentoTotal += empregado.calcularSalario();
	}
	

	public double getPagamentoTotal() {
		return pagamentoTotal;
	}
	
	public void logar(FuncionarioAutenticado funcionario) {
		System.out.println(funcionario.autenticar("123456"));
	}

}
