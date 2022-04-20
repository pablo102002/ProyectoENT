package Productos;

import java.util.ArrayList;

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



	public void setTotal_grasas(double total_grasas) {
		this.total_grasas = total_grasas;
	}



	public double getTotal_grasas_saturadas() {
		return total_grasas_saturadas;
	}



	public void setTotal_grasas_saturadas(double total_grasas_saturadas) {
		this.total_grasas_saturadas = total_grasas_saturadas;
	}



	public double getTotal_hidratos_carbono() {
		return total_hidratos_carbono;
	}



	public void setTotal_hidratos_carbono(double total_hidratos_carbono) {
		this.total_hidratos_carbono = total_hidratos_carbono;
	}



	public double getTotal_azucar() {
		return total_azucar;
	}



	public void setTotal_azucar(double total_azucar) {
		this.total_azucar = total_azucar;
	}



	public double getTotal_proteinas() {
		return total_proteinas;
	}



	public void setTotal_proteinas(double total_proteinas) {
		this.total_proteinas = total_proteinas;
	}



	public double getTotal_sal() {
		return total_sal;
	}



	public void setTotal_sal(double total_sal) {
		this.total_sal = total_sal;
	}



	public double getTotal_calorias() {
		return total_calorias;
	}



	public void setTotal_calorias(double total_calorias) {
		this.total_calorias = total_calorias;
	}
	
	
	//Metodos
	
	//Metodos insertar y eliminar productos a la dieta

	public void insertarProducto(Producto prod, double gramos) {

		//Calculamos la cantidad de nutrientes y lo guardamos en variables
		
		
		//REVISAR!!!!!!
		
		
		
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

	public void eliminarProducto(String NomProductoABorrar) {

		int i=0;
		int length = dieta.size();
		boolean encontrado = false;
		while(!encontrado && i<length)
		{
			//Si... tiene el mismo nombre se borrara
			if(dieta.get(i).getNombre().equals(NomProductoABorrar))
			{
				Producto prod = dieta.get(i);
				total_grasas -= prod.getGrasas();
				total_grasas_saturadas -= prod.getGrasas_saturadas();
				total_hidratos_carbono -= prod.getHidratos_carbono();
				total_azucar -= prod.getAzucar();
				total_proteinas -= prod.getProteinas();
				total_sal -= prod.getSal();
				total_calorias -= prod.getCalorias();
				
				dieta.remove(i);
				encontrado = true;
			}
			else
				i++;
		}
	
	}
	
	//Calcular si la dieta es saludable
	
		public double total() {
			return total_grasas + total_grasas_saturadas + total_hidratos_carbono + total_azucar + total_proteinas + total_sal;
		}
		
		public double consumo_grasas() {
			return 100 * (total_grasas + total_grasas_saturadas) / total();
		}
		
		public double consumo_hidratos() {
			return 100 * (total_hidratos_carbono + total_azucar) / total();
		}
		
		public double consumo_azucar() {
			return 100 * total_azucar / total();
		}
		
		//Comprobar que sea una dieta saludale calculando que las grasas no superen el 30%
		//Que el azucar sea menos del 10%
		//Menos de 5 gramos de sal
		public boolean alimentacion_saludable() {
			
			if(this.consumo_grasas() <= 30 && this.consumo_azucar() < 10 && total_sal < 5) 
				return true;
			else
				return false;
			
		}

}
