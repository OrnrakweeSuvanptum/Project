package TourismBusinessCompany;

public interface Tax {
	double tax(); //interface method

}

class EMP implements Tax {
	public double tax() {
		return 0.1;
	}
}