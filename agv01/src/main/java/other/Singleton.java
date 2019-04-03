package other;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
}
