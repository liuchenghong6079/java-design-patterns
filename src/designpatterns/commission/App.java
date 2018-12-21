package designpatterns.commission;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Notifyer notifyer = new ConcreteNotifier();

        PlayingGameListener playingGameListener = new PlayingGameListener();

        WatchingTVListener watchingTVListener = new WatchingTVListener();

        notifyer.addListener(playingGameListener,"stopPlayingGame",new Date());

        notifyer.addListener(watchingTVListener,"stopWatchingTV",new Date());

        notifyer.notifyX();

    }

}
