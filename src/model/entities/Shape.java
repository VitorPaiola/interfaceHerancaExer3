package model.entities;

public interface Shape {

	double area();

}

/*Através da Interface é possível que uma classe implemente várias interfaces ao mesmo tempo
 * 
 *Ao contrário da herança que limita uma classe a herdar somente uma classe pai por vez, 
 *é possível que uma classe implemente varias interfaces ao mesmo tempo. 
 *
 *Obriga um determinado grupo de classes a ter métodos ou propriedades em comum 
 *para existir em um determinado contexto
 *
 *Dentro das interfaces existem somente assinaturas de métodos e propriedades, 
 *cabendo à classe que a utilizará realizar a implementação das assinaturas, 
 *dando comportamentos práticos aos métodos.*/
