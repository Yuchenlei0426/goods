package com.bawei.yuchenlei20190806.base;

public class BasePresenter<BaseView extends IBaseView> {
    private BaseView baseView;

    public BasePresenter(BaseView baseView) {
        this.baseView = baseView;
    }
    public void onDestory(){
        if (baseView!=null) {
            baseView=null;
        }
    }
}
