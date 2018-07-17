
public class SumArgs {

	public static void main(String[] args) {
		int x[] = new int[args.length];
		int sum = 0;
		
			for (int i = 0; i < args.length; i++) {
				x[i] = Integer.parseInt(args[i]);
				sum = sum + x[i];
			}
	}

}
