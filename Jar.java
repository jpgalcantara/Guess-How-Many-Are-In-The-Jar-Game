import java.util.Random;

public class Jar {

  private String mItemName;
  private int mMaxNumber;
  
  public Jar(String itemName, int maxNumber) {
    mItemName = itemName;
    mMaxNumber = maxNumber;  
  }
  
  public String getItemName() {
    return mItemName;
  }
  
  public int getMaxNumber() {
    return mMaxNumber;
  }
 
  public int fillJar() {
    Random random = new Random();
    return random.nextInt(mMaxNumber)+1;
  }

}