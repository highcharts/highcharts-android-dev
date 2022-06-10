package com.highsoft.devground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.highsoft.highcharts.common.HIColor
import com.highsoft.highcharts.common.hichartsclasses.*
import com.highsoft.highcharts.core.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val button = findViewById<Button>(R.id.btn)

        val chartView = findViewById<HIChartView>(R.id.hc)

        chartView.plugins = ArrayList(Arrays.asList("drilldown"))

        val options = HIOptions()

        val chart = HIChart()
        chart.type = "column"
        chart.backgroundColor = HIColor.initWithHexValue("F2F9FC")
        chart.events = HIEvents()
//        chart.events.drilldown = HIFunction(
//            // this.series[0].data[this.series[0].data.indexOf(this.hoverPoint)].name
//            HIConsumer { f: HIChartContext ->
//                val t = Toast.makeText(
//                    this,
//                    "Name: " + f.getProperty("series.0.data.(0).name"),
//                    Toast.LENGTH_SHORT
//                )
//                t.show()
//            }, arrayOf("series.0.data.(0).name")
//        )
        options.chart = chart

        val title = HITitle()
        title.text = ""
        options.title = title

        val credits = HICredits()
        credits.enabled = false
        options.credits=credits

        val export = HIExporting()
        export.enabled=false

        options.exporting = export



        val xAxis = HIXAxis()
        xAxis.type = "category"
        xAxis.labels = HILabels()
        xAxis.labels.autoRotation = arrayListOf(0)
        options.xAxis=ArrayList(listOf(xAxis))

        val yAxis = HIYAxis()
        yAxis.title = HITitle()
        yAxis.title.text = ""
        yAxis.visible = false

        options.yAxis=ArrayList(listOf(yAxis))


        // 1
        val legend = HILegend()
        legend.enabled = false
        options.legend = legend

        // 2
        val plotOptions = HIPlotOptions()
        val col = HIColumn()
        col.borderWidth = 0
        col.dataLabels = ArrayList<HIDataLabels>()
        val dataLabels = HIDataLabels()
        dataLabels.enabled = true
        col.dataLabels.add(dataLabels)
        plotOptions.series = col
        options.plotOptions = plotOptions


        val tooltip = HITooltip()
        tooltip.headerFormat = "<span style=\"font-size:11px\">{series.name}</span><br>"
        tooltip.pointFormat =
            "<span style=\"color:{point.color}\">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>"
        options.tooltip = tooltip

        val columncolors = ArrayList<String>()
        columncolors.add("#FBB519")
        columncolors.add("#F5716F")
        columncolors.add("#00B9C4")
        columncolors.add("#ABC22A")
        columncolors.add("#CA56AF")
        columncolors.add("#CA56AF")

        val series1 = HIColumn()
        series1.name = "Browsers"
        series1.colorByPoint = true



        val map1: HashMap<String, Any> = HashMap()
        map1["name"] = "Hyderabad"
        map1["y"] = 56.33
        map1[""]
        map1["drilldown"] = "Microsoft"

        val map2: HashMap<String, Any> = HashMap()
        map2["name"] = "Vijayawada"
        map2["y"] = 24.03
        map2["drilldown"] = "Chrome"

        val map3: HashMap<String, Any> = HashMap()
        map3["name"] = "Secundrabad"
        map3["y"] = 18.38
        map3["drilldown"] = "Firefox"

        val map4: HashMap<String, Any> = HashMap()
        map4["name"] = "Kakinada"
        map4["y"] = 14.77
        map4["drilldown"] = "Safari"

        val map5: HashMap<String, Any> = HashMap()
        map5["name"] = "Nellore"
        map5["y"] = 21.50
        map5["drilldown"] = "Opera"

        val map6: HashMap<String, Any> = HashMap()
        map6["name"] = "Kurnool"
        map6["y"] = 30.00
        map6["drilldown"] = "null"


        val series1_data =  ArrayList<HashMap<String, Any>>()
        series1_data.add(map1)
        series1_data.add(map2)
        series1_data.add(map3)
        series1_data.add(map4)
        series1_data.add(map5)
        series1_data.add(map6)


        series1.data = ArrayList(series1_data)
        val series = ArrayList<HISeries>()
        series.add(series1)
        options.series = series



        val drilldown = HIDrilldown()

        val series2 = HIColumn()
        series2.name = "Hyderabad"
        series2.id = "Microsoft"

        val object1 = arrayOf<Any>("Quarter1", 24.13)
        val object2 = arrayOf<Any>("Quarter2", 17.2)
        val object3 = arrayOf<Any>("Quarter3", 8.11)
        val object4 = arrayOf<Any>("Quarter4", 5.33)

        val series_list = ArrayList<Any>()
        series_list.add(object1)
        series_list.add(object2)
        series_list.add(object3)
        series_list.add(object4)

        series2.data =
            ArrayList(series_list)

        val series3 = HIColumn()
        series3.name = "Vijayawada"
        series3.id = "Chrome"

        val object5 = arrayOf<Any>("Quarter1", 24.13)
        val object6 = arrayOf<Any>("Quarter2", 17.2)
        val object7 = arrayOf<Any>("Quarter3", 8.11)
        val object8 = arrayOf<Any>("Quarter4", 5.33)

        val series_list1 = ArrayList<Any>()
        series_list1.add(object5)
        series_list1.add(object6)
        series_list1.add(object7)
        series_list1.add(object8)

        series3.data =
            ArrayList(series_list1)

        val series4 = HIColumn()
        series4.name = "Secundrabad"
        series4.id = "Firefox"

        val object9 = arrayOf<Any>("Quarter1", 24.13)
        val object10 = arrayOf<Any>("Quarter2", 17.2)
        val object11 = arrayOf<Any>("Quarter3", 8.11)
        val object12 = arrayOf<Any>("Quarter4", 5.33)

        val series_list2 = ArrayList<Any>()
        series_list2.add(object9)
        series_list2.add(object10)
        series_list2.add(object11)
        series_list2.add(object12)

        series4.data =
            ArrayList(series_list2)


        val series5 = HIColumn()
        series5.name = "Kakinada"
        series5.id = "Safari"

        val object13 = arrayOf<Any>("Quarter1", 24.13)
        val object14= arrayOf<Any>("Quarter2", 17.2)
        val object15 = arrayOf<Any>("Quarter3", 8.11)
        val object16 = arrayOf<Any>("Quarter4", 5.33)

        val series_list3 = ArrayList<Any>()
        series_list3.add(object13)
        series_list3.add(object14)
        series_list3.add(object15)
        series_list3.add(object16)

        series5.data =
            ArrayList(series_list3)


        val seriesList = ArrayList<HISeries>()

        seriesList.add(series2)
        seriesList.add(series3)
        seriesList.add(series4)
        seriesList.add(series5)

        val plotoptions = HIPlotOptions()
        plotoptions.series = HISeries()
        plotoptions.series.events = HIEvents()
        plotoptions.series.point = HIPoint()
        plotoptions.series.point.events = HIEvents()
        plotoptions.series.point.events.click = HIFunction(
            HIConsumer { f: HIChartContext ->
                val t = Toast.makeText(
                    this,
                    "X value [ " + f.getProperty("x") + " ]; category: " + f.getProperty("category"),
                    Toast.LENGTH_SHORT
                )
                t.show()
            }, arrayOf("x", "category")
        )
        options.plotOptions = plotoptions


        drilldown.series = ArrayList(seriesList)
        options.drilldown = drilldown


        chartView.setOptions(options);

    }
}