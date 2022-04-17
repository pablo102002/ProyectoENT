package Productos;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodos {
	public static void VaciarAlertas(ArrayList<JLabel> labelsAlertaAgregarProducto) {
		//Le pasas un array de labels que vaciara los mensajes de alerta
		int size = labelsAlertaAgregarProducto.size();
		for(int i = 0; i<size;i++)
		{
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
	
	public static boolean comprobarCantidadValida(JTextField FieldCantidad,JLabel LabelAlerta) {
		//Sirve para que el numero añadido no tenga letras ni numeros inferiores a 0
		
		//Convierto el texto de Cantidad_Gramos_Introducido a un array de Chars
		String texto = FieldCantidad.getText();
		char[] v=texto.toCharArray();
		int i=0;

		//Mientras el valor que encuentre sea un digito continuara hasta el final
		//Sino parará y mostrará un error
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
	
}
