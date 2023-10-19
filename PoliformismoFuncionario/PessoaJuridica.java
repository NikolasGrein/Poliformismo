package PoliformismoFuncionario;

public class PessoaJuridica extends Funcionario {
	
	public PessoaJuridica(long id, String nome, String telefone,int matricula,String endereco) {
	super(id, nome, telefone, matricula, endereco);	
	}
	
	@Override
	public double calculaSalario(double salarioHora, double horaTrabalhada) {
		return salarioHora*horaTrabalhada;
	}
}