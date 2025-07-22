package JAN_01.record;

public record ProductRecord(Integer productId, String productName){

	public ProductRecord {
		if(productId <= 0) {
			System.err.println("Invalid Id");
		} 
	}
}
