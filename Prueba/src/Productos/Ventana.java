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

public class Ventana {

	private JFrame frame;
	private JTextField Cantidad_Gramos_ListaProductos;

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
		
		//Panel2
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 255, 255));
		panel_2.setBounds(47, 283, 609, 596);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		//Panel3
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(153, 255, 255));
		panel_3.setBounds(750, 283, 289, 596);
		frame.getContentPane().add(panel_3);


		//Panel4
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(153, 255, 255));
		panel_4.setBounds(1049, 283, 292, 596);
		frame.getContentPane().add(panel_4);
		
			
		
		
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
		Gramos_Hidratos.setBounds(191, 262, 20, 17);
		panel_2.add(Gramos_Hidratos);
		
		JLabel Gramos_Grasas_Saturadas = new JLabel("0");
		Gramos_Grasas_Saturadas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas.setBounds(191, 193, 20, 17);
		panel_2.add(Gramos_Grasas_Saturadas);
		
		JLabel Gramos_Grasas = new JLabel("0");
		Gramos_Grasas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas.setBounds(191, 127, 20, 17);
		panel_2.add(Gramos_Grasas);
		
		JLabel Gramos_Proteinas = new JLabel("0");
		Gramos_Proteinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas.setBounds(191, 389, 20, 17);
		panel_2.add(Gramos_Proteinas);
		
		JLabel Gramos_Azucar = new JLabel("0");
		Gramos_Azucar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar.setBounds(191, 323, 20, 17);
		panel_2.add(Gramos_Azucar);
		
		JLabel Gramos_Sal = new JLabel("0");
		Gramos_Sal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal.setBounds(191, 458, 20, 17);
		panel_2.add(Gramos_Sal);
		
		JLabel Etiqueta_Gramos_1 = new JLabel("gr");
		Etiqueta_Gramos_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1.setBounds(212, 127, 20, 17);
		panel_2.add(Etiqueta_Gramos_1);
		
		JLabel Etiqueta_Gramos_2 = new JLabel("gr");
		Etiqueta_Gramos_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2.setBounds(212, 193, 20, 17);
		panel_2.add(Etiqueta_Gramos_2);
		
		JLabel Etiqueta_Gramos_3 = new JLabel("gr");
		Etiqueta_Gramos_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3.setBounds(212, 262, 20, 17);
		panel_2.add(Etiqueta_Gramos_3);
		
		JLabel Etiqueta_Gramos_4 = new JLabel("gr");
		Etiqueta_Gramos_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4.setBounds(209, 323, 20, 17);
		panel_2.add(Etiqueta_Gramos_4);
		
		JLabel Etiqueta_Gramos_5 = new JLabel("gr");
		Etiqueta_Gramos_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5.setBounds(209, 389, 20, 17);
		panel_2.add(Etiqueta_Gramos_5);
		
		JLabel Etiqueta_Gramos_6 = new JLabel("gr");
		Etiqueta_Gramos_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6.setBounds(209, 458, 20, 17);
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
		Etiqueta_gramos_7.setBounds(521, 93, 20, 20);
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
		Gramos_Hidratos_Usuario.setBounds(500, 262, 20, 17);
		panel_2.add(Gramos_Hidratos_Usuario);
		
		JLabel Gramos_Grasas_Saturadas_Usuario = new JLabel("0");
		Gramos_Grasas_Saturadas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Saturadas_Usuario.setBounds(500, 193, 20, 17);
		panel_2.add(Gramos_Grasas_Saturadas_Usuario);
		
		JLabel Gramos_Grasas_Usuario = new JLabel("0");
		Gramos_Grasas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Grasas_Usuario.setBounds(500, 127, 20, 17);
		panel_2.add(Gramos_Grasas_Usuario);
		
		JLabel Gramos_Proteinas_Usuario = new JLabel("0");
		Gramos_Proteinas_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Proteinas_Usuario.setBounds(500, 389, 20, 17);
		panel_2.add(Gramos_Proteinas_Usuario);
		
		JLabel Gramos_Azucar_Usuario = new JLabel("0");
		Gramos_Azucar_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Azucar_Usuario.setBounds(500, 323, 20, 17);
		panel_2.add(Gramos_Azucar_Usuario);
		
		JLabel Gramos_Sal_Usuario = new JLabel("0");
		Gramos_Sal_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Gramos_Sal_Usuario.setBounds(500, 458, 20, 17);
		panel_2.add(Gramos_Sal_Usuario);
		
		JLabel Etiqueta_Gramos_1_1 = new JLabel("gr");
		Etiqueta_Gramos_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_1_1.setBounds(521, 127, 20, 17);
		panel_2.add(Etiqueta_Gramos_1_1);
		
		JLabel Etiqueta_Gramos_2_1 = new JLabel("gr");
		Etiqueta_Gramos_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_2_1.setBounds(521, 193, 20, 17);
		panel_2.add(Etiqueta_Gramos_2_1);
		
		JLabel Etiqueta_Gramos_3_1 = new JLabel("gr");
		Etiqueta_Gramos_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_3_1.setBounds(521, 262, 20, 17);
		panel_2.add(Etiqueta_Gramos_3_1);
		
		JLabel Etiqueta_Gramos_4_1 = new JLabel("gr");
		Etiqueta_Gramos_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_4_1.setBounds(518, 323, 20, 17);
		panel_2.add(Etiqueta_Gramos_4_1);
		
		JLabel Etiqueta_Gramos_5_1 = new JLabel("gr");
		Etiqueta_Gramos_5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_5_1.setBounds(518, 389, 20, 17);
		panel_2.add(Etiqueta_Gramos_5_1);
		
		JLabel Etiqueta_Gramos_6_1 = new JLabel("gr");
		Etiqueta_Gramos_6_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Etiqueta_Gramos_6_1.setBounds(518, 458, 20, 17);
		panel_2.add(Etiqueta_Gramos_6_1);
		JComboBox Lista_Productos = new JComboBox();
		Lista_Productos.setBounds(76, 32, 124, 26);
		panel_2.add(Lista_Productos);
		
		
		//OBJETOS LOS CUALES TIENEN FUNCIONES
		
		//Lista de productos referenciados a la ArrayList de la clase Productos
				ArrayList<String> ArrayListaProductos = new ArrayList<String>();
				ArrayListaProductos.add("Actimel");
				ArrayListaProductos.add("Kit-Kat");
				ArrayListaProductos.add("Pollo");
				ArrayListaProductos.add("Arroz");
				ArrayListaProductos.add("Avena");
				//Bucle el cual recorre toda la ArrayList y la añade a la lista de la interfaz
				for(int i=0;i<ArrayListaProductos.size();i++) {
					Lista_Productos.addItem(ArrayListaProductos.get(i));
					};
				
		
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
		Cantidad_Gramos_ListaProductos.setColumns(10);
		
		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("Gr");
		Etiqueta_Gramos.setFont(new Font("Tahoma", Font.BOLD, 15));
		Etiqueta_Gramos.setBounds(351, 41, 20, 17);
		panel_2.add(Etiqueta_Gramos);
		
		//Boton Agregar
		JButton Boton_Agregar = new JButton("Agregar");
		Boton_Agregar.setBounds(411, 25, 106, 41);
		panel_2.add(Boton_Agregar);
		
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
		
		JPanel panel_Titulo = new JPanel();
		panel_Titulo.setBackground(new Color(153, 255, 255));
		panel_Titulo.setBounds(368, 11, 670, 73);
		frame.getContentPane().add(panel_Titulo);
		panel_Titulo.setLayout(null);
		
		JLabel Etiqueta_Titulo = new JLabel("Nombre Aplicacion");
		Etiqueta_Titulo.setFont(new Font("Gabriola", Font.BOLD, 64));
		Etiqueta_Titulo.setBounds(153, 11, 419, 100);
		panel_Titulo.add(Etiqueta_Titulo);
		// Si se agrega el prodcuto el texto Gramos se borrara y tambien todas sus referencias en los macros
		Boton_Agregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cantidad_Gramos_ListaProductos.setText(null);
				Gramos_Grasas.setText(null);
				Gramos_Grasas_Saturadas.setText(null);
				Gramos_Hidratos.setText(null);
				Gramos_Azucar.setText(null);
				Gramos_Proteinas.setText(null);
				Gramos_Sal.setText(null);
				//Se visualizan los Macros depende los gramos que ponga el usario
				Gramos_Grasas_Usuario.setText(null);
				Gramos_Grasas_Saturadas_Usuario.setText(null);
				Gramos_Hidratos_Usuario.setText(null);
				Gramos_Azucar_Usuario.setText(null);
				Gramos_Proteinas_Usuario.setText(null);
				Gramos_Sal_Usuario.setText(null);
				
			}
		});
		
		
		
		
		
	}
}
