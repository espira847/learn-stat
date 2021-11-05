package geometric;

import java.util.ArrayList;
import java.util.List;

public class GeometricService {
	
	public List getAspects(Double p) {
		
		
		List aspects = new ArrayList();
		String pVal = String.valueOf(p);
		
		aspects.add(pVal);
		
		Double eX = 1 / p;
		String expectedVal = String.valueOf(eX);
		
		aspects.add(expectedVal);
		
		Double variance = (double) Math.round(((1 - p) / (p * p)) * 100)/100;
		String var = String.valueOf(variance);
		aspects.add(var);
		
		return aspects;
	}

}
