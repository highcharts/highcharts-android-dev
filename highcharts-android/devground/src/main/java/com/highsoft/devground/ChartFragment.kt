package com.highsoft.devground

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.highsoft.devground.databinding.FragmentChartBinding
import com.highsoft.highcharts.common.hichartsclasses.HIBoost
import com.highsoft.highcharts.common.hichartsclasses.HIChart
import com.highsoft.highcharts.common.hichartsclasses.HIEvents
import com.highsoft.highcharts.common.hichartsclasses.HILegend
import com.highsoft.highcharts.common.hichartsclasses.HILine
import com.highsoft.highcharts.common.hichartsclasses.HIOptions
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle
import com.highsoft.highcharts.common.hichartsclasses.HITitle
import com.highsoft.highcharts.common.hichartsclasses.HITooltip
import com.highsoft.highcharts.common.hichartsclasses.HIZooming
import com.highsoft.highcharts.core.HIFunction


class ChartFragment : Fragment() {
    private var _binding: FragmentChartBinding? = null
    private val binding get() = _binding!!

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
    }

    private fun setUpHiChart() {

        val chart = HIChart()
        chart.setType("line")

        val options = HIOptions()

        chart.setType("line")
        chart.zooming = HIZooming().apply { type = "x" }
        chart.apply {
            scrollablePlotArea = HIScrollablePlotArea().apply {
                minHeight = 800
                scrollPositionX = 1
            }
        }
        options.setChart(chart)

        val boost = HIBoost()
        boost.setUseGPUTranslations(true)
        options.setBoost(boost)

        val title = HITitle()
        title.setText("Highcharts drawing 500 points")
        options.setTitle(title)

        val subtitle = HISubtitle()
        subtitle.setText("Using the Boost module")
        options.setSubtitle(subtitle)

        val tooltip = HITooltip()
        tooltip.setValueDecimals(2)
        options.setTooltip(tooltip)

        val line = HILine().apply {
            events = HIEvents().apply {
                legendItemClick = HIFunction {
                    "function() { return false; }"
                }
            }
        }
        line.setData(data())

        val legend = HILegend()
        legend.enabled = true

        line.setLineWidth(0.5)
        options.setSeries(ArrayList(listOf(line)))
        options.legend = legend

        binding.chart.setOptions(options)
    }

    private fun data(): ArrayList<Array<Number?>> {
        val dataList = ArrayList<Array<Number?>>()
        for (i in 0..50) {
            val random = Math.random() * 49 + 1
            val number = arrayOfNulls<Number>(2)
            number[0] = i
            number[1] = random
            dataList.add(number)
        }
        HITooltip()
        Log.d("info", "array Size:" + dataList.size)
        return dataList
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