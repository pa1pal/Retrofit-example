package pa1pal.retrofitexample;

import pa1pal.retrofitexample.POJO.Model;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by pa1pal on 3/10/15.
 */

public interface weatherapi {

    @GET("/forecast/daily")
    Call<Model> getWeather(@Query("lat") double lat , @Query("lon") double lon  );


}
