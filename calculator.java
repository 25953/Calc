import java.util.Scanner;

public class calculator {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;


        System.out.print("Voer een cijfer in \n");
        a = in.nextDouble();


        System.out.print("Voer nog een cijfer in  \n");
        b = in.nextDouble();


        System.out.print("Kies wat je wilt doen  " +
                "\n1.Plus" +
                "\n2.Min" +
                "\n3.Keer" +
                "\n4.Delen " +
                "\n#Kies een nummer \n");


        double dingetje = in.nextDouble();
        double plus = 1;
        double min = 2;
        double keer = 3;
        double delen = 4 ;

        if (dingetje == plus) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);  }


        else if (dingetje == min)  {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);	}


        else if (dingetje == keer)	{
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);	}


        else if (dingetje == delen)   {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);	}

    }

}





