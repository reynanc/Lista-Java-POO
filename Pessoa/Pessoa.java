package Pessoa;
//Escreva um programa em java para armazenar o nome e a idade de pessoas. Nesta
//classe, crie os métodos de leitura (get()) e os de manipulação (set()) para os atributos.
//Crie também um método para retornar os valores dos atributos desta classe como uma
//String (toString()). Crie outra classe PessoaTeste, em seguida instancie um objeto da
//classe Pessoa e passe os dados de nome e idade como parâmetro para os métodos
//criados. Por fim, imprima os dados nesta segunda classe chamando o método que
//retorna uma grande String

public class Pessoa {
    String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
}
    
}