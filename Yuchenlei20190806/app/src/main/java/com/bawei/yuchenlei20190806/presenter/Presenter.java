package com.bawei.yuchenlei20190806.presenter;

import com.bawei.yuchenlei20190806.view.Clones;

public class Presenter extends Clones.onPresenter{
    private Clones.IView iView;

    public Presenter(Clones.IView iView) {
        this.iView = iView;
    }

    @Override
    public void getList(String url) {

    }
}
