package com.example.mvpexample;

public interface MainView {
    void showProgress();
    void hideProgress();
    void setQuote(String string);
}


// 'showProgress()' & 'hideProgress()' would be used for displaying and hiding the progressBar while the next Random quote is fetched from the 'GetQuoteInteractorImpl' class

//    'setQuote()' will set the random string on the textView