import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        boolean looping = true;
        double sum = 0.0;
        while(looping)
        {
            double nextPrice = SafeInput.getRangedDouble(in, "Enter a price in the range", 0.5, 10.0);
            sum = sum + nextPrice;
            looping = SafeInput.getYNConfirm(in, "Add another item to your cart?");
        }
        System.out.println(String.format("%.2f", sum));
    }
}
