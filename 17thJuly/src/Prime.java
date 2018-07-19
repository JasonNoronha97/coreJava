
public class Prime {

	public static void main(String[] args) {

		int i = 3, c = 0;
		for (int count = 2; count <= 15;) {
			for (c = 2; c <= i - 1; c++) {
				if (i % c == 0)
					break;
			}
			if (c == i) {
				System.out.print(i + "   ");
				count++;
			}
			i++;
		}

	}

}
