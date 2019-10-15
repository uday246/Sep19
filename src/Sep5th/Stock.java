package Sep5th;

import java.util.Scanner;

public class Stock {
	public static void main(String[] args) {
		int sharesOfStock;
		double salePrice;
		double pricePerShare;
		double commissionRate;
		double saleCommision;
		double purchaseTotal = 0;
		double sellingTotal = 0;
		double total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of shares: ");
		sharesOfStock = sc.nextInt();
		System.out.println("Enter purchase price : ");
		pricePerShare = sc.nextDouble();
		System.out.println("Enter purchase commission : ");
		commissionRate = sc.nextDouble();
		commissionRate = commissionRate / 100;
		System.out.println("Enter sales price");
		salePrice = sc.nextDouble();
		System.out.println("Enter sale commission");
		saleCommision = sc.nextDouble();
		saleCommision = saleCommision / 100;
		// finding the amount paid only to the stock
		double totolStock = (sharesOfStock * pricePerShare);
		// finding the commission
		double commission = totolStock * commissionRate;
		// finding purchase total
		purchaseTotal = totolStock + commission;
		//finding selling price
		sellingTotal = sharesOfStock * salePrice;
		//finding selling price after commission
		sellingTotal = sellingTotal - (sellingTotal * saleCommision);
		//finding profits and losses
		total = sellingTotal - purchaseTotal;
		// if total is negative than it is loss
		System.out.println("Shares = "+sharesOfStock);
		System.out.println("Purchase price = "+pricePerShare);
		System.out.println("Purchase commission = "+(commission*100));
		System.out.println("Sale price= "+salePrice);
		System.out.println("Sale commission= "+(saleCommision*100));
		
		
		if (total < 0) {
			
			total=total*-1;
			System.out.println("Net loss $" + total);
		} else {
			System.out.println("Net profit $" + total);
		}
	}
}
