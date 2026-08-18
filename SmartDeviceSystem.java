interface WiFiEnabled {
    void connectWiFi();
}

interface VoiceControlled {
    void voiceCommand(String cmd);
}

interface MusicPlayer {
    void playMusic();
}

class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    @Override
    public void connectWiFi() {
        System.out.println("SmartSpeaker connected to WiFi");
    }

    @Override
    public void voiceCommand(String cmd) {
        System.out.println("Command executed: " + cmd);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing audio stream");
    }
}

public class SmartDeviceSystem {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectWiFi();
        speaker.voiceCommand("Play classic jazz");
        speaker.playMusic();
    }
}