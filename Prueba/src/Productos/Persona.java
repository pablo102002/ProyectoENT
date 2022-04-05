package Productos;

import java.util.ArrayList;

public class Persona {
	
	//Nutrientes en total de todos los productos
	private double total_grasas=0;
	private double total_grasas_saturadas=0;
	private double total_hidratos_carbono=0;
	private double total_azucar=0;
	private double total_proteinas=0;
	private double total_sal=0;
	
	//ArrayList con los productos de la dieta de la persona
	private ArrayList <Producto> dieta;
	
	public Persona() {
		dieta = new ArrayList<Producto>();
	}
	
	//Metodos a�adir y eliminar productos a la dieta
	public void insertarProducto(Producto prod, double gramos) {
		
		//Calculamos la cantidad de nutrientes
		double grasas = prod.getGrasas() * gramos / 100;						//grasas
		double grasas_saturadas = prod.getGrasas_saturadas() * gramos / 100;	//grasas_saturadas
		double hidratos_carbono = prod.getHidratos_carbono() * gramos / 100;	//hidratos_carbono
		double azucar = prod.getAzucar() * gramos / 100;						//azucar
		double proteinas = prod.getProteinas() * gramos / 100;					//proteinas
		double sal = prod.getSal() * gramos / 100;								//sal
		
		//Añadimos el producto ya calculado a la dieta
		Producto producto_dieta = new Producto(prod.getNombre(), grasas, grasas_saturadas, hidratos_carbono, azucar, proteinas, sal);
		
		dieta.add(producto_dieta);
		
		//Incrementamos los totales
		total_grasas += grasas;
		total_grasas_saturadas += grasas_saturadas;
		total_hidratos_carbono += hidratos_carbono;
		total_azucar += azucar;
		total_proteinas += proteinas;
		total_sal += sal;
		
	}
	
	public void eliminarProducto(int index) {
		dieta.remove(index);
		
		Producto prod = dieta.get(index);
		
		total_grasas -= prod.getGrasas();
		total_grasas_saturadas -= prod.getGrasas_saturadas();
		total_hidratos_carbono -= prod.getHidratos_carbono();
		total_azucar -= prod.getAzucar();
		total_proteinas -= prod.getProteinas();
		total_sal -= prod.getSal();
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
