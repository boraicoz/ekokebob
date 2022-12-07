import java.util.Scanner;
public class EBOBEKOK {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,temp,ebob=0,ekok=0;
        System.out.println("0'dan buyuk sayi giriniz");
        System.out.print("1.Sayi:");
        a=in.nextInt();
        System.out.print("2.Sayi:");
        b=in.nextInt();
        if(a>b)
          temp=b;
        else
        temp=a;


        while(temp>=1){
            if(a%temp==0&&b%temp==0) {
                ebob = temp;
                break;
            }
            temp--;
        }
        System.out.println("EBOB:"+ebob);

 temp=a*b;
      while(temp>=1)
      {
          if(temp%a==0&&temp%b==0)
          {
           ekok=temp;
          }
          temp--;
      }

        System.out.print("EKOK:"+ekok);
    }
}
