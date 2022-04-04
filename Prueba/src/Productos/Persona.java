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
	
	//Metodos añadir y eliminar a la dieta
	public void insertarProducto(Producto prod, double gramos) {
		
		Producto producto_dieta = new Producto(
				prod.getNombre(),							//nombre
				prod.getGrasas() * gramos / 100, 			//grasas
				prod.getGrasas_saturadas() * gramos / 100, 	//grasas_saturadas
				prod.getHidratos_carbono() * gramos / 100, 	//hidratos_carbono
				prod.getAzucar() * gramos / 100, 			//azucar
				prod.getProteinas() * gramos / 100, 		//proteinas
				prod.getSal() * gramos / 100				//sal
				);
		
		dieta.add(producto_dieta);
	}
	
	public void eliminarProducto(int index) {
		dieta.remove(index);
	}
	
	//Calcular si la dieta es saludable
	
	public void ingesta_calorica() {};
	public void consumo_azucar() {};
	public void consumo_sal() {};
	
}
