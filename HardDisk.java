public class HardDisk implements Computer {
    @Override
    public void powerOn() {
      System.out.println("Hard disk dihidupkan");
    }
  
    @Override
    public void restart() {
      System.out.println("Hard disk direstart");
    }
  
    @Override
    public void shutDown() {
      System.out.println("Hard disk dimatikan");
    }
  }
  