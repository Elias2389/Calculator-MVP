package com.erivas.calculatomvp.interactor;

import com.erivas.calculatomvp.presenter.MainActivityPresenter;



public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sum(String numberOne, String numberTwo) {

        Double result = Double.valueOf(numberOne) + Double.valueOf(numberTwo);
        presenter.showResult(String.valueOf(result));


    }
}
