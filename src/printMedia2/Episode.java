package printMedia2;

public class Episode implements Media {
    private int duration;

    public void setDuration(int durationMins) {
        duration = durationMins;
    }

    @Override
    public void printDuration() {
        System.out.println(duration + " minutes");
    }
}