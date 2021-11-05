package binomial;

import java.util.ArrayList;
import java.util.List;

public class BinomialService {
	
	public List getAspects(Double p, Integer n) {
		
		
		List aspects = new ArrayList();
		String pVal = String.valueOf(p);
		
		aspects.add(pVal);
		
		Double eX = p * n;
		String expectedVal = String.valueOf(eX);
		
		aspects.add(expectedVal);
		
		Double variance = eX * (1 - p);
		String var = String.valueOf(variance);
		aspects.add(var);
		
		return aspects;
	}

}
