package ch29.g;

public class BlackBox {
private String maker;
private String model;

public BlackBox() {
	System.out.println("blackBOx생성자");
}
@Override
public String toString() {
	return "BlackBox [maker=" + maker + ", model=" + model + "]";
}
public String getMaker() {
	return maker;
}
public void setMaker(String maker) {
	this.maker = maker;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}


}
