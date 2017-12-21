package edu.cs.birzeit.startedservice1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this){
            try{
                wait(5000);
            }catch (InterruptedException ex ){
                ex.printStackTrace();
            }
        }
        String data = intent.getStringExtra("MESSAGE");
        Log.v("MY_MESSAGE", "Long running Code completed " + data);

    }


}
