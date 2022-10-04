package question1.service;
import question1.model.Customer;
public class CustomerService
{
	public boolean checkEleigibility(Customer Obj1) {
		boolean result = false;
		int age = Obj1.getAge();
		if(age >= 18) {
			return true ;
		}
		return false;
		
	}
}