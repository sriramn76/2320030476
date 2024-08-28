package WEEK_2;

public class MusicSourceAdapter implements MusicSource {
	private MusicSource musicSource;

    public MusicSourceAdapter(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void play() {
        musicSource.play();
    }
}