package com.example.mvpexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.view.View.GONE;

//      ** JournalDev MVP Example
//      https://www.journaldev.com/14886/android-mvp

//    :1
//    Design activity_main

//    :2
//    Create 'GetQuoteInteractor' Interface

//    :3
//    Create class 'GetQuoteInteractorImpl'

//    :4
//    Create interface 'MainView.java'


//    :5
//    Create 'MainPresenter' interface

//    :6
//    Create 'MainPresenterImpl' class


//     :7
public class MainActivity extends AppCompatActivity implements MainView {

    private TextView textView;
    private Button button;
    private ProgressBar progressBar;
    MainPresenter presenter;
/* *********************** */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 7.1
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        presenter = new MainPresenterImpl(this, new GetQuoteInteractorImpl());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClick();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(GONE);
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setQuote(String string) {
        textView.setText(string);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}