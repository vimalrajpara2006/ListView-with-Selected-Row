package com.example.listview.selected.row;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLayout extends LinearLayout implements Checkable {
    private boolean mChecked;

    public CheckableLayout(Context context) {
        super(context);
    }

    public CheckableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
        
        // Use this code for setting custom color in background of this layout
        setBackgroundDrawable(checked ? new ColorDrawable(android.graphics.Color.LTGRAY) : null);
        
        // Use this code for setting custom image in background of this layout
        /*setBackgroundResource(checked ? R.drawable.ic_action_search
                : R.drawable.ic_launcher);*/
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void toggle() {
        setChecked(!mChecked);
    }

}
