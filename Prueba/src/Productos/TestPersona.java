package Productos;

public class TestPersona {

	static void listarProducto(Producto p) {
		System.out.println("Grasas: "+p.getGrasas() + "Grasas saturadas: "+p.getGrasas_saturadas()+"Hidratos Carbono: "+p.getHidratos_carbono()+"Azucar: "+p.getAzucar()+"Proteinas: "+p.getProteinas()+"Sal: "+p.getSal()+"Calorias: "+p.getCalorias());
	}
	
	static void listarTotal(Ingesta d) {
		System.out.println("Grasas: "+d.getTotal_grasas() + "Grasas saturadas: "+d.getTotal_grasas_saturadas()+"Hidratos Carbono: "+d.getTotal_hidratos_carbono()+"Azucar: "+d.getTotal_azucar()+"Proteinas: "+d.getTotal_proteinas()+"Sal: "+d.getTotal_sal()+"Calorias: "+d.getTotal_calorias());
	}
	
	public static void main(String[] args) {
		
		//Productos
		Producto pr1 = new Producto("Actimel", 0.4, 0.8, 0, 10.6, 1.5, 0.05,84);
		Producto pr2 = new Producto("Kit-Kat", 11.8, 15, 13.3, 45.7, 7.8, 0.14,518);
		Producto pr3 = new Producto("Arroz_curry", 4, 0.9, 13.3, 0.6, 8.5, 0.72,456);
		
		Producto pr4 = new Producto("Uno", 5, 6, 7, 8, 9, 10, 500);
		Producto pr5 = new Producto("Dos", 10, 12, 14, 16, 18, 20, 1000);
		
		//Persona
		Ingesta dieta = new Ingesta();
		
		//dieta.insertarProducto(pr1, 50);
		//dieta.insertarProducto(pr2, 60);
		//dieta.insertarProducto(pr3, 300);
		
		dieta.insertarProducto(pr4, 100);
		dieta.insertarProducto(pr5, 100);
		
		listarProducto(pr4);
		listarProducto(pr5);
		System.out.println("----------------------------------------");
		listarTotal(dieta);
		System.out.println("----------------------------------------");
		System.out.println("Datos:");
		System.out.println(dieta.total());
		
		
	}

}
