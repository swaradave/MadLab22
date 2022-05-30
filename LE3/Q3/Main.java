public class Main
{
	public static void main(String[] args) {
		duck wd = new WD();
		duck rd = new RD();
		duck rhd = new RHD();
		duck ld = new LD();
		
		wd.display();
		wd.performFly();
		wd.performQuack();
		wd.swim();
		
		
		rd.display();
		rd.performFly();
		rd.performQuack();
		rd.swim();
		
		rhd.display();
		rhd.performFly();
		rhd.performQuack();
		rhd.swim();
		
		ld.display();
		ld.performFly();
		ld.performQuack();
		ld.swim();
	}
}
