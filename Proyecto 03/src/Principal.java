import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Juego.Jugador;
import javax.swing.JTextArea;

    //VENTANA PRINCIPAL JFRAME
public class Principal extends JFrame {
	
	//PROPIEDADES
	private JPanel 		contenedor;
	private JTextField 	tfNombre;
	private JTextField 	tfApellidos;
	private JTextField 	tfEdad;
	private JTextField 	tfid;
	private JButton 	btnBoton;
	private JTextArea 	taSalida;
	
	Jugador 			player1;	
	
	// ENTRADA AL PROGRAMA
	public static void main(String[] args) {
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
		inicioComponentes();	
		
		btnBoton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {		
			taSalida.setText ("");
			String nombre    ="";
			String apellidos ="";
			int edad         =0;
			int id           =0;
			boolean error	 =false;
			
			//EDAD
			if(esNumerico(tfEdad.getText())){
				edad = Integer.parseInt(tfEdad.getText());
			}else{
				taSalida.append("Edad incorrecta\n");
				error = true;
			}
			
			//ID
			if(esNumerico(tfid.getText())){
				id = Integer.parseInt(tfid.getText());
			}else{
				taSalida.append("Id incorrecta\n");
				error = true;
			}
			
			//NOMBRE
			nombre = tfNombre.getText().trim();
			if (!nombre.isEmpty()){
				for (int i = 0; i < nombre.length(); i++){
					if (Character.isDigit(nombre.charAt(i))){
						error = true;
						taSalida.append("Error en el nombre\n");
						break;
					}
				}				
			}
			else taSalida.append("Error en el nombre\n");
			
			//APELLIDO
			apellidos = tfApellidos.getText().trim();
			if (!apellidos.isEmpty()){
				for (int i = 0; i < apellidos.length(); i++){
					if (Character.isDigit(apellidos.charAt(i))){
						error = true;
						taSalida.append("Error en el apellido\n");
						break;
					}
				}				
			}
			else taSalida.append("Error en el apellido\n");
			
			
		    if (!error){
		    	player1 = new Jugador(tfNombre.getText(),tfApellidos.getText(),"",edad,id);
		    	taSalida.append(player1.toString()+"\n");
		    }		
		}

		private String String(String text) {
			
			return null;
		}
		});				
	}
	
	private void inicioComponentes(){	
		player1 = new Jugador();
		
		//PROPIEDADES DE LA VENTANA Y DEL CONTENEDOR:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		//LOS JLABEL
		//PRIMER LABEL ( TU JUGADOR):
		JLabel lblTuJugador = new JLabel("TU JUGADOR :");
		lblTuJugador.setFont(lblTuJugador.getFont().deriveFont(lblTuJugador.getFont().getStyle() | Font.BOLD, lblTuJugador.getFont().getSize() + 3f));
		lblTuJugador.setBounds(10, 11, 187, 14);
		contenedor.add(lblTuJugador);
		
		//SEGUNDO LABEL (NOMBRE)
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(lblNombre.getFont().deriveFont(lblNombre.getFont().getStyle() | Font.BOLD, lblNombre.getFont().getSize() + 2f));
		lblNombre.setBounds(10, 54, 132, 14);
		contenedor.add(lblNombre);
		
		//TERCER LABEL (APELLIDOS)
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setFont(lblApellidos.getFont().deriveFont(lblApellidos.getFont().getStyle() | Font.BOLD, lblApellidos.getFont().getSize() + 2f));
		lblApellidos.setBounds(10, 79, 84, 14);
		contenedor.add(lblApellidos);
		
		//CUARTO LABEL (EDAD)
		JLabel lblEdad = new JLabel("EDAD");
		lblEdad.setFont(lblEdad.getFont().deriveFont(lblEdad.getFont().getStyle() | Font.BOLD, lblEdad.getFont().getSize() + 2f));
		lblEdad.setBounds(10, 104, 46, 14);
		contenedor.add(lblEdad);
		
		//QUINTO LABEL (ID)
		JLabel lblid = new JLabel("ID");
		lblid.setFont(lblid.getFont().deriveFont(lblid.getFont().getStyle() | Font.BOLD, lblid.getFont().getSize() + 2f));
		lblid.setBounds(10, 129, 46, 14);
		contenedor.add(lblid);
		
		//LOS JTEXTFILD
		//TEXTFILD DE "NOMBRE"
	
		tfNombre = new JTextField();
		tfNombre.setBounds(111, 52, 296, 20);
		contenedor.add(tfNombre);
		tfNombre.setColumns(10);
	
		//TEXTFILD DE "APELLIDOS"
		tfApellidos = new JTextField();
		tfApellidos.setBounds(111, 77, 296, 20);
		contenedor.add(tfApellidos);
		tfApellidos.setColumns(10);
		
		//TEXTFILD DE "EDAD"
		tfEdad = new JTextField();
		tfEdad.setBounds(111, 102, 296, 20);
		contenedor.add(tfEdad);
		tfEdad.setColumns(10);
		
		//TEXTFILD DE "ID"
		tfid = new JTextField();
		tfid.setBounds(111, 127, 296, 20);
		contenedor.add(tfid);
		tfid.setColumns(10);
		
		//JBUTTON 
		btnBoton = new JButton("Jugamos");
		
		btnBoton.setBounds(10, 154, 397, 23);
		contenedor.add(btnBoton);
		
		taSalida = new JTextArea();
		taSalida.setBounds(10, 182, 397, 68);
		contenedor.add(taSalida);
	}
	
	public boolean esNumerico (String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		}   catch (NumberFormatException nfe) {
			return false;
		}
	}
}


