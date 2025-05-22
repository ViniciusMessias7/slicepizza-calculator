import java.util.Scanner;

public class PizzaCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("*********************************************************************");
        System.out.print("                  Welcome to pizza calculator v1.0.0\n");
        System.out.println("Please keep in mind that this program only works with whole numbers!");
        System.out.println("*********************************************************************");

        System.out.println();

        System.out.println("Please enter how many people will eat pizza: ");
        int numberOfPeople = userInput.nextInt();

        System.out.println("Enter the average number of slices each person will eat:");
        int slicesPerPerson = userInput.nextInt();

        System.out.println("Enter how many slices the pizza has:");
        int slicesPerPizza = userInput.nextInt();

        int totalSlicesNeeded = numberOfPeople * slicesPerPerson;
        int fullPizzasNeeded = totalSlicesNeeded / slicesPerPizza;
        int remainingSlices = totalSlicesNeeded % slicesPerPizza;
        int pizzasToOrder = fullPizzasNeeded + (remainingSlices > 0 ? 1 : 0); // from chatGPT 😞

        String amountPizzas = "You should order: " + pizzasToOrder;
        String result = "You will need " + fullPizzasNeeded + " whole pizzas and " + remainingSlices + " slices of another pizza!";

        System.out.println(amountPizzas + " pizzas" + "\n" + result);
    }
}
