
public class LazySingleton {
  // volatile: https://zh.wikipedia.org/wiki/Volatile%E5%8F%98%E9%87%8F
  private volatile static LazySingleton instance;

  // private 建構式
  private LazySingleton() {}
  
  // double-ckecked locking
  public static LazySingleton getInstance() {
    if (instance == null) {
      // 同步再檢查一次 
      synchronized (LazySingleton.class) {
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
  }
}
