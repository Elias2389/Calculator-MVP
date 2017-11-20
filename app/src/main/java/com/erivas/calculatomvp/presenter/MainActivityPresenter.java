package com.erivas.calculatomvp.presenter;

/**
 * Created by erivas on 11/20/17.
 */

public interface MainActivityPresenter {

    void sum(String numberOne, String numberTwo); //Interactor
    void showError(String error); //View
    void showResult(String result); //View

}
