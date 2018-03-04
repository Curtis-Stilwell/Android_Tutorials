package com.example.curtisstilwell1.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;

/**
 * Created by curtisstilwell1 on 8/21/17.
 */

public class ActivityHandler extends Handler {
    private  MainActivity mMainActivity;

    public ActivityHandler(MainActivity mainActivity) {
        mMainActivity = mainActivity;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if (msg.arg1 == 0) {
            if (msg.arg2 == 1) {
                mMainActivity.changePlayButtonText("Play");
            }
            // Music is not playing
            //Play the music
            Message message = Message.obtain();
            message.arg1 = 0;
            try {
                msg.replyTo.send(message);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            //Change play button to say "Pause"
            mMainActivity.changePlayButtonText("Pause");
        } else if (msg.arg1 == 1) {
            if (msg.arg2 == 1) {
               mMainActivity.changePlayButtonText("Pause");
            } else {
                // Music is not playing
                //Play the music
                Message message = Message.obtain();
                message.arg1 = 1;
                try {
                    msg.replyTo.send(message);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                //Change play button to say "Play"
                mMainActivity.changePlayButtonText("Play");
            }
        }
    }
}
