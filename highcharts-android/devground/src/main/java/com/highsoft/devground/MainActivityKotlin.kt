package com.highsoft.devground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.highsoft.highcharts.common.HIColor
import com.highsoft.highcharts.common.HIGradient
import com.highsoft.highcharts.common.HIStop
import com.highsoft.highcharts.common.hichartsclasses.*
import com.highsoft.highcharts.core.*
import java.util.*
import kotlin.collections.HashMap


class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val button = findViewById<Button>(R.id.btn)

        val chartView = findViewById<HIChartView>(R.id.hc)

        val options = HIOptions()

        val plotOptions = HIPlotOptions().apply {
            spline = HISpline().apply {
                color = HIColor.initWithRGB(10,10,10)
                type = "spline"
            }
        }
        options.plotOptions = plotOptions

        val yAxis = HIYAxis().apply {
            lineColor = HashMap<String, HIColor>().put("a", HIColor.initWithRGBA(10, 10, 10, 0.3))
            title = HITitle().apply { text = "mg/dL" }
            lineWidth = 1
            labels = HILabels().apply {
                x = -5
                style = HICSSObject().apply {
                    color = HIColor.initWithRGB(10, 10, 10)
                    textOutline = "10px Arial"
                }
            }
        }
        options.yAxis = arrayListOf(yAxis)

        val xAxis = HIXAxis().apply {
            showLastLabel = true
            min = 1675231200000
            max = 1677247541726
            tickInterval = 86400000
            tickColor = HashMap<String, HIColor>().put("a", HIColor.initWithRGBA(10, 10, 10, 0.0))
            showFirstLabel = true
            lineColor = HashMap<String, HIColor>().put("a", HIColor.initWithRGBA(10, 10, 10, 0.3))
            labels = HILabels().apply {
                formatter = HIFunction("function () { const options = { month: '2-digit', day: '2-digit' }; return new Date(this.value).toLocaleDateString(undefined, options) }")
                style = HICSSObject().apply {
                    color = HIColor.initWithRGB(10,10,10)
                    textOutline = "10px Arial"
                }
            }
        }
        options.xAxis = arrayListOf(xAxis)

        val accessibility = HIAccessibility().apply { enabled = false }
        options.accessibility = accessibility

        val credits = HICredits().apply { enabled = false }
        options.credits = credits

        val series = HISeries().apply {
            data = arrayListOf(
                listOf(
                    1677247539225,
                    112.0
                ),
                listOf(
                    1677161139227,
                    113.0
                ),
                listOf(
                    1677074739227,
                    114.0
                )
            )
            color = HIColor.initWithHexValue("6B81FC")
            marker = HIMarker().apply { enabled = true }
            name = "Glucose"
            tooltip = HITooltip().apply {
                headerFormat = ""
                pointFormatter = HIFunction("function() { const options = { month: '2-digit', day: '2-digit', year: 'numeric' }; return 'Glucose<b>'+this.y+'</b><br /><br />('+new Date(this.x).toLocaleDateString(undefined, options)+')' }")
                valueSuffix = " mg/dL"
            }
            type = "spline"
            showInLegend = true
        }
        options.series = arrayListOf(series)

        val tooltip = HITooltip().apply { headerFormat = "" }
        options.tooltip = tooltip

        val time = HITime().apply {
            timezoneOffset = -21600000
            useUTC = false
        }
        options.time = time

        val title = HITitle().apply {
            y = 16
            style = HICSSObject().apply {
                fontFamily = "Arial"
                color = HIColor.initWithRGBA(10,10,10,0.6)
                fontSize = "14px"
                text = ""
                align = "left"
            }
        }
        options.title = title

        val chart = HIChart().apply {
            renderTo = "container"
            borderRadius = 6
            type = "spline"
        }
        options.chart = chart

        chartView.options = options
    }
}