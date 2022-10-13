package homework1;

public class CustomerManager {
	private Customer customer;
	private ICreditManager iCreditManager;

	public CustomerManager(Customer customer, ICreditManager iCreditManager) {
		super();
		this.customer = customer;
		this.iCreditManager = iCreditManager;
	}

	public void add() {
		System.out.println("Müşteri eklendi. " + customer.getId());
	}

	public void delete() {
		System.out.println("Müşteri silindi. " + customer.getId());
	}

	public void giveCredit() {
		iCreditManager.Calculate();
		System.out.println("Kredi verildi");
	}
}
