package app.cryptor.saeed;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.Toast;


import java.util.Locale;


public class App extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        Configuration newConfig  = new Configuration();
        newConfig.locale = Locale.ENGLISH;
        super.onConfigurationChanged(newConfig);
        Locale.setDefault(newConfig.locale);
        getBaseContext().getResources().updateConfiguration(newConfig, getResources().getDisplayMetrics());


    }



    public static void Loger (String m){
        Log.e("Saeed Tag",m);
    }

    public static void ToastMaker (Context c, String m){
        Toast.makeText(c, m, Toast.LENGTH_SHORT).show();
    }

    public static void DialogMaker (Context c,String title,String mes){
        AlertDialog.Builder alert = new AlertDialog.Builder(c);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(mes);
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }


}
