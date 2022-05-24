package Productos;

/**
* En esta clase se definen productos
* @author Johann
*/

public class Producto {

	//Atributos
	//Estos cantidades se basan en 100 gramos
	private String nombre;
	private double grasas;
	private double grasas_saturadas;
	private double hidratos_carbono;
	private double azucar;
	private double proteinas;
	private double sal;
	private double calorias;
	
	//Constructor
	//No se podran crear constructores vacios
	public Producto(String nombre, double grasas, double grasas_saturadas, double hidratos_carbono, double azucar,
			double proteinas, double sal, double calorias) {
		super();
		this.nombre = nombre;
		this.grasas = grasas;
		this.grasas_saturadas = grasas_saturadas;
		this.hidratos_carbono = hidratos_carbono;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calorias = calorias;
	}
	
	
	//Getter y Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double getGrasas() {
		return grasas;
	}

	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}

	public double getGrasas_saturadas() {
		return grasas_saturadas;
	}

	public void setGrasas_saturadas(double grasas_saturadas) {
		this.grasas_saturadas = grasas_saturadas;
	}

	public double getHidratos_carbono() {
		return hidratos_carbono;
	}

	public void setHidratos_carbono(double hidratos_carbono) {
		this.hidratos_carbono = hidratos_carbono;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}


	public double getCalorias() {
		return calorias;
	}


	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	

}
