package smartDevice;

public class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Music is playing");
	}

	@Override
	public void clickPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo is clicked");
	}

}
