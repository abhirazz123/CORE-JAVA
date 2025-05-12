package NOV_26.aggregation;

public class College {
	private String CollegeName;
	private String CollageLoction;
	
	public College(String CollegeName, String CollageLoction) {
		this.CollegeName = CollegeName;
		this.CollageLoction = CollageLoction;
	}
	public String toString() {
		return "Collage [ College Name: "+CollegeName+"Collage Loction: "+CollageLoction 
				+"]";
		
	}

}
