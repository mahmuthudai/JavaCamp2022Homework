package homework1;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setCity("Erzurum");

		CustomerManager customerManager = new CustomerManager(customer1, new TeacherCreditManager());
		customerManager.add();
		customerManager.giveCredit();

		Person person1 = new Person();
		person1.setFirstName("Hüdai");
		person1.setLastName("Terzi");
		person1.setNationalIdentity("123123");

		Company company1 = new Company();
		company1.setCompanyName("Yemeksepeti");
		company1.setTaxNumber("123456789");
		company1.setId(100);

		CustomerManager customerManager2 = new CustomerManager(company1, new MilitaryCreditManager());
		customerManager2.add();
		customerManager2.giveCredit();

	}

}
