package com.laioffer.tinnews.ui.home;

public class Test {
    void main() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                doLongTask();
            }

        }).start();
    }

    void doLongTask() {

    }
}
