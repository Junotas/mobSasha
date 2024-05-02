import java.util.Scanner;

//mobSasha.github

public class Main {
    public static void main(String[] args) {

      /*  int[] numbers = new int[10];
        char[] chars = new char[10];
        String[] strings = new String[10];
*/

       /* Food[] refrigerator = new Food[3];

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3; */

        String food1 = "Pizza ";
        String food2 = "Hamburger ";
        String food3 = "Hot dog ";
        String order = "Your food is soon arriving at your table";
        String notFound = "We only serve Pizza, Hamburgers and Hot dogs, here!";

        Scanner sc = new Scanner(System.in);
        System.out.println("What type of food are you in the mood for today? We offer " + food1 + food2 + food3);

        Food F1 = new Food("Pizza ");
        Food F2 = new Food("Hamburger ");
        Food F3 = new Food("Hot dog ");

        Food[] refrigerator = {F1, F2, F3};

//I want to add a while loop here so the user gets to go again and again until they've choosen one of the three options
        if (sc.hasNext("Pizza" ) || (sc.hasNext("pizza"))) {
            System.out.println(refrigerator[0].name + order);
        }if (sc.hasNext("Hamburger")  || (sc.hasNext("hamburger"))){

        System.out.println(refrigerator[1].name + order);
        }if (sc.hasNext("Hot dog") || (sc.hasNext("hot dog"))){
            System.out.println(refrigerator[2].name + order);
        }else{
            System.out.println(notFound);
        }
    }
}