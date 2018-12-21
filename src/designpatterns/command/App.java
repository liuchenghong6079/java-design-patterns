package designpatterns.command;

public class App {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        Command rewindCommand = new RewindCommand(player);
        Command stopCommand = new StopCommand(player);
        Command playCommand = new PlayCommand(player);
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setStopCommand(stopCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.play();
        keypad.stop();
        keypad.rewind();

    }

}
