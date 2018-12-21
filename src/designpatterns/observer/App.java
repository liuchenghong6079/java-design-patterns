package designpatterns.observer;

public class App {

    public static void main(String[] args) {
        Listener student = new Student();
        Listener worker = new OfficeWorker();
        WeatherForecast weatherForecast = new WeatherStation();
        weatherForecast.addListener(student);
        weatherForecast.addListener(worker);
        weatherForecast.notifyWeather("晴天");
        weatherForecast.notifyWeather("下雪");

    }

}
