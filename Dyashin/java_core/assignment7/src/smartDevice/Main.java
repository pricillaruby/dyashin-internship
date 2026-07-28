package smartDevice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.clickPhoto();
		phone.playMusic();
		
		//We use Interface musicPlayer , so we can't access clickPhoto() which 
		//is in Camera interface, to access both create object for child classes
		MusicPlayer player = new SmartPhone();
		player.playMusic();
	}

}
