package api;

import model.LoginSingupResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API {

    @FormUrlEncoded
    @POST("api/v1/account/login")
    Call<LoginSingupResponse> checkUser(@Field("username") String username , @Field("password") String password);

    @FormUrlEncoded
    @POST("api/account/signup")
    Call<Void> register(@Field("first_name") String first_name , @Field("last_name") String last_name,@Field("username") String username , @Field("password") String password);


}
