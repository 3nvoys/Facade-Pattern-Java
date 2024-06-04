public class ComputerFacade {
    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;
  
    public ComputerFacade(CPU cpu, RAM ram, HardDisk hardDisk) {
      this.cpu = cpu;
      this.ram = ram;
      this.hardDisk = hardDisk;
    }
  
    public void startComputer() {
      cpu.powerOn();
      ram.powerOn();
      hardDisk.powerOn();
      System.out.println("Komputer dihidupkan");
    }
  
    public void restartComputer() {
      cpu.restart();
      ram.restart();
      hardDisk.restart();
      System.out.println("Komputer direstart");
    }
  
    public void shutDownComputer() {
      hardDisk.shutDown();
      ram.shutDown();
      cpu.shutDown();
      System.out.println("Komputer dimatikan");
    }
  }
  