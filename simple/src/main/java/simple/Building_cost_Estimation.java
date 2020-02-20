package simple;

public class Building_cost_Estimation {

	public int buildcost(String type_of_material,int area_of_house)
	{
		int price=1;
		if(type_of_material.equalsIgnoreCase("standard house"))
		{
			price=1200;
		}
		if(type_of_material.equalsIgnoreCase("above standard house"))
		{
			price=1500;
		}
		if(type_of_material.equalsIgnoreCase("high standard house"))
		{
			price=1800;
		}
		if(type_of_material.equalsIgnoreCase("high standard and fully automated house"))
		{
			price=2500;
		}
		return price*area_of_house;
	}
}
