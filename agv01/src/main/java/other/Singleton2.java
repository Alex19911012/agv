package other;

public class Singleton2 {
	private Singleton2() {
		
	}
	
	private static class SingletonHolder{
		private static Singleton2 instance = new Singleton2();
	}
	public static Singleton2 getSingleton2() {
		return SingletonHolder.instance;
	}
	
}
