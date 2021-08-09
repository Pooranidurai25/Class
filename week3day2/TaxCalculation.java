package week3day2;

public interface TaxCalculation {

	public double incomeAdd(String name, double amnt1, double amnt2);

	public double incomeReduce(String name, double amount1, double amount2);

	public void publishValue();

}
