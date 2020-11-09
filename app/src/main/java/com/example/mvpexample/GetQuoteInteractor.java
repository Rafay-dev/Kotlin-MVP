package com.example.mvpexample;

public interface GetQuoteInteractor {
    interface OnFinishedListener{
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}

    // Note:
//    It contains a nested interface 'onFinishedListener'. We'll be using a handler inside our 'GetQuoteInteractorIml.java

//    On completion of handler the above 'onFinished' will be triggered