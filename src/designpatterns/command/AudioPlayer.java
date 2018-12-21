package designpatterns.command;

/**
 * 接收者(Receiver)角色：录音机类
 * @author lch
 */
public class AudioPlayer {

    public void play(){
        System.out.println("播放...");
    }

    public void stop(){
        System.out.println("停止....");
    }

    public void rewind(){
        System.out.println("倒带....");
    }

}
