package com.example.mvpexample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import android.os.Handler;

public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List<String> arrayList = Arrays.asList("" +
                    "Be Yourself! Everyone else is already taken.",
            "A room without books is like a body without soul!.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world!.");

    @Override
    public void getNextQuote(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString(){
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}

