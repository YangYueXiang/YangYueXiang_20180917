package di;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import bean.Bean;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import utils.HttpUtils;

/**
 * Created by YangYueXiang
 * on 2018/9/16
 */
public class IModule implements IContract.imodule{
    private String path="http://172.17.8.100/movieApi/cinema/v1/findRecommendCinemas?longitude=116.30551391385724&latitude=40.04571807462411&page=1&count=10";
    @Override
    public void requestData(final calllisten calllisten) {
        HttpUtils getinstance = HttpUtils.getinstance();
        getinstance.getData(path, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                Bean bean = gson.fromJson(string, Bean.class);
                List<Bean.ResultBean.NearbyCinemaListBean> nearbyCinemaList = bean.getResult().getNearbyCinemaList();
                calllisten.responmsg(nearbyCinemaList);

            }
        });
    }
}
