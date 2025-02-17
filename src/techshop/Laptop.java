package techshop;
public class Laptop extends Computer {
    public void setComputerStatus(String cpuStatus, String internetStatus,
                                  String wifiStatus) {
        cpuUsage = cpuStatus;
        internet = internetStatus;
        wifiQuality = wifiStatus;
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("WiFi: " + wifiQuality);
    }

    private String wifiQuality;
}