package com.highsoft.devground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.highsoft.highcharts.common.HIColor
import com.highsoft.highcharts.common.HIGradient
import com.highsoft.highcharts.common.HIStop
import com.highsoft.highcharts.common.hichartsclasses.*
import com.highsoft.highcharts.core.*
import java.math.BigDecimal
import java.util.*
import kotlin.collections.HashMap


class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val button = findViewById<Button>(R.id.btn)

        val chartView = findViewById<HIChartView>(R.id.hc)

        val options = HIOptions()

        val accessibility = HIAccessibility().apply { enabled = false }
        options.accessibility = accessibility

        val credits = HICredits().apply { enabled = false }
        options.credits = credits

        val seriesData = arrayListOf(4,5,-2,-4,5,6,-1,-3,2)
        val series = HIArea().apply {
            allowPointSelect = false
            this.threshold = 0
            val zonesList = ArrayList<HIZones>()
            label = HILabel().apply { enabled = false }
            zoneAxis = "x"
            data = ArrayList<Int>().apply {
                seriesData.forEachIndexed { index, amount ->
                    add(amount)
                    marker = HIMarker().apply { this.symbol = "square" }
                }
            }
            zonesList.add(HIZones().apply {
                value = 5
                this.fillColor = HIColor.initWithName("red")
            })
            zonesList.add(HIZones().apply {
                value = 10
                this.fillColor = HIColor.initWithName("blue")
            })
            zones = zonesList

        }
        options.series = arrayListOf(series)

        chartView.options = options
    }

//    fun addPoints(datas: ChartMonthlyStat) {
//        seriesList.add(
//            HIArea().apply {
//                allowPointSelect = false
//                this.threshold = 0
//                val zonesList = ArrayList<HIZones>()
//                label = HILabel().apply { enabled = false }
//                zoneAxis = "x"
//                data = ArrayList<BigDecimal>().apply {
//                    datas.values.forEachIndexed { index, amount ->
//                        add(amount)
//                        zonesList.add(HIZones().apply {
//                            this.fillColor =
//                                if (amount < BigDecimal(0)) getNegativeAreaColor() else getAreaColor()
//                            color = this@InbankChartTrendView.getLineColor()
//                            value = amount
//                            zoneAxis = "x"
//                        })
//                        zones = zonesList
//                        marker = HIMarker().apply { this.symbol = "square" }
//                    }
//                }
//            }
//        )
//    }
}