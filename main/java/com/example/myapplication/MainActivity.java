package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

public class MainActivity extends AppCompatActivity {

    XYPlot xyPlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xyPlot = (XYPlot) findViewById(R.id.xyPlot);

        XYSeries ySeries1 = new SimpleXYSeries(SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,"Y Series 1",2,4,6,7,9);
        XYSeries ySeries2 = new SimpleXYSeries(SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,"Y Series 2",3,52,2,5,8);

        xyPlot.addSeries(ySeries1,new LineAndPointFormatter(Color.BLUE,Color.BLUE,null,null));
        xyPlot.addSeries(ySeries2,new LineAndPointFormatter(Color.RED,Color.RED,null,null));


    }
}
