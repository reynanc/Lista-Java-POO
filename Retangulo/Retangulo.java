//Escreva um programa em java que calcule a área e o perímetro de um retângulo
//utilizando o encapsulamento. Para isto, crie uma classe Retângulo com os atributos
//privados altura e largura. Nesta classe terá os métodos que calculam a área (altura *
//largura) e o perímetro (altura * 2) + (largura * 2). Em outra classe RetânguloTeste,
//Instancie um objeto da classe Retângulo e passe os valores da altura e largura como
//parâmetro para os métodos criados. Por fim, imprima a área e o perímetro do retângulo
//nesta segunda classe.

package Retangulo;

public class Retangulo {
	private double altura;
	private double largura;


	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double area() {
		return altura * largura;
	}
	public double perimetro() {
		return (altura * 2) + (largura * 2);
		
	}

	@Override
	public String toString() {
		return "Retangulo [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}

	
	
}
