public class Main {
	public static void main(String[] args) {

		// リテラルを使った作成
		String str1 = "Hello";

		// コンストラクタを使った作成
		String str2 = new String("Hello");

		StringBuilder sb = new StringBuilder("Hello");
		// sb.append(" World"); // 追加
		sb.append(" World"); // 追加
		System.out.println(sb);
		sb.insert(5, " Beautiful"); // 挿入
		sb.delete(5, 15); // 削除
		System.out.println(sb);
		sb.replace(0, 5, "Hi"); // 置換
		sb.reverse(); // 反転
		sb.reverse(); // 元に戻す
		sb.setCharAt(0, 'J'); // 文字変更
		System.out.println(sb); // 結果を確認！
		//
		//StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 3; i++) {
			sb.append("データ").append(i).append(" ");
		}
		System.out.println(sb.toString());
		//
		//		StringBuffer: マルチスレッド環境での安全な文字列操作
		//		🔸 StringBufferの基本的な使い方（StringBuilder と同じメソッド）
		//		java

		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World"); // 追加
		buffer.insert(5, " Safe"); // 挿入
		buffer.delete(6, 11); // 削除
		System.out.println(buffer); // 出力: Hello World

	}
}
