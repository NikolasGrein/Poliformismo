package PoliformismoFuncionario;

public class Principal {
	
	public static void main(String[]args) {
		
		Horista horista = new Horista (1, "Julia", "15 9910-1029", 23, "Rua 25 de março");
		Jornada jornada  = new Jornada (2, "Julia", "15 9910-1029", 23, "Rua 25 de março");
		PessoaJuridica pessoaJuridica = new PessoaJuridica (3, "Julia", "15 9910-1029", 23, "Rua 25 de março");
		
		System.out.println(horista.getId());
		System.out.println(horista.getNome());
		System.out.println(horista.getMatricula());
		System.out.println(horista.getTelefone());
		System.out.println(horista.getEndereco());
		
		System.out.println(jornada.getId());
		System.out.println(jornada.getNome());
		System.out.println(jornada.getMatricula());
		System.out.println(jornada.getTelefone());
		System.out.println(jornada.getEndereco());
		
		System.out.println(pessoaJuridica.getId());
		System.out.println(pessoaJuridica.getNome());
		System.out.println(pessoaJuridica.getMatricula());
		System.out.println(pessoaJuridica.getTelefone());
		System.out.println(pessoaJuridica.getEndereco());
		
		System.out.println("Seu salário é de: " + horista.calculaSalario(100, 20));
		System.out.println("Seu salário é de: " + jornada.calculaSalario(100, 20));
		System.out.println("Seu salário é de: " + pessoaJuridica.calculaSalario(100, 20));
	}

}
