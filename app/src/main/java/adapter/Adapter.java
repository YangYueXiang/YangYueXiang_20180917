package adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.yangyuexiang.R;
import com.facebook.drawee.view.DraweeView;

import java.util.List;

import bean.Bean;

/**
 * Created by YangYueXiang
 * on 2018/9/17
 */
public class Adapter extends RecyclerView.Adapter<Adapter.oneholder> {
    private Context context;
    private List<Bean.ResultBean.NearbyCinemaListBean> list;


    public Adapter(Context context, List<Bean.ResultBean.NearbyCinemaListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public oneholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null);

        oneholder oneholder = new oneholder(view);
        return oneholder;
    }

    @Override
    public void onBindViewHolder(@NonNull oneholder holder, int position) {
        holder.tv_title.setText(list.get(position).getName());
        holder.tv_location.setText(list.get(position).getAddress());
        holder.tv_km.setText(list.get(position).getDistance()%100/10+"km");
        Uri uri=Uri.parse(list.get(position).getLogo());
        holder.img_show.setImageURI(uri);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class oneholder extends RecyclerView.ViewHolder{

        private final TextView tv_title;
        private final DraweeView img_show;
        private final TextView tv_location;
        private final TextView tv_km;

        public oneholder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            img_show = itemView.findViewById(R.id.img_show);
            tv_location = itemView.findViewById(R.id.tv_location);
            tv_km = itemView.findViewById(R.id.tv_km);
        }
    }

}
