import java.util.Random;

public class arrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Random r1 = new Random();
		boolean found26 = false;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r1.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if (arr[i] == 26)
				found26 = true;
		}
		System.out.println("\n--------------------");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n--------------------");

		if (found26 == true) {
			System.out.println("26 is found..");
		} else
			System.out.println("26 is not found..");
	}

}
