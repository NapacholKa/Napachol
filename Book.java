import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;

	public void setTitle(String title) {
		this.title = title;
	}// end setTitle

	public String getTitle() {
		return title;
	}// end getTitle

	public void setPrice(float price) {
		this.price = price;
	}// end setPrice

	public float price() {
		return price;
	}// end price

	public void setPublishyear(int year) {
		this.publishyear = year;
	}

	public int getPublishyear() {
		return publishyear;
	}

	public int getTotalYear() {
		return Year.now().getValue() - publishyear;
	}

	public String toString() {
		return "Title : " + title + " published for " + getTotalYear() + " year " + "(" + price + " baht.)";
	}

}
