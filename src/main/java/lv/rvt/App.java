package lv.rvt;


import java.util.*;



public class App 
{
    public static void main( String[] args )
    {   //definets vienu reizi un talak mes lietojam
        //scanner mainigo
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Give me the first number: ");
        int pirmais = Integer.valueOf(scanner.nextLine());


        System.out.println("Give me the second number: ");
        int otrais = Integer.valueOf(scanner.nextLine());

    

        System.out.println(pirmais + " " + "+" + " " + otrais + " "+ "=" + " " + pirmais + otrais);
        System.out.println(pirmais + " " + "-" + " " + otrais + " " + "=" + " " + (pirmais - otrais));
        System.out.println(pirmais + " " + "*" + " " + otrais + " " + "=" + " " + pirmais * otrais);
        double result = pirmais / (double) otrais ;
 
        System.out.println(pirmais + " " + "/" + " " +otrais + " " + "=" + " " + result);
    }
}
