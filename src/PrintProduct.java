public class PrintProduct {
    public void PrintReport(Product product) {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("************************");
        PrintTotalProductSales(product);
        PrintAverageProductSales(product);
        PrintMostPopularProduct(product);
    }


    public void PrintTotalProductSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // method to print average
    public void PrintAverageProductSales(Product product) {

        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }


    public void PrintMostPopularProduct(Product product) {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
