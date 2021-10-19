package one.digitalinnovation.gof;

/**
 * Singleton "Apressado".
 * 
 * @author Benedito Carvalho
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
