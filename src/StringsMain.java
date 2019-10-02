public class StringsMain {
	public static void main(String args[]) {
		String str1 = " ";
		System.out.println(str1.isBlank());

		String str2 = "GeeksForGeeks";
		System.out.println(str2.isBlank());

		String str = "Hello\nWorld";
		System.out.println("    str".stripLeading());

	}
}
