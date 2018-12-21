package designpatterns.observer;

/**
 *  抽象主题角色(Subject)
 *
 *  天气预报
 *
 * @author lch
 */
public interface WeatherForecast {

    /**
     * 添加收听人员
     * @param listener
     */
    public void addListener(Listener listener);

    /**
     * 删除收听人员
     */
    public void removeListener(Listener listener);

    /**
     * 天气播报
     */
    public void notifyWeather(String message);


}
