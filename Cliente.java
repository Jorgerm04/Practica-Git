package Gestion_Pedidos;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Cliente {
	private String Nombre;
	private String Apellidos;
	private String FechaDeAlta;
	private String Telefono;
	private String Direccion;

	private String Historial;
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Contructor con parametros de Cliente
	 * @param nombre
	 * @param apellidos
	 * @param fecha 
	 * @param telefono
	 * @param direccion
	 * @param historial
	 */
	public  Cliente(String nombre,String apellidos,String fecha,String telefono,String direccion,String historial){
		this.Nombre=nombre.toLowerCase();
		this.Apellidos=apellidos.toUpperCase();
		this.FechaDeAlta=fecha;
		this.Telefono=telefono;
		this.Direccion=direccion;
		this.Historial=historial;
	}
	/**
	 * Constructor vacio de Cliente
	 */
	public Cliente() {
		
	}
	//GETTERS AND SETTERS//
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre.toLowerCase();
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos.toUpperCase();
	}
	
	public String getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(String fechaDeAlta) {
		FechaDeAlta = fechaDeAlta;
	}
	

	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
	    Telefono=telefono;
	}
	
	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getHistorial() {
		return Historial;
	}

	public void setHistorial(String historial) {
		Historial = historial;
	}

	/**
	 * Metodo que pregunta el numero. Si el numero no cumple la condicion te vuelve a preguntar 
	 * hasta que cumpla la condicion
	 */
		public void ponerTelef() {
			boolean valido = false;
			String telefono;
		    while (!valido) {
		      System.out.println("Introduce un numero de telefono: ");
		      telefono = sc.nextLine();
		      if (telefono.length()==9&&(telefono.startsWith("6")||telefono.startsWith("7")||telefono.startsWith("8")||telefono.startsWith("9"))) {
		        this.Telefono = telefono;
		        valido = true;
		      } else {
		        System.err.println("El numero de telefono no es valido, por favor intentalo de nuevo.");
		      }
		    }
			
		}
	
	public void añadirHistorial(String cadena) {
		Historial=Historial.concat(cadena);
	}
	
	/**
	 * Metodo para crear los distintos clientes
	 * @param c
	 */
	public void crearCliente(Cliente c) {
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaActual = new Date();
		String fechaFormateada = formatoFecha.format(fechaActual);
		
		System.out.println("\nIntroduzca el nombre del cliente: ");
		c.setNombre(sc.nextLine());
		System.out.println("Introduzca el apellido del cliente: ");
		c.setApellidos(sc.nextLine());
		c.setFechaDeAlta(fechaFormateada);
		//Cliente1.setTelefono();
		c.ponerTelef();
		System.out.println("Introduzca la direccion del cliente: ");
		c.setDireccion(sc.nextLine());
		c.setHistorial(" ");
		
	}
	
	/**
	 * Metodo para mostrar los distintos clientes
	 * @param c
	 */
	public void mostrarCliente(Cliente c) {
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Apellido: "+c.getApellidos());
		System.out.println("Fecha de alta: "+c.getFechaDeAlta());
		System.out.println("Telefono: "+c.getTelefono());
		System.out.println("Direccion: "+c.getDireccion());
		System.out.println("Historial: "+c.getHistorial());
	}
}
