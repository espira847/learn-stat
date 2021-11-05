package negativeBinomial;

import java.util.ArrayList;
import java.util.List;

public class NegBinomialService {
	
	public List getAspects(Double p, Integer n) {
		
		
		List aspects = new ArrayList();
		String pVal = String.valueOf(p);
		
		aspects.add(pVal);
		
		Double eX = n / p;
		String expectedVal = String.valueOf(eX);
		
		aspects.add(expectedVal);
		
		Double variance = n * (1 - p) / (p * p) ;
		String var = String.valueOf(variance);
		aspects.add(var);
		
		return aspects;
	}

}
