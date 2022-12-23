import java.text.DecimalFormat;
import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		double total = 0;
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];

		for (int i = 0; i < productList.length; i++) {
			productList[i]  = new Product();
			System.out.print("Input product Id : ");
			productList[i].setid(scan.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------");
		for (Product List : productList) {
			System.out.println("Product ID : " + List.getid()
					+ ", Total price = " +  frm.format(List.calcilate()));
			total += List.calcilate();
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total price of all products is " + frm.format(total) + " baht.");
	}

}