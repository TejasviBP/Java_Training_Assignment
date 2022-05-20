package inheritence;

public class GetInformation extends StateBank{

	public static void main(String[] args) {

		StateBank obj =new StateBank();
		obj.display("Tejasvi", "MH");
		obj.rateofInterest(5);
		obj.principle(30000);
		obj.loan(40000);
		System.out.println();
		obj.belongsTo("GJ state Bank");


	}

}
