package poisson;

import java.util.ArrayList;
import java.util.List;

public class PoissonService {
	
	public List getAspects(Integer l) {
		
		
		List aspects = new ArrayList();
		
		String lVal = String.valueOf(l);
		
		aspects.add(lVal);
		
		
		return aspects;
	}

}
