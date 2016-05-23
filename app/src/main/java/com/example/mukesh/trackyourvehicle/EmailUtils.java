package com.example.mukesh.trackyourvehicle;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by pranav on 23/5/16.
 */
public class EmailUtils
{
    public static void sendEmail(Context c,String to,String sub,String body)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        i.putExtra(Intent.EXTRA_SUBJECT, sub);
        i.putExtra(Intent.EXTRA_TEXT   , body);
        try {
            c.startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(c, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
