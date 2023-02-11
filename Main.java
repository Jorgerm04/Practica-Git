package Gestion_Pedidos;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		int opcion;
		char eleccion;
		long codigoLong;
		String codigoString = null;
		String Tel=null;
		Scanner sc= new Scanner(System.in);
		Cliente Cliente1= new Cliente();
		Cliente Cliente2=new Cliente ();
		Cliente Cliente3=new Cliente();
		Producto Producto1= new Producto();
		Producto Producto2=new Producto();
		Producto Producto3=new Producto();
		Producto Producto4=new Producto();
		Producto Producto5=new Producto();
		Pedido pedi= new Pedido();
		PasarelaDePago pagamiento=new PasarelaDePago();
		
		System.out.println("#####MENU INICIAL#####");
		System.out.println("1.Crear Clientes");
		System.out.println("2.Crear Productos");
		
		opcion=sc.nextInt();
		
		switch(opcion) {
		case 1:{
			
			//Se pide por consola los datos de los clientes
			Cliente1.crearCliente(Cliente1);
			System.out.println("Cliente1:");
			Cliente1.mostrarCliente(Cliente1);
			
			Cliente2.crearCliente(Cliente2);
			System.out.println("Cliente2:");
			Cliente2.mostrarCliente(Cliente2);
			
			Cliente3.crearCliente(Cliente3);
			System.out.println("Cliente3:");
			Cliente3.mostrarCliente(Cliente3);
		}
		break;
		
		case 2:{
			//Se pide por consola los datos de los productos
				
			Producto1.crearProducto(Producto1);
			System.out.println("\nProducto 1: ");
			Producto1.mostrarProducto(Producto1);
			
			Producto2.crearProducto(Producto2);
			System.out.println("\nProducto 1: ");
			Producto2.mostrarProducto(Producto2);
			
			Producto3.crearProducto(Producto3);
			System.out.println("\nProducto 1: ");
			Producto3.mostrarProducto(Producto3);
			
			Producto4.crearProducto(Producto4);
			System.out.println("\nProducto 1: ");
			Producto4.mostrarProducto(Producto4);
			
			Producto5.crearProducto(Producto5);
			System.out.println("\nProducto 1: ");
			Producto5.mostrarProducto(Producto5);
			
			
		}
		break;
		
		default:{
			System.err.println("La opcion no es correcta");
			
		}
		break;
		}
     //Si en el switch de arriba se ha elegido la opcion 1 despues de rellenar los datos de los clientes te pedira los datos de los productos
		if(opcion==1) {
			Producto1.crearProducto(Producto1);
			System.out.println("\nProducto 1: ");
			Producto1.mostrarProducto(Producto1);
			
			Producto2.crearProducto(Producto2);
			System.out.println("\nProducto 2: ");
			Producto2.mostrarProducto(Producto2);
			
			Producto3.crearProducto(Producto3);
			System.out.println("\nProducto 3: ");
			Producto3.mostrarProducto(Producto3);
			
			Producto4.crearProducto(Producto4);
			System.out.println("\nProducto 4: ");
			Producto4.mostrarProducto(Producto4);
			
			Producto5.crearProducto(Producto5);
			System.out.println("\nProducto 5: ");
			Producto5.mostrarProducto(Producto5);
			
		}
	//Si en el switch de arriba se ha elegido la opcion 2 despues de rellenar los datos de los productos te pedira los datos de los clientes
		if(opcion==2) {
			Cliente1.crearCliente(Cliente1);
			System.out.println("Cliente1:");
			Cliente1.mostrarCliente(Cliente1);
			
			Cliente2.crearCliente(Cliente2);
			System.out.println("Cliente2:");
			Cliente2.mostrarCliente(Cliente2);
			
			Cliente3.crearCliente(Cliente3);
			System.out.println("Cliente3:");
			Cliente3.mostrarCliente(Cliente3);
			
		}
		
		System.out.println("\n#####MENU PEDIDOS#####");
		System.out.println("1.Realizar pedido");
		opcion=sc.nextInt();
		sc.nextLine();
		
		switch(opcion) {
		
		//Si elige la opcion 1 ,que es la unica, te pedira el telefono hasta que sea igual a alguno de los clientes
		case 1:{
			
			boolean inicio=false;
			
			while(!inicio) {
				System.out.println("\nIntroduce tu numero de telefono: ");
				Tel=sc.nextLine();
				if(Tel.equals(Cliente1.getTelefono())||Tel.equals(Cliente2.getTelefono())||Tel.equals(Cliente3.getTelefono())){
					
					inicio=true;
		
					
				} else {
					System.err.println("\nEl telefono no corresponde con ningun cliente");
					inicio=false;
				}	
			}
		}
		break;
		
		default:{
			System.err.println("Opcion no valida");
			
		}
		break;
		}
		
		
		//Con este if comprobamos de que cliente es el numero para asociarlo con en el pedido
		if(Tel.equals(Cliente1.getTelefono())){
			pedi.setCliente(Cliente1);
			
		}else { if(Tel.equals(Cliente2.getTelefono())) {
			pedi.setCliente(Cliente2);
			
		} else {
			pedi.setCliente(Cliente3);
		
		}
			
		}
			
		pedi.agregarProducto1(Producto1, Producto2, Producto3, Producto4, Producto5, pedi);
		
		
		System.out.println("\nDesea anadir otro producto a su pedido (y / n)");
		
		eleccion=sc.next().charAt(0);
		
		if(eleccion=='y') {
			
			pedi.agregarProducto2(Producto1, Producto2, Producto3, Producto4, Producto5, pedi);
			
		sc.nextLine();
		pagamiento.setImporte(pedi.getImporteTotal());
		
			
		} else if(eleccion=='n'){
			System.out.println("\nEl precio actual de tu pedido es de "+pedi.getImporteTotal()+" euros");
			
		} else {
			System.err.println("Opcion no valida");
		}
		
		System.out.println("\nComo desea realizar el pago: ");
		System.out.println("1. Efectivo");
		System.out.println("2. Tarjeta");
		System.out.println("3. Cuenta bancaria");
		
		opcion=sc.nextInt();
		sc.nextLine();
		
		switch(opcion) {
		case 1:{
			pagamiento.PagarEfectivo();
			pedi.mostrarPedido();
			
			
			System.out.println("Codigo de pago: "+pagamiento.getCodigoPago());
			codigoLong=pagamiento.getCodigoPago();
			codigoString=String.valueOf(codigoLong);
			
		}
		break;
		
		case 2:{
			pagamiento.PagoTarjeta();
			pedi.mostrarPedido();
			
			System.out.println("Codigo de pago: "+pagamiento.getCodigoPago());
			codigoLong=pagamiento.getCodigoPago();
			codigoString=String.valueOf(codigoLong);
			
		}
		break;
		
		case 3:{
			pagamiento.PagoCuenta();
			pedi.mostrarPedido();
			
			System.out.println("Codigo de pago: "+pagamiento.getCodigoPago());
			codigoLong=pagamiento.getCodigoPago();
			codigoString=String.valueOf(codigoLong);
		}
		break;
		
		default:{
			System.err.println("Opcion no valida");
			
		}
		break;
		}
		
		if(Tel.equals(Cliente1.getTelefono())){
			Cliente1.añadirHistorial(codigoString+", ");
			Cliente1.mostrarCliente(Cliente1);
			
		}else { if(Tel.equals(Cliente2.getTelefono())) {
			Cliente2.añadirHistorial(codigoString+", ");
			Cliente2.mostrarCliente(Cliente2);
			
			
		} else {
			Cliente3.añadirHistorial(codigoString+", ");
			Cliente3.mostrarCliente(Cliente3);
			
		
		}
			
		}
		
	}
}