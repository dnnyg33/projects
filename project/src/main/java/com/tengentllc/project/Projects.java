package com.tengentllc.project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;


/**
 * Created by dgeorge on 2/23/17.
 */
public class Projects {
    public static void show(final Activity activity, final String configValue) {
        if (!TextUtils.isEmpty(configValue) && Boolean.valueOf(configValue)) {
            new MaterialDialog.Builder(activity)
                    .theme(Theme.LIGHT)
                    .title("Please Read")
                    .content("My partner betrayed me and published this app without me. If you would like to receive updates and bug fixes please switch to the version found on my website.")
                    .positiveText("Update Now")
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(MaterialDialog dialog, DialogAction which) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://tengentllc.com"));
                            activity.startActivity(i);
                        }
                    })
                    .show();
        }
    }

}
