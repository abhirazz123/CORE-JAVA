package Dec_05.instance_of;
class Alpha{
}
class Beta extends Alpha{
}
class gamma extends Beta{
}
public class InstanceDemo2 {
	public static void main(String[] args) {
		gamma g = new gamma();
		if(g instanceof gamma) {
			System.out.println("g is pointing to gamma Object");
		}
		if(g instanceof Beta) {
			System.out.println("g is pointing to beta Object");
		}
		if(g instanceof Alpha) {
			System.out.println("g is pointionf to Alpha Object");
		}
		if(g instanceof Object) {
			System.out.println("g is pointing to Object memory ");
		}
	}

}
