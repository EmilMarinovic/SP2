public class EAudioBook extends NetTitle implements IAudioBook{
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * ((reach * 5) + (availability * 0.5) + use);
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}