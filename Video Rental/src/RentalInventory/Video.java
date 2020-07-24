package RentalInventory;

public class Video {
	private String videoName;
	private boolean checkout;
	private int rating;
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public void doCheckout()
	{
		checkout=true;
	}
	public void doReturn()
	{
		checkout=false;
	}
	public boolean getCheckout() {
		return checkout;
	}
	public int getRating() {
		return rating;
	}
	public void receiveRating(int rating) {
		this.rating = rating;
	}

}
