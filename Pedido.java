package Gestion_Pedidos;
import java.math.RoundingMode;
import java.util.Scanner;


public class Pedido {
	
	private Cliente cliente;
	private Producto Producto1;
	private Producto Producto2;
	private Double ImporteTotal;
	private PasarelaDePago Pago;
	private String Estado;

	Scanner sc=new Scanner(System.in);
	
	/**
	 * Constructor con parametros del pedido
	 * @param cliente
	 * @param producto1
	 * @param producto2
	 * @param importeTotal
	 * @param pago
	 * @param estado
	 */
	public Pedido(Cliente cliente,Producto producto1,Producto producto2, Double importeTotal,PasarelaDePago pago,String estado) {
		this.cliente=cliente;
		this.Producto1=producto1;
		this.Producto2=producto2;
		this.ImporteTotal=importeTotal;
		this.Pago=pago;
		this.Estado=estado;
	}
	 /**
	  * Contructor con parametros de pedido pero en este caso con un solo producto,
	  * ya que se puede dar el caso de que el cliente solo pida un producto en vez de dos
	  * 
	  * @param cliente
	  * @param producto1
	  * @param importeTotal
	  * @param pago
	  * @param estado
	  */
	public Pedido(Cliente cliente,Producto producto1, Double importeTotal,PasarelaDePago pago,String estado) {
		this.cliente=cliente;
		this.Producto1=producto1;
		this.ImporteTotal=importeTotal;
		this.Pago=pago;
		this.Estado=estado;
	}
	
	/**
	 * Contructor vacio de la clase Pedido
	 */
	 public Pedido() {
		 
	 }
	 
	 //GETERS AND SETERS//
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto1() {
		return Producto1;
	}

	public void setProducto1(Producto producto1) {
		Producto1 = producto1;
	}

	public Producto getProducto2() {
		return Producto2;
	}

	public void setProducto2(Producto producto2) {
		Producto2 = producto2;
	}

	public Double getImporteTotal() {
		return ImporteTotal;
	}

	public void setImporteTotal(Double importeTotal) {
		ImporteTotal = importeTotal;
	}

	public PasarelaDePago getPago() {
		return Pago;
	}

	public void setPago(PasarelaDePago pago) {
		Pago = pago;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	/**
	 * Metodo para agregar el primer producto al pedido
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 * @param pedi
	 */
	public void agregarProducto1(Producto p1,Producto p2,Producto p3, Producto p4, Producto p5, Pedido pedi) {
		int opcion,unidades1;
		double price1;
		
		
		System.out.println("\n#####Seleccione el producto que desea#####");
		System.out.println("1. "+p1.getNombre());
		System.out.println("2. "+p2.getNombre());
		System.out.println("3. "+p3.getNombre());
		System.out.println("4. "+p4.getNombre());
		System.out.println("5. "+p5.getNombre());
		
		opcion=sc.nextInt();
		sc.nextLine();
		
		//Switch para elegir que producto escoger para el pedido y la cantidad
		switch(opcion) {
		case 1:{
			price1=p1.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades1=sc.nextInt();
			p1.setCantidad(unidades1);
			price1=unidades1*price1;
			
			pedi.setImporteTotal(price1);
			pedi.setProducto1(p1);	
		}
		break;
		
		case 2:{
			price1=p2.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades1=sc.nextInt();
			p2.setCantidad(unidades1);
			price1=unidades1*price1;
			
			pedi.setImporteTotal(price1);
			pedi.setProducto1(p2);
			
		}
		break;
		
		case 3:{
			price1=p3.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades1=sc.nextInt();
			p3.setCantidad(unidades1);
			price1=unidades1*price1;
			
			pedi.setImporteTotal(price1);
			pedi.setProducto1(p3);
			
		}
		break;
		
		case 4:{
			price1=p4.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades1=sc.nextInt();
			p4.setCantidad(unidades1);
			price1=unidades1*price1;
			
			pedi.setImporteTotal(price1);
			pedi.setProducto1(p4);
			
		}
		break;
		
		case 5:{
			price1=p5.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades1=sc.nextInt();
			p5.setCantidad(unidades1);
			price1=unidades1*price1;
			
			pedi.setImporteTotal(price1);
			pedi.setProducto1(p5);
			
		}
		break;
		
		default:{
			System.err.println("Opcion no valida");
			
		}
		break;
		}
		
	
		
		System.out.println("\nEl precio actual de tu pedido es de "+pedi.getImporteTotal()+" euros");
		
	}
	
	/**
	 * Metodo igual que el anterior pero añade el segundo producto
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 * @param pedi
	 */
	public void agregarProducto2(Producto p1,Producto p2,Producto p3, Producto p4, Producto p5, Pedido pedi) {
		
		int opcion,unidades2;
		double price2;
		
		System.out.println("\n#####Seleccione el producto que desea#####");
		System.out.println("1. "+p1.getNombre());
		System.out.println("2. "+p2.getNombre());
		System.out.println("3. "+p3.getNombre());
		System.out.println("4. "+p4.getNombre());
		System.out.println("5. "+p5.getNombre());
		
		opcion=sc.nextInt();
		sc.nextLine();
		
		
		
		switch(opcion) {
		case 1:{
			price2=p1.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades2=sc.nextInt();
			p1.setCantidad(unidades2);
			price2=unidades2*price2;
			
			pedi.setImporteTotal(pedi.getImporteTotal()+price2);
			pedi.setProducto2(p1);
			
			
			
			
		}
		break;
		
		case 2:{
			price2=p2.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades2=sc.nextInt();
			p2.setCantidad(unidades2);
			price2=unidades2*price2;
			
			pedi.setImporteTotal(pedi.getImporteTotal()+price2);
			pedi.setProducto2(p2);
			
		}
		break;
		
		case 3:{
			price2=p3.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades2=sc.nextInt();
			p3.setCantidad(unidades2);
			price2=unidades2*price2;
			
			pedi.setImporteTotal(pedi.getImporteTotal()+price2);
			pedi.setProducto2(p3);
			
		}
		break;
		
		case 4:{
			price2=p4.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades2=sc.nextInt();
			p4.setCantidad(unidades2);
			price2=unidades2*price2;
			
			pedi.setImporteTotal(pedi.getImporteTotal()+price2);
			pedi.setProducto2(p4);
			
		}
		break;
		
		case 5:{
			price2=p5.getPrecio();
			
			System.out.println("\nCuantas unidades quiere");
			unidades2=sc.nextInt();
			p5.setCantidad(unidades2);
			price2=unidades2*price2;
			
			pedi.setImporteTotal(pedi.getImporteTotal()+price2);
			pedi.setProducto2(p5);
			
		}
		break;
		
		default:{
			System.err.println("Opcion no valida");
			
		}
		break;
		}
		

		System.out.println("\nEl precio actual de tu pedido es de "+pedi.getImporteTotal()+" euros");
	
		
	}
	
	/**
	 * Metodo que muestra el precio, la cantidad de productos y mas informacion sobre el pedido realizado
	 */
	public void mostrarPedido() {
		 System.out.println("\nCANT.\t\tPRODUCTO\t\tPRECIO UD.\t\tTOTAL");
	        System.out.println("=====\t\t========\t\t========\t\t=====");
	        System.out.println(Producto1.getCantidad()+"\t\t"+Producto1.getNombre()+"\t\t\t"+Producto1.getPrecio()+"\t\t\t"+Producto1.getPrecio()*Producto1.getCantidad());
	        
	        if(Producto2==null) {
	        	System.out.println("\nTOTAL\t\t-------------------------------------------->\t"+getImporteTotal());
	        	
	        } else {
	        	System.out.println(Producto2.getCantidad()+"\t\t"+Producto2.getNombre()+"\t\t\t"+Producto2.getPrecio()+"\t\t\t"+Producto2.getPrecio()*Producto2.getCantidad());
		        System.out.println("\nTOTAL\t\t-------------------------------------------->\t"+getImporteTotal());	
	        }     
	}
}
