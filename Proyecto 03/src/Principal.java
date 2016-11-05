import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

public class Principal extends JFrame {
	
	//PROPIEDADES
	private JPanel contentPane;

	// ENTRADA AL PROGRAMA
	public static void main(String[] args) {
		
   // JUGADOR NUEVO
		Jugador player1=new Jugador();
		player1.setNombre("ADRIAN");
		player1.setApellido1("BORGES");
		player1.setApellido2("SALES");
		player1.setEdad(27);
		player1.setID(001);
		
		System.out.println(player1.toString());
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal() {
		
		//PROPIEDADES DE LA VENTANA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
