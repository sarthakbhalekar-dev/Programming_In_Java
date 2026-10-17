import java.util.Scanner;

public class Tutorial_1 {
    public static void main(String[] args) {

        //Q1
        System.out.println("Exercise 1 : Name");
        System.out.println("Sarthak Bhalekar");

        //Q2
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercise 2 : Age");

        System.out.println("Enter Current Year: ");
        int current = sc.nextInt();

        System.out.println("Enter Birth Year: ");
        int birth = sc.nextInt();

        System.out.println("Your Age: " + (current - birth));


        //Q3
        System.out.println("Exercise 3 : Arithmetic Operations");
        System.out.println(4 / 3);
        System.out.println((4 - 3) * 5);
        System.out.println(1.3 / 0);
        System.out.println(4 / 3.0);
        System.out.println(117 % 7);
        System.out.println((-1.3) / 0);
        System.out.println(4 - 3 * 5);
        System.out.println(0.3 - 0.2);
        System.out.println(0 / 1.3);
        System.out.println(4 - (3 * 5));
        System.out.println(0.2 - 0.1);

        //Q4
        System.out.println("Exercise 4 : Booleans");
        System.out.println(10 > 5);
        System.out.println(false || (5 != 4));
        System.out.println(10 == 5);
        System.out.println(false && (5 != 4));
        System.out.println(5 == 5);
        System.out.println(!(30 % 3 == 0));
        System.out.println(5 == 11 - 6);
        System.out.println(0.3 - 0.2 == 0.2 - 0.1);


        //Q5
        System.out.println("Exercise 5 : Letter");

        String name_TA, name_student;
        System.out.println("What is the name of your TA?");
        name_TA = sc.next();
        System.out.println("What is your name?");
        name_student = sc.next();
        System.out.println("Dear " + name_TA + ",");
        System.out.println("I enjoy your tutorials, they are awesome!");
        System.out.println(name_student + ".");

        //Q6
        System.out.println("Exercise 6 : Integer Order");

        int a, b, c;
        System.out.println("Enter three integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println((a<b) && (b<c));

        //Q7



    }
}
