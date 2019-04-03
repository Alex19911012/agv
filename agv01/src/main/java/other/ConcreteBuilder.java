package other;

public class ConcreteBuilder implements Builder{
	Part partA,partB,PartC;

	@Override
	public void buildPartA() {
		System.out.println("组装A部件");
		
	}

	@Override
	public void buildPartB() {
		System.out.println("组装B部件");
	}

	@Override
	public void buildPartC() {
		System.out.println("组装C部件");
		
	}

	@Override
	public Product getResult() {
		//这里返回最后的组装成果
		return null;
	}
}
