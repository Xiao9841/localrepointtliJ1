public class hasLeftoverFunds {
    public static Boolean hasLeftOverFund(int burritoCost){
        int budget = 100;
        int numBurritos = 0;

        while(budget >= burritoCost){
            numBurritos ++;
            budget -= burritoCost;
        }
        

    }
}
