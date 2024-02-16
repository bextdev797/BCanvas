package com.brandonang.bcanvas;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.widget.FrameLayout;
import android.view.View;
import android.view.Gravity;
import android.widget.TextView;
import android.graphics.Typeface;

import java.util.Random;

public class BCanvas extends AndroidNonvisibleComponent {
  private static String bText = "BBBBBBBBBB" + "" + "BBBBBBBBBB" + "" + "BBBBBBBBBB" + "" + "BBBBBBBBBB" + "" + "BBBBBBBBBB";
  private Activity activity;
  private Context context;

  public BCanvas(ComponentContainer container) {
    super(container.$form());
    this.activity = container.$context();
    this.context = container.$context();
  }

  @SimpleFunction(description = "Make B Canvas")
  public void MakeBCanvas(AndroidViewComponent layout, String monospace, String serif) {
    if(monospace == "MONOSPACE"){
    View view = layout.getView();
    TextView tv = new TextView(this.context);
    tv.setText(bText);
    Typeface type = Typeface.DEFAULT;
    type = Typeface.MONOSPACE;
    int layoutHeight = view.getHeight();
    int layoutWidth = view.getWidth();

    Random random = new Random();
    int randomX = random.nextInt(layoutHeight - tv.getHeight());
    int randomY = random.nextInt(layoutHeight - tv.getHeight());
    
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
    params.setMargins(randomX, randomY, 0, 0);
    tv.setLayoutParams(params);

    FrameLayout frameLayout = (FrameLayout) view;
    frameLayout.addView(tv);
  }
    else if(serif == "SERIF"){
    View view = layout.getView();
    TextView tv = new TextView(this.context);
    tv.setText(bText);
    Typeface type = Typeface.DEFAULT;
    type = Typeface.MONOSPACE;
    int layoutHeight = view.getHeight();
    int layoutWidth = view.getWidth();

    Random random = new Random();
    int randomX = random.nextInt(layoutHeight - tv.getHeight());
    int randomY = random.nextInt(layoutHeight - tv.getHeight());
    
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
    params.setMargins(randomX, randomY, 0, 0);
    tv.setLayoutParams(params);

    FrameLayout frameLayout = (FrameLayout) view;
    frameLayout.addView(tv);
   }
    else {
    View view = layout.getView();
    TextView tv = new TextView(this.context);
    tv.setText(bText);

    int layoutHeight = view.getHeight();
    int layoutWidth = view.getWidth();

    Random random = new Random();
    int randomX = random.nextInt(layoutHeight - tv.getHeight());
    int randomY = random.nextInt(layoutHeight - tv.getHeight());
    
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
    params.setMargins(randomX, randomY, 0, 0);
    tv.setLayoutParams(params);

    FrameLayout frameLayout = (FrameLayout) view;
    frameLayout.addView(tv);
    }
  }

  @SimpleFunction(description = "Set BCanvas for Monospace")
  public String Monospace(){
    String Monospace = "MONOSPACE";
    return Monospace;
  }

  @SimpleFunction(description = "Set BCanvas for Monospace")
  public String Serif(){
    String Serif = "SERIF";
    return Serif;
  }
}