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
		frame.setBounds(100, 100, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Etiqueta_Grasas = new JLabel("Grasas:");
		Etiqueta_Grasas.setBounds(53, 329, 60, 17);
		frame.getContentPane().add(Etiqueta_Grasas);
		
		JLabel Etiqueta_Grasas_Saturadas = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas.setBounds(53, 395, 106, 17);
		frame.getContentPane().add(Etiqueta_Grasas_Saturadas);
		
		JLabel Etiqueta_Hidratos_Carbono = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono.setBounds(53, 464, 137, 17);
		frame.getContentPane().add(Etiqueta_Hidratos_Carbono);
		
		JLabel Etiqeuta_Azucar = new JLabel("Azucar:");
		Etiqeuta_Azucar.setBounds(53, 525, 60, 17);
		frame.getContentPane().add(Etiqeuta_Azucar);
		
		JLabel Etiqueta_Proteinas = new JLabel("Proteinas:");
		Etiqueta_Proteinas.setBounds(53, 591, 60, 17);
		frame.getContentPane().add(Etiqueta_Proteinas);
		
		JLabel Etiqueta_Sal = new JLabel("Sal:");
		Etiqueta_Sal.setBounds(53, 660, 60, 17);
		frame.getContentPane().add(Etiqueta_Sal);
		
		JLabel Gramos_Hidratos = new JLabel("0");
		Gramos_Hidratos.setBounds(202, 464, 20, 17);
		frame.getContentPane().add(Gramos_Hidratos);
		
		JLabel Gramos_Grasas_Saturadas = new JLabel("0");
		Gramos_Grasas_Saturadas.setBounds(202, 395, 20, 17);
		frame.getContentPane().add(Gramos_Grasas_Saturadas);
		
		JLabel Gramos_Grasas = new JLabel("0");
		Gramos_Grasas.setBounds(202, 329, 20, 17);
		frame.getContentPane().add(Gramos_Grasas);
		
		JLabel Gramos_Proteinas = new JLabel("0");
		Gramos_Proteinas.setBounds(202, 591, 20, 17);
		frame.getContentPane().add(Gramos_Proteinas);
		
		JLabel Gramos_Azucar = new JLabel("0");
		Gramos_Azucar.setBounds(202, 525, 20, 17);
		frame.getContentPane().add(Gramos_Azucar);
		
		JLabel Gramos_Sal = new JLabel("0");
		Gramos_Sal.setBounds(202, 660, 20, 17);
		frame.getContentPane().add(Gramos_Sal);
		
		JLabel Etiqueta_Gramos_1 = new JLabel("gr");
		Etiqueta_Gramos_1.setBounds(223, 329, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_1);
		
		JLabel Etiqueta_Gramos_2 = new JLabel("gr");
		Etiqueta_Gramos_2.setBounds(223, 395, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_2);
		
		JLabel Etiqueta_Gramos_3 = new JLabel("gr");
		Etiqueta_Gramos_3.setBounds(223, 464, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_3);
		
		JLabel Etiqueta_Gramos_4 = new JLabel("gr");
		Etiqueta_Gramos_4.setBounds(220, 525, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_4);
		
		JLabel Etiqueta_Gramos_5 = new JLabel("gr");
		Etiqueta_Gramos_5.setBounds(220, 591, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_5);
		
		JLabel Etiqueta_Gramos_6 = new JLabel("gr");
		Etiqueta_Gramos_6.setBounds(220, 660, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_6);
		
		JLabel Etiqueta_MacrosCada100gr = new JLabel("Macros cada 100gr");
		Etiqueta_MacrosCada100gr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Etiqueta_MacrosCada100gr.setBounds(75, 291, 192, 26);
		frame.getContentPane().add(Etiqueta_MacrosCada100gr);
		
		JLabel Etiqueta_MacrosSeleccionados = new JLabel("Macros cada ");
		Etiqueta_MacrosSeleccionados.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Etiqueta_MacrosSeleccionados.setBounds(384, 291, 98, 26);
		frame.getContentPane().add(Etiqueta_MacrosSeleccionados);
		
		JLabel Etiqueta_NumerodeGramosSeleccionados = new JLabel("0");
		Etiqueta_NumerodeGramosSeleccionados.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Etiqueta_NumerodeGramosSeleccionados.setBounds(487, 297, 52, 14);
		frame.getContentPane().add(Etiqueta_NumerodeGramosSeleccionados);
		
		JLabel Etiqueta_gramos_7 = new JLabel("gr");
		Etiqueta_gramos_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Etiqueta_gramos_7.setBounds(549, 294, 20, 20);
		frame.getContentPane().add(Etiqueta_gramos_7);
		
		JLabel Etiqueta_Grasas_Usuario = new JLabel("Grasas:");
		Etiqueta_Grasas_Usuario.setBounds(362, 329, 60, 17);
		frame.getContentPane().add(Etiqueta_Grasas_Usuario);
		
		JLabel Etiqueta_Grasas_Saturadas_Usuario = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas_Usuario.setBounds(362, 395, 106, 17);
		frame.getContentPane().add(Etiqueta_Grasas_Saturadas_Usuario);
		
		JLabel Etiqueta_Hidratos_Carbono_Usuario = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono_Usuario.setBounds(362, 464, 137, 17);
		frame.getContentPane().add(Etiqueta_Hidratos_Carbono_Usuario);
		
		JLabel Etiqeuta_Azucar_Usuario = new JLabel("Azucar:");
		Etiqeuta_Azucar_Usuario.setBounds(362, 525, 60, 17);
		frame.getContentPane().add(Etiqeuta_Azucar_Usuario);
		
		JLabel Etiqueta_Proteinas_Usuario = new JLabel("Proteinas:");
		Etiqueta_Proteinas_Usuario.setBounds(362, 591, 60, 17);
		frame.getContentPane().add(Etiqueta_Proteinas_Usuario);
		
		JLabel Etiqueta_Sal_Usuario = new JLabel("Sal:");
		Etiqueta_Sal_Usuario.setBounds(362, 660, 60, 17);
		frame.getContentPane().add(Etiqueta_Sal_Usuario);
		
		JLabel Gramos_Hidratos_Usuario = new JLabel("0");
		Gramos_Hidratos_Usuario.setBounds(511, 464, 20, 17);
		frame.getContentPane().add(Gramos_Hidratos_Usuario);
		
		JLabel Gramos_Grasas_Saturadas_Usuario = new JLabel("0");
		Gramos_Grasas_Saturadas_Usuario.setBounds(511, 395, 20, 17);
		frame.getContentPane().add(Gramos_Grasas_Saturadas_Usuario);
		
		JLabel Gramos_Grasas_Usuario = new JLabel("0");
		Gramos_Grasas_Usuario.setBounds(511, 329, 20, 17);
		frame.getContentPane().add(Gramos_Grasas_Usuario);
		
		JLabel Gramos_Proteinas_Usuario = new JLabel("0");
		Gramos_Proteinas_Usuario.setBounds(511, 591, 20, 17);
		frame.getContentPane().add(Gramos_Proteinas_Usuario);
		
		JLabel Gramos_Azucar_Usuario = new JLabel("0");
		Gramos_Azucar_Usuario.setBounds(511, 525, 20, 17);
		frame.getContentPane().add(Gramos_Azucar_Usuario);
		
		JLabel Gramos_Sal_Usuario = new JLabel("0");
		Gramos_Sal_Usuario.setBounds(511, 660, 20, 17);
		frame.getContentPane().add(Gramos_Sal_Usuario);
		
		JLabel Etiqueta_Gramos_1_1 = new JLabel("gr");
		Etiqueta_Gramos_1_1.setBounds(532, 329, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_1_1);
		
		JLabel Etiqueta_Gramos_2_1 = new JLabel("gr");
		Etiqueta_Gramos_2_1.setBounds(532, 395, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_2_1);
		
		JLabel Etiqueta_Gramos_3_1 = new JLabel("gr");
		Etiqueta_Gramos_3_1.setBounds(532, 464, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_3_1);
		
		JLabel Etiqueta_Gramos_4_1 = new JLabel("gr");
		Etiqueta_Gramos_4_1.setBounds(529, 525, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_4_1);
		
		JLabel Etiqueta_Gramos_5_1 = new JLabel("gr");
		Etiqueta_Gramos_5_1.setBounds(529, 591, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_5_1);
		
		JLabel Etiqueta_Gramos_6_1 = new JLabel("gr");
		Etiqueta_Gramos_6_1.setBounds(529, 660, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_6_1);
		
		//Lista de productos referenciados a la ArrayList de la clase Productos
		ArrayList<String> ArrayListaProductos = new ArrayList<String>();
		ArrayListaProductos.add("Actimel");
		ArrayListaProductos.add("Kit-Kat");
		ArrayListaProductos.add("Pollo");
		ArrayListaProductos.add("Arroz");
		ArrayListaProductos.add("Avena");
		JComboBox Lista_Productos = new JComboBox();
		Lista_Productos.setBounds(34, 234, 124, 26);
		frame.getContentPane().add(Lista_Productos);
		//Bucle el cual recorre toda la ArrayList y la añade a la lista de la interfaz
		for(int i=0;i<ArrayListaProductos.size();i++) {
			Lista_Productos.addItem(ArrayListaProductos.get(i));
			}
		
		
		//Cantidad de Gramos de el producto seleccionado
		Cantidad_Gramos_ListaProductos = new JTextField();
		//Sirve para acutalizar la candidad de gramos que pone le usuario
		Cantidad_Gramos_ListaProductos.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				String gramos=Cantidad_Gramos_ListaProductos.getText();
				Etiqueta_NumerodeGramosSeleccionados.setText(gramos);
			}
		});
		//Sirve para acutalizar la candidad de gramos que pone le usuario
		
		Cantidad_Gramos_ListaProductos.setBounds(195, 237, 52, 21);
		frame.getContentPane().add(Cantidad_Gramos_ListaProductos);
		Cantidad_Gramos_ListaProductos.setColumns(10);
		
		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("gr");
		Etiqueta_Gramos.setBounds(254, 239, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos);
		
		//Boton Añadir
		JButton Boton_Añadir = new JButton("Añadir");
		// Si se añade el prodcuto el texto Gramos se borrara y tambien todas sus referencias en los macros
		Boton_Añadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cantidad_Gramos_ListaProductos.setText(null);
				Gramos_Grasas.setText(null);
				Gramos_Grasas_Saturadas.setText(null);
				Gramos_Hidratos.setText(null);
				Gramos_Azucar.setText(null);
				Gramos_Proteinas.setText(null);
				Gramos_Sal.setText(null);
			}
		});
		Boton_Añadir.setBounds(309, 234, 83, 27);
		frame.getContentPane().add(Boton_Añadir);
		
		
		
		
		
	}
}
