package com.highsoft.devground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.highsoft.highcharts.common.hichartsclasses.*
import com.highsoft.highcharts.core.HIChartView
import com.highsoft.highcharts.core.HIFoundation
import java.util.*

class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val chartView = findViewById<HIChartView>(R.id.hc)

        val button = findViewById<Button>(R.id.btn)

        val options = HIOptions()

        val column = HIColumn()
        column.data = ArrayList(listOf(29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))
        options.series = ArrayList(listOf(column))

//        val exporting = HIExporting()
//
//        val hashMap = HashMap<String, HIFoundation>()
//        val series = HISeries()
//        val dataLabelsList = ArrayList<HIDataLabels>()
//        val dataLabels = HIDataLabels()
//        dataLabels.enabled = true
//        dataLabels.format = "{y:.2f} M"
//        dataLabelsList.add(dataLabels)
//        series.dataLabels = dataLabelsList
//        hashMap["series"] = series
//
//        exporting.chartOptions = hashMap
//
//        options.exporting = exporting
//

        val myhashmap= HashMap<String,HIFoundation>()
        myhashmap["series"] = HISeries().apply {
            dataLabels= arrayListOf(HIDataLabels().apply {
                enabled=true
                format="{y:.2f} M"
            })
        }

        options.exporting=HIExporting().apply {
            enabled=true
            chartOptions=myhashmap
        }

        chartView.options = options



        button.setOnClickListener {
//            chartView.options = options
//            val subTitle = HISubtitle();
//            subTitle.text = "YEAAAAAH"
            val colNew = HIColumn()
            colNew.data = ArrayList(listOf(4.5, 5.6, 7.8, 12.5, 18.9))
            options.series = ArrayList(listOf(colNew))
            val newOptions = options
            newOptions.series = ArrayList(listOf(colNew))
            chartView.options = newOptions
            chartView.redraw()
//            chartView.update(newOptions, true)
        }

    }
}