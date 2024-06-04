public class RAM implements Computer {
    @Override
    public void powerOn() {
      System.out.println("RAM dihidupkan");
    }
  
    @Override
    public void restart() {
      System.out.println("RAM direstart");
    }
  
    @Override
    public void shutDown() {
      System.out.println("RAM dimatikan");
    }
  }
  