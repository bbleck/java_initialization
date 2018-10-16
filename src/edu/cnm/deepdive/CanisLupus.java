package edu.cnm.deepdive;

public class CanisLupus extends Canis{

  static int moarData = getMoarValue();

  private int wolfData = getValue();

static {
  System.out.println("Entering CanisLupus static initialization block");
}


  {
    System.out.println("Entering CanisLupus initialization block");
  }

  public CanisLupus(){
    //Do superclass initialization first
    //Do other instance initialization before constructor
    System.out.println("Entering CanisLupus::new");
  }

  public CanisLupus(int val){
    System.out.println("Entering CanisLupus::new(int)");
  }

  private int getValue(){
    System.out.println("Entering CanisLupus::getValue()");
    return 1;
  }

  private static int getMoarValue(){
    System.out.println("Entering CanisLupus::getMoarValue");
    return 0;
  }

}
