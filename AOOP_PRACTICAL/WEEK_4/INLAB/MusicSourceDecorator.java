package INLAB;

public abstract class MusicSourceDecorator {
	protected MusicSource decoratedMusicSource;

    public MusicSourceDecorator(MusicSource decoratedMusicSource) {
        this.decoratedMusicSource = decoratedMusicSource;
    }

    public void play() {
        decoratedMusicSource.play();
    }
}
