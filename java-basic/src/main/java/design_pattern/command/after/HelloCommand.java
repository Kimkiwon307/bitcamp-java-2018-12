package design_pattern.command.after;

public class HelloCommand implements Command{
  @Override
  public void execute() {
    System.out.println("안녕");
  }
}