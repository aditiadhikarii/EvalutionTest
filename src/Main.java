import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        while (start){
            System.out.println("Enter start to start and type quit to end: ");
            String command = sc.nextLine();
            if(command.equalsIgnoreCase("quit")){
                start = false;
            }
            ArrayList <Integer> items = new ArrayList<Integer>();
            System.out.println("Enter userID: ");
            String userID = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            System.out.println("Welcome, you have successfully logged in!");

            System.out.println("Enter Number of items");
            int n = sc.nextInt();

            for (int i = 0 ; i < n ; i++ ) {
                System.out.println("Enter price:");
                int price = sc.nextInt();
                items.add(price);
            }
            System.out.println("Would you like to charge VAT? (true/false)");
            boolean vat = sc.nextBoolean();

            double total = 0;
            for (int i = 0 ; i < n ; i++ ){
                total += items.get(i);
            }
            if (vat == true){
                total = total * 1.13;
                System.out.println(total);

                System.out.println("Do you want to add discount? (true/false)");
                boolean discount = sc.nextBoolean();

                if (discount == true){
                    System.out.println("How much would you like to add discount?");
                    double discountvalue = sc.nextInt();
                    total -= total * (discountvalue / 100);
                    System.out.println("Total amount to pay is " + total);

                    System.out.println("Enter the amount of cash  : ");
                    int amount = sc.nextInt();

                    if (amount > total){
                        amount -= total;
                        if (amount >= 1000){
                            int a = amount / 1000;
                            amount = amount - (a * 1000);
                            System.out.println("1000 : " + a);
                        }
                        if (amount >= 500){
                            int b = amount / 500;
                            amount = amount - (b * 500);
                            System.out.println("5000 : " + b);
                        }
                        if (amount >= 100){
                            int c = amount / 100;
                            amount = amount - (c * 100);
                            System.out.println("100 : " + c);
                        }
                        if (amount >= 50){
                            int d = amount / 50;
                            amount = amount- (d * 50);
                            System.out.println("50 : " + d);
                        }
                        if (amount >= 20){
                            int e = amount / 20;
                            amount= amount - (e * 20);
                            System.out.println("20 : " + e);
                        }
                        if (amount >= 10){
                            int f = amount / 10;
                            amount= amount - (f * 10);
                            System.out.println("10 : " + f);
                        }
                        if (amount >= 5){
                            int g = amount/ 5;
                            amount = amount - (g * 5);
                            System.out.println("5 : " + g);
                        }
                        if (amount >= 2){
                            int h = amount / 2;
                            amount = amount - (h * 2);
                            System.out.println("2 : " + h);
                        }
                        if (amount >= 1){
                            int j = amount / 1;
                            amount = amount - (j * 1);
                            System.out.println("1 : " + j);
                        }
                    }
                }else
                {
                    System.out.println("Discount not applied");
                }
            }else{
                System.out.println("VAT not charged");
                }

            }

    }
}