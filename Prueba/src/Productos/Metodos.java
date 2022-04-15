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
	
	
	
}
