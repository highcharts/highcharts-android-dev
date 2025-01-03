package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("packedbubble");
        chart.setHeight("100%");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Carbon emissions around the world (2014)");
        options.setTitle(title);

        HITooltip tooltip = new HITooltip();
        tooltip.setUseHTML(true);
        tooltip.setPointFormat("<b>{point.name}:</b> {point.y}m CO<sub>2</sub>");
        options.setTooltip(tooltip);

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setPackedbubble(new HIPackedbubble());
        plotoptions.getPackedbubble().setDataLabels(new HIDataLabels());
        plotoptions.getPackedbubble().getDataLabels().setEnabled(true);
        plotoptions.getPackedbubble().getDataLabels().setFormat("{point.name}"); 
        plotoptions.getPackedbubble().getDataLabels().setFilter(new HIFilter());
        plotoptions.getPackedbubble().getDataLabels().getFilter().setProperty("y");
        plotoptions.getPackedbubble().getDataLabels().getFilter().setOperator(">"); 
        plotoptions.getPackedbubble().getDataLabels().getFilter().setValue(250);
        plotoptions.getPackedbubble().getDataLabels().setStyle(new HICSSObject());
        plotoptions.getPackedbubble().getDataLabels().getStyle().setColor("black");
        plotoptions.getPackedbubble().getDataLabels().getStyle().setTextOutline("none");
        plotoptions.getPackedbubble().getDataLabels().getStyle().setFontWeight("normal");
        options.setPlotOptions(plotoptions);

        HIPackedbubble packedbubble1 = new HIPackedbubble();
        packedbubble1.setName("Europe");
        HIData data11 = new HIData();
        data11.setName("Germany");
        data11.setValue(767.1);
        HIData data12 = new HIData();
        data12.setName("Croatia");
        data12.setValue(20.7);
        HIData data13= new HIData();
        data13.setName("Belgium");
        data13.setValue(97.2);
        HIData data14 = new HIData();
        data14.setName("Czech Republic");
        data14.setValue(111.7);
        HIData data15 = new HIData();
        data15.setName("Netherlands");
        data15.setValue(158.1);
        HIData data16 = new HIData();
        data16.setName("Spain");
        data16.setValue(241.6);
        HIData data17 = new HIData();
        data17.setName("Ukraine");
        data17.setValue(249.1);
        HIData data18 = new HIData();
        data18.setName("Poland");
        data18.setValue(298.1);
        HIData data19 = new HIData();
        data19.setName("France");
        data19.setValue(323.7);
        HIData data110 = new HIData();
        data110.setName("Romania");
        data110.setValue(78.3);
        HIData data111 = new HIData();
        data111.setName("United Kingdom");
        data111.setValue(415.4);
        HIData data112 = new HIData();
        data112.setName("Turkey");
        data112.setValue(353.2);
        HIData data113 = new HIData();
        data113.setName("Italy");
        data113.setValue(337.6);
        HIData data114 = new HIData();
        data114.setName("Greece");
        data114.setValue(71.1);
        HIData data115 = new HIData();
        data115.setName("Austria");
        data115.setValue(69.8);
        HIData data116 = new HIData();
        data116.setName("Belarus");
        data116.setValue(67.7);
        HIData data117 = new HIData();
        data117.setName("Serbia");
        data117.setValue(59.3);
        HIData data118 = new HIData();
        data118.setName("Finland");
        data118.setValue(54.8);
        HIData data119 = new HIData();
        data119.setName("Bulgaria");
        data119.setValue(51.2);
        HIData data120 = new HIData();
        data120.setName("Portugal");
        data120.setValue(48.3);
        HIData data121 = new HIData();
        data121.setName("Norway");
        data121.setValue(44.4);
        HIData data122 = new HIData();
        data122.setName("Sweden");
        data122.setValue(44.3);
        HIData data123 = new HIData();
        data123.setName("Hungary");
        data123.setValue(43.7);
        HIData data124 = new HIData();
        data124.setName("Switzerland");
        data124.setValue(40.2);
        HIData data125 = new HIData();
        data125.setName("Denmark");
        data125.setValue(40);
        HIData data126 = new HIData();
        data126.setName("Slovakia");
        data126.setValue(34.7);
        HIData data127 = new HIData();
        data127.setName("Ireland");
        data127.setValue(34.6);
        HIData data128 = new HIData();
        data128.setName("Croatia");
        data128.setValue(20.7);
        HIData data129 = new HIData();
        data129.setName("Estonia");
        data129.setValue(19.4);
        HIData data130 = new HIData();
        data130.setName("Slovenia");
        data130.setValue(16.7);
        HIData data131 = new HIData();
        data131.setName("Lithuania");
        data131.setValue(12.3);
        HIData data132 = new HIData();
        data132.setName("Luxembourg");
        data132.setValue(10.4);
        HIData data133 = new HIData();
        data133.setName("Macedonia");
        data133.setValue(9.5);
        HIData data134 = new HIData();
        data134.setName("Moldova");
        data134.setValue(7.8);
        HIData data135 = new HIData();
        data135.setName("Latvia");
        data135.setValue(7.5);
        HIData data136 = new HIData();
        data136.setName("Cyprus");
        data136.setValue(7.2);
        packedbubble1.setData(new ArrayList<>(Arrays.asList(data11, data12, data13, data14, data15, data16, data17, data18, data19, data110, data111, data112, data113, data114, data115, data116, data117, data118, data119, data120, data121, data122, data123, data124, data125, data126, data127, data128, data129, data130, data131, data132, data133, data134, data135, data136)));

        HIPackedbubble packedbubble2 = new HIPackedbubble();
        packedbubble2.setName("Africa");
        HIData data21 = new HIData();
        data21.setName("Senegal");
        data21.setValue(8.2);
        HIData data22 = new HIData();
        data22.setName("Cameroon");
        data22.setValue(9.2);
        HIData data23 = new HIData();
        data23.setName("Zimbabwe");
        data23.setValue(13.1);
        HIData data24 = new HIData();
        data24.setName("Ghana");
        data24.setValue(14.1);
        HIData data25 = new HIData();
        data25.setName("Kenya");
        data25.setValue(14.1);
        HIData data26 = new HIData();
        data26.setName("Sudan");
        data26.setValue(17.3);
        HIData data27 = new HIData();
        data27.setName("Tunisia");
        data27.setValue(24.3);
        HIData data28 = new HIData();
        data28.setName("Angola");
        data28.setValue(25);
        HIData data29 = new HIData();
        data29.setName("Libya");
        data29.setValue(50.6);
        HIData data210 = new HIData();
        data210.setName("Ivory Coast");
        data210.setValue(7.3);
        HIData data211 = new HIData();
        data211.setName("Morocco");
        data211.setValue(60.7);
        HIData data212 = new HIData();
        data212.setName("Ethiopia");
        data212.setValue(8.9);
        HIData data213 = new HIData();
        data213.setName("United Republic of Tanzania");
        data213.setValue(9.1);
        HIData data214 = new HIData();
        data214.setName("Nigeria");
        data214.setValue(93.9);
        HIData data215 = new HIData();
        data215.setName("South Africa");
        data215.setValue(392.7);
        HIData data216 = new HIData();
        data216.setName("Egypt");
        data216.setValue(225.1);
        HIData data217 = new HIData();
        data217.setName("Algeria");
        data217.setValue(141.5);
        packedbubble2.setData(new ArrayList<>(Arrays.asList(data21, data22, data23, data24, data25, data26, data27, data28, data29, data210, data211, data212, data213, data214, data215, data216, data217)));

        HIPackedbubble packedbubble3 = new HIPackedbubble();
        packedbubble3.setName("Oceania");
        HIData data31 = new HIData();
        data31.setName("Australia");
        data31.setValue(409.4);
        HIData data32 = new HIData();
        data32.setName("New Zealand");
        data32.setValue(34.1);
        HIData data33 = new HIData();
        data33.setName("Papua New Guinea");
        data33.setValue(7.1);
        packedbubble3.setData(new ArrayList<>(Arrays.asList(data31, data32, data33)));

        HIPackedbubble packedbubble4 = new HIPackedbubble();
        packedbubble4.setName("North America");
        HIData data41 = new HIData();
        data41.setName("Costa Rica");
        data41.setValue(7.6);
        HIData data42 = new HIData();
        data42.setName("Honduras");
        data42.setValue(8.4);
        HIData data43 = new HIData();
        data43.setName("Jamaica");
        data43.setValue(8.3);
        HIData data44 = new HIData();
        data44.setName("Panama");
        data44.setValue(10.2);
        HIData data45 = new HIData();
        data45.setName("Guatemala");
        data45.setValue(12);
        HIData data46 = new HIData();
        data46.setName("Dominican Republic");
        data46.setValue(23.4);
        HIData data47 = new HIData();
        data47.setName("Cuba");
        data47.setValue(30.2);
        HIData data48 = new HIData();
        data48.setName("USA");
        data48.setValue(5334.5);
        HIData data49 = new HIData();
        data49.setName("Canada");
        data49.setValue(566);
        HIData data410 = new HIData();
        data410.setName("Mexico");
        data410.setValue(456.3);
        packedbubble4.setData(new ArrayList<>(Arrays.asList(data41, data42, data43, data44, data45, data46, data47, data48, data49, data410)));

        HIPackedbubble packedbubble5 = new HIPackedbubble();
        packedbubble5.setName("South America");
        HIData data51 = new HIData();
        data51.setName("El Salvador");
        data51.setValue(7.2);
        HIData data52 = new HIData();
        data52.setName("Uruguay");
        data52.setValue(8.1);
        HIData data53 = new HIData();
        data53.setName("Bolivia");
        data53.setValue(17.8);
        HIData data54 = new HIData();
        data54.setName("Trinidad and Tobago");
        data54.setValue(34);
        HIData data55 = new HIData();
        data55.setName("Ecuador");
        data55.setValue(43);
        HIData data56 = new HIData();
        data56.setName("Chile");
        data56.setValue(78.6);
        HIData data57 = new HIData();
        data57.setName("Peru");
        data57.setValue(52);
        HIData data58 = new HIData();
        data58.setName("Colombia");
        data58.setValue(74.1);
        HIData data59 = new HIData();
        data59.setName("Brazil");
        data59.setValue(501.1);
        HIData data510 = new HIData();
        data510.setName("Argentina");
        data510.setValue(199);
        HIData data511 = new HIData();
        data511.setName("Venezuela");
        data511.setValue(195.2);
        packedbubble5.setData(new ArrayList<>(Arrays.asList(data51, data52, data53, data54, data55, data56, data57, data58, data59, data510, data511)));

        HIPackedbubble packedbubble6 = new HIPackedbubble();
        packedbubble6.setName("Asia");
        HIData data61 = new HIData();
        data61.setName("Nepal");
        data61.setValue(6.5);
        HIData data62 = new HIData();
        data62.setName("Georgia");
        data62.setValue(6.5);
        HIData data63 = new HIData();
        data63.setName("Brunei Darussalam");
        data63.setValue(7.4);
        HIData data64 = new HIData();
        data64.setName("Kyrgyzstan");
        data64.setValue(7.4);
        HIData data65 = new HIData();
        data65.setName("Afghanistan");
        data65.setValue(7.9);
        HIData data66 = new HIData();
        data66.setName("Myanmar");
        data66.setValue(9.1);
        HIData data67 = new HIData();
        data67.setName("Mongolia");
        data67.setValue(14.7);
        HIData data68 = new HIData();
        data68.setName("Sri Lanka");
        data68.setValue(16.6);
        HIData data69 = new HIData();
        data69.setName("Bahrain");
        data69.setValue(20.5);
        HIData data610 = new HIData();
        data610.setName("Yemen");
        data610.setValue(22.6);
        HIData data611 = new HIData();
        data611.setName("Jordan");
        data611.setValue(22.3);
        HIData data612 = new HIData();
        data612.setName("Lebanon");
        data612.setValue(21.1);
        HIData data613 = new HIData();
        data613.setName("Azerbaijan");
        data613.setValue(31.7);
        HIData data614 = new HIData();
        data614.setName("Singapore");
        data614.setValue(47.8);
        HIData data615 = new HIData();
        data615.setName("Hong Kong");
        data615.setValue(49.9);
        HIData data616 = new HIData();
        data616.setName("Syria");
        data616.setValue(52.7);
        HIData data617 = new HIData();
        data617.setName("DPR Korea");
        data617.setValue(59.9);
        HIData data618 = new HIData();
        data618.setName("Israel");
        data618.setValue(64.8);
        HIData data619 = new HIData();
        data619.setName("Turkmenistan");
        data619.setValue(70.6);
        HIData data620 = new HIData();
        data620.setName("Oman");
        data620.setValue(74.3);
        HIData data621 = new HIData();
        data621.setName("Qatar");
        data621.setValue(88.8);
        HIData data622 = new HIData();
        data622.setName("Philippines");
        data622.setValue(96.9);
        HIData data623 = new HIData();
        data623.setName("Kuwait");
        data623.setValue(98.6);
        HIData data624 = new HIData();
        data624.setName("Uzbekistan");
        data624.setValue(122.6);
        HIData data625 = new HIData();
        data625.setName("Iraq");
        data625.setValue(139.9);
        HIData data626 = new HIData();
        data626.setName("Pakistan");
        data626.setValue(158.1);
        HIData data627 = new HIData();
        data627.setName("Vietnam");
        data627.setValue(190.2);
        HIData data628 = new HIData();
        data628.setName("United Arab Emirates");
        data628.setValue(201.1);
        HIData data629 = new HIData();
        data629.setName("Malaysia");
        data629.setValue(227.5);
        HIData data630 = new HIData();
        data630.setName("Kazakhstan");
        data630.setValue(236.2);
        HIData data631 = new HIData();
        data631.setName("Thailand");
        data631.setValue(272);
        HIData data632 = new HIData();
        data632.setName("Taiwan");
        data632.setValue(276.7);
        HIData data633 = new HIData();
        data633.setName("Indonesia");
        data633.setValue(453);
        HIData data634 = new HIData();
        data634.setName("Saudi Arabia");
        data634.setValue(494.8);
        HIData data635 = new HIData();
        data635.setName("Japan");
        data635.setValue(1278.9);
        HIData data636 = new HIData();
        data636.setName("China");
        data636.setValue(10540.8);
        HIData data637 = new HIData();
        data637.setName("India");
        data637.setValue(2341.9);
        HIData data638 = new HIData();
        data638.setName("Russia");
        data638.setValue(1766.4);
        HIData data639 = new HIData();
        data639.setName("Iran");
        data639.setValue(618.2);
        HIData data640 = new HIData();
        data640.setName("Korea");
        data640.setValue(610.1);
        packedbubble6.setData(new ArrayList<>(Arrays.asList(data61, data62, data63, data64, data65, data66, data67, data68, data69, data610, data611, data612, data613, data614, data615, data616, data617, data618, data619, data620, data621, data622, data623, data624, data625, data626, data627, data628, data629, data630, data631, data632, data633, data634, data635, data636, data637, data638, data639, data640)));

        options.setSeries(new ArrayList<>(Arrays.asList(packedbubble1, packedbubble2, packedbubble3, packedbubble4, packedbubble5, packedbubble6)));

        HIResponsive responsive = new HIResponsive();
        HIRules rule = new HIRules();
        rule.setCondition(new HICondition());
        rule.getCondition().setMaxHeight(500);
        HashMap<String, HashMap<String,String>> ruleOptions = new HashMap<>();
        HashMap<String, String> legendRules = new HashMap<>();
        legendRules.put("align", "right");
        legendRules.put("verticalAlign", "middle");
        legendRules.put("layout", "vertical");
        ruleOptions.put("legend", legendRules);
        rule.setChartOptions(ruleOptions);
        responsive.setRules(new ArrayList<>(Collections.singletonList(rule)));
        options.setResponsive(responsive);

        chartView.setOptions(options);
    }
}

