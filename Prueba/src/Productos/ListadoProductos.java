package Productos;

import java.util.ArrayList;

public class ListadoProductos {

	//Atributo
	//Aqui se guardaran los productos a mostrar
	private ArrayList <Producto> ListaProductos;

	//Constructor para crear el Array
	public ListadoProductos() {
		ListaProductos = new ArrayList<Producto>();
	}
	
	//Metodos
	
	public void añadirProducto(Producto pr) {
		ListaProductos.add(pr);
	}
	
	public void eliminarProducto(Producto pr) {
		//Buscara en el Array el Producto que contenga su mismo nombre
		int i=0;
		boolean encontrado = false;
		while(!encontrado && i<ListaProductos.size())
		{
			//Si... tiene el mismo nombre se borrara
			if(ListaProductos.get(i).getNombre().equals(pr.getNombre()))
			{
				ListaProductos.remove(i);
			}
			else
				i++;
		}
	}
	
	
}
