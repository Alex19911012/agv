package other;


public class SingletonTest {
	public static void main(String[] args) {
		
			Singleton s1 = Singleton.getSingleton();
			Singleton s2 = Singleton.getSingleton();
			System.out.println(s1==s2?true:false);
			
			Singleton2 s3 = Singleton2.getSingleton2();
			Singleton2 s4 = Singleton2.getSingleton2();
			System.out.println(s3==s4);
		
	}
	
}
