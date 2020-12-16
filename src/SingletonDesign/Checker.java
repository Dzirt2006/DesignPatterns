package SingletonDesign;

public class Checker {

	public static void main(String[] args) {
		SingletonObj instance = SingletonObj.getInstance();
		instance.hello();
	}

}
