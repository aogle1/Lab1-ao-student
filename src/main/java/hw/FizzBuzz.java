package hw;

public class FizzBuzz {

  public static void fizzBuzz (int max){
    for(int n=1;n<=max;n++){
      if((n%5==0)&&(n%3==0)){
        System.out.println("fizzBuzz");

      }else{
        if((n%3)==0){
          System.out.println("Fizz");

        }
        if((n%5)==0){
          System.out.println("Buzz");

        }
        if((n%3!=0)&&(n%5!=0)){
          System.out.println(n);

        }
      }
    }
  }
}




