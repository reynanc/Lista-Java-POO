package Pessoa;

public class PessoaTeste {
	  public static void main(String[] args) {
	        Pessoa pessoa = new Pessoa();
	        
	        pessoa.setNome("José");
	        pessoa.setIdade(20);
	        
	        System.out.println(pessoa.toString());
	        
	        Pessoa pessoa2 = new Pessoa();
	        pessoa2.setNome("Maria");
	        pessoa2.setIdade(15);
	        
	        System.out.println(pessoa2.toString());
	       
	    }
}
