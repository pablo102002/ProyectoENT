package Productos;

/**
* Esta clase guardara todos los Productos que se añadan al catalogo  
* @author Johann
*/

import java.util.ArrayList;

public class ListadoProductos {

	//Atributo
	//Aqui se guardaran los productos a mostrar
	protected ArrayList <Producto> ListaProductos;

	//Constructor para crear el Array
	public ListadoProductos() {
		ListaProductos = new ArrayList<Producto>();
	}
	
	//Metodos
	
	public void insertarProducto(Producto pr) {
		ListaProductos.add(pr);
	}
	
	public void eliminarProducto(String NomProductoABorrar) {
		//Buscara en el Array el Producto que contenga su mismo nombre
		int i=0;
		boolean encontrado = false;
		while(!encontrado && i<ListaProductos.size())
		{
			//Si... tiene el mismo nombre se borrara
			if(ListaProductos.get(i).getNombre().equals(NomProductoABorrar))
			{
				ListaProductos.remove(i);
				encontrado = true;
			}
			else
				i++;
		}
	}
	
	
}
