//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class BurritoCalculator{
    public static int getBurritoQuantity(int burritoCost) {
        int budget = 4267;

        int numBurritos = 0;
        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }

        return numBurritos;
    }

    public static void main(String []args){
        System.out.println(getBurritoQuantity(7));
    }
}
