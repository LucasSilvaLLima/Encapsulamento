package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Lucas","Silva", 45);
		p1.setIdade(23); // set == alterar
		
		System.out.println(p1.getIdade()); // get == ler;
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto()); // toString
	}
}
