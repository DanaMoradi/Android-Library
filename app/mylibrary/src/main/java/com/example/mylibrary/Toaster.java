package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {


    public static void simpleToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

}
