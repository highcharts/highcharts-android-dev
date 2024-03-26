package com.highsoft.devground

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.highsoft.devground.databinding.FragmentChartBinding
import com.highsoft.highcharts.common.hichartsclasses.HIChart
import com.highsoft.highcharts.common.hichartsclasses.HIColumn
import com.highsoft.highcharts.common.hichartsclasses.HICrosshair
import com.highsoft.highcharts.common.hichartsclasses.HIOptions
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle
import com.highsoft.highcharts.common.hichartsclasses.HITitle
import com.highsoft.highcharts.common.hichartsclasses.HITooltip
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis
import java.util.Arrays


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
        binding.container.setOnClickListener {
            binding.hc.options.xAxis[0].setExtremes(6,12)
        }
        val chart = HIChart().apply {
            scrollablePlotArea = HIScrollablePlotArea().apply {
                minWidth = 1000
                scrollPositionX = 1
            }
        }
        val options = HIOptions()
        chart.setType("column")
        options.setChart(chart)

        val title = HITitle()
        title.setText("Monthly Average Rainfall")
        options.setTitle(title)

        val subtitle = HISubtitle()
        subtitle.setText("Source: WorldClimate.com")
        options.setSubtitle(subtitle)

        val xAxis = HIXAxis()
        val categoriesList = arrayOf(
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        )
        //xAxis.min = 10
        xAxis.setCategories(ArrayList(Arrays.asList(*categoriesList)))
        xAxis.setCrosshair(HICrosshair())
        options.setXAxis(object : ArrayList<HIXAxis?>() {
            init {
                add(xAxis)
            }
        })

        val yAxis = HIYAxis()
        yAxis.setMin(0)
        yAxis.setTitle(HITitle())
        yAxis.title.setText("Rainfall (mm)")
        options.setYAxis(object : ArrayList<HIYAxis?>() {
            init {
                add(yAxis)
            }
        })

        val tooltip = HITooltip()
        tooltip.setHeaderFormat("<span style=\"font-size:10px\">{point.key}</span><table>")
        tooltip.setPointFormat("<tr><td style=\"color:{series.color};padding:0\">{series.name}: </td><td style=\"padding:0\"><b>{point.y:.1f} mm</b></td></tr>")
        tooltip.setFooterFormat("</table>")
        tooltip.setShared(true)
        tooltip.setUseHTML(true)
        options.setTooltip(tooltip)

        val plotOptions = HIPlotOptions()
        plotOptions.setColumn(HIColumn())
        plotOptions.column.setPointPadding(0.2)
        plotOptions.column.setBorderWidth(0)
        options.setPlotOptions(plotOptions)

        val series1 = HIColumn()
        series1.setName("Tokyo")
        val series1_data = arrayOf<Number>(
            49.9,
            71.5,
            106.4,
            129.2,
            144.0,
            176.0,
            135.6,
            148.5,
            216.4,
            194.1,
            95.6,
            54.4
        )
        series1.setData(ArrayList(listOf(*series1_data)))
        val series2 = HIColumn()
        series2.setName("New York")
        val series2_data = arrayOf<Number>(
            83.6,
            78.8,
            98.5,
            93.4,
            106.0,
            84.5,
            105.0,
            104.3,
            91.2,
            83.5,
            106.6,
            92.3
        )
        series2.setData(ArrayList(Arrays.asList(*series2_data)))
        val series3 = HIColumn()
        series3.setName("London")
        val series3_data =
            arrayOf<Number>(48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2)
        series3.setData(ArrayList(listOf(*series3_data)))
        val series4 = HIColumn()
        series4.setName("Berlin")
        val series4_data =
            arrayOf<Number>(42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1)
        series4.setData(ArrayList(listOf(*series4_data)))
        options.setSeries(ArrayList(listOf(series1, series2, series3, series4)))

        binding.hc.setOptions(options)
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