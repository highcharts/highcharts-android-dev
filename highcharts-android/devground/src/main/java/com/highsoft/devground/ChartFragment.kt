package com.highsoft.devground

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.highsoft.devground.databinding.FragmentChartBinding
import com.highsoft.highcharts.common.hichartsclasses.HIChart
import com.highsoft.highcharts.common.hichartsclasses.HICredits
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels
import com.highsoft.highcharts.common.hichartsclasses.HIExporting
import com.highsoft.highcharts.common.hichartsclasses.HIHover
import com.highsoft.highcharts.common.hichartsclasses.HIInactive
import com.highsoft.highcharts.common.hichartsclasses.HILegend
import com.highsoft.highcharts.common.hichartsclasses.HIOptions
import com.highsoft.highcharts.common.hichartsclasses.HIPie
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions
import com.highsoft.highcharts.common.hichartsclasses.HISelect
import com.highsoft.highcharts.common.hichartsclasses.HISeries
import com.highsoft.highcharts.common.hichartsclasses.HIStates
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle
import com.highsoft.highcharts.common.hichartsclasses.HITitle
import com.highsoft.highcharts.common.hichartsclasses.HITooltip
import java.util.Collections


class ChartFragment : Fragment() {
    private var _binding: FragmentChartBinding? = null
    private val binding get() = _binding!!

    private lateinit var options: HIOptions
    private lateinit var hiChart: HIChart
    private lateinit var series: HISeries

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChartBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpHiChart()
        prepareHiChartData()
    }

    private fun setUpHiChart() {
        hiChart = HIChart()
        options = HIOptions()

        series = HISeries()
        series.name = "test name"
        series.id = "test id"

        hiChart.type = "pie"

        options.exporting = HIExporting()
        options.exporting.enabled = false

        val legend = HILegend()
        legend.enabled = false
        options.legend = legend

        val tooltip = HITooltip()
        tooltip.enabled = false
        options.tooltip = tooltip

        val credits = HICredits()
        credits.enabled = false
        options.credits = credits

        val states = HIStates()
        states.select = HISelect()
        states.select.enabled = false
        states.inactive = HIInactive()
        states.inactive.enabled = false
        states.hover = HIHover()
        states.hover.enabled = false
        series.allowPointSelect = false
        series.states = states

        val plotOptions = HIPlotOptions()
        plotOptions.pie = HIPie()
        plotOptions.pie.innerSize = "80%"
        plotOptions.pie.borderWidth = 0

        plotOptions.series = HISeries()
        val dataLabels = HIDataLabels()
        dataLabels.enabled = false
        plotOptions.series.dataLabels = kotlin.collections.ArrayList(listOf(dataLabels))

        options.chart = hiChart
        options.plotOptions = plotOptions
        options.series = ArrayList(Collections.singletonList(series))
        binding.hc.options = options
        binding.hc.redraw()
    }

    private fun prepareHiChartData() {
        val title = HITitle()
        title.text = "HI"
        title.verticalAlign = "middle"
        title.y = 7
        title.floating = true
        options.title = title

        val subTitle = HISubtitle()
        subTitle.text = "test"
        subTitle.verticalAlign = "middle"
        subTitle.y = 40
        subTitle.floating = true
        options.subtitle = subTitle

        val object1 = arrayOf<Any>(24.13)
        val object2 = arrayOf<Any>(17.2)
        val object3 = arrayOf<Any>(8.11)
        val object4 = arrayOf<Any>(5.33)
        val object5 = arrayOf<Any>(1.06)
        val object6 = arrayOf<Any>(0.5)

        series.data = ArrayList(
            listOf(
                object1,
                object2,
                object3,
                object4,
                object5,
                object6
            )
        )

        binding.hc.update(options)
        binding.hc.redraw()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ChartFragment"
        fun newInstance() = ChartFragment()
    }
}