package pa1pal.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

import java.io.IOException;

import pa1pal.retrofitexample.POJO.Model;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Converter;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

public class MainActivity extends AppCompatActivity {

    private WeatherInfoService weatherInfoService;



    private final String LOG_TAG = getClass().getSimpleName();

    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherInfoService = new WeatherInfoService();
        weatherapi wapi;

        //wapi = WeatherInfoService.createService(wapi.class , getResources().getString(R.string.base_url));


    }

    private  void getWeather(double lat, double lon)
    {
        try {
            weatherInfoService.getWeather(lat, lon, new Callback() {
                @Override
                public void onResponse(Response response) {
                    Model model = (Model) response.body();

                    final TextView city = (TextView)findViewById(R.id.textView2);
                    final TextView des = (TextView)findViewById(R.id.textView);

                    city.setText(model.getCity().getName().toString());


                }

                @Override
                public void onFailure(Throwable t) {

                }
            });
        }catch (IOException e){

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
