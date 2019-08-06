package com.bawei.yuchenlei20190806.view;

import java.util.List;

public interface Clones {
    public interface IView{
        void getDataSer(List data);
        void getDataEro(String mes);
    }
   public abstract class onPresenter{
        public abstract void getList(String url);
    }
}
