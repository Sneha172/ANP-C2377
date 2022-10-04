package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;
public class CustomerView {
	public static void main(String argu[]) {
		Customer Obj1=new Customer(3,"abc",19);
		CustomerService Obj2=new CustomerService();
		boolean value = Obj2.checkEleigibility(Obj1);
		if (value)
				{
			System.out.println("your are elegible for voting");
				}
		else {
			System.out.println("your are not elegible for voting");
		}
		
	}

}
