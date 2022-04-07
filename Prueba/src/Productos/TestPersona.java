package Productos;

public class TestPersona {

	public static void main(String[] args) {
		
		//Productos
		Producto pr1 = new Producto("Actimel", 0.4, 0.8, 0, 10.6, 1.5, 0.05,84);
		Producto pr2 = new Producto("Kit-Kat", 11.8, 15, 13.3, 45.7, 7.8, 0.14,518);
		Producto pr3 = new Producto("Arroz_curry", 4, 0.9, 13.3, 0.6, 8.5, 0.72,456);
		
		//Persona
		Ingesta dieta = new Ingesta();
		
		dieta.insertarProducto(pr1, 50);
		dieta.insertarProducto(pr2, 60);
		dieta.insertarProducto(pr3, 300);
		
		System.out.println(pr1.getCalorias());
		System.out.println(pr2.getCalorias());
		System.out.println(pr3.getCalorias());
		System.out.println("----------------------------------------");
		System.out.println(dieta.dieta.get(0).getCalorias());
		System.out.println(dieta.dieta.get(1).getCalorias());
		System.out.println(dieta.dieta.get(2).getCalorias());
		System.out.println("----------------------------------------");
		System.out.println(dieta.getTotal_grasas());
		System.out.println(dieta.getTotal_grasas_saturadas());
		System.out.println(dieta.getTotal_hidratos_carbono());
		System.out.println(dieta.getTotal_azucar());
		System.out.println(dieta.getTotal_proteinas());
		System.out.println(dieta.getTotal_sal());
		System.out.println(dieta.getTotal_calorias());
		System.out.println("----------------------------------------");
		dieta.eliminarProducto(0);
		//Arreglar error al eliminar resta las calorias del producto con 100 gramos, no con la cantidad correcta
		System.out.println(dieta.getTotal_calorias());
		
	}

}
