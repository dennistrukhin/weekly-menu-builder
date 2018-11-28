package com.whitekittyapps.myweeklymenubuilder.Listeners;

import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.whitekittyapps.myweeklymenubuilder.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class AddWeekButtonClickListener implements View.OnClickListener {

    private Context ctx;

    public AddWeekButtonClickListener(Context c) {
        ctx = c;
    }

    @Override
    public void onClick(View v) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(LAYOUT_INFLATER_SERVICE);
        View customView = inflater.inflate(R.layout.new_week_popup, (ViewGroup) v.getParent(), false);
        PopupWindow popupNewWeek = new PopupWindow(
                customView,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        if (Build.VERSION.SDK_INT >= 21) {
            popupNewWeek.setElevation(5.0f);
        }
        popupNewWeek.showAtLocation((View) v.getParent(), Gravity.CENTER, 0, 0);
    }
}
