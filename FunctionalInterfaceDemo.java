package p1;

@FunctionalInterface
interface I1 {
	void m2();

	static void m3() {
		System.out.println("m3 is static method");
	}

	default void m4() {
		System.out.println("m4 is default method");
	}

}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
//	I1 obj=new I1() {
//        @Override
//		public void m2() {
//			System.out.println("m2 method...");
//			
//		}
//		
//	};
//	obj.m2();

		I1 obj = () -> System.out.println("m2 method");

		obj.m2();

	}
}
