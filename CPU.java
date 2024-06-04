public class CPU implements Computer {
    @Override
    public void powerOn() {
      System.out.println("CPU dihidupkan");
    }
  
    @Override
    public void restart() {
      System.out.println("CPU direstart");
    }
  
    @Override
    public void shutDown() {
      System.out.println("CPU dimatikan");
    }
  }
  