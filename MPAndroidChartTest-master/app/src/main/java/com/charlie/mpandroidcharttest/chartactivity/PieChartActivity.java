package com.charlie.mpandroidcharttest.chartactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.charlie.mpandroidcharttest.R;
import com.charlie.mpandroidcharttest.util.MPChartHelper;
import com.github.mikephil.charting.charts.PieChart;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PieChartActivity extends AppCompatActivity {

    private PieChart pieChart;
    private Map<String,Float> pieValues;

    private TextView tv_online,tv_offline;

    /*
    * pieChart:饼图控件
    * pieValues：饼图显示数据
    * false： 是否显示图例
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        initView();
        initData();
        MPChartHelper.setPieChart(pieChart,pieValues,"路灯统计",true);
    }

    private void initView(){
        pieChart=(PieChart)findViewById(R.id.pieChart);
        tv_online = (TextView)findViewById(R.id.tv_online);
        tv_online.setText("100");
        tv_offline = (TextView)findViewById(R.id.tv_offline);
        tv_offline.setText("150");
    }

    private void initData(){
        pieValues=new LinkedHashMap<>();
        pieValues.put("在线",100f);
        pieValues.put("离线",150f);
//        pieValues.put("C",30f);
//        pieValues.put("D",70f);
    }
}
