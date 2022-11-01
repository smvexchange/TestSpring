package smv.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	List<Music> listMusic = new ArrayList<>();
	private String name;
	private int volume;

	public MusicPlayer() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	public List<Music> getListMusic() {
		return listMusic;
	}

	public void setListMusic(List<Music> listMusic) {
		this.listMusic = listMusic;
	}

	public void playMusic() {
		for (Music music : listMusic) {
			System.out.println("Playing " + music.getSong());
		}
	}
}
