public class Car {
    // フィールド
    String model;  // 車種
    int year;      // 製造年
    
    // コンストラクタ
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    // 自身の情報を表示するメソッド
    public void displayInfo() {
        System.out.print("車の情報: ");
        
        if (this.model == null) {
            System.out.println("利用できません");
            return;
        }
        
        System.out.println(this.model + " (" + this.year + "年)");
    }
    
    // nullチェックを行い安全に車の情報を表示するメソッド
    public void printCarInfo(Car car) {
        System.out.print("車の情報: ");
        
        // car自体がnullかチェック
        if (car == null) {
            System.out.println("利用できません");
            return;
        }
        
        // carのmodelがnullかチェック
        if (car.model == null) {
            System.out.println("利用できません");
            return;
        }
        
        // 正常な場合は車の情報を表示
        System.out.println(car.model + " (" + car.year + "年)");
    }
}