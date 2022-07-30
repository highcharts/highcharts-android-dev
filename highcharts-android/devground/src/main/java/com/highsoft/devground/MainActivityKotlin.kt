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

        val options = HIOptions()

        val chart = HIChart()
        chart.type = "column"
        options.chart = chart

        val yAxis = HIYAxis()

        val plotLine = HIPlotLines()
        plotLine.value = 55.0
        plotLine.width = 2
        plotLine.color = "red"
        yAxis.plotLines = arrayListOf(plotLine)

        options.yAxis = arrayListOf(yAxis)

        val series = HIColumn()
        series.data = arrayListOf(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)
        options.series = arrayListOf(series)

        chartView.options = options

    }
}