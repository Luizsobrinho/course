package aplication.funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario  funcionario = new Funcionario();
		funcionario.setSalario(100);
		funcionario.setTaxa(10);
		System.out.println(funcionario.salarioLiquido());
		funcionario.aumentarSalario(10);
		
	}

}
