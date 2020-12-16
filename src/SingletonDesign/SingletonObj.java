package SingletonDesign;

public class SingletonObj {
	private static SingletonObj obj = new SingletonObj();

	private SingletonObj() {
	}

	public static SingletonObj getInstance() {
		return obj;
	}

	public void hello() {
		System.out.println("Hello");
	}
}
