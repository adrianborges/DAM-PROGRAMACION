import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BailandoTexto extends JFrame {

	private JPanel contenedor;
	private JTextField caja1;
	private JButton boton2;
	private JTextField caja2;

	//punto de entrada MAIN a nuestra APP
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//configuracion de la ventana
	public BailandoTexto() {
		setTitle("BailandoTexto!");
		// marco y contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		// boton 1
		JButton boton1 = new JButton("<-----");
		//listener + evento
		//---------
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			// accion a desarrollar
				caja1.setText(caja2.getText());
				caja2.setText("");
				
			}
		});
		//---------
		boton1.setBounds(175, 158, 89, 23);
		contenedor.add(boton1);
		
		//caja texto 1
		caja1 = new JTextField();
		caja1.setBounds(10, 101, 165, 20);
		contenedor.add(caja1);
		caja1.setColumns(10);
			
		//boton 2
		boton2 = new JButton("----->");
		//listener + evento
				//---------
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// accion a desarrollar
				caja2.setText(caja1.getText());
				caja1.setText("");
			}
		});
		//----------
		boton2.setBounds(175, 43, 89, 23);
		contenedor.add(boton2);
		
		
		//caja texto 2
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(259, 101, 165, 20);
		contenedor.add(caja2);
		
		
		
		
		
		
	}
}
