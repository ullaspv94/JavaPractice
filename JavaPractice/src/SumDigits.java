
public class SumDigits {

	long num;
	
	SumDigits(long num) {
		this.num = num;
	}
	
	public long sum(long num) {
		long sum = 0;
		while (num % 10 != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}

}	

