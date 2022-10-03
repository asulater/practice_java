public class Hello {
    public static void main(String args[]){
       int a = 3;
       int b = 7;
       int c = 2;
       int d = 1;

       if(a+b > c+d) {
           System.out.println("a+b is grater then c + d");
       }

       int angle1 = 30;
       int angle2 = 50;
       int angle3 = 100;

       if(angle1 + angle2 + angle3 == 180) {
           System.out.println("this three of angles is 180");
       }

       int test = 120;

       if(test % 2 ==0) {
           System.out.println("test var is even number");
       }
       else {
           System.out.println("test var is not even number");
       }
    }
}
