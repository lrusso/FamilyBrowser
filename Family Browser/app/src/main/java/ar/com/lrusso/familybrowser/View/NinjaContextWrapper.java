package ar.com.lrusso.familybrowser.View;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import ar.com.lrusso.familybrowser.R;

public class NinjaContextWrapper extends ContextWrapper {
    private Context context;

    public NinjaContextWrapper(Context context) {
        super(context);
        this.context = context;
        this.context.setTheme(R.style.BrowserActivityTheme);
    }

    @Override
    public Resources.Theme getTheme() {
        return context.getTheme();
    }
}
