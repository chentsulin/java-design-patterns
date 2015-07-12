
public class EagerSingleton {
  // 提早初始化
  private static EagerSingleton instance = new EagerSingleton();
  
  // private 建構式
  private EagerSingleton() {}
  
  // 取得實體
  public static EagerSingleton getInstance() {
    return instance;
  }
}
