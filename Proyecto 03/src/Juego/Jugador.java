package Juego;
   // CLASE
public class Jugador {
   // PROPIEDADES O ATRIBUTOS
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String pais;
	protected int edad;
	protected int id;
	
   // METODOS
	public String getNombre(){
		return nombre;}
	public void setNombre (String nombre){
		this.nombre = nombre;}
	
	public String getApellido1(){
		return apellido1;}
	public void setApellido1 (String apellido1){
		this.apellido1 = apellido1;}
	
	public String getApellido2(){
		return apellido2;}
	public void setApellido2 (String apellido2){
		this.apellido2 = apellido2;}
	
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
	
	//	CONSTRUCTOR
	public Jugador(){
		
	}
	
	public String toString(){
		return this.nombre+"  "+this.apellido1+"  "+this.apellido2+"  "+this.edad+"  "+this.id;
	}
		
	}
	


