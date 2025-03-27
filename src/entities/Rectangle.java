// classe, atributos e métodos do exercicio 01
package entities;

// criação da classe retângulo com seus atributos
public class Rectangle {

	public double width;
	public double height;
	
	//criação de métodos para os cálculos do retângulo
	public double area() {
		return width * height;
		
	}
	
	public double perimeter () {
		return 2 * (width + height);

	}
		
	public double diagonal () {
		return Math.sqrt(width * width + height * height);
	}

}
