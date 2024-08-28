package INLAB;

public class VolumeControlDecorator extends MusicSourceDecorator implements MusicSource {
	public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume control settings applied.");
    }
}