package OCT_23.this_keyword;

public class Manager 
{
	int ManagerId;
	String ManagerName;
	
	public void setManagerData(int ManagerId, String ManagerName) {
		this.ManagerId = ManagerId;
		this.ManagerName = ManagerName;
	}
	public void GetManagerData(){
		System.out.println("Manager Id: "+ManagerId);
		System.out.println("Manager Name: "+ManagerName);
	}
	public static void main(String[] args) {
		Manager mgr = new Manager ();
		mgr.setManagerData(1007, "Abhi");
		mgr.GetManagerData();
	}
}
