/**
 * 
 *	@author ASIR1
 *
 *	Constructores: es un método especial de una clase que tiene que cumplir:
 *	- que su nombre sea el mismo que el de la clase
 *	- no devuelven ningún tipo de datos
 *	- nunca se invoca directamente. No se le puede llamar porque realmente se ejecuta de forma automática cuando se
 *		instancia el objeto. 
 *	La finalidad o la funcionalidad de los constructores es inicializar los atributos de las clases a los valores que
 *	tengan inicialmente. 
 *	
 *Lo correcto es que siempre que tenga que inicializar uno o varios atributos a un valor inicial, eso se inicialice a través
 *de los constructores.
 *
 *Hay varios tiempos de constructores -->
 *
 *	- Constructor por defecto y constructor sobrecargado.
 *
 *Nosotros hasta ahora no hemos definido ningún constructor. las aplicaciones funcionaban medianamente bien. Definir un construtor no 
 *es obligatorio. Lo haré cuando lo necesite. El compilador genera un constructor por defecto cuando se instancia un objeto, que 
 *inicializa cada uno de los atributos a sus valores por defecto.
 *
 *El constructor por defecto es aquel que no recibe ningún parámetro. Inicializa los atributos a valores por defecto.
 *El sobrecargado es aquel constructor que recibe parámetros, que son los valores que tengo que asignarle al o los  atributos
 *que tengo que inicizlizar.
 *
 *El constructor por defecto se implementa muy pocas veces, a no ser que yo quiera o diga: queremos almacenar la información de 
 *como máximo de 15 personas que hayan nacido el 23/10/1980. Lo que hago es asignar el en el constructor de la clase fecha el día 23, el mes 10 y 
 *el año 1980. 
 *
 *El sobrecargado no tiene mucha utilidfad todavía. Imaginemos que quiero almacenar en un array la información de una serie de personas que 
 *he sacado de una base de datos. Desconocemos el procedimiento para
 *sacar los datos de una base de datos. Como lo que tengo que hacer es almacenarla en un array cada vez que los leo
 *esos datos los paso como parámetros al constructor de la clase persona y no tengo que hacer nada más.
 *
 *Imaginemos la calse fecha:
 *
 *class fecha{
 *	private int mes;
 *	private int dia;hhh
 *	private int anno;
 *
 *	fecha(){
 *		dia=0, mes=0, anno=0;
 *	}
 *}	
 *	
 *class persona(){
 *	private String nombre;
 *	private int edad;
 *	private char sexo;
 *	private fecha fechaNac;
 *	
 *	persona(){
 *		fechaNac= new fecha();---
 *	} 
 *	
 *}
 *
 */


public class numero {

	private int numero=0;
	
	public numero() {
	}

	public numero(int numero){
		this.numero=numero;
	}
	
	public void anade(int numero){
		this.numero+=numero;
	}
	
	public void resta(int numero){
		this.numero-=numero;
	}
	
	public int getValor(){
		return numero;
	}
	
	public int getDoble(){
		return numero*2;
	}
	
	public int getTriple(){
		return numero*3;
	}
	
	public void setNumero(int numero){
		this.numero=numero;
	}
	
}
