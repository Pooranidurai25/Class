package week3day2;


public class Interface implements TaxCalculation,IncomeCalculation

{

	public double incomeAdd(String name, double amnt1, double amnt2) 
	{
		System.out.println("one");
		
		double ans = amnt1+ amnt2;
		System.out.println(ans);
				return ans;
	}

	public double incomeReduce(String name, double amount1, double amount2) {
		System.out.println("two");
		
		double result = amount1+ amount2;
		System.out.println(result);
		return result;
	}

	public void publishValue() {
		
		System.out.println("three");
		
	}

	public void calcGrossincome() 
	{
		String name = "Welcome";
		
		String replace = name.replace('c', 'C');
		System.out.println(replace);
	}

	public void removeDeduction() 
	
	{
		String name = "Happy Days";
		String[] split = name.split(" ");
		for (int i = 0; i < split.length; i++)
		{
			System.out.println(split[i]);
		}
		
	}
	
	public static void main(String[] args)
	{
		Interface obj = new Interface();
		
		obj.incomeAdd("Poorani", 30, 40);
		obj.incomeReduce("Anan", 30,14);
		obj.removeDeduction();
		
		
		
		
	}

}




