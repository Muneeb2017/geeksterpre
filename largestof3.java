package code;

public class largestof3 {
    public static void main(String[] args) {
        
        int num = 20;
        int num1 = 21;
        int num2 = 112;
        if (num > num1 && num > num2){  /*and operater*/
           System.out.println(num);
        }else if (num1 > num2 && num1 > num){   /*else if*/
           System.out.println(num1);
        }else{
           System.out.println(num2);
        }
        
    }
}
