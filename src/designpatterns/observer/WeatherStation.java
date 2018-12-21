package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色(ConcreteSubject)
 *
 * 气象站
 *
 * @author lch
 */
public class WeatherStation implements WeatherForecast{

    private List<Listener> listeners = new ArrayList<>();

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyWeather(String message) {
        listeners.stream().forEach(e -> {
            e.update(message);
        });
    }
}
