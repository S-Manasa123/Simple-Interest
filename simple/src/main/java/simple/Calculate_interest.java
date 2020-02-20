package simple;

public class Calculate_interest {

	public int Simple_interest_calculation(double principle_amount,float rate_of_interest,int time_period)
	{
		double Simple_Interest=(principle_amount*time_period*rate_of_interest)/100;
		return (int)Simple_Interest;
	}
	public int compound_interest_calculation(int principle_amount,double rate_of_interest,int no_of_years,int time_period)
	{
		rate_of_interest=rate_of_interest/100;
		double Compound_interest=principle_amount*Math.pow((1+rate_of_interest/no_of_years),no_of_years*time_period);
		return (int)Compound_interest;
	}
}
