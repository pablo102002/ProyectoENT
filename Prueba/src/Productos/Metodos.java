package Productos;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodos {
	public static void ComprobarCeldaVaciaString(JTextField celda,JLabel textoError) {
		if(celda.getText().equals("")) {
			textoError.setForeground(Color.RED);
			textoError.setText("!");
		}
		else {
			textoError.setForeground(Color.BLUE);
			textoError.setText("OK");
		}
	}
	
	public static void ComprobarCeldaValidaDouble(JTextField texto,JLabel textoError) {
		boolean isDigit=true;

		if(texto.getText().equals("")){
			textoError.setForeground(Color.RED);
			textoError.setText("!");
		}
		else {
			char[] v=texto.getText().toCharArray();
			int i=0;
			while(isDigit && i<v.length) {
				if(!Character.isDigit(v[i])) {
					textoError.setForeground(Color.RED);
					textoError.setText("!");
					isDigit=false;
				}
				else {
					textoError.setForeground(Color.BLUE);
					textoError.setText("OK");
				}
				i++;
			}
		}
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
