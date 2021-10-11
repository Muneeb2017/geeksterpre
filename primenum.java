package code;

public class primenum {
    
    public static void main(String[] args) {

        int num = 98;
        
      int count = 0;
      
      for(int i = 1; i <= num; i = i + 1)
      {
          if(num % i == 0)
              count = count + 1;
      }
      
      if(count == 2)
          System.out.print("Prime");
      else
          System.out.print("NOT Prime");
    }
}