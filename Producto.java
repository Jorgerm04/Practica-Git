package Gestion_Pedidos;

import java.util.Scanner;

public class Producto {
	private String Nombre;
	private Double Precio;
	private int Cantidad;
	
	Scanner sc=new Scanner(System.in);
	
	/**
	 * Contructor con parametros de Producto
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre,Double precio, int cantidad) {
		this.Nombre=nombre.toUpperCase();
		this.Precio=(double)(Math.round(precio*100)/100);
		this.Cantidad=cantidad;
		
	}
	
	/**
	 * Contructor vacio de Producto
	 */
	public Producto() {
	}
	
	//GETERS AND SETERS//
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	/**
	 * Metodo para crear productos
	 * @param p
	 */
	public void crearProducto(Producto p) {
		System.out.println("\nDigame el nombre del producto: ");
		p.setNombre(sc.nextLine());
		System.out.println("Digame el precio del producto: ");
		p.setPrecio(sc.nextDouble());
	}
	
	/**
	 * Metodo para mostrar la informacion de los productos
	 * @param p
	 */
	public void mostrarProducto(Producto p) {
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Precio: "+p.getPrecio()+" euros");
	}
}
