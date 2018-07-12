package com.highsoft.devground;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HICredits;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIHover;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotLines;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPosition;
import com.highsoft.highcharts.Common.HIChartsClasses.HIScrollablePlotArea;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStates;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIWindbarb;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> symbols;
    ArrayList<HashMap<String, Object>> precipitations;
    ArrayList<HashMap<String, Object>> precipitationsError;
    ArrayList winds;
    ArrayList temperatures;
    ArrayList pressures;
    int resolution;
    Boolean hasPrecipitationError;

    class Meteogram {

        public String metSt;

        Meteogram(HIChartView chartView){

            symbols = new ArrayList<>();
            precipitations = new ArrayList<>();
            precipitationsError = new ArrayList<>(); // only for some data sets
            winds = new ArrayList();
            temperatures = new ArrayList();
            pressures = new ArrayList();

            this.parseYrData(chartView);
        }

        /**
         * Function to smooth the temperature line. The original data provides only whole degrees,
         * which makes the line graph look jagged. So we apply a running mean on it, but preserve
         * the unaltered value in the tooltip.
         */
        private void smoothLine(ArrayList data){
            int i = data.size();
            int sum, value;

            while (i < 0){

                //todo add functionality

                i--;
            }
        }

        /**
         * Draw the weather symbols on top of the temperature series. The symbols are
         * fetched from yr.no's MIT licensed weather symbol collection.
         * https://github.com/YR/weather-symbols
         */
        private void drawWeatherSymbols(HIChartView chartView){
           //todo add functionality
        }

        /**
         * Draw blocks around wind arrows, below the plot area
         */
        private void drawBlocksForWindArrows(HIChartView chartView) {
            //todo add functionality
        }

//        private String getTitle() {
//            return "Meteogram for " + this.xml.querySelector("location name").textContent
//                    + ", " + this.xml.querySelector("location country").textContent;
//        }

        /**
         * Build and return the Highcharts options structure
         */
        private HIOptions getChartOptions() {

            Meteogram meteogram = this;
            HIOptions options = new HIOptions();

            HIChart chart = new HIChart();
            chart.setMarginBottom(70);
            chart.setMarginRight(40);
            chart.setMarginTop(50);
            chart.setPlotBorderWidth(1);
            chart.setHeight(310);
            chart.setAlignTicks(false);
            HIScrollablePlotArea scrollablePlotArea = new HIScrollablePlotArea();
            scrollablePlotArea.setMinWidth(720);
            chart.setScrollablePlotArea(scrollablePlotArea);

            options.setChart(chart);

            //defs

            HITitle title = new HITitle();
//            title.setText(this.getChartTitle());
            title.setAlign("left");
            HIStyle titleStyle = new HIStyle();
            titleStyle.setWhiteSpace("nowrap");
            titleStyle.setTextOverflow("ellipsis");
            title.setStyle(titleStyle);

            options.setTitle(title);

            HICredits credits = new HICredits();
            credits.setText("Forecast from <a href=\"http://yr.no\">yr.no</a>");
//            credits.setHref(this.xml.querySelector("credit link").getAttribute("url"));
            HIPosition creditsPosition = new HIPosition();
            creditsPosition.setX(-40);
            credits.setPosition(creditsPosition);

            options.setCredits(credits);

            HITooltip tooltip = new HITooltip();
            tooltip.setShared(true);
            tooltip.setUseHTML(true);
            tooltip.setHeaderFormat("<small>{point.x:%A, %b %e, %H:%M} - {point.point.to:%H:%M}</small><br> <b>{point.point.symbolName}</b><br>");

            options.setTooltip(tooltip);

            HIXAxis bottomXAxis = new HIXAxis();
            bottomXAxis.setType("datetime");
            bottomXAxis.setTickInterval(2*36e5); // two hours
            bottomXAxis.setMinTickInterval(36e5); // one hour
            bottomXAxis.setTickLength(0);
            bottomXAxis.setGridLineWidth(1);
            bottomXAxis.setGridLineColor(HIColor.initWithHexValue("F0F0F0"));
            bottomXAxis.setStartOnTick(false);
            bottomXAxis.setEndOnTick(false);
            bottomXAxis.setMinPadding(0);
            bottomXAxis.setMaxPadding(0);
            bottomXAxis.setOffset(30);
            bottomXAxis.setShowLastLabel(true);
            HILabels bottomXAxisLables = new HILabels();
            bottomXAxisLables.setFormat("{value:%H}");
            bottomXAxis.setLabels(bottomXAxisLables);

            HIXAxis topXAxis = new HIXAxis();
            topXAxis.setLinkedTo(0);
            topXAxis.setType("datetime");
            topXAxis.setTickInterval(24*3600*1000);
            HILabels topXAxisLabels = new HILabels();
            topXAxisLabels.setFormat("{value:<span style=\"font-size: 12px; font-weight: bold\">%a</span> %b %e}");
            topXAxisLabels.setAlign("left");
            topXAxisLabels.setX(3);
            topXAxisLabels.setY(-5);
            topXAxis.setLabels(topXAxisLabels);
            topXAxis.setOpposite(true);
            topXAxis.setTickLength(20);
            topXAxis.setGridLineWidth(1);

            options.setXAxis(new ArrayList<>(Arrays.asList(bottomXAxis, topXAxis)));

            HIYAxis temperatureAxis = new HIYAxis();
            temperatureAxis.setTitle(new HITitle());
            temperatureAxis.getTitle().setText(null);
            HILabels temperatureAxisLabels = new HILabels();
            temperatureAxisLabels.setFormat("{value}°");
            temperatureAxisLabels.setStyle(new HIStyle());
            temperatureAxisLabels.getStyle().setFontSize("10px");
            temperatureAxisLabels.setX(-3);
            temperatureAxis.setLabels(temperatureAxisLabels);
            HIPlotLines temperatureAxisPlotLines = new HIPlotLines(); // zero plane
            temperatureAxisPlotLines.setValue(0);
            temperatureAxisPlotLines.setColor(HIColor.initWithHexValue("BBBBBB"));
            temperatureAxisPlotLines.setWidth(1);
            temperatureAxisPlotLines.setZIndex(2);
            temperatureAxis.setPlotLines(new ArrayList<>(Collections.singletonList(temperatureAxisPlotLines)));
            temperatureAxis.setMaxPadding(0.3);
            temperatureAxis.setMinRange(8);
            temperatureAxis.setTickInterval(1);
            temperatureAxis.setGridLineColor(HIColor.initWithHexValue("F0F0F0"));

            HIYAxis precipitationAxis = new HIYAxis();
            precipitationAxis.setTitle(new HITitle());
            precipitationAxis.getTitle().setText(null);
            precipitationAxis.setLabels(new HILabels());
            precipitationAxis.getLabels().setEnabled(false);
            precipitationAxis.setGridLineWidth(0);
            precipitationAxis.setTickLength(0);
            precipitationAxis.setMinRange(10);
            precipitationAxis.setMin(0);

            HIYAxis airPressure = new HIYAxis();
            airPressure.setAllowDecimals(false);
            HITitle airPressureTitle = new HITitle();
            airPressureTitle.setText("hPa");
            airPressureTitle.setOffset(0);
            airPressureTitle.setAlign("high");
            airPressureTitle.setRotation(0);
            airPressureTitle.setStyle(new HIStyle());
            airPressureTitle.getStyle().setFontSize("10px");
            airPressureTitle.getStyle().setColor("#bbc21");
            airPressureTitle.setAlign("left");
            airPressureTitle.setX(3);
            HILabels airPressureLabels = new HILabels();
            airPressureLabels.setStyle(new HIStyle());
            airPressureLabels.getStyle().setFontSize("8px");
            airPressureLabels.getStyle().setColor("bbc21");
            airPressureLabels.setY(2);
            airPressureLabels.setX(3);
            airPressure.setLabels(airPressureLabels);
            airPressure.setGridLineWidth(0);
            airPressure.setOpposite(true);
            airPressure.setShowLastLabel(false);

            options.setYAxis(new ArrayList<>(Arrays.asList(temperatureAxis, precipitationAxis, airPressure)));

            options.setLegend(new HILegend());
            options.getLegend().setEnabled(false);

            options.setPlotOptions(new HIPlotOptions());
            options.getPlotOptions().setSeries(new HISeries());
            options.getPlotOptions().getSeries().setPointPlacement("between");

            options.setSeries(new ArrayList<>());

            HISpline temperatureSeries = new HISpline();
            temperatureSeries.setName("Temperature");
            temperatureSeries.setData(temperatures);
            HIMarker temperatureMarker = new HIMarker();
            temperatureMarker.setEnabled(false);
            temperatureMarker.setStates(new HIStates());
            temperatureMarker.getStates().setHover(new HIHover());
            temperatureMarker.getStates().getHover().setEnabled(true);
            temperatureSeries.setMarker(temperatureMarker);
            temperatureSeries.setTooltip(new HITooltip());
            temperatureSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.value}°C</b><br/>");
            temperatureSeries.setZIndex(1);
            temperatureSeries.setColor(HIColor.initWithHexValue("FF3333"));
            temperatureSeries.setNegativeColor(HIColor.initWithHexValue("48AFE8"));
            options.getSeries().add(temperatureSeries);

            HIColumn precipErrSeries = new HIColumn();
            precipErrSeries.setName("Precipitation");
            precipErrSeries.setData(precipitationsError);
//        precipErrSeries.setColor(); // 'url(#precipitation-error)' ??!!
            precipErrSeries.setYAxis(1);
            precipErrSeries.setGroupPadding(0);
            precipErrSeries.setPointPadding(0);
            precipErrSeries.setTooltip(new HITooltip());
            precipErrSeries.getTooltip().setValueSuffix(" mm");
            precipErrSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\\u25CF</span> {series.name}: <b>{point.minvalue} mm - {point.maxvalue} mm</b><br/>");
            precipErrSeries.setGrouping(false);
            HIDataLabels precipErrDataLabels = new HIDataLabels();
//            precipErrDataLabels.setEnabled(meteogram.hasPrecipitationError);
            precipErrDataLabels.setFormatter(new HIFunction("function() { if (this.point.maxvalue > 0) { return this.point.maxvalue; }"));
            precipErrDataLabels.setStyle(new HIStyle());
            precipErrDataLabels.getStyle().setFontSize("8px");
            precipErrDataLabels.getStyle().setColor("gray");
            options.getSeries().add(precipErrSeries);

            HIColumn precipSeries = new HIColumn();
            precipSeries.setName("Precipitation");
            precipSeries.setData(precipitations);
            precipSeries.setColor(HIColor.initWithHexValue("68CFE8"));
            precipSeries.setYAxis(1);
            precipSeries.setGroupPadding(0);
            precipSeries.setPointPadding(0);
            precipSeries.setGrouping(false);
            HIDataLabels precipDataLabels = new HIDataLabels();
//            precipDataLabels.setEnabled(!meteogram.hasPrecipitationError);
            precipDataLabels.setFormatter(new HIFunction("function () { if (this.y > 0) { return this.y; }"));
            precipDataLabels.setStyle(new HIStyle());
            precipDataLabels.getStyle().setFontSize("8px");
            precipDataLabels.getStyle().setColor("gray");
            precipSeries.setTooltip(new HITooltip());
            precipSeries.getTooltip().setValueSuffix(" mm");
            options.getSeries().add(precipSeries);

            HISeries airPressureSeries = new HISeries();
            airPressureSeries.setName("Air pressure");
            airPressureSeries.setColor(HIColor.initWithHexValue("bbc21"));
            airPressureSeries.setData(pressures);
            airPressureSeries.setMarker(new HIMarker());
            airPressureSeries.getMarker().setEnabled(false);
            airPressureSeries.setShadow(false);
            airPressureSeries.setTooltip(new HITooltip());
            airPressureSeries.getTooltip().setValueSuffix(" hPa");
            airPressureSeries.setDashStyle("shortdot");
            airPressureSeries.setYAxis(2);
            options.getSeries().add(airPressureSeries);

            HIWindbarb windSeries = new HIWindbarb();
            windSeries.setId("windbarbs");
            windSeries.setColor(HIColor.initWithHexValue("0d233a"));
            windSeries.setLineWidth(1.5);
            windSeries.setData(winds);
            windSeries.setVectorLength(18);
            windSeries.setYOffset(-15);
            windSeries.setTooltip(new HITooltip());
            windSeries.getTooltip().setValueSuffix(" m/s");
            options.getSeries().add(windSeries);

            return options;
        }

        /**
         * Post-process the chart from the callback function, the second argument to Highcharts.Chart.
         */
        private void onChartLoad(HIChartView chartView) {
            this.drawWeatherSymbols(chartView);
            this.drawBlocksForWindArrows(chartView);
//            chartView.setOptions(new HIOptions()); //temp options
            chartView.setOptions(this.getChartOptions());
        }

        /**
         * Create the chart. This function is called async when the data file is loaded and parsed.
         */
        public void createChart(HIChartView chartView) {
            this.onChartLoad(chartView);
        }

        private void error(){
            Toast.makeText(MainActivity.this, "Failed loading data, please try again later", Toast.LENGTH_SHORT).show();
        }

        /**
         * Handle the data. This part of the code is not Highcharts specific, but deals with yr.no's
         * specific data format
         */
        private void parseYrData(HIChartView chartView) {

            //parsing data from xml
            new RetrieveXMLTask().execute("https://www.yr.no/place/United_Kingdom/England/London/forecast_hour_by_hour.xml");

            this.smoothLine(temperatures);
            this.createChart(chartView);
        }
    }


    class RetrieveXMLTask extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
                SAXParser saxParser = saxParserFactory.newSAXParser();
                DataHandler dataHandler = new DataHandler();
                saxParser.parse(new InputSource(url.openStream()), dataHandler);
            } catch (SAXException | IOException | ParserConfigurationException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

     class DataHandler extends DefaultHandler {

        int pointStart;
        String symbolPattern = "[0-9]{2}[dnm]?";
        String from, to;
        HashMap<String, Object> precipitationPoint;
        HashMap<String, Object> precipitationErrorPoint;
        HashMap<String, Object> temperaturePoint;
        String symbolName;
        int i = 0;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(qName.equalsIgnoreCase("time")){
                from = attributes.getValue("from");
                to = attributes.getValue("to");
                //todo parse data properly
                System.out.println("<" + qName + ">");
            }
            if(qName.equalsIgnoreCase("symbol")){
                String var = attributes.getValue("var");
                symbolName = attributes.getValue("name");
                if(var.matches(symbolPattern)){
                    System.out.println("var: " + var);
                    symbols.add(var);
                }
            }
            if(qName.equalsIgnoreCase("temperature")){
                int temperature = Integer.parseInt(attributes.getValue("value"));
                temperaturePoint = new HashMap<>();
                temperaturePoint.put("x", from);
                temperaturePoint.put("y", temperature);
                temperaturePoint.put("to", to);
                temperaturePoint.put("symbolName", symbolName);
            }
            if(qName.equalsIgnoreCase("precipitation")){
                String minValue = attributes.getValue("minvalue");
                String value = attributes.getValue("value");
                String maxValue = attributes.getValue("maxvalue");
                String actualValue;
                if(minValue != null) actualValue = minValue;
                else actualValue = value;
                precipitationPoint = new HashMap<>();
                precipitationPoint.put("x", from);
                precipitationPoint.put("y", actualValue);
                precipitations.add(precipitationPoint);
                if(maxValue != null) {
                    hasPrecipitationError = true;
                    precipitationErrorPoint = new HashMap<>();
                    precipitationErrorPoint.put("x", from);
                    precipitationErrorPoint.put("y", maxValue);
                    precipitationErrorPoint.put("minvalue", minValue);
                    precipitationErrorPoint.put("maxvalue", maxValue);
                    precipitationErrorPoint.put("value", value);
                    precipitationsError.add(precipitationErrorPoint);
                }
            }
            if(i % 2 == 0){
                if(qName.equalsIgnoreCase("windDirection")){

                }
            }
        }

         @Override
         public void endElement(String uri, String localName, String qName) throws SAXException {
             if(qName.equalsIgnoreCase("time"))
                 System.out.println("<" + qName + "/>");
         }
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("windbarb");

        new Meteogram(chartView);
    }
}