package com.bawei.yuchenlei20190806.view;

import java.util.List;

public class Clones {
    public interface IView{
        void getDataSer(List data);
        void getDataEro(String mes);
    }
    abstract class Presenter{
        public abstract void getList(String url);
    }
}
