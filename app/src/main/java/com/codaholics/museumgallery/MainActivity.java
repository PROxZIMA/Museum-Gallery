package com.codaholics.museumgallery;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
        });

        panoWidgetView = findViewById(R.id.pano_view1);
        loadPhotoSphere1();

        panoWidgetView = findViewById(R.id.pano_view2);
        loadPhotoSphere2();

        panoWidgetView = findViewById(R.id.pano_view3);
        loadPhotoSphere3();

        panoWidgetView = findViewById(R.id.pano_view4);
        loadPhotoSphere4();

        panoWidgetView = findViewById(R.id.pano_view5);
        loadPhotoSphere5();

        panoWidgetView = findViewById(R.id.pano_view6);
        loadPhotoSphere6();
    }

    @Override
    public void onPause() {
        panoWidgetView.pauseRendering();
        super.onPause();
    }

    @Override
    public void onResume() {
        panoWidgetView.resumeRendering();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        // Destroy the widget and free memory.
        panoWidgetView.shutdown();
        super.onDestroy();
    }


    private void loadPhotoSphere1() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample1.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPhotoSphere2() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample2.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPhotoSphere3() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample3.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPhotoSphere4() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample4.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPhotoSphere5() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample5.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPhotoSphere6() {
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        InputStream inputStream;

        AssetManager assetManager = getAssets();
        try {
            inputStream = assetManager.open("sample6.jpg");
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            panoWidgetView.loadImageFromBitmap(BitmapFactory.decodeStream(inputStream), options);
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

