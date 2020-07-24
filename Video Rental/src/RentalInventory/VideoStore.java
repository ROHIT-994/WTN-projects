package RentalInventory;

public class VideoStore {
	private Video[] store;
	public int getStoreSize()
	{
		if(store!=null)
			return store.length;
		else
			return 0;
	}
	public Video getLastadded()
	{
		if(store!=null)
			return store[store.length-1];
		else
			return null;
	}
	public void addVideo(String videoName)
	{
		Video video=new Video();
		int storeSize;
		try {
			storeSize=store.length;
		}catch(Exception e)
		{
			storeSize=0;
		}
		Video[] newStore=new Video[storeSize+1];
		newStore[storeSize]=video;
		store=newStore;
	}
	public void doCheckout(String videoName) {
		if(store==null|| store.length==0)
		{
			System.out.println("store is empty");
			return;
		}
		for(Video video:store)
		{
			if(video.getVideoName().equals(videoName)) {
				video.doCheckout();
			}
		}
		
	}
	public void doReturn(String videoName)
	{
		if(store==null|| store.length==0)
		{
			System.out.println("store is empty");
			return;
		}
		for(Video video:store)
		{
			if(video.getVideoName().equals(videoName)) {
				video.doReturn();
			}
		}
		
		
	}
	public void recieveRating(String videoName,int rating)
	{
		if(store==null|| store.length==0)
		{
			System.out.println("store is empty");
			return;
		}
		for(Video video:store)
		{
			if(video.getVideoName().equals(videoName)) {
				video.receiveRating(rating);
			}
		}
		
	}
	public void listInventory() {
		if(store==null|| store.length==0)
		{
			System.out.println("store is empty");
			return;
		}
		//for(int i=0;i<80;i++)
			//System.out.println("-");
		for(Video video:store)
		{
			System.out.printf(video.getVideoName(), video.getRating(),video.getCheckout());
		}
		
	}
	

}
