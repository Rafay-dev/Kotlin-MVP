package com.example.mvpexample;

public class MainPresenterImpl implements MainPresenter, GetQuoteInteractor.OnFinishedListener{

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView, GetQuoteInteractor getQuoteInteractor){
        this.mainView = mainView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

    @Override
    public void onFinished(String string) {

    }

    @Override
    public void onButtonClick() {
        if(mainView != null){
            mainView.showProgress();
        }
        getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }
}
