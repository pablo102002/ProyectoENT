package Productos;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Metodos {
	public static void VaciarAlertas(ArrayList<JLabel> labelsAlertaAgregarProducto) {
		//Le pasas un array de labels que vaciara los mensajes de alerta
		int size = labelsAlertaAgregarProducto.size();
		for(int i = 0; i<size;i++){
			labelsAlertaAgregarProducto.get(i).setText("");
		}
	}
	
	public static boolean ComprobarCeldasValidas(ArrayList<JTextField> fieldsAgregarProducto, ArrayList<JLabel> labelsAlertaAgregarProducto, JLabel AlertaPersonalizada) {
		//Lo primero es vaciar las alertas
		AlertaPersonalizada.setText("");
		VaciarAlertas(labelsAlertaAgregarProducto);
		
		
		int size = fieldsAgregarProducto.size();
		int i=0;
		while (i<size)
		{
			
			//Si el campo esta vacio saldra una alerta y se saldra del metodo
			if(fieldsAgregarProducto.get(i).getText().equals("")) {
				labelsAlertaAgregarProducto.get(i).setForeground(Color.RED);
				labelsAlertaAgregarProducto.get(i).setText("!");

				AlertaPersonalizada.setForeground(Color.RED);
				AlertaPersonalizada.setText("El campo puede estar vacio");
				return false;
			}
			else {
				//En caso contrario saldra un OK y...
				labelsAlertaAgregarProducto.get(i).setForeground(Color.BLUE);
				labelsAlertaAgregarProducto.get(i).setText("OK");

				//Mientras no sea indice 0 (el 0 necesitamos que sea un String, no un Double)
				if(i!=0)
				{
					//Realizara un comprobacion caracter a caracter para comprobar que solo tenga numeros
					char[] v=fieldsAgregarProducto.get(i).getText().toCharArray();
					int j=0;
					while( j<v.length) {
						if(!Character.isDigit(v[j])) {
							labelsAlertaAgregarProducto.get(i).setForeground(Color.RED);
							labelsAlertaAgregarProducto.get(i).setText("!");

							AlertaPersonalizada.setForeground(Color.RED);
							AlertaPersonalizada.setText("Valor no valido");
							return false;
						}
						j++;
					}

				}
			}
			i++;
		}
		//Si detecta que todo lo anterior es correcto devolvera un TRUE
		return true;
	}

	public static boolean ComprobarCoherenciaNumerica(ArrayList<JTextField> fieldsAgregarProducto, ArrayList<JLabel> labelsAlertaAgregarProducto, JLabel AlertaPersonalizada) {

		double Grasas = Double.parseDouble(fieldsAgregarProducto.get(2).getText());
		double GrasasSaturadas = Double.parseDouble(fieldsAgregarProducto.get(3).getText());

		if(GrasasSaturadas > Grasas)
		{
			labelsAlertaAgregarProducto.get(3).setForeground(Color.RED);
			labelsAlertaAgregarProducto.get(3).setText("!");

			AlertaPersonalizada.setForeground(Color.RED);
			AlertaPersonalizada.setText("Grasas Saturadas no puede ser mayor que Grasas");
			return false;
		}
		else
		{
			double Hidratos = Double.parseDouble(fieldsAgregarProducto.get(4).getText());
			double Azucar = Double.parseDouble(fieldsAgregarProducto.get(5).getText());

			if(Azucar > Hidratos)
			{
				labelsAlertaAgregarProducto.get(5).setForeground(Color.RED);
				labelsAlertaAgregarProducto.get(5).setText("!");

				AlertaPersonalizada.setForeground(Color.RED);
				AlertaPersonalizada.setText("Azucar no puede ser mayor que Hidratos");
				return false;
			}
		}

		return true;
	}
	
	public static void mostrarCalculoEnLabel(JLabel g100,JLabel gres, double cantGg) {
		double valor_calcular = Double.parseDouble(g100.getText());
		double calculoMacro=cantGg*valor_calcular/100;
		String pasarcalculoMacro=String.valueOf(calculoMacro);
		gres.setText(pasarcalculoMacro);
	}
	
	public static void actualizarMacros100g(Producto producto,ArrayList<JLabel> label) {
		//Recogo con un Array los Labels donde quiero actualizar los campos
		//La Lista solo
		
		int i=0;
		
		String MacroEspecifica=Double.toString(producto.getGrasas());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getGrasas_saturadas());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getHidratos_carbono());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getAzucar());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getProteinas());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getSal());
		label.get(i).setText(MacroEspecifica);
		i++;
		
		MacroEspecifica=Double.toString(producto.getCalorias());
		label.get(i).setText(MacroEspecifica);
		
	}
	public static boolean comprobarCantidadValida(JTextField FieldCantidad) {
		//Sirve para que el numero agregado no tenga letras ni numeros inferiores a 0
		
		//Convierto el texto de Cantidad_Gramos_Introducido a un array de Chars
		String texto = FieldCantidad.getText();
		char[] v=texto.toCharArray();
		int i=0;

		//Mientras el valor que encuentre sea un digito continuara hasta el final
		//Sino parar y mostrar un error
		while( i<v.length ) {
			if(!Character.isDigit(v[i])) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean comprobarCantidadValida(JTextField FieldCantidad,JLabel LabelAlerta) {
		//Sirve para que el numero agregado no tenga letras ni numeros inferiores a 0
		
		//Convierto el texto de Cantidad_Gramos_Introducido a un array de Chars
		String texto = FieldCantidad.getText();
		char[] v=texto.toCharArray();
		int i=0;

		//Mientras el valor que encuentre sea un digito continuara hasta el final
		//Sino parar y mostrar un error
		while( i<v.length ) {
			if(!Character.isDigit(v[i])) {
				LabelAlerta.setText("Valor erroneo, tienes que introducir un numero positivo");
				return false;
			}
			else
				LabelAlerta.setText("");
			i++;
		}
		return true;
	}
	
	public static Producto agregarProductoAlCatalogo(ArrayList<JTextField> fieldsAgregarProducto)
	{
		String nombre = fieldsAgregarProducto.get(0).getText();
		double grasas = Double.parseDouble(fieldsAgregarProducto.get(2).getText());
		double grasas_saturadas = Double.parseDouble(fieldsAgregarProducto.get(3).getText());
		double hidratos_carbono = Double.parseDouble(fieldsAgregarProducto.get(4).getText());
		double azucar = Double.parseDouble(fieldsAgregarProducto.get(5).getText());
		double proteinas = Double.parseDouble(fieldsAgregarProducto.get(6).getText());
		double sal = Double.parseDouble(fieldsAgregarProducto.get(7).getText());
		double calorias = Double.parseDouble(fieldsAgregarProducto.get(8).getText());
		
		double gramos_alimento = Double.parseDouble(fieldsAgregarProducto.get(1).getText());
		
		// Producto (String nombre, double grasas, double grasas_saturadas, double hidratos_carbono, double azucar,
		// double proteinas, double sal, double calorias)
		
		if(gramos_alimento != 100)
		{
			grasas = 100 * grasas/gramos_alimento;
			grasas_saturadas = 100 * grasas_saturadas / gramos_alimento;
			hidratos_carbono = 100 * hidratos_carbono / gramos_alimento;
			azucar = 100 * azucar / gramos_alimento;
			proteinas = 100 * proteinas / gramos_alimento;
			sal = 100 * sal / gramos_alimento;
			calorias = 100 * calorias / gramos_alimento;
		}
		
		Producto prod = new Producto(nombre, grasas, grasas_saturadas, hidratos_carbono, azucar, proteinas, sal, calorias);
		return prod;
		
	}
	public static void VaciarCamposAgregarProducto(ArrayList<JTextField> fieldsAgregarProducto, ArrayList<JLabel> labelsAlertaAgregarProducto)
	{
		int size = labelsAlertaAgregarProducto.size();
		for (int i = 0; i<size;i++)
		{
			labelsAlertaAgregarProducto.get(i).setText("");
			fieldsAgregarProducto.get(i).setText("");
		}
	}

	public static void actualizarPanel(ArrayList <Producto> dieta, JTextPane panel, JComboBox Desplegable) {
		
		int length = dieta.size();
		
		if(length>0) {
			
			String stringPanel = "";
			Desplegable.removeAllItems();
			
			for(int i=0;i<length;i++) {
				
				Producto prod = dieta.get(i);
				Desplegable.addItem(prod.getNombre());
				stringPanel += "ID: "+i+prod.getNombre()+" Calorias: "+prod.getCalorias()+"\n";
			}
			
			panel.setText(stringPanel);
			
		}
		else
		{
			Desplegable.removeAllItems();
			panel.setText("");
		}
	}

}
