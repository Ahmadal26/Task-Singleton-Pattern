public class IPhoneSettings {

    private static IPhoneSettings instance;
    private String brightness;
    private boolean wifiIsConnected = false;

    private IPhoneSettings() {

    }

    public static IPhoneSettings getInstance() {

        if (instance == null) {
            instance = new IPhoneSettings();

        }
        return instance;

    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public boolean getWifiIsConnected() {

        return wifiIsConnected;
    }

    public void setWifiIsConnected(boolean wifi) {
        this.wifiIsConnected = wifi;

    }
}