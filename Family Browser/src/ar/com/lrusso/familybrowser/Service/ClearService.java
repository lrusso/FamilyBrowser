package ar.com.lrusso.familybrowser.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ar.com.lrusso.familybrowser.Unit.BrowserUnit;

public class ClearService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        System.exit(0); // For remove all WebView thread
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        clear();
        stopSelf();
        return START_STICKY;
    }

    private void clear() {
        BrowserUnit.clearBookmarks(this);
        BrowserUnit.clearCache(this);
        BrowserUnit.clearCookie(this);
        BrowserUnit.clearFormData(this);
        BrowserUnit.clearHistory(this);
        BrowserUnit.clearPasswords(this);
    }
}
