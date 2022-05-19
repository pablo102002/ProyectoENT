package Productos;

/**
* Esta es la interfaz de usuario que utilizara el usuario para realizar su dieta
* Dentro contiene los objetos como los JLabels, JTextFields, JButtons  
* @author Johann / Pablo / Gabriel
* @version 0.1, 2022/05/19
*/

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ventana {

	private JFrame frame;
	private JTextField textField_CantidadGramosIntroducido;
	private JTextField textField_NombreAgregarProducto;
	private JTextField textField_MacrosCadaAgregarProducto;
	private JTextField textField_GrasasAgregarProducto;
	private JTextField textField_GrasasSaturadasAgregarProducto;
	private JTextField textField_HidratosAgregarProducto;
	private JTextField textField_AzucarAgregarProducto;
	private JTextField textField_ProteinasAgregarProducto;
	private JTextField textField_SalAgregarProducto;
	private JTextField textField_TotalCaloriasAgregarProducto;
	private JTextField textField_Edad;
	private JTextField textField_Peso;
	private JTextField textField_Altura;
	
	static boolean validEdad = true;
	static boolean validAltura = true;
	static boolean validPeso = true;
	static boolean personaRegistrada = false;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 255, 204));
		frame.setBounds(100, 100, 1400, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// **** CONTENIDO JPANEL panel_Titulo ****
		JPanel panel_Titulo = new JPanel();
		panel_Titulo.setBackground(new Color(153, 255, 255));
		panel_Titulo.setBounds(368, 11, 670, 73);
		frame.getContentPane().add(panel_Titulo);
		panel_Titulo.setLayout(null);
		
		JLabel Etiqueta_Titulo = new JLabel("DietCalc");
		Etiqueta_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Titulo.setFont(new Font("Linux Biolinum Keyboard O", Font.BOLD, 58));
		Etiqueta_Titulo.setBounds(44, 0, 529, 73);
		panel_Titulo.add(Etiqueta_Titulo);
		
		// **** FIN CONTENIDO JPANEL panel_Titulo ****

		
		
		
		// **** CONTENIDO JPANEL panel_Persona ****
	
		JPanel panel_Persona = new JPanel();
		panel_Persona.setBackground(new Color(153, 255, 255));
		panel_Persona.setBounds(25, 95, 1316, 161);
		frame.getContentPane().add(panel_Persona);
		panel_Persona.setLayout(null);

		//Sexo
		JLabel Etiqueta_Sexo = new JLabel("Sexo:");
		Etiqueta_Sexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		Etiqueta_Sexo.setBounds(39, 42, 46, 14);
		panel_Persona.add(Etiqueta_Sexo);
		
		JComboBox Desplegable_Sexo = new JComboBox();
		Desplegable_Sexo.setModel(new DefaultComboBoxModel(new String[] {"Mujer", "Hombre"}));
		Desplegable_Sexo.setBounds(26, 72, 78, 26);
		panel_Persona.add(Desplegable_Sexo);
		
		//Edad
		JLabel Etiqueta_Edad = new JLabel("Edad:");
		Etiqueta_Edad.setFont(new Font("Tahoma", Font.BOLD, 14));
		Etiqueta_Edad.setBounds(162, 42, 46, 14);
		panel_Persona.add(Etiqueta_Edad);
		
		textField_Edad = new JTextField();
		textField_Edad.setText("16");
		textField_Edad.setBounds(147, 75, 36, 21);
		panel_Persona.add(textField_Edad);
		textField_Edad.setColumns(10);
		
		JLabel Etiqueta_Edad_anyos= new JLabel("A\u00F1os");
		Etiqueta_Edad_anyos.setBounds(189, 82, 46, 14);
		panel_Persona.add(Etiqueta_Edad_anyos);
		
		JLabel Etiqueta_ErrorEdad = new JLabel("");
		Etiqueta_ErrorEdad.setBounds(81, 118, 251, 17);
		panel_Persona.add(Etiqueta_ErrorEdad);
		
		//Altura
		JLabel Etiqueta_Altura = new JLabel("Altura:");
		Etiqueta_Altura.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_Altura.setBounds(258, 42, 61, 14);
		panel_Persona.add(Etiqueta_Altura);
		
		textField_Altura = new JTextField();
		textField_Altura.setText("130");
		textField_Altura.setColumns(10);
		textField_Altura.setBounds(247, 77, 46, 21);
		panel_Persona.add(textField_Altura);
		
		JLabel Etiqueta_Altura_cm = new JLabel("cm");
		Etiqueta_Altura_cm.setBounds(299, 80, 36, 14);
		panel_Persona.add(Etiqueta_Altura_cm);
		
		JLabel Etiqueta_ErrorAltura = new JLabel("");
		Etiqueta_ErrorAltura.setForeground(Color.RED);
		Etiqueta_ErrorAltura.setBounds(133, 138, 284, 22);
		panel_Persona.add(Etiqueta_ErrorAltura);
		
		//Peso
		JLabel Etiqueta_Peso = new JLabel("Peso");
		Etiqueta_Peso.setFont(new Font("Tahoma", Font.BOLD, 14));
		Etiqueta_Peso.setBounds(371, 42, 46, 14);
		panel_Persona.add(Etiqueta_Peso);
		
		textField_Peso = new JTextField();
		textField_Peso.setText("40");
		textField_Peso.setColumns(10);
		textField_Peso.setBounds(363, 77, 36, 21);
		panel_Persona.add(textField_Peso);
		
		JLabel Etiqueta_Peso_kg = new JLabel("Kg");
		Etiqueta_Peso_kg.setBounds(409, 78, 25, 14);
		panel_Persona.add(Etiqueta_Peso_kg);
		
		JLabel Etiqueta_ErrorPeso = new JLabel("");
		Etiqueta_ErrorPeso.setBounds(342, 118, 244, 17);
		panel_Persona.add(Etiqueta_ErrorPeso);	
		
		//Actividad
		JLabel Etiqueta_ActividadFisica = new JLabel("Actividad Fisica");
		Etiqueta_ActividadFisica.setFont(new Font("Tahoma", Font.BOLD, 14));
		Etiqueta_ActividadFisica.setBounds(457, 42, 125, 14);
		panel_Persona.add(Etiqueta_ActividadFisica);
		
		JComboBox Desplegable_Actividad = new JComboBox();
		Desplegable_Actividad.setModel(new DefaultComboBoxModel(new String[] {"Poco", "Ligero", "Moderado", "Intenso", "Muy intenso"}));
		Desplegable_Actividad.setBounds(457, 74, 94, 22);
		panel_Persona.add(Desplegable_Actividad);
		
		JButton btn_infoActividad = new JButton("");
		btn_infoActividad.setIcon(new ImageIcon(Ventana.class.getResource("/img/icons8-acerca-de-17.png")));
		btn_infoActividad.setBounds(563, 74, 25, 22);
		panel_Persona.add(btn_infoActividad);
		
		//IMC
		JLabel Etiqueta_InformativaIMC = new JLabel("IMC");
		Etiqueta_InformativaIMC.setFont(new Font("Tahoma", Font.BOLD, 14));
		Etiqueta_InformativaIMC.setBounds(702, 44, 36, 14);
		panel_Persona.add(Etiqueta_InformativaIMC);
		
		JLabel Etiqueta_IMC = new JLabel("0");
		Etiqueta_IMC.setFont(new Font("Tahoma", Font.BOLD, 11));
		Etiqueta_IMC.setBounds(702, 78, 79, 14);
		panel_Persona.add(Etiqueta_IMC);
		
		JButton btn_infoIMC = new JButton("");
		btn_infoIMC.setIcon(new ImageIcon(Ventana.class.getResource("/img/icons8-acerca-de-17.png")));
		btn_infoIMC.setBounds(733, 36, 25, 22);
		panel_Persona.add(btn_infoIMC);
		
		//Boton para calcular IMC y TMB
		JButton btnCalcIMC_TMB = new JButton("Calcular");
		btnCalcIMC_TMB.setBounds(733, 112, 86, 23);
		panel_Persona.add(btnCalcIMC_TMB);
		
		//TMB
		//Basal
		JLabel Etiqueta_MetabolismoBasal = new JLabel("Metabolismo basal: ");
		Etiqueta_MetabolismoBasal.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_MetabolismoBasal.setBounds(989, 12, 210, 17);
		panel_Persona.add(Etiqueta_MetabolismoBasal);
		
		JLabel Etiqueta_calculo_basal = new JLabel("0");
		Etiqueta_calculo_basal.setBounds(1211, 12, 93, 17);
		panel_Persona.add(Etiqueta_calculo_basal);
		
		//Mantener
		JLabel Etiqueta_MantenerPeso = new JLabel("Calorias para mantener peso: ");
		Etiqueta_MantenerPeso.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_MantenerPeso.setBounds(989, 43, 210, 17);
		panel_Persona.add(Etiqueta_MantenerPeso);
		
		JLabel Etiqueta_calculo_mantener = new JLabel("0");
		Etiqueta_calculo_mantener.setBounds(1211, 43, 93, 17);
		panel_Persona.add(Etiqueta_calculo_mantener);
		
		//Adelgazar
		JLabel Etiqueta_Adelgazar = new JLabel("Calorias para adelgazar: ");
		Etiqueta_Adelgazar.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_Adelgazar.setBounds(989, 79, 210, 17);
		panel_Persona.add(Etiqueta_Adelgazar);
		
		JLabel Etiqueta_calculo_adelgazar = new JLabel("0");
		Etiqueta_calculo_adelgazar.setBounds(1211, 79, 93, 17);
		panel_Persona.add(Etiqueta_calculo_adelgazar);
		
		//Engordar
		JLabel Etiqueta_Engordar = new JLabel("Calorias para subir de peso: ");
		Etiqueta_Engordar.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_Engordar.setBounds(989, 112, 210, 17);
		panel_Persona.add(Etiqueta_Engordar);
		
		JLabel Etiqueta_calculo_engordar = new JLabel("0");
		Etiqueta_calculo_engordar.setBounds(1211, 115, 93, 17);
		panel_Persona.add(Etiqueta_calculo_engordar);
		
		// **** FIN CONTENIDO JPANEL panel_Persona ****
		
		
		
		
		// **** CONTENIDO JPANEL panel_AgregarProducto ****
		JPanel panel_AgregarProducto = new JPanel();
		panel_AgregarProducto.setLayout(null);
		panel_AgregarProducto.setBackground(new Color(153, 255, 255));
		panel_AgregarProducto.setBounds(25, 279, 340, 583);
		frame.getContentPane().add(panel_AgregarProducto);

		//Titulo
		JLabel Etiqueta_agregarProducto = new JLabel("Agregar Producto al Catalogo");
		Etiqueta_agregarProducto.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_agregarProducto.setBounds(28, 12, 266, 21);
		panel_AgregarProducto.add(Etiqueta_agregarProducto);
		
		//Nombre Producto
		JLabel Etiqueta_NombreAgregarProducto = new JLabel("Nombre del Alimento:");
		Etiqueta_NombreAgregarProducto.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_NombreAgregarProducto.setBounds(12, 61, 160, 17);
		panel_AgregarProducto.add(Etiqueta_NombreAgregarProducto);
		
		textField_NombreAgregarProducto = new JTextField();
		textField_NombreAgregarProducto.setBounds(178, 59, 102, 21);
		panel_AgregarProducto.add(textField_NombreAgregarProducto);
		textField_NombreAgregarProducto.setColumns(10);
		
		JLabel ErrorNombreAlimento = new JLabel("");
		ErrorNombreAlimento.setForeground(Color.RED);
		ErrorNombreAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorNombreAlimento.setBounds(288, 64, 46, 14);
		panel_AgregarProducto.add(ErrorNombreAlimento);
		
		//Macros cada...
		JLabel Etiqueta_MacrosCadaAgregarProducto = new JLabel("Macros cada:");
		Etiqueta_MacrosCadaAgregarProducto.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_MacrosCadaAgregarProducto.setBounds(12, 116, 121, 17);
		panel_AgregarProducto.add(Etiqueta_MacrosCadaAgregarProducto);
		
		textField_MacrosCadaAgregarProducto = new JTextField();
		textField_MacrosCadaAgregarProducto.setBounds(178, 114, 60, 21);
		panel_AgregarProducto.add(textField_MacrosCadaAgregarProducto);
		textField_MacrosCadaAgregarProducto.setColumns(10);
		
		JLabel ErrorMacrosCadaAlimento = new JLabel("");
		ErrorMacrosCadaAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorMacrosCadaAlimento.setForeground(Color.RED);
		ErrorMacrosCadaAlimento.setBounds(278, 118, 46, 14);
		panel_AgregarProducto.add(ErrorMacrosCadaAlimento);
		
		//Grasas
		JLabel Etiqueta_GrasasAgregarProducto = new JLabel("Grasas:");
		Etiqueta_GrasasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasAgregarProducto.setBounds(12, 155, 60, 17);
		panel_AgregarProducto.add(Etiqueta_GrasasAgregarProducto);
		
		textField_GrasasAgregarProducto = new JTextField();
		textField_GrasasAgregarProducto.setBounds(178, 154, 60, 20);
		panel_AgregarProducto.add(textField_GrasasAgregarProducto);
		textField_GrasasAgregarProducto.setColumns(10);
		
		JLabel ErrorGrasas = new JLabel("");
		ErrorGrasas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorGrasas.setForeground(Color.RED);
		ErrorGrasas.setBounds(273, 157, 46, 14);
		panel_AgregarProducto.add(ErrorGrasas);
		
		//Grasas Saturadas
		JLabel Etiqueta_GrasasSaturadasAgregarProducto = new JLabel("Grasas Saturadas:");
		Etiqueta_GrasasSaturadasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasSaturadasAgregarProducto.setBounds(12, 204, 137, 17);
		panel_AgregarProducto.add(Etiqueta_GrasasSaturadasAgregarProducto);
		
		textField_GrasasSaturadasAgregarProducto = new JTextField();
		textField_GrasasSaturadasAgregarProducto.setBounds(178, 201, 60, 20);
		panel_AgregarProducto.add(textField_GrasasSaturadasAgregarProducto);
		textField_GrasasSaturadasAgregarProducto.setColumns(10);
		
		JLabel ErrorGrasasSaturadas = new JLabel("");
		ErrorGrasasSaturadas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorGrasasSaturadas.setForeground(Color.RED);
		ErrorGrasasSaturadas.setBounds(273, 206, 46, 14);
		panel_AgregarProducto.add(ErrorGrasasSaturadas);
		
		//Hidratos
		JLabel Etiqueta_HidratosCarbonoAgregarProducto = new JLabel("Hidratos de Carbono:");
		Etiqueta_HidratosCarbonoAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_HidratosCarbonoAgregarProducto.setBounds(12, 259, 137, 17);
		panel_AgregarProducto.add(Etiqueta_HidratosCarbonoAgregarProducto);
		
		textField_HidratosAgregarProducto = new JTextField();
		textField_HidratosAgregarProducto.setBounds(178, 258, 60, 20);
		panel_AgregarProducto.add(textField_HidratosAgregarProducto);
		textField_HidratosAgregarProducto.setColumns(10);
		
		JLabel ErrorHidratos = new JLabel("");
		ErrorHidratos.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorHidratos.setForeground(Color.RED);
		ErrorHidratos.setBounds(273, 261, 46, 14);
		panel_AgregarProducto.add(ErrorHidratos);
		
		//Azucar
		JLabel Etiqueta_AzucarAgregarProducto = new JLabel("Azucar:");
		Etiqueta_AzucarAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_AzucarAgregarProducto.setBounds(12, 315, 60, 17);
		panel_AgregarProducto.add(Etiqueta_AzucarAgregarProducto);
		
		textField_AzucarAgregarProducto = new JTextField();
		textField_AzucarAgregarProducto.setBounds(178, 314, 60, 20);
		panel_AgregarProducto.add(textField_AzucarAgregarProducto);
		textField_AzucarAgregarProducto.setColumns(10);
		
		JLabel ErrorAzucar = new JLabel("");
		ErrorAzucar.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorAzucar.setForeground(Color.RED);
		ErrorAzucar.setBounds(273, 317, 46, 14);
		panel_AgregarProducto.add(ErrorAzucar);
		
		//Proteinas
		JLabel Etiqueta_ProteinasAgregarProducto = new JLabel("Proteinas:");
		Etiqueta_ProteinasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_ProteinasAgregarProducto.setBounds(12, 370, 60, 17);
		panel_AgregarProducto.add(Etiqueta_ProteinasAgregarProducto);
		
		textField_ProteinasAgregarProducto = new JTextField();
		textField_ProteinasAgregarProducto.setBounds(178, 369, 60, 20);
		panel_AgregarProducto.add(textField_ProteinasAgregarProducto);
		textField_ProteinasAgregarProducto.setColumns(10);
		
		JLabel ErrorProteinas = new JLabel("");
		ErrorProteinas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorProteinas.setForeground(Color.RED);
		ErrorProteinas.setBounds(273, 372, 46, 14);
		panel_AgregarProducto.add(ErrorProteinas);
		
		//Sal
		JLabel Etiqueta_SalAgregarProducto = new JLabel("Sal:");
		Etiqueta_SalAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_SalAgregarProducto.setBounds(14, 413, 60, 17);
		panel_AgregarProducto.add(Etiqueta_SalAgregarProducto);
		
		textField_SalAgregarProducto = new JTextField();
		textField_SalAgregarProducto.setBounds(178, 412, 62, 20);
		panel_AgregarProducto.add(textField_SalAgregarProducto);
		textField_SalAgregarProducto.setColumns(10);
		
		JLabel ErrorSal = new JLabel("");
		ErrorSal.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorSal.setForeground(Color.RED);
		ErrorSal.setBounds(273, 415, 46, 14);
		panel_AgregarProducto.add(ErrorSal);
		
		//Calorias totales
		JLabel Etiqueta_CaloriasTotalAgregarProducto = new JLabel("Total Calorias:");
		Etiqueta_CaloriasTotalAgregarProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_CaloriasTotalAgregarProducto.setBounds(12, 459, 108, 14);
		panel_AgregarProducto.add(Etiqueta_CaloriasTotalAgregarProducto);
		
		textField_TotalCaloriasAgregarProducto = new JTextField();
		textField_TotalCaloriasAgregarProducto.setBounds(178, 457, 62, 20);
		panel_AgregarProducto.add(textField_TotalCaloriasAgregarProducto);
		textField_TotalCaloriasAgregarProducto.setColumns(10);
		
		JLabel ErrorTotalCalorias = new JLabel("");
		ErrorTotalCalorias.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorTotalCalorias.setForeground(Color.RED);
		ErrorTotalCalorias.setBounds(273, 460, 46, 14);
		panel_AgregarProducto.add(ErrorTotalCalorias);
		
		//Alerta Errores Agregar Producto
		JLabel Etiqueta_Alerta_AgregarProducto = new JLabel("");
		Etiqueta_Alerta_AgregarProducto.setForeground(Color.RED);
		Etiqueta_Alerta_AgregarProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		Etiqueta_Alerta_AgregarProducto.setBounds(0, 504, 324, 22);
		panel_AgregarProducto.add(Etiqueta_Alerta_AgregarProducto);
		
		//Alerta Producto Agregado al catalogo		
		JLabel Etiqueta_ProductoAgregado = new JLabel("");
		Etiqueta_ProductoAgregado.setForeground(Color.BLUE);
		Etiqueta_ProductoAgregado.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_ProductoAgregado.setBounds(95, 496, 152, 30);
		panel_AgregarProducto.add(Etiqueta_ProductoAgregado);
		
		//Boton Agregar Producto al catalogo
		JButton botonAgregarProductoCatalogo = new JButton("Agregar Producto");
		botonAgregarProductoCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonAgregarProductoCatalogo.setBounds(76, 537, 162, 32);
		panel_AgregarProducto.add(botonAgregarProductoCatalogo);
		
		//Labels que solo tienen "gr"
		JLabel Etiqueta_Gramos_1_2 = new JLabel("gr");
		Etiqueta_Gramos_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_2.setBounds(243, 118, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_2);
		
		JLabel Etiqueta_Gramos_1_3 = new JLabel("gr");
		Etiqueta_Gramos_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_3.setBounds(243, 157, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_3);
		
		JLabel Etiqueta_Gramos_1_4 = new JLabel("gr");
		Etiqueta_Gramos_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_4.setBounds(243, 206, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_4);
		
		JLabel Etiqueta_Gramos_1_5 = new JLabel("gr");
		Etiqueta_Gramos_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_5.setBounds(243, 261, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_5);
		
		JLabel Etiqueta_Gramos_1_6 = new JLabel("gr");
		Etiqueta_Gramos_1_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_6.setBounds(243, 317, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_6);
		
		JLabel Etiqueta_Gramos_1_7 = new JLabel("gr");
		Etiqueta_Gramos_1_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_7.setBounds(243, 372, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_7);
		
		JLabel Etiqueta_Gramos_1_8 = new JLabel("gr");
		Etiqueta_Gramos_1_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_8.setBounds(245, 415, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_8);
		
		JLabel Etiqueta_Gramos_1_9 = new JLabel("gr");
		Etiqueta_Gramos_1_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_9.setBounds(245, 460, 20, 17);
		panel_AgregarProducto.add(Etiqueta_Gramos_1_9);
		
		// **** FIN CONTENIDO JPANEL panel_AgregarProducto ****
		
		
		
		
		// **** CONTENIDO JPANEL panel_Dieta ****
		JPanel panel_Dieta = new JPanel();
		panel_Dieta.setBackground(new Color(153, 255, 255));
		panel_Dieta.setBounds(1077, 279, 264, 583);
		frame.getContentPane().add(panel_Dieta);
		panel_Dieta.setLayout(null);
		
		//Titulo
		JLabel Etiqueta_TuDieta = new JLabel("Tu Dieta:");
		Etiqueta_TuDieta.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_TuDieta.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_TuDieta.setBounds(12, 12, 240, 21);
		panel_Dieta.add(Etiqueta_TuDieta);
		
		//Alerta Dieta
		JLabel Etiqueta_Alerta_Dieta = new JLabel("");
		Etiqueta_Alerta_Dieta.setForeground(Color.RED);
		Etiqueta_Alerta_Dieta.setFont(new Font("Dialog", Font.BOLD, 12));
		Etiqueta_Alerta_Dieta.setBounds(12, 39, 244, 22);
		panel_Dieta.add(Etiqueta_Alerta_Dieta);
		
		//Despegable
		JComboBox Desplegable_Dieta = new JComboBox();
		Desplegable_Dieta.setBounds(12, 77, 98, 26);
		panel_Dieta.add(Desplegable_Dieta);
		
		//Boton BorrarProducto de la dieta
		JButton boton_BorrarProductoDieta = new JButton("Borrar Producto");
		boton_BorrarProductoDieta.setBounds(122, 76, 134, 27);
		panel_Dieta.add(boton_BorrarProductoDieta);
		
		//Panel de texto para la dieta
		JTextPane Panel_Alimentos_Ingeridos = new JTextPane();
		Panel_Alimentos_Ingeridos.setEditable(false);
		Panel_Alimentos_Ingeridos.setBounds(12, 114, 244, 238);
		panel_Dieta.add(Panel_Alimentos_Ingeridos);
		
		// **** FIN CONTENIDO JPANEL panel_Dieta ****
		
		
		
		
		// **** CONTENIDO JPANEL panel_ChecksComidaEquilibrada ****
		JPanel panel_ChecksComidaEquilibrada = new JPanel();
		panel_ChecksComidaEquilibrada.setBounds(25, 874, 1316, 135);
		frame.getContentPane().add(panel_ChecksComidaEquilibrada);
		panel_ChecksComidaEquilibrada.setBackground(new Color(153, 255, 255));
		panel_ChecksComidaEquilibrada.setLayout(null);
		
		//Boton para calcular la dieta
		JButton Boton_CalcularDieta = new JButton("Calcular Dieta");
		Boton_CalcularDieta.setFont(new Font("Tahoma", Font.BOLD, 13));
		Boton_CalcularDieta.setBounds(12, 55, 135, 45);
		panel_ChecksComidaEquilibrada.add(Boton_CalcularDieta);
		
		//Alerta para el boton calcularDieta
		JLabel Etiqueta_AlertaCalcularDieta = new JLabel("");
		Etiqueta_AlertaCalcularDieta.setForeground(Color.RED);
		Etiqueta_AlertaCalcularDieta.setFont(new Font("Dialog", Font.BOLD, 16));
		Etiqueta_AlertaCalcularDieta.setBackground(new Color(204, 255, 255));
		Etiqueta_AlertaCalcularDieta.setBounds(22, 101, 192, 22);
		panel_ChecksComidaEquilibrada.add(Etiqueta_AlertaCalcularDieta);
		
		//Calorias Requeridas
		JLabel lblCaloriasRequeridas = new JLabel("Calorias que debes consumir:");
		lblCaloriasRequeridas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCaloriasRequeridas.setBounds(151, 12, 192, 14);
		panel_ChecksComidaEquilibrada.add(lblCaloriasRequeridas);
		
		JLabel Etiqueta_calculo_requeridas = new JLabel("0");
		Etiqueta_calculo_requeridas.setBounds(227, 43, 55, 17);
		panel_ChecksComidaEquilibrada.add(Etiqueta_calculo_requeridas);
		
		//Calorias Consumidas
		JLabel lblCaloriasConsumidas = new JLabel("Calorias que Consumes:");
		lblCaloriasConsumidas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCaloriasConsumidas.setBounds(355, 12, 162, 14);
		panel_ChecksComidaEquilibrada.add(lblCaloriasConsumidas);
		
		JLabel Etiqueta_calculo_consumidas = new JLabel("0");
		Etiqueta_calculo_consumidas.setBounds(411, 46, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_calculo_consumidas);
		
		//Consumo Grasas
		JLabel lblConsumoGrasas = new JLabel("Consumo de grasas:");
		lblConsumoGrasas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsumoGrasas.setBounds(583, 8, 148, 22);
		panel_ChecksComidaEquilibrada.add(lblConsumoGrasas);
		
		JLabel Etiqueta_ConsumoGrasas = new JLabel("0");
		Etiqueta_ConsumoGrasas.setBounds(614, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_ConsumoGrasas);
		
		JPanel panel_ColorConsumoGrasas = new JPanel();
		panel_ColorConsumoGrasas.setBackground(new Color(153, 255, 255));
		panel_ColorConsumoGrasas.setBounds(583, 78, 76, 22);
		panel_ChecksComidaEquilibrada.add(panel_ColorConsumoGrasas);
		
		//Consumo Azucar
		JLabel lblConsumoAzucar = new JLabel("Consumo de Azucar:");
		lblConsumoAzucar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsumoAzucar.setBounds(830, 13, 148, 14);
		panel_ChecksComidaEquilibrada.add(lblConsumoAzucar);
		
		JLabel Etiqueta_ConsumoAzucar = new JLabel("0");
		Etiqueta_ConsumoAzucar.setBounds(861, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_ConsumoAzucar);
		
		JPanel panel_ColorConsumoAzucar = new JPanel();
		panel_ColorConsumoAzucar.setBackground(new Color(153, 255, 255));
		panel_ColorConsumoAzucar.setBounds(850, 78, 76, 22);
		panel_ChecksComidaEquilibrada.add(panel_ColorConsumoAzucar);
		
		//Consumo Sal
		JLabel lblConsumoSal = new JLabel("Consumo de Sal:");
		lblConsumoSal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsumoSal.setBounds(1074, 13, 148, 14);
		panel_ChecksComidaEquilibrada.add(lblConsumoSal);
		
		JLabel Etiqueta_ConsumoSal = new JLabel("0");
		Etiqueta_ConsumoSal.setBounds(1111, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_ConsumoSal);
		
		JPanel panel_ColorConsumoSal = new JPanel();
		panel_ColorConsumoSal.setBackground(new Color(153, 255, 255));
		panel_ColorConsumoSal.setBounds(1087, 78, 76, 22);
		panel_ChecksComidaEquilibrada.add(panel_ColorConsumoSal);
		
		//Boton info colores
		JButton btn_infoColores = new JButton("");
		btn_infoColores.setIcon(new ImageIcon(Ventana.class.getResource("/img/icons8-acerca-de-17.png")));
		btn_infoColores.setBounds(1232, 38, 25, 22);
		panel_ChecksComidaEquilibrada.add(btn_infoColores);
		
		//Labels que solo tienen "%"
		JLabel Etiqueta_porcentaje = new JLabel("%");
		Etiqueta_porcentaje.setBounds(660, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_porcentaje);
		
		JLabel Etiqueta_porcentaje_1 = new JLabel("%");
		Etiqueta_porcentaje_1.setBounds(899, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_porcentaje_1);
		
		JLabel Etiqueta_porcentaje_2 = new JLabel("%");
		Etiqueta_porcentaje_2.setBounds(1144, 43, 46, 14);
		panel_ChecksComidaEquilibrada.add(Etiqueta_porcentaje_2);
		
		// **** FIN CONTENIDO JPANEL panel_ChecksComidaEquilibrada ****
		
		
		
		
		// **** CONTENIDO JPANEL panel_Ingesta ****
		JPanel panel_Ingesta = new JPanel();
		panel_Ingesta.setBackground(new Color(153, 255, 255));
		panel_Ingesta.setBounds(401, 279, 622, 583);
		frame.getContentPane().add(panel_Ingesta);
		panel_Ingesta.setLayout(null);

		//Titulo
		JLabel Etiqueta_QueHasComido = new JLabel("¿Que has comido?");
		Etiqueta_QueHasComido.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_QueHasComido.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_QueHasComido.setBounds(209, 0, 172, 21);
		panel_Ingesta.add(Etiqueta_QueHasComido);
		
		JLabel Etiqueta_Grasas = new JLabel("Grasas:");
		Etiqueta_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas.setBounds(42, 127, 60, 17);
		panel_Ingesta.add(Etiqueta_Grasas);
		
		JLabel Etiqueta_GrasasSaturadas = new JLabel("Grasas Saturadas:");
		Etiqueta_GrasasSaturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GrasasSaturadas.setBounds(42, 193, 106, 17);
		panel_Ingesta.add(Etiqueta_GrasasSaturadas);
		
		JLabel Etiqueta_HidratosCarbono = new JLabel("Hidratos de Carbono:");
		Etiqueta_HidratosCarbono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_HidratosCarbono.setBounds(42, 262, 137, 17);
		panel_Ingesta.add(Etiqueta_HidratosCarbono);
		
		JLabel Etiqueta_Azucar = new JLabel("Azucar:");
		Etiqueta_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Azucar.setBounds(42, 323, 60, 17);
		panel_Ingesta.add(Etiqueta_Azucar);
		
		JLabel Etiqueta_Proteinas = new JLabel("Proteinas:");
		Etiqueta_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Proteinas.setBounds(42, 389, 60, 17);
		panel_Ingesta.add(Etiqueta_Proteinas);
		
		JLabel Etiqueta_Sal = new JLabel("Sal:");
		Etiqueta_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Sal.setBounds(42, 458, 60, 17);
		panel_Ingesta.add(Etiqueta_Sal);
		
		JLabel Etiqueta_GramosHidratos = new JLabel("0");
		Etiqueta_GramosHidratos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosHidratos.setBounds(191, 262, 43, 17);
		panel_Ingesta.add(Etiqueta_GramosHidratos);
		
		JLabel Etiqueta_GramosGrasasSaturadas = new JLabel("0");
		Etiqueta_GramosGrasasSaturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosGrasasSaturadas.setBounds(191, 193, 43, 17);
		panel_Ingesta.add(Etiqueta_GramosGrasasSaturadas);
		
		JLabel Etiqueta_GramosGrasas = new JLabel("0");
		Etiqueta_GramosGrasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosGrasas.setBounds(191, 127, 43, 17);
		panel_Ingesta.add(Etiqueta_GramosGrasas);
		
		JLabel Gramos_Proteinas = new JLabel("0");
		Gramos_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas.setBounds(191, 389, 41, 17);
		panel_Ingesta.add(Gramos_Proteinas);
		
		JLabel Gramos_Azucar = new JLabel("0");
		Gramos_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar.setBounds(191, 323, 43, 17);
		panel_Ingesta.add(Gramos_Azucar);
		
		JLabel Gramos_Sal = new JLabel("0");
		Gramos_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal.setBounds(191, 458, 43, 17);
		panel_Ingesta.add(Gramos_Sal);
		
		JLabel Etiqueta_Gramos_1 = new JLabel("gr");
		Etiqueta_Gramos_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1.setBounds(226, 127, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_1);
		
		JLabel Etiqueta_Gramos_2 = new JLabel("gr");
		Etiqueta_Gramos_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2.setBounds(226, 193, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_2);
		
		JLabel Etiqueta_Gramos_3 = new JLabel("gr");
		Etiqueta_Gramos_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3.setBounds(226, 262, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_3);
		
		JLabel Etiqueta_Gramos_4 = new JLabel("gr");
		Etiqueta_Gramos_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4.setBounds(223, 323, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_4);
		
		JLabel Etiqueta_Gramos_5 = new JLabel("gr");
		Etiqueta_Gramos_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5.setBounds(223, 389, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_5);
		
		JLabel Etiqueta_Gramos_6 = new JLabel("gr");
		Etiqueta_Gramos_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6.setBounds(223, 458, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_6);
		
		JLabel Etiqueta_MacrosCada100gr = new JLabel("Macros cada 100 gr");
		Etiqueta_MacrosCada100gr.setBounds(42, 90, 192, 26);
		panel_Ingesta.add(Etiqueta_MacrosCada100gr);
		Etiqueta_MacrosCada100gr.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_MacrosSeleccionados = new JLabel("Macros cada ");
		Etiqueta_MacrosSeleccionados.setBounds(351, 90, 118, 26);
		panel_Ingesta.add(Etiqueta_MacrosSeleccionados);
		Etiqueta_MacrosSeleccionados.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_NumerodeGramosSeleccionados = new JLabel("0");
		Etiqueta_NumerodeGramosSeleccionados.setBounds(468, 96, 52, 14);
		panel_Ingesta.add(Etiqueta_NumerodeGramosSeleccionados);
		Etiqueta_NumerodeGramosSeleccionados.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_gramos_7 = new JLabel("gr");
		Etiqueta_gramos_7.setBounds(521, 93, 20, 23);
		panel_Ingesta.add(Etiqueta_gramos_7);
		Etiqueta_gramos_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_GrasasUsuario = new JLabel("Grasas:");
		Etiqueta_GrasasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GrasasUsuario.setBounds(351, 127, 60, 17);
		panel_Ingesta.add(Etiqueta_GrasasUsuario);
		
		JLabel Etiqueta_GrasasSaturadasUsuario = new JLabel("Grasas Saturadas:");
		Etiqueta_GrasasSaturadasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GrasasSaturadasUsuario.setBounds(351, 193, 106, 17);
		panel_Ingesta.add(Etiqueta_GrasasSaturadasUsuario);
		
		JLabel Etiqueta_HidratosCarbonoUsuario = new JLabel("Hidratos de Carbono:");
		Etiqueta_HidratosCarbonoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_HidratosCarbonoUsuario.setBounds(351, 262, 137, 17);
		panel_Ingesta.add(Etiqueta_HidratosCarbonoUsuario);
		
		JLabel Etiqueta_AzucarUsuario = new JLabel("Azucar:");
		Etiqueta_AzucarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_AzucarUsuario.setBounds(351, 323, 60, 17);
		panel_Ingesta.add(Etiqueta_AzucarUsuario);
		
		JLabel Etiqueta_ProteinasUsuario = new JLabel("Proteinas:");
		Etiqueta_ProteinasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_ProteinasUsuario.setBounds(351, 389, 60, 17);
		panel_Ingesta.add(Etiqueta_ProteinasUsuario);
		
		JLabel Etiqueta_SalUsuario = new JLabel("Sal:");
		Etiqueta_SalUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_SalUsuario.setBounds(351, 458, 60, 17);
		panel_Ingesta.add(Etiqueta_SalUsuario);
		
		JLabel Etiqueta_GramosHidratosUsuario = new JLabel("0");
		Etiqueta_GramosHidratosUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosHidratosUsuario.setBounds(488, 262, 53, 17);
		panel_Ingesta.add(Etiqueta_GramosHidratosUsuario);
		
		JLabel Etiqueta_GramosGrasasSaturadasUsuario = new JLabel("0");
		Etiqueta_GramosGrasasSaturadasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosGrasasSaturadasUsuario.setBounds(488, 193, 53, 17);
		panel_Ingesta.add(Etiqueta_GramosGrasasSaturadasUsuario);
		
		JLabel Etiqueta_GramosGrasasUsuario = new JLabel("0");
		Etiqueta_GramosGrasasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosGrasasUsuario.setBounds(488, 127, 53, 17);
		panel_Ingesta.add(Etiqueta_GramosGrasasUsuario);
		
		JLabel Etiqueta_GramosProteinasUsuario = new JLabel("0");
		Etiqueta_GramosProteinasUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosProteinasUsuario.setBounds(488, 389, 53, 17);
		panel_Ingesta.add(Etiqueta_GramosProteinasUsuario);
		
		JLabel Etiqueta_GramosAzucarUsuario = new JLabel("0");
		Etiqueta_GramosAzucarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_GramosAzucarUsuario.setBounds(488, 323, 53, 17);
		panel_Ingesta.add(Etiqueta_GramosAzucarUsuario);
		
		JLabel Gramos_Sal_Usuario = new JLabel("0");
		Gramos_Sal_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal_Usuario.setBounds(488, 458, 53, 17);
		panel_Ingesta.add(Gramos_Sal_Usuario);
		
		JLabel Etiqueta_Gramos_1_1 = new JLabel("gr");
		Etiqueta_Gramos_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_1.setBounds(548, 127, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_1_1);
		
		JLabel Etiqueta_Gramos_2_1 = new JLabel("gr");
		Etiqueta_Gramos_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2_1.setBounds(548, 193, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_2_1);
		
		JLabel Etiqueta_Gramos_3_1 = new JLabel("gr");
		Etiqueta_Gramos_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3_1.setBounds(548, 262, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_3_1);
		
		JLabel Etiqueta_Gramos_4_1 = new JLabel("gr");
		Etiqueta_Gramos_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4_1.setBounds(548, 323, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_4_1);
		
		JLabel Etiqueta_Gramos_5_1 = new JLabel("gr");
		Etiqueta_Gramos_5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5_1.setBounds(548, 389, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_5_1);
		
		JLabel Etiqueta_Gramos_6_1 = new JLabel("gr");
		Etiqueta_Gramos_6_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6_1.setBounds(548, 458, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos_6_1);
		
		
		JPanel panel_Calorias_100gr = new JPanel();
		panel_Calorias_100gr.setBackground(new Color(153, 255, 204));
		panel_Calorias_100gr.setBounds(42, 526, 190, 46);
		panel_Ingesta.add(panel_Calorias_100gr);
		panel_Calorias_100gr.setLayout(null);
		
		JLabel Etiqueta_Calorias = new JLabel("Calorias");
		Etiqueta_Calorias.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_Calorias.setBounds(92, 11, 74, 24);
		panel_Calorias_100gr.add(Etiqueta_Calorias);
		
		JLabel Etiqueta_Total_Calorias_100gr = new JLabel("0");
		Etiqueta_Total_Calorias_100gr.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Total_Calorias_100gr.setBounds(27, 12, 55, 20);
		panel_Calorias_100gr.add(Etiqueta_Total_Calorias_100gr);
		
		JPanel panel_Calorias_100gr_Usuario = new JPanel();
		panel_Calorias_100gr_Usuario.setBackground(new Color(153, 255, 204));
		panel_Calorias_100gr_Usuario.setBounds(351, 526, 190, 46);
		panel_Ingesta.add(panel_Calorias_100gr_Usuario);
		panel_Calorias_100gr_Usuario.setLayout(null);
		
		JLabel Etiqueta_Calorias_1 = new JLabel("Calorias");
		Etiqueta_Calorias_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_Calorias_1.setBounds(106, 10, 74, 24);
		panel_Calorias_100gr_Usuario.add(Etiqueta_Calorias_1);
		
		JLabel Etiqueta_Total_Calorias_Usuario = new JLabel("0");
		Etiqueta_Total_Calorias_Usuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Total_Calorias_Usuario.setBounds(30, 11, 55, 20);
		panel_Calorias_100gr_Usuario.add(Etiqueta_Total_Calorias_Usuario);
		
		JLabel Total_Calorias_100gr = new JLabel("Total Calorias:");
		Total_Calorias_100gr.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total_Calorias_100gr.setBounds(76, 486, 124, 29);
		panel_Ingesta.add(Total_Calorias_100gr);
		
		JLabel Total_Calorias_100gr_1 = new JLabel("Total Calorias:");
		Total_Calorias_100gr_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total_Calorias_100gr_1.setBounds(385, 486, 124, 29);
		panel_Ingesta.add(Total_Calorias_100gr_1);
		
		JLabel Etiqueta_Alerta_Ingesta = new JLabel("");
		Etiqueta_Alerta_Ingesta.setFont(new Font("Dialog", Font.BOLD, 12));
		Etiqueta_Alerta_Ingesta.setForeground(Color.RED);
		Etiqueta_Alerta_Ingesta.setBounds(191, 72, 338, 22);
		panel_Ingesta.add(Etiqueta_Alerta_Ingesta);
		
		textField_CantidadGramosIntroducido = new JTextField();
		textField_CantidadGramosIntroducido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_CantidadGramosIntroducido.setBounds(221, 35, 70, 23);
		panel_Ingesta.add(textField_CantidadGramosIntroducido);

		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("Gr");
		Etiqueta_Gramos.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Gramos.setBounds(317, 42, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos);

		//Boton Agregar
		JButton Boton_AgregarProducto = new JButton("Agregar");
		Boton_AgregarProducto.setBounds(351, 26, 106, 41);
		panel_Ingesta.add(Boton_AgregarProducto);

		JButton boton_BorrarProducto = new JButton("Borrar Producto");
		boton_BorrarProducto.setBounds(468, 26, 131, 41);
		panel_Ingesta.add(boton_BorrarProducto);
		
		JComboBox Desplegable_Catalogo = new JComboBox();
		Desplegable_Catalogo.setBounds(42, 33, 124, 26);
		panel_Ingesta.add(Desplegable_Catalogo);
		
		JLabel Etiqueta_Catalogo = new JLabel("Catalogo");
		Etiqueta_Catalogo.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Catalogo.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_Catalogo.setBounds(22, 4, 172, 21);
		panel_Ingesta.add(Etiqueta_Catalogo);
		
		// **** FIN CONTENIDO JPANEL panel_Ingesta ****
		
		
		/**
		*OBJETOS LOS CUALES TIENEN FUNCIONES
		*/
		
		//Lista de productos referenciados a la ArrayList de la clase Productos
		//Creamos un objeto de la clase ListadoProductos
		
		ListadoProductos ArrayListaProductos=new ListadoProductos();
		
		//Dentro del objeto creado ArrayListaProductos contiene un Arraylist que guarda productos
		//Agregamos unos por defecto
		//Para crear cada alimento este es el esquema "Producto(nombre, grasas, grasas_saturadas, hidratos_carbono,  azucar, proteinas, sal, calorias)"

		ArrayListaProductos.insertarProducto(new Producto("Almendras", 50.64, 3.881, 19.74, 4.8, 21.26, 0,578));
		ArrayListaProductos.insertarProducto(new Producto("Macarrones", 0.92, 0.175, 30.68, 0.56, 5.76, 0.58,157));
		ArrayListaProductos.insertarProducto(new Producto("Arroz", 4, 0.12, 44.08, 0.08, 4.2, 0.72,204));
		ArrayListaProductos.insertarProducto(new Producto("Pollo",7.72,2.17,0,0,29.55,0.98,195));
		ArrayListaProductos.insertarProducto(new Producto("Avena",6.9,1.21,66.27,0,16.89,0,389));
		
		ArrayListaProductos.insertarProducto(new Producto("Leche Semidesnatada",1.6,1.1,4.8,4.8,3.1,0.13,46));
		ArrayListaProductos.insertarProducto(new Producto("Tomate Frito",3.5,0.3,9.5,6.9,1.5,1,77));
		ArrayListaProductos.insertarProducto(new Producto("At�n claro en aceite de oliva",31,4.6,0.9,0.5,19,0.9,357));
		ArrayListaProductos.insertarProducto(new Producto("Galletas Mar�a",15,9.1,71,20,7,1,452));
		ArrayListaProductos.insertarProducto(new Producto("Zumo de Manzana",0.1,0,11.3,10.5,0.1,0,44));
		ArrayListaProductos.insertarProducto(new Producto("Patatas fritas Lay's",29.2,3.7,52.7,0.7,6.3,1.2,509));
		ArrayListaProductos.insertarProducto(new Producto("Coca-Cola",0,0,10.6,10.6,0,0,42));
		ArrayListaProductos.insertarProducto(new Producto("Ensalada mezcla gourmet",0.3,0.04,3.1,0.5,1.4,0.06,26));
		ArrayListaProductos.insertarProducto(new Producto("Chocolate Milka",29,18,59,58,6.3,0.37,530));
		ArrayListaProductos.insertarProducto(new Producto("Flan de queso",6,3.6,18.7,18.7,4.6,0.18,148));

		

		//Creamos el objeto Ingesta
		//Tiene un arraylist de los Productos que el usuario a agregado a su dieta
		Ingesta ing=new Ingesta();


		//Array que guarda los JLabel de los que hace referencia a 100g dentro del panel_Ingesta
		ArrayList<JLabel> labelsMacros100=new ArrayList<JLabel>();
		labelsMacros100.add(Etiqueta_GramosGrasas);
		labelsMacros100.add(Etiqueta_GramosGrasasSaturadas);
		labelsMacros100.add(Etiqueta_GramosHidratos);
		labelsMacros100.add(Gramos_Azucar);
		labelsMacros100.add(Gramos_Proteinas);
		labelsMacros100.add(Gramos_Sal);
		labelsMacros100.add(Etiqueta_Total_Calorias_100gr);

		//Array que guarda los JLabel de los que hace referencia a los gramos consumidos por el usuario
		ArrayList<JLabel> labelsUsuario=new ArrayList<JLabel>();
		labelsUsuario.add(Etiqueta_GramosGrasasUsuario);
		labelsUsuario.add(Etiqueta_GramosGrasasSaturadasUsuario);
		labelsUsuario.add(Etiqueta_GramosHidratosUsuario);
		labelsUsuario.add(Etiqueta_GramosAzucarUsuario);
		labelsUsuario.add(Etiqueta_GramosProteinasUsuario);
		labelsUsuario.add(Gramos_Sal_Usuario);
		labelsUsuario.add(Etiqueta_Total_Calorias_Usuario);

		
		
		// ++++ Eventos panel_Ingesta ++++
		
		//Despeglable Catalogo
		Desplegable_Catalogo.addItemListener(new ItemListener() {
			//Cuando se cambie el valor del desplegable, los macros del producto se aplicaran y se mostraran
			public void itemStateChanged(ItemEvent arg0) {
				
				//Reseteamos alertas de la dieta y productos agregados para que no este siempre
				Etiqueta_Alerta_Dieta.setText("");
				Etiqueta_ProductoAgregado.setText("");
				
				//Reseteamos el valor a 0 de la cantidad de gramos
				textField_CantidadGramosIntroducido.setText("0");
				
				//Primero coge el indice del numero del despegable Catalogo
				Integer NumeroLista = Desplegable_Catalogo.getSelectedIndex();
				//Segun el indice anterior, saca el Producto del Array de Productos de ListadoProductos con nombre ArrayListaProductos
				Producto ProductoElegido = ArrayListaProductos.ListaProductos.get(NumeroLista);
				//Llama al metodo que actualizara la lista
				
				/**
				* Este metodo actualizara los labels de macros cada 100g
				* @param param1 Producto del Catalogo seleccionado
				* @param param2 Array de los labels que tienen que cambiarse
				*/
				Metodos.actualizarMacros100g(ProductoElegido, labelsMacros100);
			}
		});
		
		//Bucle el cual recorre toda la ArrayList de La lista de productos y agrega al desplegable el nombre de cada objeto Producto
		for(int i=0;i<ArrayListaProductos.ListaProductos.size();i++) {
			Desplegable_Catalogo.addItem(ArrayListaProductos.ListaProductos.get(i).getNombre());
		}
		
		//Field Cantidad Gramos Consumidos
		//Sirve para actualizar la candidad de gramos que pone le usuario
		textField_CantidadGramosIntroducido.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				//Reseteamos alertas de la dieta y productos agregados para que no este siempre
				Etiqueta_Alerta_Dieta.setText("");
				Etiqueta_Alerta_Ingesta.setText("");

				//Si no esta vacio, realizara lo de dentro
				if(!textField_CantidadGramosIntroducido.getText().isEmpty()) {

					/**
					 * Comprobara si el valor introducido es valido
					 * Valido en no vacio, no menor que 0 y sin digitos
					 * @param param1 El objeto textField con la cantidad de gramos que introduce el usuario
					 * @return si consigue terminarlo devolverá true
					 * @return sino devolvera false
					 */
					boolean Valido = Metodos.comprobarCantidadValida(textField_CantidadGramosIntroducido);

					//Sí devuelve false mostrara un error
					//Sino, realizara los calculos para mostrarlos en las macros consumidas por el usuario
					if(!Valido) {
						Etiqueta_Alerta_Ingesta.setText("Valor erroneo, tienes que introducir un numero positivo");
					}
					else
					{
						//convertimos el JTextField en un Double para hacer los calculos
						String texto = textField_CantidadGramosIntroducido.getText();
						double cantidadGramos=Double.parseDouble(texto);

						//Actualizara los labels del usuario, mostrando asi el resultado
						Etiqueta_NumerodeGramosSeleccionados.setText(texto);

						for(int j=0;j<labelsMacros100.size();j++) {
							/**
							 * El metodo calculara los macros cada 100 por la cantidad y el resultado lo mostrara en su label correspodiente
							 * @param param1 Label de un campo especifico
							 * @param param2 Label relacionado con el campo anterior
							 * @param param3 Cantidad de gramos que ha introducido el usuario
							 */
							//Le pasa al metodo (Label del cual realizara el calculo, Label donde se mostrara el calculo, int con el valor de cantidad de Gramos)
							Metodos.calcularMostrarMacrosUsuario(labelsMacros100.get(j),labelsUsuario.get(j), cantidadGramos);

						}
					}	
				}
			}
		});
		
		
		
		
		

		Boton_AgregarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Etiqueta_Alerta_Dieta.setText("");
				
				//Si el campo de los gramos esta vacio o a 0 no introduce producto
				if(textField_CantidadGramosIntroducido.getText().equals("") || textField_CantidadGramosIntroducido.getText().equals("0")) {
					Etiqueta_Alerta_Ingesta.setText("El campo no agregarse como vacio o 0");;
				}else {
					//Sirve para poner todos Label de usuario 
					for(int i=0;i<labelsUsuario.size();i++) {
						labelsUsuario.get(i).setText("0");
					}


					//Cogemos el La cantidad de Gramos Introducido
					double CantidadGramosConsumido = Double.parseDouble(textField_CantidadGramosIntroducido.getText());
					//Ya podemos pasar ciertos campos a valor 0
					textField_CantidadGramosIntroducido.setText("");
					Etiqueta_NumerodeGramosSeleccionados.setText("0");
					//Cogemos el producto seleccionado del desplegable del Catalogo
					Producto PrAgregado = ArrayListaProductos.ListaProductos.get(Desplegable_Catalogo.getSelectedIndex());
					//Y ambos, se lo pasamos a la Ingesta y que lo implemente
					/**
					* Agrega el producto a la clase ingesta que tenemos 
					* Dentro del metodo se calcularan los campos y se guardaran los productos
					* @param param1 Producto a ingresar a ingesta/dieta
					* @param param2 Cantidad de gramos que ingerio el usuario para calcularse					
					*/
					ing.insertarProducto(PrAgregado, CantidadGramosConsumido);

					/**
					* Le pasa el array list de la dieta para que se vea visualmente el producto agregado
					* @param param1 ArrayList de la dieta/ingesta
					* @param param2 Panel donde añadiremos visualmente el producto agregado
					* @param param3 Desplegable que añadira a si mismo el Producto agregado	
					*/
					Metodos.actualizarPanelDieta(ing.dieta, Panel_Alimentos_Ingeridos, Desplegable_Dieta);
				}
			}
		});
		
		//Boton Borrar Producto del Catalogo
		
		boton_BorrarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Etiqueta_Alerta_Dieta.setText("");
				
				if(Desplegable_Catalogo.getItemCount()>1)
				{
					Etiqueta_Alerta_Ingesta.setText("");
				//Primero coge el indice del Producto de Catalogo
				Integer NumeroLista = Desplegable_Catalogo.getSelectedIndex();
				//Coge el nombre
				String cat = Desplegable_Catalogo.getSelectedItem().toString();
				//Lo borra del Catalogo
				Desplegable_Catalogo.removeItemAt(NumeroLista);
				//Borra el primer Producto que coincida con el nombre del Array de los Productos
				ArrayListaProductos.eliminarProducto(cat);
				}
				else
					Etiqueta_Alerta_Ingesta.setText("No puedes tener 0 Productos");
			}
		});
		
		
		
		//Array de Etiquetas a�adir Productos 
		ArrayList<JTextField> fieldsAgregarProducto=new ArrayList<JTextField>();
		fieldsAgregarProducto.add(textField_NombreAgregarProducto);
		fieldsAgregarProducto.add(textField_MacrosCadaAgregarProducto);
		fieldsAgregarProducto.add(textField_GrasasAgregarProducto);
		fieldsAgregarProducto.add(textField_GrasasSaturadasAgregarProducto);
		fieldsAgregarProducto.add(textField_HidratosAgregarProducto);
		fieldsAgregarProducto.add(textField_AzucarAgregarProducto);
		fieldsAgregarProducto.add(textField_ProteinasAgregarProducto);
		fieldsAgregarProducto.add(textField_SalAgregarProducto);
		fieldsAgregarProducto.add(textField_TotalCaloriasAgregarProducto);
		
		ArrayList<JLabel> labelsAlertaAgregarProducto=new ArrayList<JLabel>();
		labelsAlertaAgregarProducto.add(ErrorNombreAlimento);
		labelsAlertaAgregarProducto.add(ErrorMacrosCadaAlimento);
		labelsAlertaAgregarProducto.add(ErrorGrasas);
		labelsAlertaAgregarProducto.add(ErrorGrasasSaturadas);
		labelsAlertaAgregarProducto.add(ErrorHidratos);
		labelsAlertaAgregarProducto.add(ErrorAzucar);
		labelsAlertaAgregarProducto.add(ErrorProteinas);
		labelsAlertaAgregarProducto.add(ErrorSal);
		labelsAlertaAgregarProducto.add(ErrorTotalCalorias);
		
		
		//Boton para agregar un nuevo producto
		
		
		botonAgregarProductoCatalogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Etiqueta_Alerta_Dieta.setText("");
				
				/**
				* Comprueba que los todos los campos especificos de Agregar Producto sean los correctos
				* @param param1 ArrayList de TextFields especificos
				* @param param2 ArrayList de Jlabels especificos de las alertas "!" individuales
				* @param param3 Label que mostrar que tipo error se ha producido 
				* @return Devolvera true si termina todo el metodo
				* @return Devolvera false si ha encontrado un error
				*/
				boolean ComprobanteCeldasValidas = Metodos.comprobarCeldasValidasAgregarProducto(fieldsAgregarProducto, labelsAlertaAgregarProducto, Etiqueta_Alerta_AgregarProducto);
				
				boolean ComprobanteGrasaAzucar;
				
				if(ComprobanteCeldasValidas)
				{
					/**
					* Comprueba que grasas y azucar sean los correctos
					* @param param1 ArrayList de TextFields especificos
					* @param param2 ArrayList de Jlabels especificos de las alertas "!" individuales
					* @param param3 Label que mostrar que tipo error se ha producido 
					* @return Devolvera true si termina todo el metodo
					* @return Devolvera false si ha encontrado un error
					*/
					ComprobanteGrasaAzucar = Metodos.comprobarGrasaAzucar(fieldsAgregarProducto, labelsAlertaAgregarProducto, Etiqueta_Alerta_AgregarProducto);

					if(ComprobanteCeldasValidas && ComprobanteGrasaAzucar)
					{
						Producto nuevoProducto = Metodos.agregarProductoAlCatalogo(fieldsAgregarProducto);
						ArrayListaProductos.insertarProducto(nuevoProducto);
						
						Desplegable_Catalogo.addItem(nuevoProducto.getNombre());
						
						/**
						* Vacia todas las alertas de Agregar Producto
						* @param param1 ArrayList de TextFields especificos
						* @param param2 ArrayList de Jlabels especificos de las alertas "!" individuales
						*/
						Metodos.vaciarCamposAgregarProducto(fieldsAgregarProducto,labelsAlertaAgregarProducto);
						
						
						Etiqueta_ProductoAgregado.setText("Producto creado");
					}
				}


			}
		});
		
		
		
		
		
		boton_BorrarProductoDieta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Borrar Etiquetas de dieta
				Etiqueta_calculo_requeridas.setText("0");
				Etiqueta_calculo_consumidas.setText("0");
				Etiqueta_ConsumoGrasas.setText("0");
				Etiqueta_ConsumoSal.setText("0");
				Etiqueta_ConsumoAzucar.setText("0");
				
				panel_ColorConsumoAzucar.setBackground(new Color(153, 255, 255));
				panel_ColorConsumoGrasas.setBackground(new Color(153, 255, 255));
				panel_ColorConsumoSal.setBackground(new Color(153, 255, 255));
				
				if(ing.dieta.size()>0)
				{
				
				int NumeroIndice = Desplegable_Dieta.getSelectedIndex();
				
				ing.eliminarProducto(NumeroIndice);
				
				/**
				* Le pasa el array list de la dieta para que se vea visualmente el producto agregado
				* @param param1 ArrayList de la dieta/ingesta
				* @param param2 Panel donde añadiremos visualmente el producto agregado
				* @param param3 Desplegable que añadira a si mismo el Producto agregado	
				*/
				Metodos.actualizarPanelDieta(ing.dieta, Panel_Alimentos_Ingeridos, Desplegable_Dieta);
				
				Etiqueta_Alerta_Dieta.setForeground(Color.BLUE);
				Etiqueta_Alerta_Dieta.setText("Producto borrado");
				}
				else
				{
					Etiqueta_Alerta_Dieta.setForeground(Color.RED);
					Etiqueta_Alerta_Dieta.setText("No existen mas productos");
				}
					
			}
		});
		
		
		textField_Edad.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				//Empezamos poniendo que el valor no es valido y al final si lo es cambiara
				validEdad = false;
				Etiqueta_ErrorEdad.setText(null);
				Etiqueta_ErrorEdad.setForeground(Color.RED);
				if(!textField_Edad.getText().equals("")) {
					/**
					 * Comprobara si el valor introducido es valido
					 * Valido en no vacio, no menor que 0 y sin digitos
					 * @param param1 El objeto textField con la cantidad de gramos que introduce el usuario
					 * @return si consigue terminarlo devolverá true
					 * @return sino devolvera false
					 */
					boolean ComprobarEdad=Metodos.comprobarCantidadValida(textField_Edad);

					if(!ComprobarEdad) {
						Etiqueta_ErrorEdad.setText("Tiene que ser un numero");
					}
					else {
						String textoEdad=textField_Edad.getText();
						int numeroEdad=Integer.parseInt(textoEdad);
						if(numeroEdad<16 || numeroEdad>99) {
							Etiqueta_ErrorEdad.setText("El numero debe estar entre (16-99)");
						}else
							validEdad = true;
					}
				}
			}
		});
		
	
		textField_Peso.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				//Empezamos poniendo que el valor no es valido y al final si lo es cambiara
				validPeso = false;
				Etiqueta_ErrorPeso.setText(null);
				Etiqueta_ErrorPeso.setForeground(Color.RED);
				if(!textField_Peso.getText().equals("")) {
					
					/**
					 * Comprobara si el valor introducido es valido
					 * Valido en no vacio, no menor que 0 y sin digitos
					 * @param param1 El objeto textField con la cantidad de gramos que introduce el usuario
					 * @return si consigue terminarlo devolverá true
					 * @return sino devolvera false
					 */
					boolean ComprobarEdad=Metodos.comprobarCantidadValida(textField_Peso);

					if(!ComprobarEdad) {
						Etiqueta_ErrorPeso.setText("Tiene que ser un numero");
					}
					else {
						String textoPeso=textField_Peso.getText();
						int numeroEdad=Integer.parseInt(textoPeso);
						if(numeroEdad<40 || numeroEdad>200) {
							Etiqueta_ErrorPeso.setText("Los kilos deben estar entre (40-200)kg");
						}else
							validPeso = true;
					}
				}
			}
		});
		
		
		textField_Altura.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				//Empezamos poniendo que el valor no es valido y al final si lo es cambiara
				validAltura = false;
				Etiqueta_ErrorAltura.setText(null);
				Etiqueta_ErrorAltura.setForeground(Color.RED);
				if(!textField_Altura.getText().equals("")) {
					/**
					 * Comprobara si el valor introducido es valido
					 * Valido en no vacio, no menor que 0 y sin digitos
					 * @param param1 El objeto textField con la cantidad de gramos que introduce el usuario
					 * @return si consigue terminarlo devolverá true
					 * @return sino devolvera false
					 */
					boolean ComprobarAltura=Metodos.comprobarCantidadValida(textField_Altura);

					if(!ComprobarAltura) {
						Etiqueta_ErrorAltura.setText("Tiene que ser un numero");
					}
					else {
						String textoAltura=textField_Altura.getText();
						int numeroAltura=Integer.parseInt(textoAltura);
						if(numeroAltura<120 || numeroAltura>220) {
							Etiqueta_ErrorAltura.setText("La altura debe de estar entre (130-220) cm");
						}else
							validAltura = true;
					}
				}
			}
		});
		/*
		 * CALCULAR IMC y TMC
		 */
		
		btnCalcIMC_TMB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	
				//TMB & IMC
				if(textField_Edad.getText().isEmpty() || textField_Altura.getText().isEmpty() || textField_Peso.getText().isEmpty() || !validEdad || !validAltura || !validPeso) {
					
				}else {
					
					//Sacar variables para los calculos
					double altura=Double.valueOf(textField_Altura.getText())/100;
					double alturaCm=Double.valueOf(textField_Altura.getText());
					double edad=Double.valueOf(textField_Edad.getText());
					double peso=Double.valueOf(textField_Peso.getText());
					
					
					//Sacamos que sexo ha sido seleccionado y guardamos el valor indicado para usar más tarde en la formula
					int sexo;
					if(Desplegable_Sexo.getSelectedIndex()==0)
						sexo = -161;
					else
						sexo = 5;
					
					//Sacamos que nivel de actividad fisica ha sido seleccionado y lo guardamos para calcular mas tarde
					double actividad = 1;
					int index_desplegable_actividad = Desplegable_Actividad.getSelectedIndex();
					switch(index_desplegable_actividad) {
						case 0:
							actividad = 1.2;
							break;
						case 1:
							actividad = 1.375;
							break;
						case 2:
							actividad = 1.55;
							break;
						case 3:
							actividad = 1.725;
							break;
						case 4:
							actividad = 1.9;
							break;
						
					}
					
					//Calcular y mostrar IMC
					double resultadoIMC=peso/Math.pow(altura, 2);
					
					resultadoIMC=Math.round(resultadoIMC*100.00)/100.00;
					
					Etiqueta_IMC.setText(String.valueOf(resultadoIMC));
					
					//Calcular y mostrar TMB
					double tmb = (10 * peso) + (6.25 * alturaCm) - (5 * edad) + sexo;
					
					
					//Metabolismo basal
					double resultado = Math.round(tmb*100.00)/100.00;
					Etiqueta_calculo_basal.setText(String.valueOf(resultado));
					
					//Mantener peso
					resultado = Math.round((tmb * actividad)*100.00)/100.00;
					Etiqueta_calculo_mantener.setText(String.valueOf(resultado));
					
					//Adelgazar
					resultado = Math.round(((tmb * actividad) * 0.85)*100.00)/100.00;
					Etiqueta_calculo_adelgazar.setText(String.valueOf(resultado));
					
					//Engordar
					resultado = Math.round(((tmb * actividad) + (tmb * actividad) * 0.15)*100.00)/100.00;
					Etiqueta_calculo_engordar.setText(String.valueOf(resultado));
					
					personaRegistrada = true;
				}
				
			}
		});
		
		/*
		 * CALCULO DIETA EQUILIBRADA
		 */
		//Llamamos al boton Boton_CalcularDieta
		
		Boton_CalcularDieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!personaRegistrada )
				{
					Etiqueta_AlertaCalcularDieta.setText("Persona no registrada");
				}
				else if(ing.dieta.size() == 0)
				{
					Etiqueta_AlertaCalcularDieta.setText("Dieta vacia");
				}
				else
				{
					Etiqueta_AlertaCalcularDieta.setText("");
					//Poner en etiquetas los porcentajes
					Etiqueta_ConsumoGrasas.setText(String.valueOf(ing.consumo_grasas()));
					Etiqueta_ConsumoAzucar.setText(String.valueOf(ing.consumo_azucar()));
					Etiqueta_ConsumoSal.setText(String.valueOf(ing.consumo_Sal()));

					//Poner etiqueta consumo total de calorias
					Etiqueta_calculo_consumidas.setText(String.valueOf(ing.getTotal_calorias()));
					Etiqueta_calculo_requeridas.setText(Etiqueta_calculo_mantener.getText());
					

					if(!ing.consumo_grasas_saludable()) {
						panel_ColorConsumoGrasas.setBackground(Color.RED);
					}
					else {
						panel_ColorConsumoGrasas.setBackground(Color.GREEN);
					}

					if(!ing.consumo_sal_saludable()) {
						panel_ColorConsumoSal.setBackground(Color.RED);
					}
					else {
						panel_ColorConsumoSal.setBackground(Color.GREEN);
					}
					
					ing.consumo_azucar_saludable(panel_ColorConsumoAzucar);
					
						
					
				}
			}
		});

		btn_infoActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(
						frame, "Poco --> poco o ningun ejercicio \n"
								+ "Ligero --> 1 - 3 dias a la semana \n"
								+ "Moderado --> 3 - 5 dias a la semana \n"
								+ "Intenso --> 6 - 7 dias a la semana \n"
								+ "Muy intenso --> 2 veces al dia",
						"Actividad Fisica",
					   	JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btn_infoIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Icon icono = new ImageIcon(getClass().getResource("/img/IMC.png"));
				
				JOptionPane.showMessageDialog(
						frame, icono, 
						"IMC",
					   	JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		btn_infoColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(
						frame, "Verde --> Saludable \n"
								+ "Naranja --> Normal \n"
								+ "Rojo --> No saludable",
						"Colores",
					   	JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
}

