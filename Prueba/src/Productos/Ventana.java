package Productos;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextPane;

public class Ventana {

	private JFrame frame;
	private JTextField Cantidad_Gramos_Introducido;
	private JTextField textField_NombreAgregarProducto;
	private JTextField textField_GramosAgregarProducto;
	private JTextField textField_GrasasAgregarProducto;
	private JTextField textField_GrasasSaturadasAgregarProducto;
	private JTextField textField_HidratosAgregarProducto;
	private JTextField textField_AzucarAgregarProducto;
	private JTextField textField_ProteinasAgregarProducto;
	private JTextField textField_SalAgregarProducto;
	private JTextField textField_TotalCaloriasAgregarProducto;
	boolean isDigit=true;

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
		frame.setBounds(100, 100, 1400, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//panel_Titulo
		JPanel panel_Titulo = new JPanel();
		panel_Titulo.setBackground(new Color(153, 255, 255));
		panel_Titulo.setBounds(368, 11, 670, 73);
		frame.getContentPane().add(panel_Titulo);
		panel_Titulo.setLayout(null);
		
		//panel_Persona
		JPanel panel_Persona = new JPanel();
		panel_Persona.setLayout(null);
		panel_Persona.setBackground(new Color(153, 255, 255));
		panel_Persona.setBounds(47, 115, 1294, 133);
		frame.getContentPane().add(panel_Persona);
		
		//panel_AgregarProducto
		JPanel panel_AgregarProducto = new JPanel();
		panel_AgregarProducto.setLayout(null);
		panel_AgregarProducto.setBackground(new Color(153, 255, 255));
		panel_AgregarProducto.setBounds(25, 283, 334, 596);
		frame.getContentPane().add(panel_AgregarProducto);

		//panel_Ingesta
		JPanel panel_Ingesta = new JPanel();
		panel_Ingesta.setBackground(new Color(153, 255, 255));
		panel_Ingesta.setBounds(401, 283, 609, 596);
		frame.getContentPane().add(panel_Ingesta);
		panel_Ingesta.setLayout(null);

		//panel_Resumen
		JPanel panel_Resumen = new JPanel();
		panel_Resumen.setBackground(new Color(153, 255, 255));
		panel_Resumen.setBounds(1071, 283, 264, 596);
		frame.getContentPane().add(panel_Resumen);
		panel_Resumen.setLayout(null);
		
		JTextPane Panel_Alimentos_Ingeridos = new JTextPane();
		Panel_Alimentos_Ingeridos.setEditable(false);
		Panel_Alimentos_Ingeridos.setBounds(10, 42, 244, 238);
		panel_Resumen.add(Panel_Alimentos_Ingeridos);
		
		JLabel Etiqueta_agregarProducto = new JLabel("Agregar Producto");
		Etiqueta_agregarProducto.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_agregarProducto.setBounds(76, 27, 171, 21);
		panel_AgregarProducto.add(Etiqueta_agregarProducto);
		
		JLabel Etiqueta_GramosAgregarProducto = new JLabel("Gramos alimento:");
		Etiqueta_GramosAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 12));
		Etiqueta_GramosAgregarProducto.setBounds(12, 116, 121, 17);
		panel_AgregarProducto.add(Etiqueta_GramosAgregarProducto);
		
		JLabel Etiqueta_NombreAgregarProducto = new JLabel("Nombre del Alimento:");
		Etiqueta_NombreAgregarProducto.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_NombreAgregarProducto.setBounds(12, 61, 160, 17);
		panel_AgregarProducto.add(Etiqueta_NombreAgregarProducto);
		
		textField_NombreAgregarProducto = new JTextField();
		textField_NombreAgregarProducto.setBounds(178, 59, 102, 21);
		panel_AgregarProducto.add(textField_NombreAgregarProducto);
		textField_NombreAgregarProducto.setColumns(10);
		
		textField_GramosAgregarProducto = new JTextField();
		textField_GramosAgregarProducto.setBounds(178, 114, 60, 21);
		panel_AgregarProducto.add(textField_GramosAgregarProducto);
		textField_GramosAgregarProducto.setColumns(10);
		
		JLabel Etiqueta_GrasasAgregarProducto = new JLabel("Grasas:");
		Etiqueta_GrasasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasAgregarProducto.setBounds(12, 155, 60, 17);
		panel_AgregarProducto.add(Etiqueta_GrasasAgregarProducto);
		
		JLabel Etiqueta_GrasasSaturadasAgregarProducto = new JLabel("Grasas Saturadas:");
		Etiqueta_GrasasSaturadasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasSaturadasAgregarProducto.setBounds(12, 204, 137, 17);
		panel_AgregarProducto.add(Etiqueta_GrasasSaturadasAgregarProducto);
		
		JLabel Etiqeuta_AzucarAgregarProducto = new JLabel("Azucar:");
		Etiqeuta_AzucarAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqeuta_AzucarAgregarProducto.setBounds(12, 315, 60, 17);
		panel_AgregarProducto.add(Etiqeuta_AzucarAgregarProducto);
		
		JLabel Etiqueta_ProteinasAgregarProducto = new JLabel("Proteinas:");
		Etiqueta_ProteinasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_ProteinasAgregarProducto.setBounds(12, 370, 60, 17);
		panel_AgregarProducto.add(Etiqueta_ProteinasAgregarProducto);
		
		JLabel Etiqueta_Sal_Usuario_1 = new JLabel("Sal:");
		Etiqueta_Sal_Usuario_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_Sal_Usuario_1.setBounds(14, 413, 60, 17);
		panel_AgregarProducto.add(Etiqueta_Sal_Usuario_1);
		
		JLabel Etiqueta_HidratosCarbonoAgregarProducto = new JLabel("Hidratos de Carbono:");
		Etiqueta_HidratosCarbonoAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_HidratosCarbonoAgregarProducto.setBounds(12, 259, 137, 17);
		panel_AgregarProducto.add(Etiqueta_HidratosCarbonoAgregarProducto);
		
		textField_GrasasAgregarProducto = new JTextField();
		textField_GrasasAgregarProducto.setBounds(178, 154, 60, 20);
		panel_AgregarProducto.add(textField_GrasasAgregarProducto);
		textField_GrasasAgregarProducto.setColumns(10);
		
		textField_GrasasSaturadasAgregarProducto = new JTextField();
		textField_GrasasSaturadasAgregarProducto.setBounds(178, 201, 60, 20);
		panel_AgregarProducto.add(textField_GrasasSaturadasAgregarProducto);
		textField_GrasasSaturadasAgregarProducto.setColumns(10);
		
		textField_HidratosAgregarProducto = new JTextField();
		textField_HidratosAgregarProducto.setBounds(178, 258, 60, 20);
		panel_AgregarProducto.add(textField_HidratosAgregarProducto);
		textField_HidratosAgregarProducto.setColumns(10);
		
		textField_AzucarAgregarProducto = new JTextField();
		textField_AzucarAgregarProducto.setBounds(178, 314, 60, 20);
		panel_AgregarProducto.add(textField_AzucarAgregarProducto);
		textField_AzucarAgregarProducto.setColumns(10);
		
		textField_ProteinasAgregarProducto = new JTextField();
		textField_ProteinasAgregarProducto.setBounds(178, 369, 60, 20);
		panel_AgregarProducto.add(textField_ProteinasAgregarProducto);
		textField_ProteinasAgregarProducto.setColumns(10);
		
		textField_SalAgregarProducto = new JTextField();
		textField_SalAgregarProducto.setBounds(178, 412, 62, 20);
		panel_AgregarProducto.add(textField_SalAgregarProducto);
		textField_SalAgregarProducto.setColumns(10);
		
		textField_TotalCaloriasAgregarProducto = new JTextField();
		textField_TotalCaloriasAgregarProducto.setBounds(178, 457, 62, 20);
		panel_AgregarProducto.add(textField_TotalCaloriasAgregarProducto);
		textField_TotalCaloriasAgregarProducto.setColumns(10);
		
		JLabel Etiqueta_CaloriasTotalAgregarProducto = new JLabel("Total Calorias:");
		Etiqueta_CaloriasTotalAgregarProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_CaloriasTotalAgregarProducto.setBounds(12, 459, 108, 14);
		panel_AgregarProducto.add(Etiqueta_CaloriasTotalAgregarProducto);
	
		
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
		
			
		
		
		JLabel Etiqueta_Grasas = new JLabel("Grasas:");
		Etiqueta_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas.setBounds(42, 127, 60, 17);
		panel_Ingesta.add(Etiqueta_Grasas);
		
		JLabel Etiqueta_Grasas_Saturadas = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Saturadas.setBounds(42, 193, 106, 17);
		panel_Ingesta.add(Etiqueta_Grasas_Saturadas);
		
		JLabel Etiqueta_Hidratos_Carbono = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Hidratos_Carbono.setBounds(42, 262, 137, 17);
		panel_Ingesta.add(Etiqueta_Hidratos_Carbono);
		
		JLabel Etiqeuta_Azucar = new JLabel("Azucar:");
		Etiqeuta_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqeuta_Azucar.setBounds(42, 323, 60, 17);
		panel_Ingesta.add(Etiqeuta_Azucar);
		
		JLabel Etiqueta_Proteinas = new JLabel("Proteinas:");
		Etiqueta_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Proteinas.setBounds(42, 389, 60, 17);
		panel_Ingesta.add(Etiqueta_Proteinas);
		
		JLabel Etiqueta_Sal = new JLabel("Sal:");
		Etiqueta_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Sal.setBounds(42, 458, 60, 17);
		panel_Ingesta.add(Etiqueta_Sal);
		
		JLabel Gramos_Hidratos = new JLabel("0");
		Gramos_Hidratos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Hidratos.setBounds(191, 262, 43, 17);
		panel_Ingesta.add(Gramos_Hidratos);
		
		JLabel Gramos_Grasas_Saturadas = new JLabel("0");
		Gramos_Grasas_Saturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas.setBounds(191, 193, 43, 17);
		panel_Ingesta.add(Gramos_Grasas_Saturadas);
		
		JLabel Gramos_Grasas = new JLabel("0");
		Gramos_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas.setBounds(191, 127, 43, 17);
		panel_Ingesta.add(Gramos_Grasas);
		
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
		
		JLabel Etiqueta_Grasas_Usuario = new JLabel("Grasas:");
		Etiqueta_Grasas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Usuario.setBounds(351, 127, 60, 17);
		panel_Ingesta.add(Etiqueta_Grasas_Usuario);
		
		JLabel Etiqueta_Grasas_Saturadas_Usuario = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Saturadas_Usuario.setBounds(351, 193, 106, 17);
		panel_Ingesta.add(Etiqueta_Grasas_Saturadas_Usuario);
		
		JLabel Etiqueta_Hidratos_Carbono_Usuario = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Hidratos_Carbono_Usuario.setBounds(351, 262, 137, 17);
		panel_Ingesta.add(Etiqueta_Hidratos_Carbono_Usuario);
		
		JLabel Etiqeuta_Azucar_Usuario = new JLabel("Azucar:");
		Etiqeuta_Azucar_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqeuta_Azucar_Usuario.setBounds(351, 323, 60, 17);
		panel_Ingesta.add(Etiqeuta_Azucar_Usuario);
		
		JLabel Etiqueta_Proteinas_Usuario = new JLabel("Proteinas:");
		Etiqueta_Proteinas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Proteinas_Usuario.setBounds(351, 389, 60, 17);
		panel_Ingesta.add(Etiqueta_Proteinas_Usuario);
		
		JLabel Etiqueta_Sal_Usuario = new JLabel("Sal:");
		Etiqueta_Sal_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Sal_Usuario.setBounds(351, 458, 60, 17);
		panel_Ingesta.add(Etiqueta_Sal_Usuario);
		
		JLabel Gramos_Hidratos_Usuario = new JLabel("0");
		Gramos_Hidratos_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Hidratos_Usuario.setBounds(488, 262, 53, 17);
		panel_Ingesta.add(Gramos_Hidratos_Usuario);
		
		JLabel Gramos_Grasas_Saturadas_Usuario = new JLabel("0");
		Gramos_Grasas_Saturadas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas_Usuario.setBounds(488, 193, 53, 17);
		panel_Ingesta.add(Gramos_Grasas_Saturadas_Usuario);
		
		JLabel Gramos_Grasas_Usuario = new JLabel("0");
		Gramos_Grasas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Usuario.setBounds(488, 127, 53, 17);
		panel_Ingesta.add(Gramos_Grasas_Usuario);
		
		JLabel Gramos_Proteinas_Usuario = new JLabel("0");
		Gramos_Proteinas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas_Usuario.setBounds(488, 389, 53, 17);
		panel_Ingesta.add(Gramos_Proteinas_Usuario);
		
		JLabel Gramos_Azucar_Usuario = new JLabel("0");
		Gramos_Azucar_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar_Usuario.setBounds(488, 323, 53, 17);
		panel_Ingesta.add(Gramos_Azucar_Usuario);
		
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
		Etiqueta_Alerta_Ingesta.setBounds(131, 0, 338, 22);
		panel_Ingesta.add(Etiqueta_Alerta_Ingesta);
		
		
		
		JLabel Etiqueta_Titulo = new JLabel("Nombre Aplicacion");
		Etiqueta_Titulo.setFont(new Font("Dialog", Font.BOLD, 58));
		Etiqueta_Titulo.setBounds(44, -27, 670, 100);
		panel_Titulo.add(Etiqueta_Titulo);
		
		JLabel Etiqueta_Alerta_AgregarProducto = new JLabel("");
		Etiqueta_Alerta_AgregarProducto.setForeground(Color.RED);
		Etiqueta_Alerta_AgregarProducto.setFont(new Font("Dialog", Font.BOLD, 12));
		Etiqueta_Alerta_AgregarProducto.setBounds(0, 504, 324, 22);
		panel_AgregarProducto.add(Etiqueta_Alerta_AgregarProducto);
		
		JLabel ErrorGrAlimento = new JLabel("");
		ErrorGrAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorGrAlimento.setForeground(Color.RED);
		ErrorGrAlimento.setBounds(278, 118, 46, 14);
		panel_AgregarProducto.add(ErrorGrAlimento);
		
		JLabel ErrorGrasas = new JLabel("");
		ErrorGrasas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorGrasas.setForeground(Color.RED);
		ErrorGrasas.setBounds(273, 157, 46, 14);
		panel_AgregarProducto.add(ErrorGrasas);
		
		JLabel ErrorGrasasSaturadas = new JLabel("");
		ErrorGrasasSaturadas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorGrasasSaturadas.setForeground(Color.RED);
		ErrorGrasasSaturadas.setBounds(273, 206, 46, 14);
		panel_AgregarProducto.add(ErrorGrasasSaturadas);
		
		JLabel ErrorHidratos = new JLabel("");
		ErrorHidratos.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorHidratos.setForeground(Color.RED);
		ErrorHidratos.setBounds(273, 261, 46, 14);
		panel_AgregarProducto.add(ErrorHidratos);
		
		JLabel ErrorAzucar = new JLabel("");
		ErrorAzucar.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorAzucar.setForeground(Color.RED);
		ErrorAzucar.setBounds(273, 317, 46, 14);
		panel_AgregarProducto.add(ErrorAzucar);
		
		JLabel ErrorProteinas = new JLabel("");
		ErrorProteinas.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorProteinas.setForeground(Color.RED);
		ErrorProteinas.setBounds(273, 372, 46, 14);
		panel_AgregarProducto.add(ErrorProteinas);
		
		JLabel ErrorSal = new JLabel("");
		ErrorSal.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorSal.setForeground(Color.RED);
		ErrorSal.setBounds(273, 415, 46, 14);
		panel_AgregarProducto.add(ErrorSal);
		
		JLabel ErrorTotalCalorias = new JLabel("");
		ErrorTotalCalorias.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorTotalCalorias.setForeground(Color.RED);
		ErrorTotalCalorias.setBounds(273, 460, 46, 14);
		panel_AgregarProducto.add(ErrorTotalCalorias);
		
		JLabel ErrorNombreAlimento = new JLabel("");
		ErrorNombreAlimento.setForeground(Color.RED);
		ErrorNombreAlimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		ErrorNombreAlimento.setBounds(288, 64, 46, 14);
		panel_AgregarProducto.add(ErrorNombreAlimento);
		
		JLabel Etiqueta_ProductoAgregado = new JLabel("");
		Etiqueta_ProductoAgregado.setForeground(Color.BLUE);
		Etiqueta_ProductoAgregado.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_ProductoAgregado.setBounds(95, 496, 152, 30);
		panel_AgregarProducto.add(Etiqueta_ProductoAgregado);
		
		
		//Cantidad de Gramos del producto seleccionado
		Cantidad_Gramos_Introducido = new JTextField();
		Cantidad_Gramos_Introducido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Cantidad_Gramos_Introducido.setBounds(221, 35, 70, 23);
		panel_Ingesta.add(Cantidad_Gramos_Introducido);

		//OBJETOS LOS CUALES TIENEN FUNCIONES

		//Lista de productos referenciados a la ArrayList de la clase Productos
		//ArrayList<String> ArrayListaProductos = new ArrayList<String>();
		ListadoProductos ArrayListaProductos=new ListadoProductos();
		//Para crear cada alimento este es el esquema "Producto(nombre, grasas, grasas_saturadas, hidratos_carbono,  azucar, proteinas, sal, calorias)"

		ArrayListaProductos.insertarProducto(new Producto("Actimel", 0.4, 0.8, 0, 10.6, 1.5, 0.05,84));
		ArrayListaProductos.insertarProducto(new Producto("Kit-Kat", 11.8, 15, 13.3, 45.7, 7.8, 0.14,518));
		ArrayListaProductos.insertarProducto(new Producto("Arroz", 4, 0.9, 13.3, 0.6, 8.5, 0.72,456));
		ArrayListaProductos.insertarProducto(new Producto("Pollo",7.72,2.17,0,0,29.55,0.98,195));
		ArrayListaProductos.insertarProducto(new Producto("Avena",6.9,1.21,66.27,0,16.89,0,389));

		//Array que guarda los JLabel de los que hace referencia a 100g
		ArrayList<JLabel> labelsMacros100=new ArrayList<JLabel>();
		labelsMacros100.add(Gramos_Grasas);
		labelsMacros100.add(Gramos_Grasas_Saturadas);
		labelsMacros100.add(Gramos_Hidratos);
		labelsMacros100.add(Gramos_Azucar);
		labelsMacros100.add(Gramos_Proteinas);
		labelsMacros100.add(Gramos_Sal);
		labelsMacros100.add(Etiqueta_Total_Calorias_100gr);

		
		JComboBox Catalogo = new JComboBox();
		Catalogo.addItemListener(new ItemListener() {
			//Cuando se cambie el valor del desplegable, los macros deberan cambiar
			public void itemStateChanged(ItemEvent arg0) {
				
				Cantidad_Gramos_Introducido.setText("0");
				
				//Primero coge el indice del numero del despegable
				Integer NumeroLista = Catalogo.getSelectedIndex();
				//Segundo de ese indice anterior, saca el Producto del Array de Productos
				Producto ProductoElegido = ArrayListaProductos.ListaProductos.get(NumeroLista);
				//Llama al metodo que actualizara la lista
				Metodos.actualizarMacros100g(ProductoElegido, labelsMacros100);

				Etiqueta_ProductoAgregado.setText("");
			}
		});
		Catalogo.setBounds(42, 33, 124, 26);
		panel_Ingesta.add(Catalogo);
		
		
		//Bucle el cual recorre toda la ArrayList de La lista de productos y agrega al desplegable el nombre de cada objeto Producto
		for(int i=0;i<ArrayListaProductos.ListaProductos.size();i++) {
			Catalogo.addItem(ArrayListaProductos.ListaProductos.get(i).getNombre());
		}
		
		//Array que guarda los JLabel de los que hace referencia a los gramos consumidos por el usuario
		ArrayList<JLabel> labelsUsuario=new ArrayList<JLabel>();
		labelsUsuario.add(Gramos_Grasas_Usuario);
		labelsUsuario.add(Gramos_Grasas_Saturadas_Usuario);
		labelsUsuario.add(Gramos_Hidratos_Usuario);
		labelsUsuario.add(Gramos_Azucar_Usuario);
		labelsUsuario.add(Gramos_Proteinas_Usuario);
		labelsUsuario.add(Gramos_Sal_Usuario);
		labelsUsuario.add(Etiqueta_Total_Calorias_Usuario);
		
		
		
		//Sirve para acutalizar la candidad de gramos que pone le usuario
		Cantidad_Gramos_Introducido.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {

				//Si no esta vacio, realizara lo de dentro
				if(!Cantidad_Gramos_Introducido.getText().isEmpty()) {

					//Comprobara si el valor introducido es valido, si consigue terminarlo devolvera true
					//Sino cambiara la alerta del label y devolvera false
					boolean Valido = Metodos.comprobarCantidadValida(Cantidad_Gramos_Introducido, Etiqueta_Alerta_Ingesta);

					//Si el resultado anterior es true, realizara lo de dentro
					if(Valido) {
						String texto = Cantidad_Gramos_Introducido.getText();
						//convertimos el JTextField en un Double para hacer los calculos
						double cantidadGramos=Double.parseDouble(texto);

						//Actualizara el texto de los label, mostrando asi el resultado
						Etiqueta_NumerodeGramosSeleccionados.setText(texto);
						for(int j=0;j<labelsMacros100.size();j++) {
							//Le pasa al metodo (Label del cual realizara el calculo, Label donde se mostrara el calculo, int con el valor de cantidad de Gramos)
							Metodos.mostrarCalculoEnLabel(labelsMacros100.get(j),labelsUsuario.get(j), cantidadGramos);

						}
					}	
				}
			}
		});
		
		//Creamos el objeto Ingesta
		Ingesta ing=new Ingesta();
		
		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("Gr");
		Etiqueta_Gramos.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Gramos.setBounds(317, 42, 20, 17);
		panel_Ingesta.add(Etiqueta_Gramos);
		
		//Boton Agregar
		JButton Boton_AgregarProducto = new JButton("Agregar");
		Boton_AgregarProducto.setBounds(351, 26, 106, 41);
		panel_Ingesta.add(Boton_AgregarProducto);

		Boton_AgregarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//Si el campo de los gramos esta vacio o a 0 no introduce producto
				if(Cantidad_Gramos_Introducido.getText().equals("") || Cantidad_Gramos_Introducido.getText().equals("0")) {
					Etiqueta_Alerta_Ingesta.setText("El campo no agregarse como vacio o 0");;
				}else {
					//Sirve para poner todos Label de usuario 
					for(int i=0;i<labelsUsuario.size();i++) {
						labelsUsuario.get(i).setText("0");
					}


					//Cogemos el La cantidad de Gramos Introducido
					double CantidadGramosConsumido = Double.parseDouble(Cantidad_Gramos_Introducido.getText());
					//Ya podemos pasar ciertos campos a valor 0
					Cantidad_Gramos_Introducido.setText("");
					Etiqueta_NumerodeGramosSeleccionados.setText("0");
					//Cogemos el producto seleccionado del desplegable del Catalogo
					Producto PrAgregado = ArrayListaProductos.ListaProductos.get(Catalogo.getSelectedIndex());
					//Y ambos, se lo pasamos a la Ingesta y que lo implemente
					ing.insertarProducto(PrAgregado, CantidadGramosConsumido);

					Metodos.actualizarPanel(ing.dieta, Panel_Alimentos_Ingeridos);
				}
			}
		});
		
		//Boton Borrar Producto
		JButton boton_BorrarProducto = new JButton("Borrar Producto");
		boton_BorrarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Catalogo.getItemCount()>1)
				{
					Etiqueta_Alerta_Ingesta.setText("");
				//Primero coge el indice del Producto de Catalogo
				Integer NumeroLista = Catalogo.getSelectedIndex();
				//Coge el nombre
				String cat = Catalogo.getSelectedItem().toString();
				//Lo borra del Catalogo
				Catalogo.removeItemAt(NumeroLista);
				//Borra el primer Producto que coincida con el nombre del Array de los Productos
				ArrayListaProductos.eliminarProducto(cat);
				}
				else
					Etiqueta_Alerta_Ingesta.setText("No puedes tener 0 Productos");
			}
		});
		boton_BorrarProducto.setBounds(468, 26, 131, 41);
		panel_Ingesta.add(boton_BorrarProducto);
		
		//Array de Etiquetas añadir Productos 
		ArrayList<JTextField> fieldsAgregarProducto=new ArrayList<JTextField>();
		fieldsAgregarProducto.add(textField_NombreAgregarProducto);
		fieldsAgregarProducto.add(textField_GramosAgregarProducto);
		fieldsAgregarProducto.add(textField_GrasasAgregarProducto);
		fieldsAgregarProducto.add(textField_GrasasSaturadasAgregarProducto);
		fieldsAgregarProducto.add(textField_HidratosAgregarProducto);
		fieldsAgregarProducto.add(textField_AzucarAgregarProducto);
		fieldsAgregarProducto.add(textField_ProteinasAgregarProducto);
		fieldsAgregarProducto.add(textField_SalAgregarProducto);
		fieldsAgregarProducto.add(textField_TotalCaloriasAgregarProducto);
		
		ArrayList<JLabel> labelsAlertaAgregarProducto=new ArrayList<JLabel>();
		labelsAlertaAgregarProducto.add(ErrorNombreAlimento);
		labelsAlertaAgregarProducto.add(ErrorGrAlimento);
		labelsAlertaAgregarProducto.add(ErrorGrasas);
		labelsAlertaAgregarProducto.add(ErrorGrasasSaturadas);
		labelsAlertaAgregarProducto.add(ErrorHidratos);
		labelsAlertaAgregarProducto.add(ErrorAzucar);
		labelsAlertaAgregarProducto.add(ErrorProteinas);
		labelsAlertaAgregarProducto.add(ErrorSal);
		labelsAlertaAgregarProducto.add(ErrorTotalCalorias);
		
		
		//Boton para añadir un nuevo producto
		
		JButton botonAgregarProductoUsuario = new JButton("Agregar Producto");
		botonAgregarProductoUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean ComprobanteCeldasValidas = Metodos.ComprobarCeldasValidas(fieldsAgregarProducto, labelsAlertaAgregarProducto, Etiqueta_Alerta_AgregarProducto);
				
				boolean ComprobanteCoherenciaNumerica;
				
				if(ComprobanteCeldasValidas)
				{
					ComprobanteCoherenciaNumerica =Metodos.ComprobarCoherenciaNumerica(fieldsAgregarProducto, labelsAlertaAgregarProducto, Etiqueta_Alerta_AgregarProducto);

					if(ComprobanteCeldasValidas && ComprobanteCoherenciaNumerica)
					{
						Producto nuevoProducto = Metodos.agregarProductoAlCatalogo(fieldsAgregarProducto);
						ArrayListaProductos.insertarProducto(nuevoProducto);
						
						Catalogo.addItem(nuevoProducto.getNombre());
						
						Metodos.VaciarCamposAgregarProducto(fieldsAgregarProducto,labelsAlertaAgregarProducto);
						
						
						Etiqueta_ProductoAgregado.setText("Producto creado");
					}
				}


			}
		});
		botonAgregarProductoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonAgregarProductoUsuario.setBounds(76, 537, 162, 32);
		panel_AgregarProducto.add(botonAgregarProductoUsuario);
		
		
		
		
		
		
	}
}

