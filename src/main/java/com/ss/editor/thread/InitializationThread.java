package com.ss.editor.thread;

import com.ss.editor.EditorThread;
import com.ss.editor.JFXApplication;
import com.ss.rlib.manager.InitializeManager;

public class InitializationThread extends EditorThread {

    public InitializationThread() {
        super();
        setName("Initialization thread");
    }

    @Override
    public void run() {
        JFXApplication.semaphore.waitForUnlock();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        InitializeManager.initialize();
    }
}
