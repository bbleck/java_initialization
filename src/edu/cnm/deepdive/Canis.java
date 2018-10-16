package edu.cnm.deepdive;

public abstract class Canis {

  public static final int FINAL_DATA = 11;//this happens at compile time
  public static final double FINAL_RANDOM = Math.random(); //this loads the class, initializes the static fields and block, then can give access to the variable store
  static {
    System.out.println("Entering Canis static initialization block");
  }

  {
    System.out.println("Entering Canis initialization block");
  }

    private int data = getValue();

  static int moarData = getMoarValue();


  public Canis() {
    System.out.println("Entering Canis::new");
  }


  private int getValue(){
    System.out.println("Entering Canis::getValue");
    return 0;
  }
  private static int getMoarValue(){
    System.out.println("Entering Canis::getMoarValue");
    return 0;
  }

}
