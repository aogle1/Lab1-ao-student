package hw;

public class FizzBuzz {

  public static String[] fizzBuzz (int max){
    String[]ret = new String[max];
    for(int n=1;n<=max;n++){
      if((n%5==0)&&(n%3==0)){
        ret[n-1] = "fizzBuzz";

      }else{
        if((n%3)==0){
          ret[n-1] = "Fizz";

        }
        if((n%5)==0){
          ret[n-1] = "Buzz";

        }
        if((n%3!=0)&&(n%5!=0)){
        ret[n-1] = Integer.toString(n);

        }
      }
    }
    return ret;
  }
}




