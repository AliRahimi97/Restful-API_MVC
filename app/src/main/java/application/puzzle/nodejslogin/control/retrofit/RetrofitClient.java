package application.puzzle.nodejslogin.control.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static Retrofit instance;

    public static Retrofit getInstance() {

        if (instance == null)
            instance = new Retrofit.Builder()
                    //your ip address
                    .baseUrl("http://localhost:3000/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();


        return instance;
    }
}
