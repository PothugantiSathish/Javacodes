package uno.career;

public class SalaryInHand {

	public static void main(String[] args) {
		int monthlysalary=30000;
	    int TaxSavingInvestment=120000;
	    int AnualIncome;
	    int TaxableIncome;
	    double TaxPayable;
	    double IncomeAfterTax;
	    double SalaryInHand;
	    AnualIncome=monthlysalary*12;
	    TaxableIncome=AnualIncome-TaxSavingInvestment;
	    TaxPayable=0.05*TaxableIncome;
	    IncomeAfterTax=AnualIncome-TaxPayable;
	    SalaryInHand=IncomeAfterTax/12;
	    System.out.println(AnualIncome);
	    System.out.println(TaxableIncome);
	    System.out.println(TaxPayable);
	    System.out.println(IncomeAfterTax);
	    System.out.println(SalaryInHand);
	}

}
