package uniform;

import java.util.ArrayList;
import java.util.List;

public class UniformService {
	
	public List getAspects(Double a, Double b) {
		
		List aspects = new ArrayList();
		
		String aVal = String.valueOf(a);
		String bVal = String.valueOf(b);
		
		aspects.add(aVal);
		aspects.add(bVal);
		
		Double eX = (a + b) / 2;
		String expectedVal = String.valueOf(eX);
		
		aspects.add(expectedVal);
		
		Double variance = ((b-a) * (b-a)) / 12;
		String var = String.valueOf(variance);
		
		aspects.add(var);
		
		return aspects;
	}

}
