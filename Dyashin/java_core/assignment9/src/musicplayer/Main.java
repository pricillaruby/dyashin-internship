package musicplayer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicPlayer mp3 = new FLAC();
		MusicPlayer wac = new MP3();
		MusicPlayer flac = new WAC();
		
		mp3.fileFormat();
		wac.fileFormat();
		flac.fileFormat();

	}

}
