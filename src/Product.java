public class Product implements IProducts {
    private String[] productNames;
    private int[][] salesData;

    private int totalProductsSold;
    private double averageProductSold;
    private String mostPopularProduct;

    // Constructor that accepts the data
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
        calculateStats();
    }


    private void calculateStats() {
        totalProductsSold = 0;
        int maxSales = -1;
        int currentProductTotal;

        for (int i = 0; i < salesData.length; i++) {
            currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }

            totalProductsSold += currentProductTotal;


            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                mostPopularProduct = productNames[i] + "(" + maxSales + ")";
            }
        }


        averageProductSold = (double) totalProductsSold / productNames.length;
    }



    @Override
    public int GetTotalProductsSold() {
        return totalProductsSold;
    }


    @Override
    public double GetAverageProductSold() {
        return averageProductSold;
    }

    @Override
    public String GetMostPopularProduct() {
        return mostPopularProduct;
    }
}