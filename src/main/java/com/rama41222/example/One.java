package com.rama41222.example;

public class One {
  String message = "foo";
  String message2 = "toto";
  String nullMessage;
  public One(){
	  nullMessage = "im a null message";
  }
  public String foo() {
    return message;
  }

  public String toto() {
    return message2;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
  
  public boolean messageEqual(String msg1, String msg2){
	  if(msg1.equals(msg2)){
		  return true;
	  }else{
		  return false;
	  }
  }
}
