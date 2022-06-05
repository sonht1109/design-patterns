package _Facade;

public class ComputerFacade {
  private CPU cpu;
  private RAM ram;

  public ComputerFacade() {
    cpu = new CPU();
    ram = new RAM();
  }

  public void start() {
    long address = 1231232;
    cpu.freeze();
    ram.load(address);
    cpu.jump(address);
    cpu.execute();
  }
}
