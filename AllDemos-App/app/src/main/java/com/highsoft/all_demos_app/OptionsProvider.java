package com.highsoft.all_demos_app;

import com.highsoft.all_demos_app.demosOptions.areaCharts.BasicArea;
import com.highsoft.all_demos_app.demosOptions.lineCharts.AjaxLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.AnnotationsLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.BasicLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.Chart500PointsLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.DataLabelsLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.InvertedAxesSpline;
import com.highsoft.all_demos_app.demosOptions.lineCharts.IrreguralIntervalsLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.LogarithmicAxisLine;
import com.highsoft.all_demos_app.demosOptions.lineCharts.PlotBandsSpline;
import com.highsoft.all_demos_app.demosOptions.lineCharts.SymbolsSpline;
import com.highsoft.all_demos_app.demosOptions.lineCharts.TimeSeriesZoomableLine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;

import java.util.HashMap;

/**
 * Created by bartosz on 28.03.18.
 */

class OptionsProvider {

    private HashMap<String, HIOptions> chartCategoryOptions;

    OptionsProvider(String category) {
        switch (category){
            case "Line charts":
                chartCategoryOptions = setLineChartsOptions();
                break;
//            case "Area charts":
//                chartCategoryOptions = setAreaChartOptions();
//                break;
//            case "Column and bar charts":
//                chartCategoryOptions = setColumnBarChartOptions();
//                break;
        }
    }

    HIOptions getChartOptions(String chartType){
        return chartCategoryOptions.get(chartType);
    }

    HashMap<String, HIOptions> setLineChartsOptions(){
        HashMap<String, HIOptions> map = new HashMap<>();
        map.put("Basic line", BasicLine.getOptions());
        map.put("Ajax loaded data, clickable points", AjaxLine.getOptions()); //todo csv data
        map.put("With data labels", DataLabelsLine.getOptions()); //todo remove unnecesary plugin?
        map.put("With annotations", AnnotationsLine.getOptions());
        map.put("Time series, zoomable", TimeSeriesZoomableLine.getOptions());
        map.put("Spline with inverted axes", InvertedAxesSpline.getOptions());
        map.put("Spline with symbols", SymbolsSpline.getOptions()); //todo doesnt draw
        map.put("Spline with plot bands", PlotBandsSpline.getOptions());
        map.put("Time data with irregular intervals", IrreguralIntervalsLine.getOptions());
        map.put("Logarithmic axis", LogarithmicAxisLine.getOptions());
        map.put("Line chart with 500 points", Chart500PointsLine.getOptions());
        return map;
    }

//    HashMap<String, HIOptions> setAreaChartOptions(){
//        HashMap<String, HIOptions> map = new HashMap<>();
//        map.put("Basic area", BasicArea.getOptions());
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
//        return map;
//    }
//
//    HashMap<String, HIOptions> setColumnBarChartOptions(){
//        HashMap<String, HIOptions> map = new HashMap<>();
//        map.put("Basic bar", BasicBar.getOptions());
//        return map;
//    }
}
