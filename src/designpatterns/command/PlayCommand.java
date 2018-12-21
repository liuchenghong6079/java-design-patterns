package designpatterns.command;

/**
 *  具体命令(ConcreteCommand)角色：播放命令
 * @author lch
 */
public class PlayCommand implements Command{

    AudioPlayer player;

    public PlayCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
