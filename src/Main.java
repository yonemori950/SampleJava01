import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    // Bookオブジェクトの作成
//        ArrayList <String> fruits  = new ArrayList<String>();
//        fruits.add("apple"); // string fruits[0] = "apple";
//        fruits.get(0); 		// fruits[0];
//        fruits.set(1, "grape"); // fruits[1] = "grape";
//        //fruits[1]  //2
//        //fruits.remove(0);		// fruits[0] 削除
//        fruits.remove("apple");		// fruits[0] 削除
//        // fruits[0]  grape　//1
//        fruits.size();   // fruits.lenght;
//        boolean hasfruits = fruits.contains("banana");	//grape　入ってますか？
//        //true false
//        // 全て消す
//        fruits.clear();
        
        
        
        
        
        //問題1: ArrayListの基本操作
        //String型のArrayListを作成し、3つの果物を追加してください。
        
        // String型のArrayListを作成
        ArrayList<String> fruits = new ArrayList<String>();
        
        // 3つの果物を追加
        fruits.add("りんご");
        fruits.add("バナナ");
        fruits.add("オレンジ");
        
        // 確認のため内容を表示
        System.out.println("果物リスト:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        
        // 問題2: 要素の取得と表示
        //作成したリストから2番目の果物を取得し、出力してください。
        String secondFruit = fruits.get(1);
        //System.out.print(fruits.get(1));
        
        //
        //問題3: 要素の追加
        //リストの先頭に新しい果物を追加してください。
        fruits.add(0, "ぶどう");
        
        // 確認のため内容を表示
        System.out.println("果物リスト（先頭に追加後）:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
            
        
        //問題4: 要素の置き換え
        //リスト内の特定の果物を別の果物に置き換えてください。
        fruits.set(1, "いちご");
        
        // リストの内容を表示（置き換え後）
        System.out.println("\n置き換え後の果物リスト:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        

        //問題5: 要素の確認と削除
        //リストに特定の果物が含まれているか確認し、存在する場合は削除してください。
        
        // 削除したい果物
        String targetFruit = "バナナ";
        
        // リストに特定の果物が含まれているか確認
        if (fruits.contains(targetFruit)) {
            System.out.println("\n「" + targetFruit + "」が見つかりました。削除します。");
            // 果物を削除
            fruits.remove(targetFruit);
        } else {
            System.out.println("\n「" + targetFruit + "」はリストに含まれていません。");
        }
        
        // リストの内容を表示（削除後）
        System.out.println("\n削除後の果物リスト:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        

        
        
        
        
        
		/*Book myBook = new Book("吾輩は猫である", "夏目漱石");
        
        
        // 情報の表示
        myBook.displayInfo();
        
        
		
        // student1の作成
        Student student1 = new Student("田中", 90);
        
        // student2 - student1への参照をコピー
        Student student2 = student1;
        
        // student3 - student1のクローンを作成
        Student student3 = student1.clone();
        
        // student3の得点を変更
        student3.setScore(85);
        
        // 各学生の情報を出力（displayInfoメソッドを使用）
        System.out.print("student1: ");
        student1.displayInfo();
        
        System.out.print("student2: ");
        student2.displayInfo();
        
        System.out.print("student3: ");
        student3.displayInfo();
        
        
        
        // Car オブジェクトの作成
        // Car オブジェクトの作成
        Car car1 = new Car("プリウス", 2022);
        Car car2 = null;
        Car car3 = new Car(null, 2023);
        
        // Carのインスタンスを使ってprintCarInfoを呼び出す
        // ここではcar1を使用してメソッドを呼び出す
        car1.printCarInfo(car1);
        car1.printCarInfo(car2);
        car1.printCarInfo(car3);
	
        
        // 異なるコンストラクタを使用して3つの長方形を作成
        Rectangle rect1 = new Rectangle();       // 引数なし: 幅=1, 高さ=1
        Rectangle rect2 = new Rectangle(5);      // 引数1つ: 幅=5, 高さ=5
        Rectangle rect3 = new Rectangle(3, 4);   // 引数2つ: 幅=3, 高さ=4
        
        // 各長方形の面積を計算して表示
        System.out.println("rect1の面積: " + rect1.area());  // 1*1 = 1
        System.out.println("rect2の面積: " + rect2.area());  // 5*5 = 25
        System.out.println("rect3の面積: " + rect3.area());  // 3*4 = 12
        
     // Person オブジェクトの配列を作成（要素数3）
        Person[] people = new Person[3];
        
        // 配列に Person オブジェクトを格納
        people[0] = new Person("鈴木", 25);
        people[1] = new Person("佐藤", 30);
        people[2] = new Person("高橋", 22);
        
        
        // 初期状態の表示
        System.out.println("===== 初期状態 =====");
        for (Person person : people) {
            person.displayInfo();
        }
        
        // 配列の要素を操作
        // 1. 鈴木さんの年齢を1歳増やす
        people[0].age++;
        
        // 2. 佐藤さんの参照を高橋さんに変更
        people[1] = people[2];
        
        // 変更後の状態を表示
        System.out.println("===== 変更後 =====");
        for (Person person : people) {
            person.displayInfo();
        }	
        */
		
		/*
		 ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        // 以下にコードを追加
        Collections.sort(numbers);
        
        System.out.println(numbers);
        
        ArrayList<String> members = new ArrayList<>();
        
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        //以下にコードを追加
        ArrayList<String> members_copy = new ArrayList<>(members);
        System.out.println("members：" + members);
        System.out.println("members_copy：" + members_copy);
        
        
        //応用１
        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("grape");
        fruits2.add("kiwi");
        fruits2.add("melon");
        
        // ここに2つのリストを結合し、ソートするコードを追加
        ArrayList<String> combinedFruits = new ArrayList<>(fruits1);
        combinedFruits.addAll(fruits2);
        
        //addAllを使わない方法で fruits2 の要素を追加
        for (String fruit : fruits2) {
            combinedFruits.add(fruit);
        }
        Collections.sort(combinedFruits);
        
        // 出力結果: [apple, banana, grape, kiwi, melon, orange]
        System.out.println(combinedFruits);

        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("田中", "開発部", 350000));
        employees.add(new Employee("鈴木", "営業部", 380000));
        employees.add(new Employee("佐藤", "開発部", 400000));
        employees.add(new Employee("高橋", "人事部", 320000));
        employees.add(new Employee("伊藤", "開発部", 370000));
        
        // ここに「開発部」の社員のみを抽出し、給与の高い順にソートするコードを追加
        ArrayList<Employee> devEmployees = new ArrayList<>();
        
        // 開発部の社員のみを抽出
        for (Employee emp : employees) {
            if (emp.getDepartment().equals("開発部")) {
                devEmployees.add(emp);
            }
        }
        
        
        // バブルソートで給与の高い順にソート
        for (int i = 0; i < devEmployees.size() - 1; i++) {
            for (int j = 0; j < devEmployees.size() - i - 1; j++) {
                // 現在の要素が次の要素よりも給与が低い場合、交換する
                if (devEmployees.get(j).getSalary() < devEmployees.get(j + 1).getSalary()) {
                    // 要素を交換
                    Employee temp = devEmployees.get(j);
                    devEmployees.set(j, devEmployees.get(j + 1));
                    devEmployees.set(j + 1, temp);
                }
            }
        }           
        
        // 出力結果: [佐藤 (開発部, 400000円), 伊藤 (開発部, 370000円), 田中 (開発部, 350000円)]
        System.out.println(devEmployees);
        */
		
        /*
        
        1回目のパス (i=0)
        比較1 (j=0): 田中 vs 佐藤
        +-------------------+-------------------+-------------------+
        |     田中          |     佐藤          |     伊藤          |
        |    350,000円      |    400,000円      |    370,000円      |
        +-------------------+-------------------+-------------------+
                ↑                   ↑                   
              比較して交換（350,000 < 400,000）
        交換後
        +-------------------+-------------------+-------------------+
        |     佐藤          |     田中          |     伊藤          |
        |    400,000円      |    350,000円      |    370,000円      |
        +-------------------+-------------------+-------------------+
                [0]                 [1]                 [2]
        比較2 (j=1): 田中 vs 伊藤
        +-------------------+-------------------+-------------------+
        |     佐藤          |     田中          |     伊藤          |
        |    400,000円      |    350,000円      |    370,000円      |
        +-------------------+-------------------+-------------------+
                                    ↑                   ↑
                                比較して交換（350,000 < 370,000）
        交換後
        +-------------------+-------------------+-------------------+
        |     佐藤          |     伊藤          |     田中          |
        |    400,000円      |    370,000円      |    350,000円      |
        +-------------------+-------------------+-------------------+
                [0]                 [1]                 [2]
                
                                                          ↓
                                                   この位置が確定
        2回目のパス (i=1)
        比較1 (j=0): 佐藤 vs 伊藤
        +-------------------+-------------------+-------------------+
        |     佐藤          |     伊藤          |     田中          |
        |    400,000円      |    370,000円      |    350,000円      |
        +-------------------+-------------------+-------------------+
                ↑                   ↑                   
              比較（400,000 > 370,000）→ 交換不要
        パス終了後
        +-------------------+-------------------+-------------------+
        |     佐藤          |     伊藤          |     田中          |
        |    400,000円      |    370,000円      |    350,000円      |
        +-------------------+-------------------+-------------------+
                [0]                 [1]                 [2]
                                     ↓                   ↓
                                これらの位置が確定
        ソート完了
        +-------------------+-------------------+-------------------+
        |     佐藤          |     伊藤          |     田中          |
        |    400,000円      |    370,000円      |    350,000円      |
        +-------------------+-------------------+-------------------+
                [0]                 [1]                 [2]
		*/
		//問題1: 文字列の反転（目標ここまで）
		// 1. reverseString
        System.out.println("reverseString(\"Hello\") = " + reverseString("Hello"));

        // 2. reverseStringBuilder
        System.out.println("reverseStringBuilder(\"Hello\") = " + reverseStringBuilder("Hello"));

        //問題2: 母音の削除
        // 3. countCharString
        System.out.println("countCharString(\"Hello World\", 'l') = " + countCharString("Hello World", 'l'));

        // 4. countCharStringBuilder
        System.out.println("countCharStringBuilder(\"Hello World\", 'l') = " + countCharStringBuilder("Hello World", 'l'));

        //問題3: 回文チェック
        // 5. removeVowels
        System.out.println("removeVowels(\"Beautiful Day\") = " + removeVowels("Beautiful Day"));

        // 6. removeVowelsInPlace
        System.out.println("removeVowelsInPlace(\"Beautiful Day\") = " + removeVowelsInPlace("Beautiful Day"));

        // 問題5: 単語の逆順
        // 7. reverseWords
        System.out.println("reverseWords(\"Java is fun\") = " + reverseWords("Java is fun"));

        // 8. reverseWordsString
        System.out.println("reverseWordsString(\"Java is fun\") = " + reverseWordsString("Java is fun"));
    }
	
	public static boolean isPalindrome(String input) {
	    if (input == null) return false;

	    // 空白削除＋小文字に変換
	    String cleaned = input.replaceAll("\\s+", "").toLowerCase();

	    // 反転した文字列と比較
	    String reversed = new StringBuilder(cleaned).reverse().toString();
	    return cleaned.equals(reversed);
	}
	
	
	
	
	//Stringのバージョン
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    
    //StringBuilderのバージョン
    public static String reverseStringBuilder(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    
    
    public static int countCharString(String str, char targetChar) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
    
    public static int countCharStringBuilder(String str, char targetChar) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        // 文字列を StringBuilder に変換
        StringBuilder sb = new StringBuilder(str);
        
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == targetChar) {
                count++;
            }
        }
        
        return count;
    }
    
    //母音だけ削除する判定
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    // 別の実装方法: 文字列をStringBuilderに変換してから母音を削除
    public static String removeVowelsInPlace(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder sb = new StringBuilder(input);
        
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (isVowel(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
        }
        
        return sb.toString();
    }
    
    //remove削除
    public static String removeVowels(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static String reverseWords(String sentence) {
        // 1. 空白で分割
        String[] words = sentence.trim().split("\\s+");

        // 2. 単語を逆順に追加
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
    
    public static String reverseWordsString(String sentence) {
        // 前後の空白を除去し、単語で分割
        String[] words = sentence.trim().split("\\s+");
        String result = "";

        // 配列を逆順で処理し、文字列を再構成
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }

        return result;
    }
    
}

class Employee {
    private String name;
    private String department;
    private int salary;
    
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

	public String getDepartment() {
	        return department;
	    }
	
	public int getSalary() {
	    return salary;
	}

	@Override
	public String toString() {
	    return name + " (" + department + ", " + salary + "円)";
	}
	
	
}


