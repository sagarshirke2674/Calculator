
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    double getSqrt(int x)
    {
        logger.info("[SQ ROOT] - " + x);
        double result = Math.sqrt(x);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;

    }
    long getFact(int x)
    {
        logger.info("[FACTORIAL] - " + x);
        long fact=1;
        for(int i=x;i>0;i--)
        {
            fact=fact*i;
        }
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }
    double getLoge(int x)
    {
        logger.info("[NATURAL LOG] - " + x);
        double result = 0;
        try {

            if (x <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(x);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;

    }
    double getPow(int x,int y)
    {
        logger.info("[POWER - " + x + " RAISED TO] " + y);
        double result = Math.pow(x,y);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
    public static void main(String args[])
    {
        Scanner sca=new Scanner(System.in);
        int choice;
        Calculator calculator=new Calculator();
        do {
            System.out.println("Scientific Calculator started...");
            System.out.println("1. Find Square Root");
            System.out.println("2. Find Factorial");
            System.out.println("3. Find Natural Logarithm");
            System.out.println("4. Find Power");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice=sca.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                double sqrt=calculator.getSqrt(num);
                System.out.println("Square root : "+sqrt);
            }
            else if(choice==2)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                long fact=calculator.getFact(num);
                System.out.println("Factorial : "+fact);
            }
            else if(choice==3)
            {
                System.out.println("Enter the number : ");
                int num=sca.nextInt();
                double loge=calculator.getLoge(num);
                System.out.println("Natural Logarithm : "+loge);
            }
            else if(choice==4)
            {
                System.out.println("Enter the base : ");
                int base=sca.nextInt();
                System.out.println("Enter the exponent : ");
                int exp=sca.nextInt();
                double power=calculator.getPow(base,exp);
                System.out.println("Power : "+power);
            }
            else if(choice<0 || choice>4)
            {
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN !!");
            }
            else
            {
                System.out.println("Scientific Calculator powered OFF");
            }
        }while(choice!=0);
    }

}
