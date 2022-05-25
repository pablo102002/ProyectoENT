package Productos;

/**
* En esta clase se almacena un array list de productos que sirve para calcular,
* lo que una persona come durante el día y si es una dieta saludable 
* @author Gabriel
*/

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ingesta {

	
	//Nutrientes en total de todos los productos
	
	private double total_grasas=0;
	private double total_grasas_saturadas=0;
	private double total_hidratos_carbono=0;
	private double total_azucar=0;
	private double total_proteinas=0;
	private double total_sal=0;
	private double total_calorias=0;

	
	
	//ArrayList con los productos de la dieta de la persona
	
	public ArrayList <Producto> dieta;


	//Constructores
	
	public Ingesta() {
		dieta = new ArrayList<Producto>();
	}

	
	//Getters and Setters
	
	public double getTotal_grasas() {
		return total_grasas;
	}



	public double getTotal_grasas_saturadas() {
		return total_grasas_saturadas;
	}



	public double getTotal_hidratos_carbono() {
		return total_hidratos_carbono;
	}



	public double getTotal_azucar() {
		return total_azucar;
	}



	public double getTotal_proteinas() {
		return total_proteinas;
	}



	public double getTotal_sal() {
		return total_sal;
	}



	public double getTotal_calorias() {
		return total_calorias;
	}

	
	
	//Metodos
	
	//Metodos insertar y eliminar productos a la dieta

	/**
	  * Se recibe un objeto y la cantidad en gramos.
	  * Se calcula la cantidad de nutrientes haciendo una regla de tres,
	  * se guarda en un nuevo objeto y se inserta en el arraylist
	  *
	  * @param prod Recibe un objeto producto.
	  * @param gramos y la cantidad en gramos de el producto recibido
	  */
	
	public void insertarProducto(Producto prod, double gramos) {

		//Calculamos la cantidad de nutrientes y lo guardamos en variables
		
		
		
		double grasas = prod.getGrasas() * gramos / 100;						//grasas 
		double grasas_saturadas = prod.getGrasas_saturadas() * gramos / 100;	//grasas_saturadas
		double hidratos_carbono = prod.getHidratos_carbono() * gramos / 100;	//hidratos_carbono
		double azucar = prod.getAzucar() * gramos / 100;						//azucar
		double proteinas = prod.getProteinas() * gramos / 100;					//proteinas
		double sal = prod.getSal() * gramos / 100;								//sal
		double calorias = prod.getCalorias() * gramos / 100;					//calorias

		//Insertamos el producto ya calculado a la dieta
		Producto producto_dieta = new Producto(prod.getNombre(), grasas, grasas_saturadas, hidratos_carbono, azucar, proteinas, sal, calorias);

		dieta.add(producto_dieta);

		//Incrementamos los totales
		total_grasas += grasas;
		total_grasas_saturadas += grasas_saturadas;
		total_hidratos_carbono += hidratos_carbono;
		total_azucar += azucar;
		total_proteinas += proteinas;
		total_sal += sal;
		total_calorias += calorias;

	}

	/**
	  * Se elimina un producto del arraylist recibiendo su índice
	  *
	  * @param index La posición en el arraylist del producto que queremos borrar
	  */

	public void eliminarProducto(int index) {

		Producto prod = dieta.get(index);

		total_grasas -= prod.getGrasas();
		total_grasas_saturadas -= prod.getGrasas_saturadas();
		total_hidratos_carbono -= prod.getHidratos_carbono();
		total_azucar -= prod.getAzucar();
		total_proteinas -= prod.getProteinas();
		total_sal -= prod.getSal();
		total_calorias -= prod.getCalorias();

		dieta.remove(index);

	}


	
	//Calcular si la dieta es saludable
	/**
	  * Este método coge el total de nutrientes de todos los productos y lo devuelve
	  *
	  */
	
		public double total() {
			return Math.round((total_grasas + total_grasas_saturadas + total_hidratos_carbono + total_azucar + total_proteinas + total_sal)*100.00)/100.00;
		}
		
		
		/**
		 * Este método recive el total de grasas y el total de nutrintes.
		 * Devuelve un porcentaje con la cantidad total de grasas que hay en la dieta
		 */
		
		public double consumo_grasas() {
			return Math.round((100 * total_grasas / total())*100.00)/100.00;
		}
		
		
		/**
		 * Este método recive el total de azucar y el total de nutrintes.
		 * Devuelve un porcentaje con la cantidad total de azucar que hay en la dieta
		 */
		
		public double consumo_azucar() {
			return Math.round((100 * total_azucar / total())*100.00)/100.00;
		}
		
		
		/**
		 * Este método recive el total de sal y el total de nutrintes.
		 * Devuelve un porcentaje con la cantidad total de sal que hay en la dieta
		 */
		
		public double consumo_Sal() {
			return Math.round((100 * total_sal / total())*100.00)/100.00;
		}
		
		
		
		
		/**
		 * Comprobar que sea una dieta saludale
		 * Calculando que las grasas no superen el 30%, que el azucar sea menos del 10% y menos de 5 gramos de sal
		 */
		
		//---------------------------------------------------------------
		
		public boolean consumo_grasas_saludable() {
			
			if(this.consumo_grasas() <= 30 ) 
				return true;
			else
				return false;
			
		}
		
		public void consumo_azucar_saludable(JPanel color) {
			if(this.consumo_azucar() <= 10) {
				if(this.consumo_azucar() <= 5) {
					color.setBackground(Color.GREEN);
				}
				else {
					color.setBackground(Color.ORANGE);
				}
			}
			else {
				color.setBackground(Color.RED);
			}
				
		}

		public boolean consumo_sal_saludable() {
			if(total_sal < 5) 
				return true;
			else
				return false;
		}
		
		//---------------------------------------------------------------
		
}
