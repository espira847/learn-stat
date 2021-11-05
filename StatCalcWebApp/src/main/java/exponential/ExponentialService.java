package exponential;

import java.util.ArrayList;
import java.util.List;

public class ExponentialService {

	public List getAspects(Integer l) {
		
		List aspects = new ArrayList();
		
		String lVal = String.valueOf(l);
		
		aspects.add(lVal);
		
		Double eX =  1.0 / l;
		String expectedVal = String.valueOf(eX);
		
		aspects.add(expectedVal);
		
		Double variance = eX / l;
		String var = String.valueOf(variance);
		
		aspects.add(var);
		
		return aspects;
	}
}
