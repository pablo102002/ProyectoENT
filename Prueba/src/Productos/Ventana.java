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

public class Ventana {

	private JFrame frame;
	private JTextField Cantidad_Gramos_ListaProductos;
	private JTextField textField_NombreAgregarProducto;
	private JTextField textField_GramosAgregarProducto;
	private JTextField textField_GrasasAgregarProducto;
	private JTextField textField_GrasasSaturadasAgregarProducto;
	private JTextField textField_HidratosAgregarProducto;
	private JTextField textField_AzucarAgregarProducto;
	private JTextField textField_ProteinasAgregarProducto;
	private JTextField textField_SalAgregarProducto;
	private JTextField textField_TotalCaloriasAgregarProducto;

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
		
		
		//Panel1
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(153, 255, 255));
		panel_1.setBounds(47, 115, 1294, 133);
		frame.getContentPane().add(panel_1);
		
		//Panel3
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1005, 129, 289, 296);
		panel_1.add(panel_3);
		panel_3.setBackground(new Color(153, 255, 255));
		panel_3.setLayout(null);
		
		//Panel2
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 255, 255));
		panel_2.setBounds(401, 283, 609, 596);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);


		//Panel4
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(153, 255, 255));
		panel_4.setBounds(25, 283, 334, 596);
		frame.getContentPane().add(panel_4);
		
		JLabel Etiqueta_agregarProducto = new JLabel("Agregar Producto");
		Etiqueta_agregarProducto.setFont(new Font("Dialog", Font.BOLD, 17));
		Etiqueta_agregarProducto.setBounds(76, 31, 171, 17);
		panel_4.add(Etiqueta_agregarProducto);
		
		JLabel Etiqueta_GramosAgregarProducto = new JLabel("Gramos alimento:");
		Etiqueta_GramosAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 12));
		Etiqueta_GramosAgregarProducto.setBounds(12, 102, 121, 17);
		panel_4.add(Etiqueta_GramosAgregarProducto);
		
		JLabel Etiqueta_NombreAgregarProducto = new JLabel("Nombre del Alimento:");
		Etiqueta_NombreAgregarProducto.setFont(new Font("Dialog", Font.BOLD, 14));
		Etiqueta_NombreAgregarProducto.setBounds(12, 61, 160, 17);
		panel_4.add(Etiqueta_NombreAgregarProducto);
		
		textField_NombreAgregarProducto = new JTextField();
		textField_NombreAgregarProducto.setBounds(178, 59, 102, 21);
		panel_4.add(textField_NombreAgregarProducto);
		textField_NombreAgregarProducto.setColumns(10);
		
		textField_GramosAgregarProducto = new JTextField();
		textField_GramosAgregarProducto.setBounds(178, 100, 60, 21);
		panel_4.add(textField_GramosAgregarProducto);
		textField_GramosAgregarProducto.setColumns(10);
		
		JLabel Etiqueta_GrasasAgregarProducto = new JLabel("Grasas:");
		Etiqueta_GrasasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasAgregarProducto.setBounds(12, 155, 60, 17);
		panel_4.add(Etiqueta_GrasasAgregarProducto);
		
		JLabel Etiqueta_GrasasSaturadasAgregarProducto = new JLabel("Grasas Saturadas:");
		Etiqueta_GrasasSaturadasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_GrasasSaturadasAgregarProducto.setBounds(12, 221, 137, 17);
		panel_4.add(Etiqueta_GrasasSaturadasAgregarProducto);
		
		JLabel Etiqeuta_AzucarAgregarProducto = new JLabel("Azucar:");
		Etiqeuta_AzucarAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqeuta_AzucarAgregarProducto.setBounds(12, 351, 60, 17);
		panel_4.add(Etiqeuta_AzucarAgregarProducto);
		
		JLabel Etiqueta_ProteinasAgregarProducto = new JLabel("Proteinas:");
		Etiqueta_ProteinasAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_ProteinasAgregarProducto.setBounds(12, 406, 60, 17);
		panel_4.add(Etiqueta_ProteinasAgregarProducto);
		
		JLabel Etiqueta_Sal_Usuario_1 = new JLabel("Sal:");
		Etiqueta_Sal_Usuario_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_Sal_Usuario_1.setBounds(14, 449, 60, 17);
		panel_4.add(Etiqueta_Sal_Usuario_1);
		
		JLabel Etiqueta_HidratosCarbonoAgregarProducto = new JLabel("Hidratos de Carbono:");
		Etiqueta_HidratosCarbonoAgregarProducto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Etiqueta_HidratosCarbonoAgregarProducto.setBounds(12, 288, 137, 17);
		panel_4.add(Etiqueta_HidratosCarbonoAgregarProducto);
		
		textField_GrasasAgregarProducto = new JTextField();
		textField_GrasasAgregarProducto.setBounds(178, 154, 60, 20);
		panel_4.add(textField_GrasasAgregarProducto);
		textField_GrasasAgregarProducto.setColumns(10);
		
		textField_GrasasSaturadasAgregarProducto = new JTextField();
		textField_GrasasSaturadasAgregarProducto.setBounds(178, 218, 60, 20);
		panel_4.add(textField_GrasasSaturadasAgregarProducto);
		textField_GrasasSaturadasAgregarProducto.setColumns(10);
		
		textField_HidratosAgregarProducto = new JTextField();
		textField_HidratosAgregarProducto.setBounds(178, 287, 60, 20);
		panel_4.add(textField_HidratosAgregarProducto);
		textField_HidratosAgregarProducto.setColumns(10);
		
		textField_AzucarAgregarProducto = new JTextField();
		textField_AzucarAgregarProducto.setBounds(178, 350, 60, 20);
		panel_4.add(textField_AzucarAgregarProducto);
		textField_AzucarAgregarProducto.setColumns(10);
		
		textField_ProteinasAgregarProducto = new JTextField();
		textField_ProteinasAgregarProducto.setBounds(178, 405, 60, 20);
		panel_4.add(textField_ProteinasAgregarProducto);
		textField_ProteinasAgregarProducto.setColumns(10);
		
		textField_SalAgregarProducto = new JTextField();
		textField_SalAgregarProducto.setBounds(180, 448, 60, 20);
		panel_4.add(textField_SalAgregarProducto);
		textField_SalAgregarProducto.setColumns(10);
		
		textField_TotalCaloriasAgregarProducto = new JTextField();
		textField_TotalCaloriasAgregarProducto.setBounds(180, 493, 60, 20);
		panel_4.add(textField_TotalCaloriasAgregarProducto);
		textField_TotalCaloriasAgregarProducto.setColumns(10);
		
		JLabel Etiqueta_CaloriasTotalAgregarProducto = new JLabel("Total Calorias:");
		Etiqueta_CaloriasTotalAgregarProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_CaloriasTotalAgregarProducto.setBounds(12, 495, 108, 14);
		panel_4.add(Etiqueta_CaloriasTotalAgregarProducto);
		
		JButton botonAgregarProductoUsuario = new JButton("Agregar Producto");
		botonAgregarProductoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonAgregarProductoUsuario.setBounds(90, 537, 129, 32);
		panel_4.add(botonAgregarProductoUsuario);
		
		JLabel Etiqueta_Gramos_1_2 = new JLabel("gr");
		Etiqueta_Gramos_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_2.setBounds(243, 104, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_2);
		
		JLabel Etiqueta_Gramos_1_3 = new JLabel("gr");
		Etiqueta_Gramos_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_3.setBounds(243, 157, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_3);
		
		JLabel Etiqueta_Gramos_1_4 = new JLabel("gr");
		Etiqueta_Gramos_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_4.setBounds(243, 223, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_4);
		
		JLabel Etiqueta_Gramos_1_5 = new JLabel("gr");
		Etiqueta_Gramos_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_5.setBounds(243, 290, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_5);
		
		JLabel Etiqueta_Gramos_1_6 = new JLabel("gr");
		Etiqueta_Gramos_1_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_6.setBounds(243, 353, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_6);
		
		JLabel Etiqueta_Gramos_1_7 = new JLabel("gr");
		Etiqueta_Gramos_1_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_7.setBounds(243, 408, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_7);
		
		JLabel Etiqueta_Gramos_1_8 = new JLabel("gr");
		Etiqueta_Gramos_1_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_8.setBounds(245, 451, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_8);
		
		JLabel Etiqueta_Gramos_1_9 = new JLabel("gr");
		Etiqueta_Gramos_1_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_9.setBounds(245, 496, 20, 17);
		panel_4.add(Etiqueta_Gramos_1_9);
		
			
		
		
		JLabel Etiqueta_Grasas = new JLabel("Grasas:");
		Etiqueta_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas.setBounds(42, 127, 60, 17);
		panel_2.add(Etiqueta_Grasas);
		
		JLabel Etiqueta_Grasas_Saturadas = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Saturadas.setBounds(42, 193, 106, 17);
		panel_2.add(Etiqueta_Grasas_Saturadas);
		
		JLabel Etiqueta_Hidratos_Carbono = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Hidratos_Carbono.setBounds(42, 262, 137, 17);
		panel_2.add(Etiqueta_Hidratos_Carbono);
		
		JLabel Etiqeuta_Azucar = new JLabel("Azucar:");
		Etiqeuta_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqeuta_Azucar.setBounds(42, 323, 60, 17);
		panel_2.add(Etiqeuta_Azucar);
		
		JLabel Etiqueta_Proteinas = new JLabel("Proteinas:");
		Etiqueta_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Proteinas.setBounds(42, 389, 60, 17);
		panel_2.add(Etiqueta_Proteinas);
		
		JLabel Etiqueta_Sal = new JLabel("Sal:");
		Etiqueta_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Sal.setBounds(42, 458, 60, 17);
		panel_2.add(Etiqueta_Sal);
		
		JLabel Gramos_Hidratos = new JLabel("0");
		Gramos_Hidratos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Hidratos.setBounds(191, 262, 43, 17);
		panel_2.add(Gramos_Hidratos);
		
		JLabel Gramos_Grasas_Saturadas = new JLabel("0");
		Gramos_Grasas_Saturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas.setBounds(191, 193, 43, 17);
		panel_2.add(Gramos_Grasas_Saturadas);
		
		JLabel Gramos_Grasas = new JLabel("0");
		Gramos_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas.setBounds(191, 127, 43, 17);
		panel_2.add(Gramos_Grasas);
		
		JLabel Gramos_Proteinas = new JLabel("0");
		Gramos_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas.setBounds(191, 389, 41, 17);
		panel_2.add(Gramos_Proteinas);
		
		JLabel Gramos_Azucar = new JLabel("0");
		Gramos_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar.setBounds(191, 323, 43, 17);
		panel_2.add(Gramos_Azucar);
		
		JLabel Gramos_Sal = new JLabel("0");
		Gramos_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal.setBounds(191, 458, 43, 17);
		panel_2.add(Gramos_Sal);
		
		JLabel Etiqueta_Gramos_1 = new JLabel("gr");
		Etiqueta_Gramos_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1.setBounds(226, 127, 20, 17);
		panel_2.add(Etiqueta_Gramos_1);
		
		JLabel Etiqueta_Gramos_2 = new JLabel("gr");
		Etiqueta_Gramos_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2.setBounds(226, 193, 20, 17);
		panel_2.add(Etiqueta_Gramos_2);
		
		JLabel Etiqueta_Gramos_3 = new JLabel("gr");
		Etiqueta_Gramos_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3.setBounds(226, 262, 20, 17);
		panel_2.add(Etiqueta_Gramos_3);
		
		JLabel Etiqueta_Gramos_4 = new JLabel("gr");
		Etiqueta_Gramos_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4.setBounds(223, 323, 20, 17);
		panel_2.add(Etiqueta_Gramos_4);
		
		JLabel Etiqueta_Gramos_5 = new JLabel("gr");
		Etiqueta_Gramos_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5.setBounds(223, 389, 20, 17);
		panel_2.add(Etiqueta_Gramos_5);
		
		JLabel Etiqueta_Gramos_6 = new JLabel("gr");
		Etiqueta_Gramos_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6.setBounds(223, 458, 20, 17);
		panel_2.add(Etiqueta_Gramos_6);
		
		JLabel Etiqueta_MacrosCada100gr = new JLabel("Macros cada 100gr");
		Etiqueta_MacrosCada100gr.setBounds(42, 90, 192, 26);
		panel_2.add(Etiqueta_MacrosCada100gr);
		Etiqueta_MacrosCada100gr.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_MacrosSeleccionados = new JLabel("Macros cada ");
		Etiqueta_MacrosSeleccionados.setBounds(351, 90, 118, 26);
		panel_2.add(Etiqueta_MacrosSeleccionados);
		Etiqueta_MacrosSeleccionados.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_NumerodeGramosSeleccionados = new JLabel("0");
		Etiqueta_NumerodeGramosSeleccionados.setBounds(468, 96, 52, 14);
		panel_2.add(Etiqueta_NumerodeGramosSeleccionados);
		Etiqueta_NumerodeGramosSeleccionados.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_gramos_7 = new JLabel("gr");
		Etiqueta_gramos_7.setBounds(521, 93, 20, 23);
		panel_2.add(Etiqueta_gramos_7);
		Etiqueta_gramos_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel Etiqueta_Grasas_Usuario = new JLabel("Grasas:");
		Etiqueta_Grasas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Usuario.setBounds(351, 127, 60, 17);
		panel_2.add(Etiqueta_Grasas_Usuario);
		
		JLabel Etiqueta_Grasas_Saturadas_Usuario = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Grasas_Saturadas_Usuario.setBounds(351, 193, 106, 17);
		panel_2.add(Etiqueta_Grasas_Saturadas_Usuario);
		
		JLabel Etiqueta_Hidratos_Carbono_Usuario = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Hidratos_Carbono_Usuario.setBounds(351, 262, 137, 17);
		panel_2.add(Etiqueta_Hidratos_Carbono_Usuario);
		
		JLabel Etiqeuta_Azucar_Usuario = new JLabel("Azucar:");
		Etiqeuta_Azucar_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqeuta_Azucar_Usuario.setBounds(351, 323, 60, 17);
		panel_2.add(Etiqeuta_Azucar_Usuario);
		
		JLabel Etiqueta_Proteinas_Usuario = new JLabel("Proteinas:");
		Etiqueta_Proteinas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Proteinas_Usuario.setBounds(351, 389, 60, 17);
		panel_2.add(Etiqueta_Proteinas_Usuario);
		
		JLabel Etiqueta_Sal_Usuario = new JLabel("Sal:");
		Etiqueta_Sal_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Sal_Usuario.setBounds(351, 458, 60, 17);
		panel_2.add(Etiqueta_Sal_Usuario);
		
		JLabel Gramos_Hidratos_Usuario = new JLabel("0");
		Gramos_Hidratos_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Hidratos_Usuario.setBounds(488, 262, 53, 17);
		panel_2.add(Gramos_Hidratos_Usuario);
		
		JLabel Gramos_Grasas_Saturadas_Usuario = new JLabel("0");
		Gramos_Grasas_Saturadas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas_Usuario.setBounds(488, 193, 53, 17);
		panel_2.add(Gramos_Grasas_Saturadas_Usuario);
		
		JLabel Gramos_Grasas_Usuario = new JLabel("0");
		Gramos_Grasas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Usuario.setBounds(488, 127, 53, 17);
		panel_2.add(Gramos_Grasas_Usuario);
		
		JLabel Gramos_Proteinas_Usuario = new JLabel("0");
		Gramos_Proteinas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas_Usuario.setBounds(488, 389, 53, 17);
		panel_2.add(Gramos_Proteinas_Usuario);
		
		JLabel Gramos_Azucar_Usuario = new JLabel("0");
		Gramos_Azucar_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar_Usuario.setBounds(488, 323, 53, 17);
		panel_2.add(Gramos_Azucar_Usuario);
		
		JLabel Gramos_Sal_Usuario = new JLabel("0");
		Gramos_Sal_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal_Usuario.setBounds(488, 458, 53, 17);
		panel_2.add(Gramos_Sal_Usuario);
		
		JLabel Etiqueta_Gramos_1_1 = new JLabel("gr");
		Etiqueta_Gramos_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_1.setBounds(548, 127, 20, 17);
		panel_2.add(Etiqueta_Gramos_1_1);
		
		JLabel Etiqueta_Gramos_2_1 = new JLabel("gr");
		Etiqueta_Gramos_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2_1.setBounds(548, 193, 20, 17);
		panel_2.add(Etiqueta_Gramos_2_1);
		
		JLabel Etiqueta_Gramos_3_1 = new JLabel("gr");
		Etiqueta_Gramos_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3_1.setBounds(548, 262, 20, 17);
		panel_2.add(Etiqueta_Gramos_3_1);
		
		JLabel Etiqueta_Gramos_4_1 = new JLabel("gr");
		Etiqueta_Gramos_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4_1.setBounds(548, 323, 20, 17);
		panel_2.add(Etiqueta_Gramos_4_1);
		
		JLabel Etiqueta_Gramos_5_1 = new JLabel("gr");
		Etiqueta_Gramos_5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5_1.setBounds(548, 389, 20, 17);
		panel_2.add(Etiqueta_Gramos_5_1);
		
		JLabel Etiqueta_Gramos_6_1 = new JLabel("gr");
		Etiqueta_Gramos_6_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6_1.setBounds(548, 458, 20, 17);
		panel_2.add(Etiqueta_Gramos_6_1);
		
		
		JPanel panel_Calorias_100gr = new JPanel();
		panel_Calorias_100gr.setBackground(new Color(153, 255, 204));
		panel_Calorias_100gr.setBounds(42, 526, 190, 46);
		panel_2.add(panel_Calorias_100gr);
		panel_Calorias_100gr.setLayout(null);
		
		JLabel Etiqueta_Calorias = new JLabel("Calorias");
		Etiqueta_Calorias.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_Calorias.setBounds(92, 11, 74, 24);
		panel_Calorias_100gr.add(Etiqueta_Calorias);
		
		JLabel Etiqueta_Total_Calorias_100gr = new JLabel("");
		Etiqueta_Total_Calorias_100gr.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Total_Calorias_100gr.setBounds(27, 12, 55, 20);
		panel_Calorias_100gr.add(Etiqueta_Total_Calorias_100gr);
		
		JPanel panel_Calorias_100gr_Usuario = new JPanel();
		panel_Calorias_100gr_Usuario.setBackground(new Color(153, 255, 204));
		panel_Calorias_100gr_Usuario.setBounds(351, 526, 190, 46);
		panel_2.add(panel_Calorias_100gr_Usuario);
		panel_Calorias_100gr_Usuario.setLayout(null);
		
		JLabel Etiqueta_Calorias_1 = new JLabel("Calorias");
		Etiqueta_Calorias_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Etiqueta_Calorias_1.setBounds(106, 10, 74, 24);
		panel_Calorias_100gr_Usuario.add(Etiqueta_Calorias_1);
		
		JLabel Etiqueta_Total_Calorias_Usuario = new JLabel("");
		Etiqueta_Total_Calorias_Usuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Total_Calorias_Usuario.setBounds(30, 11, 55, 20);
		panel_Calorias_100gr_Usuario.add(Etiqueta_Total_Calorias_Usuario);
		
		JLabel Total_Calorias_100gr = new JLabel("Total Calorias:");
		Total_Calorias_100gr.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total_Calorias_100gr.setBounds(76, 486, 124, 29);
		panel_2.add(Total_Calorias_100gr);
		
		JLabel Total_Calorias_100gr_1 = new JLabel("Total Calorias:");
		Total_Calorias_100gr_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total_Calorias_100gr_1.setBounds(385, 486, 124, 29);
		panel_2.add(Total_Calorias_100gr_1);
		
		JLabel Etiqueta_Exception_Gramos_Lista = new JLabel("");
		Etiqueta_Exception_Gramos_Lista.setFont(new Font("Dialog", Font.BOLD, 12));
		Etiqueta_Exception_Gramos_Lista.setForeground(Color.RED);
		Etiqueta_Exception_Gramos_Lista.setBounds(131, 0, 338, 22);
		panel_2.add(Etiqueta_Exception_Gramos_Lista);
		
		JPanel panel_Titulo = new JPanel();
		panel_Titulo.setBackground(new Color(153, 255, 255));
		panel_Titulo.setBounds(368, 11, 670, 73);
		frame.getContentPane().add(panel_Titulo);
		panel_Titulo.setLayout(null);
		
		JLabel Etiqueta_Titulo = new JLabel("Nombre Aplicacion");
		Etiqueta_Titulo.setFont(new Font("Dialog", Font.BOLD, 58));
		Etiqueta_Titulo.setBounds(44, -27, 670, 100);
		panel_Titulo.add(Etiqueta_Titulo);
		
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

		JComboBox Lista_Productos = new JComboBox();
		//Este argumento sirve para cuando el usuario seleccione un producto de la lista de productos
		//mire todos los macros
		Lista_Productos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//Para poder hacer tengo que pasar el valor que es un Double a String y por eso creo otra variable
				Integer NumeroLista=Lista_Productos.getSelectedIndex();
				String MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getGrasas());
				Gramos_Grasas.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getGrasas_saturadas());
				Gramos_Grasas_Saturadas.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getHidratos_carbono());
				Gramos_Hidratos.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getAzucar());
				Gramos_Azucar.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getProteinas());
				Gramos_Proteinas.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getSal());
				Gramos_Sal.setText(MacroEspecifica);
				MacroEspecifica=Double.toString(ArrayListaProductos.ListaProductos.get(NumeroLista).getCalorias());
				Etiqueta_Total_Calorias_100gr.setText(MacroEspecifica);
				//Sirve para que cuando el usuario seleccione otro producto le la list ano se gurden los resultados del anterior producto
				Gramos_Grasas_Usuario.setText(null);
				Gramos_Grasas_Saturadas_Usuario.setText(null);
				Gramos_Hidratos_Usuario.setText(null);
				Gramos_Azucar_Usuario.setText(null);
				Gramos_Proteinas_Usuario.setText(null);
				Gramos_Sal_Usuario.setText(null);

			}
		});
		Lista_Productos.setBounds(76, 32, 124, 26);
		panel_2.add(Lista_Productos);
		//Bucle el cual recorre toda la ArrayList y agrega a la lista de la interfaz el nombre de cada objeto Producto
		for(int i=0;i<ArrayListaProductos.ListaProductos.size();i++) {
			Lista_Productos.addItem(ArrayListaProductos.ListaProductos.get(i).getNombre());
		};
		ArrayList<JLabel> CalculosGrUsuario=new ArrayList<JLabel>();
		CalculosGrUsuario.add(Gramos_Grasas_Usuario);
		CalculosGrUsuario.add(Gramos_Grasas_Saturadas_Usuario);
		CalculosGrUsuario.add(Gramos_Hidratos_Usuario);
		CalculosGrUsuario.add(Gramos_Azucar_Usuario);
		CalculosGrUsuario.add(Gramos_Proteinas_Usuario);
		CalculosGrUsuario.add(Gramos_Sal_Usuario);
		
		//Cantidad de Gramos de el producto seleccionado
		Cantidad_Gramos_ListaProductos = new JTextField();
		Cantidad_Gramos_ListaProductos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Cantidad_Gramos_ListaProductos.setBounds(255, 34, 70, 23);
		panel_2.add(Cantidad_Gramos_ListaProductos);
		//Sirve para acutalizar la candidad de gramos que pone le usuario
		Cantidad_Gramos_ListaProductos.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				String gramos=Cantidad_Gramos_ListaProductos.getText();
				Etiqueta_NumerodeGramosSeleccionados.setText(gramos);
				
			}
		});
		
		//Creamos el objeto Ingesta
		Ingesta ing=new Ingesta();

		//ArrayList de las etiquetas JLabel
		ArrayList<JLabel> etiquetaUsuario=new ArrayList<JLabel>();
		etiquetaUsuario.add(Gramos_Grasas_Usuario);
		etiquetaUsuario.add(Gramos_Grasas_Saturadas_Usuario);
		etiquetaUsuario.add(Gramos_Hidratos_Usuario);
		etiquetaUsuario.add(Gramos_Azucar_Usuario);
		etiquetaUsuario.add(Gramos_Proteinas_Usuario);
		etiquetaUsuario.add(Gramos_Sal_Usuario);
		
		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("Gr");
		Etiqueta_Gramos.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Gramos.setBounds(351, 41, 20, 17);
		panel_2.add(Etiqueta_Gramos);
		
		//Boton Agregar
		JButton Boton_Agregar = new JButton("Agregar");
		Boton_Agregar.setBounds(411, 25, 106, 41);
		panel_2.add(Boton_Agregar);
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(1077, 283, 264, 596);
		frame.getContentPane().add(panel);
		Boton_Agregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Sirve para poner todos los huecos en null y que no se guarde los valores del atnerior prodcuto agregrado
				//para eso estamos usando la ArrayList etiquetaUsuario
				for(int i=0;i<etiquetaUsuario.size();i++) {
					etiquetaUsuario.get(i).setText("0");
				}
				
		
				//Esta exception sirve para mostrar al usuario si ha introducido los datos bien
				Etiqueta_Exception_Gramos_Lista.setText("");
				String texto = Cantidad_Gramos_ListaProductos.getText();
				char[] v=texto.toCharArray();
				boolean isDigit=true;
				int i=0;
				while(isDigit && i<v.length) {
					if(!Character.isDigit(v[i])) {
					Etiqueta_Exception_Gramos_Lista.setText("datos erroneos, tienes que introducir un numero positivo");
					isDigit=false;
					}
					i++;
				}
				
				if(isDigit) {
				// Creamos un objeto ing de Ingesta para poder calcular los Macros dependiendo las calorias que pone el usuario
				//gracias a un metodo el cual hace todos los calculos
				Integer NumeroLista=Lista_Productos.getSelectedIndex();
				int gramos=Integer.parseInt(Cantidad_Gramos_ListaProductos.getText());
				//Llamamos la metodo insertarProducto
				ing.insertarProducto(ArrayListaProductos.ListaProductos.get(NumeroLista), gramos);
				int size=ing.dieta.size()-1; // tamaño de la ArrayList dieta
				// Hacemos que las etiquetas tengan el valor de los calculos especificos gracias al metodo insertarProducto
				String MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getGrasas());
				Gramos_Grasas_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getGrasas_saturadas());
				Gramos_Grasas_Saturadas_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getHidratos_carbono());
				Gramos_Hidratos_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getAzucar());
				Gramos_Azucar_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getProteinas());
				Gramos_Proteinas_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getSal());
				Gramos_Sal_Usuario.setText(MacroEspecificaUsuario);
				MacroEspecificaUsuario=Double.toString(ing.dieta.get(size).getCalorias());
				Etiqueta_Total_Calorias_Usuario.setText(MacroEspecificaUsuario);
				}	
			}
		});
		
		
		
		
		
	}
}

