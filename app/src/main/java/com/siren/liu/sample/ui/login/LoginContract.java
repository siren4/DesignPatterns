package com.siren.liu.sample.ui.login;

import com.siren.liu.sample.base.BaseModel;
import com.siren.liu.sample.base.BasePresenter;
import com.siren.liu.sample.base.BaseView;

public interface LoginContract {

    interface View extends BaseView {
        void fun1(Object object);

        void fun2(Object object);
    }

    interface Presenter extends BasePresenter {
        Model obtainBridge();

        void fun1(Object object);

        void fun2(Object object);
    }

    interface Model extends BaseModel {

    }
}
