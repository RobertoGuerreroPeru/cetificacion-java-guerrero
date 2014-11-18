/**
 * 
 */
package practicando_cualquier_cosa;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * @author rguerrero
 *
 */
public class ScannerTeclado {

	private static Scanner teclado;
	private static String nombre;
	private static int valor;
	private static Date fecha;
	private static int primerValor;
	private static int segundoValor;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double cantidad = 8389393.272;
		System.out.println("%.2f"+cantidad);
		
		
		
		Formatter format = new Formatter();
		Calendar calendar =  Calendar.getInstance();
		format.format("%tr %tZ", calendar, calendar);
		System.out.println("Fecha formateada: "+format);
		
		StringBuffer buffer = new StringBuffer();
		StringBuffer buffer2=new StringBuffer();
		buffer2.append("HOLA");
		buffer2.insert(0, "5434");
		buffer2.insert(0, "097");
		buffer.append(buffer2);
		
		buffer.insert(0, "123");
		
//		String space=" ";
//		String valor="Hello";
//		valor=space+valor+space+space;
//		String hola = valor.concat("world");
//		hola=hola+space;
//		System.out.println("Cantidad:"+hola.trim());
//		System.out.println("Cantidad: "+hola.trim().length());
		
		
//		String numeroCuenta="7837-8387-2438-4328";
//		StringTokenizer token = new StringTokenizer(numeroCuenta); 
//		String [] s = numeroCuenta.split("-");
//		for (int i = 0; i < s.length; i++) {
//			String v = s[i];
//			System.out.println("s: "+ i +" _ "+s[i]);
//			for (int j = 0; j < v.length(); j++) {
//				System.out.println("elementos: "+v.charAt(j));
//			}
//		}
		
		
		
//		System.out.println("Buffer impreso: "+buffer);
		
		Random random = new Random();
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("==============================================================================================");
//			numerosTinka();
//			System.out.println("==============================================================================================");
//		}
//		
//		print("3.2");
		
		
//		System.out.println("Ingrese rango:");
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Primer valor:");
//		primerValor=teclado.nextInt();
//		System.out.println("Segundo valor:");
//		segundoValor=teclado.nextInt();
//		System.out.println("Cuantos elementos:");
//		valor = teclado.nextInt();
//		System.out.println("Valores del rango");
//		
//		for (int i = 0; i < valor; i++) {
//			int v = imprimeAleatoriosRango(primerValor, segundoValor);
//			System.out.println("Valor impreso: "+v );
//		}
		
	}
	
	
	
	private static void print(Number d) {
		// TODO Auto-generated method stub
		System.out.println("Number");
	}
	
	
	private static void print(String d) {
		// TODO Auto-generated method stub
		System.out.println("Float");
	}



	public static void numerosTinka(){
		for (int i = 0; i < 6; i++) {
			int numeroAleatorio = (int)(Math.random()*45);
			System.out.println("numeroAleatorio:  "+numeroAleatorio);
		}
	}
	
	
	public static int imprimeAleatoriosRango(int a, int b){
		int rango = (b-a)+1;
		int val=(int)((Math.random()*rango)+b);
		System.out.println("Valores nativos"+val);
		return (int) (val)<a?a:b;
		
	}

}
