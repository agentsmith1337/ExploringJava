//Implement here: Polymorphism, Inheritance with both Interfaces and Abstract Classes, Multiple Inheritance, 
public class OOPDemonstration {
    public static void main(String[] args) {

    }
}
abstract class Device {
    boolean running;
    void enable() {
        this.running=true;
        System.out.println("Device is enabled");
    }
    void disable() {
        this.running=false;
        System.out.println("Device is disabled");
    }
    abstract void printInformation();
}

interface NetworkMonitor {
    String interfaceVersion="1.0";
    void showNetwork(Device d);
    void listDevices();
    void showBandwith();
    void showNetworkUsage(Device d);
    void printMonitorInfo();
} 
interface PacketAnalyzer {
    String interfaceversion="1.0";
    void showPackets(Device d);
    void analysePackets(Device d);
}
class WifiAdaptor extends Device {
    String deviceName;
    int build;
    WifiAdaptor(String name, int build) {
        this.deviceName=name;
        this.build=build;
    }
    @Override 
    void enable() {
        super.enable();
        System.out.println("Device is active in Network Mode");
    }
    void printInformation() {
        
        System.out.println(deviceName+" "+"Build: "+build);
    }
}
class NetworkManager implements NetworkMonitor, PacketAnalyzer {
    public void showNetwork(Device d) {
        System.out.println("Intercepting traffic at d");
    }
    public void listDevices() {

    }
    public void showBandwith() {
        
    }
    public void showNetworkUsage(Device d) {

    }
    public void printMonitorInfo() {

    }
    public void showPackets(Device d) {

    }
    public void analysePackets(Device d) {
        
    }
}