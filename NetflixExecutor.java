class NetflixExecutor{
 public static void main(String[] args){
    Netflix netflix = new Netflix();
	// netflix.addWebSeries("Stranger Things");
	// netflix.addWebSeries("Money Heist");
	// netflix.addWebSeries("Dark");

	// netflix.getWebSeries();
	
	// netflix.getWebSeriesNames(0);
	
	// netflix.getWebSeriesIndex("Stranger Things");

	// netflix.UpdatedName("Dark", "White");

	// netflix.deleteName("Dark");

	// netflix.getWebSeries();

	 String[] webseries={"Stranger things", "Money Heist", "Dark"};
	 boolean series=netflix.createNeflixNames(webseries);
	 System.out.println(series);
	}
 }
