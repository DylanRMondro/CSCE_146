
public class Bread {
	private double size;
	private String type;
	Bread() {
		this.size = 1;
		this.type = "White bread";
	}
	Bread(int aSize, String aType){
		this.size = aSize;
		this.type = aType;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if(size >=1)
			this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
