package com.highsoft.devground;

import android.content.Context;
import android.widget.Toast;

import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HIHeatmap;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISolidgauge;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIZooming;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HeatMapBuilder {

    private final boolean isFullScreen;
    private Context mContext;
    private int insightsID;
    private static final String HEAT_MAP = "heatmap";
    private ArrayList<String> YLabels;
    private ArrayList<String> XLabels;
    private String chartType;
    HIOptions options = new HIOptions();
    private String YTitle;
    private int marginTop;
    private int marginBottom;
    private int plotBorderWidth;
    private int titleFontSize;
    private String legendAlign;
    private String legendLayoutOrientation;
    private int legendMargin;
    private String legendVerticalAlign;
    private int legendY;
    private int legendSymbolHeight;
    private String minColor;
    private String maxColor;
    private String nameSeries;
    private String dataLabelsColor;
    private  ArrayList heatmapData;
    private ArrayList<String> mKeys;

    public HeatMapBuilder(Context context, boolean isFullScreen, int insightsID){
        this.mContext = context;
        this.isFullScreen = isFullScreen;
        this.insightsID = insightsID;
        initDefaultValues();
    }

    private void initDefaultValues() {
        chartType = HEAT_MAP;
        YTitle = "";
        marginTop = 40;
        marginBottom = 80;
        titleFontSize = 24;
        plotBorderWidth = 1;
//        YLabels = new ArrayList<>();
        YLabels = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
//        XLabels = new ArrayList<>();
        XLabels = new ArrayList<>(Arrays.asList("Alexander", "Marie", "Maximilian", "Sophia", "Lukas", "Maria", "Leon", "Anna", "Tim", "Laura"));
//        heatmapData = new ArrayList<>();
        Number[][] heatmapDataArray = new Number[][]{
                {0, 0, 10},
                {0, 1, 19},
                {0, 2, 8},
                {0, 3, 24},
                {0, 4, 67},
                {1, 0, 92},
                {1, 1, 58},
                {1, 2, 78},
                {1, 3, 117},
                {1, 4, 48},
                {2, 0, 35},
                {2, 1, 15},
                {2, 2, 123},
                {2, 3, 64},
                {2, 4, 52},
                {3, 0, 72},
                {3, 1, 132},
                {3, 2, 114},
                {3, 3, 19},
                {3, 4, 16},
                {4, 0, 38},
                {4, 1, 5},
                {4, 2, 8},
                {4, 3, 117},
                {4, 4, 115},
                {5, 0, 88},
                {5, 1, 32},
                {5, 2, 12},
                {5, 3, 6},
                {5, 4, 120},
                {6, 0, 13},
                {6, 1, 44},
                {6, 2, 88},
                {6, 3, 98},
                {6, 4, 96},
                {7, 0, 31},
                {7, 1, 1},
                {7, 2, 82},
                {7, 3, 32},
                {7, 4, 30},
                {8, 0, 85},
                {8, 1, 97},
                {8, 2, 123},
                {8, 3, 64},
                {8, 4, 84},
                {9, 0, 47},
                {9, 1, 114},
                {9, 2, 31},
                {9, 3, 48},
                {9, 4, 91}
        };
        heatmapData = new ArrayList<>(Arrays.asList(heatmapDataArray));
        legendAlign = "right";
        legendLayoutOrientation = "vertical";
        legendMargin = 0;
        legendVerticalAlign = "top";
        legendY = 25;
        legendSymbolHeight = 280;
        nameSeries = "";
        dataLabelsColor = "000000";
        minColor = "#FFFFFF";
        maxColor = "#7cb5ec";
        mKeys = new ArrayList<>();

        HITitle title = new HITitle();//remove title
        title.setText("");
        options.setTitle(title);

        HIExporting exporting = new HIExporting();//remove icons
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HICredits credits = new HICredits();//remove highchart.com credit
        credits.setEnabled(false);
        options.setCredits(credits);
    }


    /**
     * init options to build the view
     * Use default values initialized in initDefaultValues()
     * If you want to custom call setters before calling this function
     */
    public void initOptions(String title) {
        options.setTitle(getTitle(title, titleFontSize));
        initOptions();
    }

    /**
     * init options to build the view
     * Use default values initialized in initDefaultValues()
     * If you want to custom call setters before calling this function
     */
    public void initOptions() {

        options.setChart(getChart(chartType));

        options.setXAxis(getXAxis());

        options.setYAxis(getYAxis());

        options.setLegend(getLegend());

//        options.setTooltip(setTooltip());

        options.setSeries(getSeries());

        /* also try without this*/
//        options.setPlotOptions(getPlotOptions());

        options.additionalOptions = new HashMap<>();
        options.additionalOptions.put("colorAxis", getColorAxisOptions());

    }

    @NotNull
    private HIPlotOptions getPlotOptions() {
        /*try with and without this */
        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSeries(new HIHeatmap());
        plotOptions.getSeries().setDataLabels(getDataLabels());
        return plotOptions;
    }

    @NotNull
    private HIChart getChart(String type) {
        HIChart chart = new HIChart();
        chart.setZooming(new HIZooming());
        chart.setType(type);
        chart.setPlotBorderWidth(plotBorderWidth);
        chart.setEvents(new HIEvents());

        return chart;
    }

    @NotNull
    private ArrayList<HIXAxis> getXAxis() {
        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(XLabels);
        if (isFullScreen) {
            xaxis.setGridLineWidth(1);
            xaxis.setGridLineColor(HIColor.initWithHexValue("000000"));
        }
        HIEvents events = new HIEvents();
        events.setClick(new HIFunction(
                f -> {
                    Toast t = Toast.makeText(
                            mContext,
                                "Clicked point [ " + f.getProperty("x") + ", " + f.getProperty("y") + " ]",
                                Toast.LENGTH_SHORT
                        );
                        t.show();
                    },
                    new String[] {"x"}
            ));
            xaxis.setEvents(events);
            return new ArrayList<>(Collections.singletonList(xaxis));
        }

    @NotNull
    private ArrayList<HIYAxis> getYAxis() {
        HIYAxis yaxis = new HIYAxis();
        yaxis.setCategories(YLabels);
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText(YTitle);
        if (isFullScreen) {
            yaxis.setGridLineWidth(1);
            yaxis.setGridLineColor(HIColor.initWithHexValue("000000"));
        }
        return new ArrayList<>(Collections.singletonList(yaxis));
    }

    @NotNull
    private HILegend getLegend() {
        HILegend legend = new HILegend();
        legend.setEnabled(false);
        return legend;
    }

//    @NotNull
//    private HITooltip setTooltip() {
//        HITooltip tooltip = new HITooltip();
//        tooltip.setUseHTML(true);
//        tooltip.setShared(true);
//        if (insightsID == 230 || insightsID == 231 || insightsID == 237 || insightsID == 239){
//            tooltip.setFormatter(new HIFunction("function () { return '" +  " <b>' + this.point.YName + '</b><br>"  +  " ' + this.point.XName + ' "  +
//                    " <b>' + this.point.valueInPercentage + '</b><br>" + mContext.getString(R.string.target_) + " <b>' " +
//                    "+ this.point.target + '</b><br>" + mContext.getString(R.string.percentage) + " <b>' + this.point.Percentage + '</b>' }"));
//        }else {
//            tooltip.setFormatter(new HIFunction("function () { return '" + mContext.getString(R.string.good_units) + " <b>' + this.point.unitsProducedOK + '</b><br>" + mContext.getString(R.string.theoretical_units) +
//                    " <b>' + this.point.unitsProducedTheoretically + '</b><br>" + mContext.getString(R.string.percentage) + " <b>' + this.point.percentage + ' %</b>' }"));
//        }
//        return tooltip;
//    }


    @NotNull
    private ArrayList<HISeries> getSeries() {

        HIHeatmap heatmap = new HIHeatmap();
        /*try to add this also before setdata()*/
        heatmap.setDataLabels(getDataLabels());
        heatmap.setName(nameSeries);
        heatmap.setData(heatmapData);
        mKeys.add("x");
        mKeys.add("y");
        mKeys.add("value");
        mKeys.add("color");
        mKeys.add("YName");
        mKeys.add("XName");
        mKeys.add("valueInPercentage");
        mKeys.add("target");
        mKeys.add("Percentage");
        heatmap.setKeys(mKeys);
        return new ArrayList<>(Collections.singletonList(heatmap));
    }

    @NotNull
    private ArrayList<HIDataLabels> getDataLabels() {
        ArrayList<HIDataLabels> hiDataLabelsArrayList = new ArrayList<HIDataLabels>();
        HIDataLabels hiDataLabels = new HIDataLabels();
        hiDataLabels.setEnabled(true);
    /*also try to add this:
    hiDataLabels.setStyle(new HIStyle());
    hiDataLabels.getStyle().setColor("000000");*/
        hiDataLabels.setColor("000000");
        hiDataLabelsArrayList.add(hiDataLabels);
        return hiDataLabelsArrayList;
    }


    @NotNull
    private HashMap<String, Object> getColorAxisOptions() {
        HashMap<String, Object> colorAxisOptions = new HashMap<>();
        colorAxisOptions.put("min", 0);
        colorAxisOptions.put("minColor", minColor);
        colorAxisOptions.put("maxColor", maxColor);
        return colorAxisOptions;
    }

    @NotNull
    private HITitle getTitle(String titleTxt, int fontSizePx) {
        HITitle title = new HITitle();
        title.setText(titleTxt);
        title.setStyle(new HICSSObject());
        title.getStyle().setFontSize(fontSizePx + "px");
        return title;
    }


    public HIChartView getChartView() {
        HIChartView chartView = new HIChartView(mContext);
        options.getChart().setBackgroundColor(HIColor.initWithRGBA(255, 255, 255, 0.0));//without backgroud the chart not displayed
        chartView.setOptions(options);
//        chartView.setBackgroundColor(mContext.getResources().getColor(R.color.transparentColor));
        return chartView;
    }
}