package JAN_01.record;
import java.util.Objects;
public class ProductClass  {
	private Integer  ProductId;
	private String ProductName;
	
	public ProductClass(Integer ProductId, String ProductName) {
		this.ProductId = ProductId;
		this.ProductName = ProductName ;
	}
	public Integer getProductId() {
		return ProductId;
		
	}
	public String getProductName() {
		return ProductName;
		
	}
	public void setProductId(Integer ProductId) {
		this.ProductId = ProductId;
		
	}
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	@Override
	public String toString() {
		return "ProductClass [ProductId=" + ProductId + ", ProductName=" + ProductName + "]";
	}
	@ Override
	public int hashCode() {
		return Objects.hash(ProductId , ProductName);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}if(obj == null) {
			return false;
		}if(getClass()!= obj.getClass()) {
			return false;
		}
		ProductClass other = (ProductClass) obj;
		return Objects.equals(getProductId(), other.getProductId()) && Objects.equals(getProductName(), other.getProductName());
	}

}
