package other;

public class BuilderTest {
	public static void main(String[] args) {
		ConcreteBuilder builder =new ConcreteBuilder();
		Director director = new Director(builder);
		director.constrict();
		Product product = builder.getResult();
		System.out.println(product);
	}
	
	
}
