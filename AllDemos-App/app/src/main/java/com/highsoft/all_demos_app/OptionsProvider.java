package com.highsoft.all_demos_app;

import android.content.Context;

import com.highsoft.all_demos_app.demosOptions.areaCharts.BasicArea;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;

import java.util.HashMap;

/**
 * Created by bartosz on 28.03.18.
 */

class OptionsProvider {

    private HashMap<String, HIOptions> chartCategoryOptions;

    OptionsProvider(String category, Context context) {
        switch (category){
            case "Line charts":
                chartCategoryOptions = setLineChartsOptions(context);
                break;
            case "Area charts":
                chartCategoryOptions = setAreaChartOptions();
                break;
//            case "Column and bar charts":
//                chartCategoryOptions = setColumnBarChartOptions();
//                break;
//            case "Heat and tree maps":
//                chartCategoryOptions = setHeatAndTreeMapsOptions();
        }
    }

    HIOptions getChartOptions(String chartType){
        return chartCategoryOptions.get(chartType);
    }

    private HashMap<String, HIOptions> setLineChartsOptions(Context context){
        HashMap<String, HIOptions> map = new HashMap<>();
//        map.put("Basic line", SymbolsSpline.getOptions()); //todo doesnt draw
//        map.put("Ajax loaded data, clickable points", AjaxLine.getOptions(context)); //todo csv data
//        map.put("With data labels", DataLabelsLine.getOptions()); //todo remove unnecesary plugin?
//        map.put("With annotations", AnnotationsLine.getOptions());
//        map.put("Time series, zoomable", TimeSeriesZoomableLine.getOptions());
//        map.put("Spline with inverted axes", InvertedAxesSpline.getOptions());
//        map.put("Spline with symbols", SymbolsSpline.getOptions()); //todo doesnt draw
//        map.put("Spline with plot bands", PlotBandsSpline.getOptions());
//        map.put("Time data with irregular intervals", IrreguralIntervalsLine.getOptions());
//        map.put("Logarithmic axis", LogarithmicAxisLine.getOptions());
//        map.put("Line chart with 500 points", Chart500PointsLine.getOptions());
        return map;
    }

    private HashMap<String, HIOptions> setAreaChartOptions(){
        HashMap<String, HIOptions> map = new HashMap<>();
        map.put("Basic area", BasicArea.getOptions());
//        map.put("Area with negative values", NegativeValuesArea.getOptions());
//        map.put("Stacked area", StackedArea.getOptions());
//        map.put("Percentage area", PercentageArea.getOptions());
//        map.put("Area with missing points", MissingPointsArea.getOptions());
//        map.put("Inverted axes", InvertedAxesArea.getOptions());
//        map.put("Area-spline", SplineArea.getOptions());
//        map.put("Area range", RangeArea.getOptions());
//        map.put("Area range and line", RangeAndLineArea.getOptions());
//        map.put("Sparkline charts", SparklineArea.getOptions());
//        map.put("Streamgraph", StreamgraphArea.getOptions());
        return map;
    }

    private HashMap<String, HIOptions> setColumnBarChartOptions(){
        HashMap<String, HIOptions> map = new HashMap<>();
//        map.put("Basic bar", BasicBar.getOptions());
        return map;
    }

    private HashMap<String, HIOptions> setHeatAndTreeMapsOptions(){
        HashMap<String, HIOptions> map = new HashMap<>();
//        map.put("Large heat map", LargeHeatMap.getOptions());
        return map;
    }
}
