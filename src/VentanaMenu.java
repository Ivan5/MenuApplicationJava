import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaMenu {
	JFrame ventana; //Definir la ventana
	JMenu opcion1, opcion2; //Opciones del Men�
	JMenuItem sub1; //Item del men�
	JMenuBar menubar; //Barra de Men�
	
	public void crearMenu(){
		menubar = new JMenuBar(); //Crear la barra de menu
		
		opcion1 = new JMenu("Opci�n 1");
		opcion2 = new JMenu("Opci�n 2");
	}
	
	public void crearVentana(){
		ventana = new JFrame("Men�"); //Crear la ventana
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS)); //Agregar el Layout
		ventana.setSize(300,300); //Definir el tama�o
		ventana.setVisible(true); //Hacerla visible
		ventana.setJMenuBar(menubar); //Agregar la barra de men�
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE); //Cerrar la ejecuci�n.
	}

}
