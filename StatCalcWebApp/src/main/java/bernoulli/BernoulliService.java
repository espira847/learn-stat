package bernoulli;

import java.util.*;

public class BernoulliService {
	
	public List getAspects(Double p) {
		
		
		List aspects = new ArrayList();
		
		String pVal = String.valueOf(p);
		aspects.add(pVal);
		
		p = p * 10;
		Double variance = p * (10 - p);
		variance = variance/100;
		String var = String.valueOf(variance);
		aspects.add(var);
		
		return aspects;
	}

}
