/*
package com.laioffer.tinnews.ui.home;

public abstract class Test2 <Param, Progress, Result> {

    Result result;

    protected void onPreExecute() {

    }
    abstract Result doInBackground(Param param);
    protected void onPostExecute(Result result) {

    }

    protected void onProgressUpdate(Progress progress) {
        //back to UI thread
    }

    public Test2<Param, Progress, Result> execute(Param param){
        //on UI thread
        //show spinner
        onPreExecute();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                result = doInBackground(param);
            }
        });
        thread.run();
        thread.join();

        //on UI thread
        //update return type
        onPostExecute(result);
        return this;
    }

}

 */
