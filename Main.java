public class Main {
    public static void main(String[] args) {
      CPU cpu = new CPU();
      RAM ram = new RAM();
      HardDisk hardDisk = new HardDisk();
  
      ComputerFacade facade = new ComputerFacade(cpu, ram, hardDisk);
  
      facade.startComputer();
      facade.restartComputer();
      facade.shutDownComputer();
    }
  }

  