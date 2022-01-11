package com.highsoft.devground;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIBar;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HICrosshair;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HIStackLabels;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


    private static final String TAG = "Issue";
    private IssuesActivity mTestActivity;
    private Spinner mSpinner1;
    private Spinner mSpinner2;
    private HIChartView mChartView1;
    private HIChartView mChartView2;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);
        DensityUtil.init(this);
        mTestActivity = this;
        setUpChartView();
        setUpSpinner1();
        setUpSpinner2();
    }

    private void setUpChartView() {
        mChartView1 = findViewById(R.id.chartview1);
        mChartView2 = findViewById(R.id.chartview2);
    }

    private void setUpSpinner1() {
        mSpinner1 = findViewById(R.id.spinner1);
        mSpinner1.setDropDownWidth(400);
        mSpinner1.setDropDownHorizontalOffset(100);
        mSpinner1.setDropDownVerticalOffset(200);
        String[] spinnerItems = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(mTestActivity,
                R.layout.item_select, spinnerItems);
        spinnerAdapter.setDropDownViewResource(R.layout.item_drop);
        mSpinner1.setAdapter(spinnerAdapter);

        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    String text = textView.getText().toString();
                    int integer = Integer.parseInt(text);
                    Toast.makeText(mTestActivity, text, Toast.LENGTH_SHORT).show();
                    initChartDatas(integer, targetStack);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        mSpinner1.setSelection(8);
    }

    private void setUpSpinner2() {
        mSpinner2 = findViewById(R.id.spinner2);
        mSpinner2.setDropDownWidth(400);
        mSpinner2.setDropDownHorizontalOffset(100);
        mSpinner2.setDropDownVerticalOffset(200);
        String[] spinnerItems = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(mTestActivity,
                R.layout.item_select, spinnerItems);
        spinnerAdapter.setDropDownViewResource(R.layout.item_drop);
        mSpinner2.setAdapter(spinnerAdapter);

        mSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    String text = textView.getText().toString();
                    int integer = Integer.parseInt(text);
                    Toast.makeText(mTestActivity, text, Toast.LENGTH_SHORT).show();
                    initChartDatas(integer, indicationStack);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private static final String targetDistrTitle = "Drug distribution at the same target";
    private static final String indicationDistrTitle = "Distribution of Syndrome Drugs";
    private static final String targetStack = "target";
    private static final String indicationStack = "indication";
    private static final String tooltip_background_color = "dbecfd";
    private static final String tooltip_text_color = "03356f";
    private static final String listName = "list";
    private static final String listColor = "548ed4";
    private static final String endName = "end";
    private static final String endColor = "cf5250";
    private static final String noProgressName = "No progress";
    private static final String noProgressColor = "e6c486";
    private static final String onGoingName = "Ongoing";
    private static final String onGoingColor = "51ce73";
    private static final List<String> DEFAULT_CATEGORIES_LIST =
            new ArrayList<String>() {{
                add("Approval");
                add("NDA");
                add("BLA");
                add("PhaseIII");
                add("PhaseII");
                add("PhaseI");
                add("PhaseUnknown");
                add("Apply");
                add("Pre");
            }};

    private HIOptions initChartOptions(String type, final List<String> categories, Number[]... data) {
        HIOptions options = new HIOptions();

        HIChart hiChart = new HIChart();
        hiChart.setType("bar");
        hiChart.setMarginRight(50);
        int size = categories.size();
        hiChart.setHeight(80 + size * 32);
        HIScrollablePlotArea hiScrollablePlotArea = new HIScrollablePlotArea();
        hiScrollablePlotArea.setMinHeight(0);
        hiChart.setScrollablePlotArea(hiScrollablePlotArea);
        hiChart.setReflow(true);
        options.setChart(hiChart);

        HITitle hiTitle = new HITitle();
        hiTitle.setText(TextUtils.equals(type, targetStack) ? targetDistrTitle : indicationDistrTitle);
        hiTitle.setMargin(8);
        options.setTitle(hiTitle);

        final HIYAxis hiyAxis = new HIYAxis();
        hiyAxis.setEvents(new HIEvents());
        hiyAxis.getEvents().setClick(new HIFunction(() -> Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()));
        hiyAxis.setTitle(new HITitle());
        hiyAxis.getTitle().setText("");
        HIStackLabels hiStackLabels = new HIStackLabels();
        hiStackLabels.setEnabled(true);
        hiStackLabels.setAlign("right");
        hiyAxis.setStackLabels(hiStackLabels);
        hiyAxis.setAllowDecimals(false);


        options.setYAxis(new ArrayList<HIYAxis>() {
            {
                add(hiyAxis);
            }
        });

        final HIXAxis hixAxis = new HIXAxis();
        HICrosshair hiCrosshair = new HICrosshair();
        hiCrosshair.setSnap(true);
        hiCrosshair.setWidth(22);
        hixAxis.setCrosshair(hiCrosshair);
        HILabels hiLabels = new HILabels();
        HICSSObject hicssObject = new HICSSObject();
        hicssObject.setFontSize("10px");
        hiLabels.setStyle(hicssObject);
        hixAxis.setLabels(hiLabels);
        hixAxis.setCategories(new ArrayList<String>() {
            {
                addAll(categories);
            }
        });
        options.setXAxis(new ArrayList<HIXAxis>() {
            {
                add(hixAxis);
            }
        });

        HILegend hiLegend = new HILegend();
        hiLegend.setReversed(true);
        hiLegend.setVerticalAlign("top");
        hiLegend.setSymbolRadius(0);
        hiLegend.setSymbolPadding(0);
        HICSSObject legendHicssObject = new HICSSObject();
        legendHicssObject.setFontSize("8px");
        hiLegend.setItemStyle(legendHicssObject);
        hiLegend.setMargin(8);
        hiLegend.setItemDistance(8);
        options.setLegend(hiLegend);

        HIPlotOptions hiPlotOptions = new HIPlotOptions();
        HISeries hiSeries = new HISeries();
        hiSeries.setStacking(type);
        HIEvents hiEvents = new HIEvents();
        hiEvents.setLegendItemClick(new HIFunction("function () {return false;}"));
        hiSeries.setEvents(hiEvents);
        hiPlotOptions.setSeries(hiSeries);
        options.setPlotOptions(hiPlotOptions);

        HITooltip hiTooltip = new HITooltip();
        hiTooltip.setBorderWidth(0);
        hiTooltip.setShared(true);
        hiTooltip.setOutside(false);
        String jsFunction =
                "function () {return this.points.reduce(function (s, point) {return point.y==0?s:s+'<br/>'+point.series.name+' '+point.y;}, '');}";
        HIFunction hiFunction = new HIFunction(jsFunction);
        hiTooltip.setFormatter(hiFunction);
        hiTooltip.setBackgroundColor(HIColor.initWithHexValue(tooltip_background_color));
        HICSSObject toolTipHicssObject = new HICSSObject();
        toolTipHicssObject.setFontSize("12px");
        toolTipHicssObject.setFontWeight("bold");
        hiTooltip.setStyle(toolTipHicssObject);
        options.setTooltip(hiTooltip);

        HICredits hiCredits = new HICredits();
        hiCredits.setEnabled(false);
        options.setCredits(hiCredits);

        HIExporting hiExporting = new HIExporting();
        hiExporting.setEnabled(false);
        options.setExporting(hiExporting);

        HIBar listBar = new HIBar();
        listBar.setColor(HIColor.initWithHexValue(listColor));
        listBar.setName(listName);
        List<Number> ints0 = Arrays.asList(data[0]);
        listBar.setPointWidth(16);
        listBar.setData(new ArrayList<>(ints0));

        HIBar endBar = new HIBar();
        endBar.setColor(HIColor.initWithHexValue(endColor));
        endBar.setName(endName);
        List<Number> ints1 = Arrays.asList(data[1]);
        endBar.setPointWidth(16);
        endBar.setData(new ArrayList<>(ints1));

        HIBar noProgressBar = new HIBar();
        noProgressBar.setColor(HIColor.initWithHexValue(noProgressColor));
        noProgressBar.setName(noProgressName);
        List<Number> ints2 = Arrays.asList(data[2]);
        noProgressBar.setPointWidth(16);
        noProgressBar.setData(new ArrayList<>(ints2));

        HIBar onGoingBar = new HIBar();
        onGoingBar.setColor(HIColor.initWithHexValue(onGoingColor));
        onGoingBar.setName(onGoingName);
        List<Number> ints3 = Arrays.asList(data[3]);
        onGoingBar.setPointWidth(16);
        onGoingBar.setData(new ArrayList<>(ints3));

        ArrayList<HISeries> hiBars = new ArrayList<HISeries>(Arrays.asList(onGoingBar, noProgressBar, endBar, listBar));
        options.setSeries(hiBars);

        return options;
    }

    private void initChartDatas(int categorySize, String type) {
        List<String>
                categories = DEFAULT_CATEGORIES_LIST.subList(0, categorySize);
        Number[] listData = new Number[categorySize];
        putData(listData);
        Number[] endData = new Number[categorySize];
        putData(endData);
        Number[] noProgressData = new Number[categorySize];
        putData(noProgressData);
        Number[] onGoingData = new Number[categorySize];
        putData(onGoingData);

        HIOptions options = initChartOptions(type, categories, listData, endData, noProgressData, onGoingData);
        if (TextUtils.equals(type, targetStack)) {
            mChartView1.setOptions(options);
            mChartView1.reload();
        } else if (TextUtils.equals(type, indicationStack)) {
            mChartView2.setOptions(options);
            mChartView2.reload();
        }

        Object height = options.getChart().getHeight();
        Log.d(TAG, "chartHeight: " + height);
        chartLayoutHeight(type, (Integer) height);
    }

    private void chartLayoutHeight(String type, int height) {
        int h = DensityUtil.dip2px(height);
        Log.d(TAG, "chartLayoutHeight: "+h);
        if (TextUtils.equals(type, targetStack)) {
            ViewGroup.LayoutParams layoutParams = mChartView1.getLayoutParams();
            layoutParams.height = h;
            mChartView1.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams = mChartView2.getLayoutParams();
            layoutParams.height = h;
            mChartView2.setLayoutParams(layoutParams);
        }
    }

    private void putData(Number[] data) {
        int length = data.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            data[i] = random.nextInt(99);
        }
    }

    class ChartInfo {
        String type;
        String name;

        public ChartInfo(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}
