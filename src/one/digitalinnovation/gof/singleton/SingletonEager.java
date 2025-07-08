package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author ilannakarla
 * livremente baseado no repositório "https://github.com/digitalinnovationone/lab-padroes-projeto-java"
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