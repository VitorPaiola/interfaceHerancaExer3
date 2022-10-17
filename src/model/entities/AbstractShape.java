package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}

/*Cada uma das classes derivadas completa a funcionalidade da classe abstrata 
 * adicionando um comportamento específico
 * 
 * Este tipo de classe possui uma característica muito específica, 
 * que é o de não permitir que novos objetos sejam instanciados a partir desta classe.*/