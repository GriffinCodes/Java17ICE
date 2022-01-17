import java.util.HashMap;

public class Java17ICE {

	interface Arg {}

	record NumberBasedArg<T extends Number>(String name, T from, T to) implements Arg {}

	public static void main(String[] args) {
		final Arg abc = new NumberBasedArg<>("abc", 1, 2);
		new HashMap<>() {{
			if (abc instanceof NumberBasedArg numberBasedArg)
				System.out.println(numberBasedArg.name);
		}};
	}

}
