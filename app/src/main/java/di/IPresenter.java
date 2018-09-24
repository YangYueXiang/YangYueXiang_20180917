package di;

import java.lang.ref.WeakReference;
import java.util.List;

import bean.Bean;

/**
 * Created by YangYueXiang
 * on 2018/9/16
 */
public class IPresenter implements IContract.ipresenter<IContract.iview>{
    private IContract.iview iview;
    private IModule iModule;
    private WeakReference<IContract.iview> iviewWeakReference;
    private WeakReference<IContract.imodule> imoduleWeakReference;

    @Override
    public void attachView(IContract.iview iview) {
        this.iview=iview;
        iModule = new IModule();
        iviewWeakReference = new WeakReference<>(iview);
        imoduleWeakReference = new WeakReference<IContract.imodule>(iModule);
    }

    @Override
    public void detachView(IContract.iview iview) {
        iviewWeakReference.clear();
        imoduleWeakReference.clear();
    }

    @Override
    public void requestInfo() {
        iModule.requestData(new IContract.imodule.calllisten() {
            @Override
            public void responmsg(List<Bean.ResultBean.NearbyCinemaListBean> message) {
                iview.showData(message);
            }
        });
    }
}
