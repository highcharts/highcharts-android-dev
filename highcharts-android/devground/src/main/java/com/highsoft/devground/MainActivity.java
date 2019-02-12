package com.highsoft.devground;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIHover;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotLines;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPosition;
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStates;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIWindbarb;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> symbols;
    ArrayList<HashMap<String, Object>> precipitations;
    ArrayList<HashMap<String, Object>> precipitationsError;
    ArrayList<HashMap<String, Object>> winds;
    ArrayList<HashMap<String, Object>> temperatures;
    ArrayList<HashMap<String, Object>> pressures;
    Boolean hasPrecipitationError = false;
    String creditsUrl;
    String chartTitle = "Meteogram for ";
    int resolution;

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

    }

//        private String getTitle() {
//            return "Meteogram for " + this.xml.querySelector("location name").textContent
//                    + ", " + this.xml.querySelector("location country").textContent;
//        }

    /**
     * Build and return the Highcharts options structure
     */
    private HIOptions getChartOptions() {

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
        title.setText(chartTitle);
        title.setAlign("left");
//        HIStyle titleStyle = new HIStyle();
//        titleStyle.setWhiteSpace("nowrap");
//        titleStyle.setTextOverflow("ellipsis");
//        title.setStyle(titleStyle);

        options.setTitle(title);

        HICredits credits = new HICredits();
        credits.setText("Forecast from <a href=\"http://yr.no\">yr.no</a>");
        credits.setHref(creditsUrl);
        HIPosition creditsPosition = new HIPosition();
        creditsPosition.setX(-40);
//        credits.setPosition(creditsPosition);

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
        bottomXAxis.setStartOnTick(true);
        bottomXAxis.setEndOnTick(true);
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
        temperatureAxis.getTitle().setText("");
        HILabels temperatureAxisLabels = new HILabels();
        temperatureAxisLabels.setFormat("{value}°");
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
        precipitationAxis.getTitle().setText("");
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
        airPressureTitle.setAlign("left");
        airPressureTitle.setX(3);
        airPressure.setTitle(airPressureTitle);
        HILabels airPressureLabels = new HILabels();

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
        temperatureSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.y}°C</b><br/>");
        temperatureSeries.setZIndex(1);
        temperatureSeries.setColor(HIColor.initWithHexValue("FF3333"));
        temperatureSeries.setNegativeColor(HIColor.initWithHexValue("48AFE8"));
        options.getSeries().add(temperatureSeries);

        HIColumn precipErrSeries = new HIColumn();
        precipErrSeries.setName("Precipitation");
        precipErrSeries.setData(precipitationsError);
        precipErrSeries.setColor(HIColor.initWithHexValue("68CFE8"));
        precipErrSeries.setYAxis(1);
        precipErrSeries.setGroupPadding(0);
        precipErrSeries.setPointPadding(0);
        precipErrSeries.setTooltip(new HITooltip());
        precipErrSeries.getTooltip().setValueSuffix(" mm");
        precipErrSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\\u25CF</span> {series.name}: <b>{point.minvalue} mm - {point.maxvalue} mm</b><br/>");
        precipErrSeries.setGrouping(false);
        HIDataLabels precipErrDataLabels = new HIDataLabels();
        precipErrDataLabels.setEnabled(hasPrecipitationError);
        precipErrDataLabels.setFormatter(new HIFunction("function() { if (this.point.maxvalue > 0) { return this.point.maxvalue; }"));
        precipErrDataLabels.setStyle(new HICSSObject());
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
        precipDataLabels.setEnabled(!hasPrecipitationError);
        precipDataLabels.setFormatter(new HIFunction("function () { if (this.y > 0) { return this.y; }"));
        precipDataLabels.setStyle(new HICSSObject());
        precipDataLabels.getStyle().setFontSize("8px");
        precipDataLabels.getStyle().setColor("gray");
        precipSeries.setTooltip(new HITooltip());
        precipSeries.getTooltip().setValueSuffix(" mm");
        options.getSeries().add(precipSeries);

        HISeries airPressureSeries = new HISeries();
        airPressureSeries.setName("Air pressure");
        airPressureSeries.setColor(HIColor.initWithHexValue("21bc5f"));
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
        windSeries.setName("Wind");
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

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            setContentView(R.layout.activity_main);

            HIChartView chartView = findViewById(R.id.hc);
            chartView.plugins = new ArrayList<>();
            chartView.plugins.add("windbarb");

            smoothLine(temperatures);
            createChart(chartView);
        }
    }

     class DataHandler extends DefaultHandler {

        private String symbolPattern = "[0-9]{2}[dnm]?";
        private String from, to, symbolName, direction;
        private Date fromDate, toDate;
        private HashMap<String, Object> precipitationPoint;
        private HashMap<String, Object> precipitationErrorPoint;
        private HashMap<String, Object> temperaturePoint;
        private HashMap<String, Object> windPoint;
        private HashMap<String, Object> pressurePoint;
        private int i = 0;
        private boolean isName = false;
        private boolean isCountry = false;
        private boolean creditsUrlFound = false;

         @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(qName.equalsIgnoreCase("name")) {
                isName = true;
            }
            if(qName.equalsIgnoreCase("country")){
                isCountry = true;
            }
            if(!creditsUrlFound && qName.equalsIgnoreCase("link")){
                creditsUrl = attributes.getValue("url");
                System.out.println("creditsy: " + creditsUrl);
                creditsUrlFound = true;
            }
            if(qName.equalsIgnoreCase("time")){
                from = attributes.getValue("from");
                to = attributes.getValue("to");
                try {
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    fromDate = formatter.parse(from);
                    toDate = formatter.parse(to);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            if(qName.equalsIgnoreCase("symbol")){
                String var = attributes.getValue("var");
                symbolName = attributes.getValue("name");
                if(var.matches(symbolPattern)){
                    symbols.add(var);
                }
            }
            if(qName.equalsIgnoreCase("temperature")){
                int temperature = Integer.parseInt(attributes.getValue("value"));
                temperaturePoint = new HashMap<>();
                temperaturePoint.put("x", fromDate.getTime());
                temperaturePoint.put("y", temperature);
                temperaturePoint.put("to", toDate.getTime());
                temperaturePoint.put("symbolName", symbolName);
                temperatures.add(temperaturePoint);
            }
            if(qName.equalsIgnoreCase("precipitation")){
                String minValue = attributes.getValue("minvalue");
                String value = attributes.getValue("value");
                String maxValue = attributes.getValue("maxvalue");
                String actualValue;
                if(minValue != null) actualValue = minValue;
                else actualValue = value;
                precipitationPoint = new HashMap<>();
                precipitationPoint.put("x", fromDate.getTime());
                precipitationPoint.put("y", Float.parseFloat(actualValue));
                precipitations.add(precipitationPoint);
                if(maxValue != null) {
                    hasPrecipitationError = true;
                    precipitationErrorPoint = new HashMap<>();
                    precipitationErrorPoint.put("x", fromDate.getTime());
                    precipitationErrorPoint.put("y", Float.parseFloat(maxValue));
                    precipitationErrorPoint.put("minvalue", Float.parseFloat(minValue));
                    precipitationErrorPoint.put("maxvalue", Float.parseFloat(maxValue));
                    precipitationErrorPoint.put("value", Float.parseFloat(value));
                    precipitationsError.add(precipitationErrorPoint);
                }
            }
            System.out.println("TO JEST i = " + i);
            if(qName.equalsIgnoreCase("windDirection")){
                direction = attributes.getValue("deg");
            }
            if(qName.equalsIgnoreCase("windSpeed")){
                windPoint = new HashMap<>();
                windPoint.put("value", Float.parseFloat(attributes.getValue("mps")));
                windPoint.put("direction", Float.parseFloat(direction));
                windPoint.put("x", fromDate.getTime());
                System.out.println("WIATRY: " + winds.toString());
                if(i % 2 == 0) {
                    winds.add(windPoint);
                    System.out.println("i: " + i + " DODANO");
                }
                i++;
            }
            if(qName.equalsIgnoreCase("pressure")){
                pressurePoint = new HashMap<>();
                pressurePoint.put("x", fromDate.getTime());
                pressurePoint.put("y", Float.parseFloat(attributes.getValue("value")));
                pressures.add(pressurePoint);
            }
        }

         @Override
         public void endElement(String uri, String localName, String qName) throws SAXException {
             if(qName.equalsIgnoreCase("name")) isName = false;
             if(qName.equalsIgnoreCase("country")) isCountry = false;
         }

         @Override
         public void characters(char[] ch, int start, int length) throws SAXException {
             if(isName){
                 String name = new String(ch, start, length);
                 chartTitle = chartTitle + name;
             }
             if(isCountry){
                 String country = new String(ch, start, length);
                 chartTitle = chartTitle + ", " + country;
             }
         }
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        symbols = new ArrayList<>();
        precipitations = new ArrayList<>();
        precipitationsError = new ArrayList<>(); // only for some data sets
        winds = new ArrayList<>();
        temperatures = new ArrayList<>();
        pressures = new ArrayList<>();

        new RetrieveXMLTask().execute("https://www.yr.no/place/United_Kingdom/England/London/forecast_hour_by_hour.xml");
    }
}