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
  public boolean nullPointMethod(String msg){
	  if(msg.contains("hi")) return true;
	  return false;
  }
  public boolean messageEqual(String msg1, String msg2){
	  if(msg1.equals(msg2)){
		  return true;
	  }else{
		  return false;
	  }
  }
  public int f(int i) {
	  //code duplicatioh
	  	int p = 10;
		 if (i == 0 || i == 1) return i;
		 return f(i - 2) + f(i - 1);
}
 public void codeDuplication(){
	 //code duplication
	 int p = 11;
	 int[] a = new int[10];
	 a[9] = 0;
	 a[8] = 1;
	 for (int i = 7; i >= 0; i--) {
	 a[i] = a[i+2] + a[i+1];
	 }
	 System.out.println(a[0]);

	 
	 System.out.println(f(9));

	 int[] x = {34, 21, 13, 8, 5, 3, 2, 1, 1, 0};
	 System.out.println(x[0]);

	 int[] b = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	 System.out.println(b[9]);
 
 }
}
