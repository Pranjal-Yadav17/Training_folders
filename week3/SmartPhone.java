class Phone{
  void call(String name){
    System.out.println("Calling " + name);
  }

  void sms(String name, String message){
    System.out.println("Sending message " + message + " to " + name);
  }
}

interface Camera{
  void click();
  void record();
}

interface MusicPlayer{
  void play();
  void stop();
}




public class SmartPhone extends Phone implements Camera, MusicPlayer {
  public static void main(String[] args) {
    SmartPhone iphone = new SmartPhone();
    iphone.call("Pranjal");
    iphone.sms("Pranjal", "Reached Home");

    iphone.click();
    iphone.record();

    iphone.play();
    iphone.stop();
  }

  @Override
  public void play() {
    System.out.println("Music is being played");
  }

  @Override
  public void stop() {
    System.out.println("Music has been paused");
  }

  @Override
  public void click() {
    System.out.println("Picture has been clicked");
  }

  @Override
  public void record() {
    System.out.println("Video has been recorded");
  }


}
