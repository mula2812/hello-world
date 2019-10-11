import jeliot.io.*;
//by ilan and roy
public class MyClass {
    public static void main() {
        int a=3;
        int b=7;
        int c=9;
        int d=18;
        
        if(a>c && a>b){
               System.out.println("max is: " +a);
        }       
       if(b>c && b>a){
               System.out.println("max is: " +b);
        }       
       if(c>b && c>a){
                System.out.println("max is: " +c);
       }
        if(a>c && a>b && a>d){
               System.out.println("max is: " +a);
        }       
       if(b>c && b>a && b>d){
               System.out.println("max is: " +b);
        }       
       if(c>b && c>a && c>d){
                System.out.println("max is: " +c);
       }
        if(d>c && d>b && d>a){
               System.out.println("max is: " +d);
        }       
      a= Input.readInt();
      b= Input.readInt();
      c= Input.readInt();
      if(a<c && a<b){
               System.out.println("min is: " +a);
        }       
       if(b<c && b<a){
               System.out.println("min is: " +b);
        }       
       if(c<b && c<a){
                System.out.println("min is: " +c);
       }
      
    }
}
