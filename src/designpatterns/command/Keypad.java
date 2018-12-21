package designpatterns.command;

/**
 *  请求者(Invoker)角色：键盘
 *  @author lch
 */
public class Keypad {

    private Command playCommand;

    private Command stopCommand;

    private Command rewindCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void play(){
        playCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }
}
