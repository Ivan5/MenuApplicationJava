import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaMenu implements ActionListener{
	JFrame ventana; //Definir la ventana
	JMenu opcion1, opcion2,Sopcion1,Sopcion2,Sopcion3,Sopcion4; //Opciones del Menú
	JMenuItem sub1,sub2; //Item del menú
	JMenuBar menubar; //Barra de Menú
	
	public void crearMenu(){
		menubar = new JMenuBar(); //Crear la barra de menu
		
		opcion1 = new JMenu("Opción 1");
		opcion2 = new JMenu("Opción 2");
		
		Sopcion1 = new JMenu("Archivo");
		Sopcion2 = new JMenu("Edicion");
		Sopcion3 = new JMenu("Crear");
		Sopcion4 = new JMenu("Salir");
		
		sub1 = new JMenuItem("X");
		sub2 = new JMenuItem("Y");
		
		menubar.add(opcion1);
		menubar.add(opcion2);
		
		opcion1.add(Sopcion1);
		opcion1.add(Sopcion2);
		
		opcion2.add(Sopcion3);
		opcion2.add(Sopcion4);
		
		Sopcion2.add(sub1);
		Sopcion2.add(sub2);
		
		Sopcion1.addActionListener(this);
		Sopcion2.addActionListener(this);
		Sopcion3.addActionListener(this);
		Sopcion4.addActionListener(this);
		
		sub1.addActionListener(this);
		sub2.addActionListener(this);
		
	}
	
	public void crearVentana(){
		ventana = new JFrame("Menú"); //Crear la ventana
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS)); //Agregar el Layout
		ventana.setSize(300,300); //Definir el tamaño
		ventana.setVisible(true); //Hacerla visible
		ventana.setJMenuBar(menubar); //Agregar la barra de menú
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE); //Cerrar la ejecución.
	}
	
	public VentanaMenu(){
		crearMenu();
		crearVentana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== sub1){
			//System.out.println("Seleciono X");
			ventana.setSize(500, 500);
		}
	}

}
