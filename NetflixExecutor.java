class NetflixExecutor{
 public static void main(String[] args){
    Netflix netflix = new Netflix();
	netflix.addWebSeries("Stranger Things");
	netflix.addWebSeries("Money Heist");
	netflix.addWebSeries("Dark");
	
	netflix.getWebSeries();
	}
 }