package com.erivas.calculatomvp.presenter;

import com.erivas.calculatomvp.interactor.MainActivityInteractor;
import com.erivas.calculatomvp.interactor.MainActivityInteractorImpl;
import com.erivas.calculatomvp.view.MainActivityView;

/**
 * Created by erivas on 11/20/17.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView activityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sum(String numberOne, String numberTwo) {
        interactor.sum(numberOne,numberTwo);
    }

    @Override
    public void showError(String error) {
        activityView.showError(error);
    }

    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }
}
