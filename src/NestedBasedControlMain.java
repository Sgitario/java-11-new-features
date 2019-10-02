public class NestedBasedControlMain {
	public void myPublic() {
		System.out.println("myPublic");
	}

	private void myPrivate() {
		System.out.println("myPrivate");
	}

	class Nested {

		public void nestedPublic() {
			myPrivate();
		}
	}

	public static void main(String args[]) {
		// Nested nested = new Nested();

	}
}
