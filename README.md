# JavaLeapYearCheck
うるう年判定

## 処理
標準入力された西暦年でうるう年判定を行います。

## コード
```
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
			System.out.println("入力エラー：西暦年ではありません。");
		}
	}

}
```

## 入力例
```
西暦年を入力してください。
2000
```

## 出力結果  
```
2000年はうるう年です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
