package com.highsoft.devground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.highsoft.highcharts.common.HIColor
import com.highsoft.highcharts.common.hichartsclasses.HIBoost
import com.highsoft.highcharts.common.hichartsclasses.HIBubble
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject
import com.highsoft.highcharts.common.hichartsclasses.HIChart
import com.highsoft.highcharts.common.hichartsclasses.HICredits
import com.highsoft.highcharts.common.hichartsclasses.HIData
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels
import com.highsoft.highcharts.common.hichartsclasses.HIExporting
import com.highsoft.highcharts.common.hichartsclasses.HILayoutAlgorithm
import com.highsoft.highcharts.common.hichartsclasses.HILegend
import com.highsoft.highcharts.common.hichartsclasses.HIMarker
import com.highsoft.highcharts.common.hichartsclasses.HIOptions
import com.highsoft.highcharts.common.hichartsclasses.HIPackedbubble
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions
import com.highsoft.highcharts.common.hichartsclasses.HISeries
import com.highsoft.highcharts.common.hichartsclasses.HIStyle
import com.highsoft.highcharts.common.hichartsclasses.HITitle
import com.highsoft.highcharts.common.hichartsclasses.HITooltip
import com.highsoft.highcharts.core.HIChartView


class MainActivityKotlin : AppCompatActivity() {

    data class BubbleDataObj(
        var name: String? = null,
        var value: Int = 0
    )

    private fun getDataLabelList(bubbleData: List<BubbleDataObj>): ArrayList<HIData> {
        val smallFont = "10px"
        val mediumFont = "14px"
        val largeFont = "18px"

        return ArrayList<HIData>().apply {
            for (data in bubbleData) {
                add(HIData().apply {
                    name = data.name
                    value = data.value

                    dataLabels = HIDataLabels().apply {
                        style = HIStyle().apply {
                            color = "black"
                            fontSize = when {
                                data.value < 4 -> smallFont
                                data.value < 6 -> mediumFont
                                else -> largeFont
                            }
                        }
                    }
                })
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_test)

        val chartView = findViewById<HIChartView>(R.id.hc)

        val highChartOptions = HIOptions()

        val xd = HICSSObject()
        xd.color = "#fff"

        val chart = HIChart()
        chart.type = "packedbubble"
        highChartOptions.chart = chart

        val tooltip = HITooltip()
        tooltip.enabled = false
        highChartOptions.tooltip = tooltip

        val title = HITitle()
        title.text = String()
        highChartOptions.title = title

        val legend = HILegend()
        legend.enabled = false
        highChartOptions.legend = legend

        val boost = HIBoost()
        boost.enabled = false
        boost.useGPUTranslations = false
        boost.usePreallocated = false
        highChartOptions.boost = boost

        val exporting = HIExporting()
        exporting.enabled = false
        highChartOptions.exporting = exporting

        val credits = HICredits()
        credits.enabled = false
        highChartOptions.credits = credits

        val dataList1 = listOf(
            BubbleDataObj(name = "Data1", value = 1),
            BubbleDataObj(name = "Data2", value = 2),
            BubbleDataObj(name = "Data3", value = 3),
            BubbleDataObj(name = "Data4", value = 4)
        )

        val dataList2 = listOf(
            BubbleDataObj(name = "Data5", value = 5),
            BubbleDataObj(name = "Data6", value = 6),
            BubbleDataObj(name = "Data6", value = 7)
        )

        val dataListPositive = getDataLabelList(dataList1)
        val dataListNegative = getDataLabelList(dataList2)

        //++++++++++ Positive Series
        val seriesPositive = HISeries()
        seriesPositive.enableMouseTracking = false
        seriesPositive.data = dataListPositive
        seriesPositive.pointPlacement = 1.4
        seriesPositive.color = HIColor.initWithHexValue("ffffff")

        val markerPositive = HIMarker()
        markerPositive.fillColor = HIColor.initWithHexValue("22DDBB")
        markerPositive.fillOpacity = 1
        markerPositive.lineWidth = 0
        markerPositive.lineColor = "white"
        seriesPositive.marker = markerPositive


        //---------- Negative Series
        val seriesNegative = HISeries()
        seriesNegative.enableMouseTracking = false
        seriesNegative.data = dataListNegative
        seriesNegative.pointPlacement = 0.1
        seriesNegative.color = HIColor.initWithHexValue("ffffff")

        val markerNegative = HIMarker()
        markerNegative.fillColor = HIColor.initWithHexValue("FCE5F4")
        markerNegative.fillOpacity = 1
        markerNegative.lineWidth = 0
        markerNegative.lineColor = "white"
        seriesNegative.marker = markerNegative

        highChartOptions.series = arrayListOf(seriesPositive, seriesNegative)

        val packedBubble = HIPackedbubble()
        packedBubble.minSize = "70%"
        packedBubble.maxSize = "112%"

        val layoutAlgorithm = HILayoutAlgorithm()
        layoutAlgorithm.gravitationalConstant = 0.005
        layoutAlgorithm.splitSeries = false.toString()
        layoutAlgorithm.bubblePadding = 10
        layoutAlgorithm.parentNodeLimit = true
        layoutAlgorithm.enableSimulation = false
        layoutAlgorithm.seriesInteraction = true
        layoutAlgorithm.dragBetweenSeries = false

        packedBubble.layoutAlgorithm = layoutAlgorithm

        val dataLabels = HIDataLabels()
        dataLabels.enabled = true
        dataLabels.useHTML = true
        dataLabels.format = "<div style=\"text-align: center;\">" +
                "<b>{point.name}</b>" +
                "</div>" +
                "<div style=\"text-align: center;\">" +
                "<b>{point.value}</b>" +
                "</div>"
        dataLabels.align = "center"
        dataLabels.verticalAlign = "middle"
        dataLabels.inside = true
        dataLabels.style = HIStyle()

        packedBubble.dataLabels = arrayListOf(dataLabels)
        val plotOptions = HIPlotOptions()
        plotOptions.packedbubble = packedBubble
        highChartOptions.plotOptions = plotOptions

        chartView.options = highChartOptions
    }
}