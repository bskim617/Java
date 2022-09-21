package ch08_2;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customerKim = new VIPCustomer(10020, "김유신",1);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
