package callwatch;

import java.util.ArrayList;

public class CallWatch {
    public static void main(String[] args) {
        SmartWatch watch1;
        Watch watch2;
        SmartWatch watch3;

        ArrayList<Watch> watchList = new ArrayList<Watch>();
        int i;

        watch1 = new SmartWatch();
        watch1.setHours(15);
        watch1.setMins(42);
        watch1.setPercentage(30);

        watch2 = new Watch();
        watch2.setHours(20);
        watch2.setMins(44);

        watch3 = new SmartWatch();
        watch3.setHours(9);
        watch3.setMins(18);
        watch3.setPercentage(23);

        watchList.add(watch2);
        watchList.add(watch1);
        watchList.add(watch3);

        for(i = 0; i < watchList.size(); ++i) {
            watchList.get(i).printItem();
        }
    }
}