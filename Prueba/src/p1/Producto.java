package p1;

public class Producto {
	
	//Atributos
	//Estos cantidades se basan en 100 gramos
	private double grasas;
	private double grasas_saturadas;
	private double hidratos_carbono;
	private double azucar;
	private double proteinas;
	private double sal;
	
	//Constructor
	//No se podran crear constructores vacios
	public Producto(double grasas, double grasas_saturadas, double hidratos_carbono, double azucar, double proteinas,
			double sal) {
		this.grasas = grasas;
		this.grasas_saturadas = grasas_saturadas;
		this.hidratos_carbono = hidratos_carbono;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
	}
	
	
	//Getter y Setters
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
	
	
	
	
	
	
	

}
