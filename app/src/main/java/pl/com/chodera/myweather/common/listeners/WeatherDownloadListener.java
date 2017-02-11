package pl.com.chodera.myweather.common.listeners;

/**
 * Created by Adam Chodera on 2016-03-17.
 */
public interface WeatherDownloadListener {

    void downloadingWeatherFailed();

    void downloadingWeatherSucceeded(String weatherInfo, String name);
}
