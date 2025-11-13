@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Motion detected → Lights ON.");
        LightAction nightTrigger = () -> System.out.println("Night mode → Dim lights.");
        LightAction voiceTrigger = () -> System.out.println("Voice command → Change color to Blue.");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}
