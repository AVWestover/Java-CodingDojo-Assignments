public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ringString = "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
        return ringString;
    }
    @Override
    public String unlock() {
        return "unlocking via facial recongition";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}

