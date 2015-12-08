import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaMenu {
	JFrame ventana; //Definir la ventana
	JMenu opcion1, opcion2; //Opciones del Menú
	JMenuItem sub1; //Item del menú
	JMenuBar menubar; //Barra de Menú
	
	public void crearMenu(){
		menubar = new JMenuBar(); //Crear la barra de menu
		
		opcion1 = new JMenu("Opción 1");
		opcion2 = new JMenu("Opción 2");
	}
	
	public void crearVentana(){
		ventana = new JFrame("Menú"); //Crear la ventana
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS)); //Agregar el Layout
		ventana.setSize(300,300); //Definir el tamaño
		ventana.setVisible(true); //Hacerla visible
		ventana.setJMenuBar(menubar); //Agregar la barra de menú
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE); //Cerrar la ejecución.
	}

}
