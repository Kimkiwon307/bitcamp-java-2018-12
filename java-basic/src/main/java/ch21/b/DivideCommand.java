package ch21.b;

import java.util.Scanner;

public class DivideCommand implements Command{

 public Scanner kb;

  DivideCommand(Scanner kb){
    this.kb = kb;
  }
  
  @Override
  public void execute() {
    System.out.print("값1? ");
    int a = Integer.parseInt(kb.nextLine());

    System.out.print("값2? ");
    int b = Integer.parseInt(kb.nextLine());

    System.out.printf("%d / %d = %d\n", a,b,(a/b));
  }
}
