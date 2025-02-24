package printMedia2;

public class Song implements Media {
    private int minutes;
    private int seconds;

    public void setDuration(int durationMins, int durationSecs) {
        minutes = durationMins;
        seconds = durationSecs;
    }

    @Override
    public void printDuration() {
        System.out.println(minutes + ":" + seconds);
    }
}