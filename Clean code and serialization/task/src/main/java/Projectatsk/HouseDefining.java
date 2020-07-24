package Projectatsk;

public class HouseDefining {
	double v=0;
	double cost(String s,double r,String y)
	{
		if (s.equals("StandardMaterials"))
		{
			
			v=v+(1200*r);
			
			
		}
		
		else if (s.equals("above standard materials"))
		{
			
			v=v+(1500*r);
			
			
		}
		else
		{
			if (y.equals("fully automated home" ))
			{v=v+(2500*r);
			}
			else
			{
				v=v+(1800*r);
			}
			
		}
		
		
	return(v);	
	}

}
