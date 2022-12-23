import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int product = scan.nextInt();
		System.out.println();
		Product[] productList = new Product[product];

		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id : ");
			productList[i].setid(scan.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("----------------------------------");
		for (Product List : productList) {
			{
				if (List.getUnit() < 5) {
					List.ListOfProduct(List.getUnit());
				}
			}

		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'NOMAL' status.");
		System.out.println("----------------------------------");
		for (Product List : productList) {
			{
				if (List.getUnit() >= 5&&List.getUnit()<50) {
					List.ListOfProduct(List.getUnit());
				}
			}
		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("----------------------------------");
		for (Product List : productList) {
			{
				if (List.getUnit() >= 50) {
					List.ListOfProduct(List.getUnit());
				}
			}
		}
	}

}