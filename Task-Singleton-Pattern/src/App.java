public class App {
    public static void main(String[] args) throws Exception {
        IPhoneSettings iPhoneSettings = IPhoneSettings.getInstance();
        IPhoneSettings iPhoneSettings2 = IPhoneSettings.getInstance();
        iPhoneSettings2.setBrightness("Low");
        iPhoneSettings.setWifiIsConnected(true);
        iPhoneSettings.setBrightness("High");

        System.out.println("Brightness level: " + iPhoneSettings.getBrightness());
        System.out.println("WiFi status: " + iPhoneSettings.getWifiIsConnected());

    }
}
