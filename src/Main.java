import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };

        int[][] salesData = new int[3][3];

// Input
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        Product productReport = new Product(productNames, salesData);


        PrintProduct printer = new PrintProduct();
        printer.PrintReport(productReport);

        scanner.close();
    }
}