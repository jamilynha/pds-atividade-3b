package atividadePds;

public class App {
	  public static void main(String[] args) {
	        // Criando uma instância de Pessoa para cada estuantes
	        Pessoa pessoa = new Pessoa("Daniel", 25);
	        
	        Pessoa pessoa1 = new Pessoa("Jamily", 19);

	        // Exibindo as informações dos estudantes
	        System.out.println("Integrantes do grupo");
	        pessoa.exibirInformacoes();
	        pessoa1.exibirInformacoes();
	    }

}
