import java.text.NumberFormat;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
//fghasikfgnasfjhgahrkgjfnacdkjiovharwekjfgnmaijkodfsgbniauodgnardgnlakgnauwiherf
        Scanner input= new Scanner(System.in);
        System.out.print("Principal: ");
        int priValue= input.nextInt();
        // Question : Can i use a single Scanner object for multiple enteries or inputs.//
        // Scanner input= new Scanner(System.in);
        System.out.print("Annual Interset Rate: ");
        double aIR= (input.nextDouble())/1200;
        // Scanner input= new Scanner(System.in);
        System.out.print("Period (Years): ");
        int years= (input.nextInt())*12;
        double morgage= priValue*(aIR*(Math.pow((1+aIR),years))/(Math.pow((1+aIR),years)-1));
        // formating the number. Still needs some work //
        NumberFormat formatPay= NumberFormat.getCurrencyInstance();
        String finalPay= formatPay.format(morgage);
        System.out.println("Morgage: "+finalPay);
        System.out.print("NEW CODE");
        
        input.close();
    }
}
