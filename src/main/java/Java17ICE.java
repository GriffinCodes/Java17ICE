import java.util.HashMap;

public class Java17ICE {

	public static void main(String[] args) {
		final Number abc = 1;
		new HashMap<>() {{
			if (abc instanceof Integer integer)
				System.out.println(integer.intValue());
		}};
	}

}
