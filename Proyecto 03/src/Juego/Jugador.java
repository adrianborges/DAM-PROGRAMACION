package Juego;
   // CLASE
public class Jugador {
   // PROPIEDADES O ATRIBUTOS
	protected String nombre;
	protected String apellidos;
	protected String pais;
	protected int edad;
	protected int id;
	
	//CONSTRUCTORES
	public Jugador(){
		this.nombre = "player1";
		this.apellidos = "";
		this.pais = "";
		this.edad = 0;
		this.id = 0;
	}
	public Jugador(String nombre, String apellidos, String pais, int edad, int id){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
		this.edad = edad;
		this.id = id;
	}
   // METODOS
	public String getNombre(){
		return nombre;}
	public void setNombre (String nombre){
		this.nombre = nombre;}
	
	public String getApellidos(){
		return apellidos;}
	public void setApellidos (String apellidos){
		this.apellidos = apellidos;}
	
	public String getPais(){
		return pais;}
	public void pais (String pais){
		this.pais = pais;}
	
	public int getEdad(){
		return edad;}
	public void setEdad(int edad){
		this.edad = edad;}
	
	public int getID(){
		return id;}
	public void setID(int id){
		this.id = id;}

//MÉTODO DE COMPROBAR SI LA CADENA ES UN CONJUNTO DE ESPACIOS

public boolean SonEspacios(String cad)
{
	for(int i =0; i<cad.length(); i++)
		if(cad.charAt(i) != ' ')
			return false;
	return false;
}


public String toString() {
	return this.nombre+" "+this.apellidos+" con ID "+this.id+" de "+this.edad+" años";
   }
}
	
	

	
		
	
	


