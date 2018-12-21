package designpatterns.command;

/**
 *  具体命令(ConcreteCommand)角色：倒带命令
 * @author lch
 */
public class RewindCommand implements Command {

    private AudioPlayer player;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
