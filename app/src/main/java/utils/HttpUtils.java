package utils;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by YangYueXiang
 * on 2018/9/16
 */
public class HttpUtils {
    //全局变量
    private  static HttpUtils httpUtils;
    public static HttpUtils getinstance(){
        if (httpUtils==null){
            synchronized (HttpUtils.class){
                httpUtils=new HttpUtils();
            }
        }
        return httpUtils;
    }
    private OkHttpClient okHttpClient;
    public HttpUtils(){
        okHttpClient=new OkHttpClient();
    }

    //get请求
    public void getData(String path, Callback callback){
        Request request=new Request.Builder()
                .url(path)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(callback);
    }
}
