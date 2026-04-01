class YouTubeVideoInfoExecutor {
 public static void main(String[] args){

    System.out.println();
    YouTubeVideoInfo y1 = new YouTubeVideoInfo();
    y1.setVideoId(1);
    System.out.println("Video Id:" +y1.getVideoId());
    y1.setTitle("Java Tutorial");
    System.out.println("Title:" +y1.getTitle());
    y1.setChannelName("CodeWithHarry");
    System.out.println("Channel:" +y1.getChannelName());
    y1.setViews(500000);
    System.out.println("Views:" +y1.getViews());
    y1.setLikes(25000);
    System.out.println("Likes:" +y1.getLikes());
    y1.setDuration("20:15");
    System.out.println("Duration:" +y1.getDuration());
    y1.setIsLive(false);
    System.out.println("Live:" +y1.getIsLive());

    System.out.println();
    YouTubeVideoInfo y2 = new YouTubeVideoInfo();
    y2.setVideoId(2);
    System.out.println("Video Id:" +y2.getVideoId());
    y2.setTitle("Spring Boot Crash Course");
    System.out.println("Title:" +y2.getTitle());
    y2.setChannelName("Telusko");
    System.out.println("Channel:" +y2.getChannelName());
    y2.setViews(800000);
    System.out.println("Views:" +y2.getViews());
    y2.setLikes(40000);
    System.out.println("Likes:" +y2.getLikes());
    y2.setDuration("45:30");
    System.out.println("Duration:" +y2.getDuration());
    y2.setIsLive(false);
    System.out.println("Live:" +y2.getIsLive());

 }
}