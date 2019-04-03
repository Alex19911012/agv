package other;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder=builder;
	}
	public void constrict() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
}
