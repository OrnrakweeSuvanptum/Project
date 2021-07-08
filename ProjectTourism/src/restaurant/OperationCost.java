package restaurant;

public interface OperationCost {
	double OpCost();//interface method
}
class financeOC implements OperationCost{
	public double  OpCost() {
		return 5000.00;
	}
} 
