package singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author ilannakarla
 * livremente baseado no repositório "https://github.com/digitalinnovationone/lab-padroes-projeto-java"
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}