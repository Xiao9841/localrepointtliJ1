public class Main {
    public static int getNumDivisbleOrder(int lastOrderNumber){
        int numDivisibleOrders = 0;

        for(int i = 1; i <= lastOrderNumber; i++){
            if(i % 9 == 0){
                numDivisibleOrders++;

                blah
            }
//        int i = 1;
//        while(i <= lastOrderNumber){
//            if( i % 9 == 0){
//                numDivisibleOrders++;
//            }
//            i++;
        }

        return numDivisibleOrders;
    }
    /* public is modifier, static -> method belongs to class, String -> accept command line argument any argument provided
    on the command line are passed as string in this array. if no argument are provided, the array will be empty(but not "null")
     */
    public static void main(String [] args){

        System.out.println(getNumDivisbleOrder(18));
    }


}
