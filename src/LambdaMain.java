import java.util.function.BiFunction;

public class LambdaMain {

	public static void main(String args[]) {
		BiFunction<Integer, Integer, Integer> sum = (var s1, var s2) -> s1 + s2;
		System.out.println(sum.apply(1, 2));
	}
}
