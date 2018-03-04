package com.example.curtisstilwell1.musicmachine;

import android.os.Looper;
import android.util.Log;

/**
 * Created by curtisstilwell1 on 8/15/17.
 */

public class DownloadThread extends Thread {
    private static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler mHandler;

    @Override
    public void run() {
        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();
    }
}
