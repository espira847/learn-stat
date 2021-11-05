import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class descriptiveService {
	int size , mid;
	double Q0;
	double Q1;
	double Q2;
	double Q3;
	double Q4;
	double mean, var, stdev;

	ArrayList<Double> data = new ArrayList<>();
	
	descriptiveService(ArrayList<Double> data){
		Collections.sort(data);
		this.data = data;
		size = data.size();
		mid = size/2 + 1;
		Minimum();
		Maximum();
		Median();
		LowerQuartile();
		UpperQuartile();
		Mean();
		Variance();
		
	}
	
	public List getAspects() {
		List info = new ArrayList();
		
		String mu = String.valueOf(mean);
		info.add(mu);
		
		String variance = String.valueOf(var);
		info.add(variance);
		
		String standardDev = String.valueOf(stdev);
		info.add(standardDev);
		
		String Quart0 = String.valueOf(Q0);
		info.add(Quart0);
		
		String Quart1 = String.valueOf(Q1);
		info.add(Quart1);
		
		String Quart2 = String.valueOf(Q2);
		info.add(Quart2);
		
		String Quart3 = String.valueOf(Q3);
		info.add(Quart3);
		
		String Quart4 = String.valueOf(Q4);
		info.add(Quart4);
		
		return info;
		
	}
	
	void Minimum() {
		Q0 = data.get(0);
	}
	
	void Maximum() {
		Q4 = data.get(size - 1);
	}
	
	void Median() {
		if(size % 2 == 0) {
			double right, left;
			left = data.get(mid - 1);
			right = data.get(mid);
			
			Q2 = (right + left) / 2; 
		}
		else
			Q2 = data.get(mid);
	}
	
	void LowerQuartile() {
		int pos = mid/2 + 1;
		if(size % 2 == 1) {
			double right, left;
			left = data.get(pos - 1);
			right = data.get(pos);
			
			Q1 = (right + left) / 2;
			
		}else
			Q1 = data.get(pos);
		
	}
	
	void UpperQuartile() {
		int pos = mid + mid/2 + 1;
		if(size % 2 == 1) {
			double right, left;
			left = data.get(pos - 1);
			right = data.get(pos);
			
			Q3 = (right + left) / 2;
			
		}else
			Q3 = data.get(pos);
	}
	
	double Quantile(double quant) {
		int pos = (int) quant * size;
		return data.get(pos);
	}
	
	double Percentile(double percent) {
		if (percent == 100) return data.get(size - 1);
		int pos = (int) percent/100 * size ;
		return data.get(pos);
	}
	
	void Mean() {
		double sum = 0;
		for(Double num : data) {
			sum += num;
		}
		mean = sum / size;
	}
	
	void Variance() {
		int sum = 0;
		for(Double num : data) {
			sum += Math.pow((num- mean), 2);
		}
		var = sum / (size - 1);
		stdev = Math.pow(var, 0.5);
	}

	

}
