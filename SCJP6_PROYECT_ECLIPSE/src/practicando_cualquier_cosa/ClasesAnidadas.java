/**
 * 
 */
package practicando_cualquier_cosa;

/**
 * @author rguerrero
 *
 */
public class ClasesAnidadas {

	/**
	 * @param args
	 */
	
	public void primerMetodo(){
		System.out.println("Fuera del contructor");
		
		class NestedClasses{
			NestedClasses(){
				System.out.println("dentro del constructor de la nested ");
			}
		}
		
		new NestedClasses();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClasesAnidadas().primerMetodo();
	}

}