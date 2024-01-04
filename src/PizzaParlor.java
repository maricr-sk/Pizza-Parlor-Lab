import java.util.Scanner;

public class PizzaParlor {

    private enum flavors{
        Plain(0),
        Veggie(1),
        Mediterranean(2),
        Greek(3),
        MeatLovers(4);


        private int flavorNum;
        //constructor

        flavors(int num){
            flavorNum = num;
        }
    }

    public static flavors cycle(int num){
        for (int i = 0; i < flavors.values().length; ++i){
            if(flavors.values()[i] == flavors.values()[num]){
                return flavors.values()[num]; }
        }
        return flavors.values()[0];
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nThese are the Pizza flavors: \nPlain (1)\nVeggie (2)\nMediterranean (3)\nGreek (4)\nMeat Lovers (5)");
        System.out.println("Please place your order by selecting the corresponding number.");
        Scanner keyboard = new Scanner(System.in);
        int input =  keyboard.nextInt();
        System.out.println("You just placed an order for a " + cycle((input-1)) + " pizza!");
    }
}