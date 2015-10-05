package pa1pal.retrofitexample;

import java.io.IOException;

import pa1pal.retrofitexample.POJO.Model;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.Callback;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by pa1pal on 4/10/15.
 */
public class WeatherInfoService {

    private weatherapi wapi;

    public WeatherInfoService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherapi service = retrofit.create(weatherapi.class);
    }

    public void getWeather(double lat, double lon, Callback callback) throws IOException {
        wapi.getWeather(lat, lon).enqueue(callback);
    }
}
