class Book {
   private String title;
   private String author;

   // 引数なしコンストラクタ
   public Book() {
       this.title = "未設定";
       this.author = "未設定";
   }

   // タイトルのみのコンストラクタ
   public Book(String title) {
       this.title = title;
       this.author = "未設定";
   }

   // タイトルと著者のコンストラクタ
   public Book(String title, String author) {
       this.title = title;
       this.author = author;
   }
}


