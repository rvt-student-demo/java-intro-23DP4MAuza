package lv.rvt;


import java.util.*;



public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet uzvārdu: ");
        String lastname = scanner.nextLine();

        System.out.println("Ievadiet grupu: ");
        String group = scanner.nextLine();



        System.out.println("Students: "+ name + " " + lastname + ", Grupa: " + group);
    }
}
