package _Template;

public abstract class Template {
  private void buildFoundation() {
    System.out.println("Building foundation");
  }

  private void buildWindows() {
    System.out.println("Building glass windows");
  }

  public abstract void buildPillars();

  public abstract void buildWalls();

  public final void buildHouse() {
    buildFoundation();
    buildPillars();
    buildWalls();
    buildWindows();
  }
}
