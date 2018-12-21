package designpatterns.command;

/**
 *  具体命令(ConcreteCommand)角色：停止命令
 * @author lch
 */
public class StopCommand implements Command {

    private  AudioPlayer player;

    public StopCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
