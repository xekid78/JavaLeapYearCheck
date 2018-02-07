/**
 *
 * @author xekid78
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		System.out.println("西暦年を入力してください。");
		try (Scanner scan = new Scanner(System.in)) {
			int year = scan.nextInt();
			if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				System.out.println(year + "年はうるう年です。");
			} else {
				System.out.println(year + "年はうるう年ではありません。");
			}
		} catch (InputMismatchException e) {
			System.out.println("西暦年ではありません。");
		}
	}

}
