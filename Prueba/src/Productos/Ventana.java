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

public class Ventana {

	private JFrame frame;
	private JTextField Nombre_Nuevo_Producto;
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
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		Nombre_Nuevo_Producto = new JTextField();
		Nombre_Nuevo_Producto.setBounds(68, 406, 114, 21);
		frame.getContentPane().add(Nombre_Nuevo_Producto);
		Nombre_Nuevo_Producto.setColumns(10);
		
		JLabel Etiqueta_Grasas = new JLabel("Grasas:");
		Etiqueta_Grasas.setBounds(45, 191, 60, 17);
		frame.getContentPane().add(Etiqueta_Grasas);
		
		JLabel Etiqueta_Grasas_Saturadas = new JLabel("Grasas Saturadas:");
		Etiqueta_Grasas_Saturadas.setBounds(45, 257, 106, 17);
		frame.getContentPane().add(Etiqueta_Grasas_Saturadas);
		
		JLabel Etiqueta_Hidratos_Carbono = new JLabel("Hidratos de Carbono:");
		Etiqueta_Hidratos_Carbono.setBounds(45, 326, 137, 17);
		frame.getContentPane().add(Etiqueta_Hidratos_Carbono);
		
		JLabel Etiqeuta_Azucar = new JLabel("Azucar:");
		Etiqeuta_Azucar.setBounds(264, 191, 60, 17);
		frame.getContentPane().add(Etiqeuta_Azucar);
		
		JLabel Etiqueta_Proteinas = new JLabel("Proteinas:");
		Etiqueta_Proteinas.setBounds(264, 257, 60, 17);
		frame.getContentPane().add(Etiqueta_Proteinas);
		
		JLabel Etiqueta_Sal = new JLabel("Sal:");
		Etiqueta_Sal.setBounds(264, 326, 60, 17);
		frame.getContentPane().add(Etiqueta_Sal);
		
		JLabel Gramos_Hidratos = new JLabel("0");
		Gramos_Hidratos.setBounds(194, 326, 20, 17);
		frame.getContentPane().add(Gramos_Hidratos);
		
		JLabel Gramos_Grasas_Saturadas = new JLabel("0");
		Gramos_Grasas_Saturadas.setBounds(194, 257, 20, 17);
		frame.getContentPane().add(Gramos_Grasas_Saturadas);
		
		JLabel Gramos_Grasas = new JLabel("0");
		Gramos_Grasas.setBounds(194, 191, 20, 17);
		frame.getContentPane().add(Gramos_Grasas);
		
		JLabel Gramos_Proteinas = new JLabel("0");
		Gramos_Proteinas.setBounds(346, 257, 20, 17);
		frame.getContentPane().add(Gramos_Proteinas);
		
		JLabel Gramos_Azucar = new JLabel("0");
		Gramos_Azucar.setBounds(346, 191, 20, 17);
		frame.getContentPane().add(Gramos_Azucar);
		
		JLabel Gramos_Sal = new JLabel("0");
		Gramos_Sal.setBounds(346, 326, 20, 17);
		frame.getContentPane().add(Gramos_Sal);
		
		JLabel Etiqueta_Gramos_1 = new JLabel("gr");
		Etiqueta_Gramos_1.setBounds(215, 191, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_1);
		
		JLabel Etiqueta_Gramos_2 = new JLabel("gr");
		Etiqueta_Gramos_2.setBounds(215, 257, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_2);
		
		JLabel Etiqueta_Gramos_3 = new JLabel("gr");
		Etiqueta_Gramos_3.setBounds(215, 326, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_3);
		
		JLabel Etiqueta_Gramos_4 = new JLabel("gr");
		Etiqueta_Gramos_4.setBounds(364, 191, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_4);
		
		JLabel Etiqueta_Gramos_5 = new JLabel("gr");
		Etiqueta_Gramos_5.setBounds(364, 257, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_5);
		
		//Lista de productos referenciados a la ArrayList de la clase Productos
		ArrayList<String> ArrayListaProdcutos = new ArrayList<String>();
		ArrayListaProdcutos.add("Arroz");
		ArrayListaProdcutos.add("Pollo");
		ArrayListaProdcutos.add("Atún");
		ArrayListaProdcutos.add("Queso");
		ArrayListaProdcutos.add("Avena");
		JComboBox Lista_Productos = new JComboBox();
		Lista_Productos.setBounds(45, 80, 124, 26);
		frame.getContentPane().add(Lista_Productos);
		
		
		//Cantidad de Gramos de el producto seleccionado
		Cantidad_Gramos_ListaProductos = new JTextField();
		Cantidad_Gramos_ListaProductos.setBounds(206, 83, 52, 21);
		frame.getContentPane().add(Cantidad_Gramos_ListaProductos);
		Cantidad_Gramos_ListaProductos.setColumns(10);
		
		//Etiqueta Gramos
		JLabel Etiqueta_Gramos = new JLabel("gr");
		Etiqueta_Gramos.setBounds(265, 85, 20, 17);
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
		Boton_Añadir.setBounds(320, 80, 83, 27);
		frame.getContentPane().add(Boton_Añadir);
		
		
		
		JLabel Etiqueta_Gramos_6 = new JLabel("gr");
		Etiqueta_Gramos_6.setBounds(364, 326, 20, 17);
		frame.getContentPane().add(Etiqueta_Gramos_6);
		for(String campos : ArrayListaProdcutos) {
			Lista_Productos.addItem(campos);
			
			}
	}
}
