package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.core.HIChartView;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HashMap<String, Object> pureOptions = new HashMap<>();

        String jsonStr = "{\n" +
                "  \"title\": \"\",\n" +
                "  \"credits\": {\n" +
                "    \"enabled\": false\n" +
                "  },\n" +
                "  \"chart\": {\n" +
                "    \"height\": \"30%\",\n" +
                "    \"style\": {\n" +
                "      \"fontFamily\": \"FrutigerLTPro, Helvetica, sans-serif\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"xAxis\": {\n" +
                "    \"type\": \"datetime\",\n" +
                "    \"dateTimeLabelFormats\": {\n" +
                "      \"week\": \"%B\",\n" +
                "      \"month\": \"%B %Y\",\n" +
                "      \"year\": \"%Y\"\n" +
                "    },\n" +
                "    \"lineColor\": \"#91e6f0\",\n" +
                "    \"endOnTick\": false,\n" +
                "    \"tickLength\": 0,\n" +
                "    \"tickmarkPlacement\": \"on\",\n" +
                "    \"crosshair\": {\n" +
                "      \"dashStyle\": \"Dash\",\n" +
                "      \"color\": \"#785bec\",\n" +
                "      \"zIndex\": 2\n" +
                "    },\n" +
                "    \"labels\": {\n" +
                "      \"step\": 2,\n" +
                "      \"y\": 30,\n" +
                "      \"useHTML\": true,\n" +
                "      \"align\": \"center\",\n" +
                "      \"style\": {\n" +
                "        \"color\": \"#411f99\",\n" +
                "        \"fontSize\": \"14px\",\n" +
                "        \"textOverflow\": \"none\"\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"yAxis\": {\n" +
                "    \"title\": \"\",\n" +
                "    \"startOnTick\": false,\n" +
                "    \"endOnTick\": false,\n" +
                "    \"gridLineColor\": \"#91e6f0\",\n" +
                "    \"opposite\": true,\n" +
                "    \"tickAmount\": 5,\n" +
                "    \"offset\": 0,\n" +
                "    \"labels\": {\n" +
                "      \"step\": 2,\n" +
                "      \"useHTML\": true,\n" +
                "      \"align\": \"left\",\n" +
                "      \"style\": {\n" +
                "        \"padding\": \"0px 5px\",\n" +
                "        \"color\": \"#411f99\",\n" +
                "        \"fontWeight\": \"bold\",\n" +
                "        \"fontSize\": \"14px\",\n" +
                "        \"backgroundColor\": \"rgba(255, 255, 255, 0.7)\"\n" +
                "      },\n" +
                "      \"padding\": 20\n" +
                "    }\n" +
                "  },\n" +
                "  \"tooltip\": {\n" +
                "    \"xDateFormat\": \"%d.%m.%Y\",\n" +
                "    \"backgroundColor\": \"#785bec\",\n" +
                "    \"headerFormat\": \"<span style=\\\"background:white;color:#411f99;font-weight:bold;font-size:12px;padding:2px 5px;border-radius:5px;\\\">{series.name}</span> {point.key}\",\n" +
                "    \"pointFormat\": \"<br><span style=\\\"margin-top:3px; display:block;font-weight:bold;font-size:15px\\\">CHF {point.y}</span>\",\n" +
                "    \"borderWidth\": 0,\n" +
                "    \"crosshairs\": true,\n" +
                "    \"shadow\": false,\n" +
                "    \"borderRadius\": 5,\n" +
                "    \"useHTML\": true,\n" +
                "    \"style\": {\n" +
                "      \"color\": \"white\",\n" +
                "      \"fontSize\": \"14px\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"plotOptions\": {\n" +
                "    \"area\": {\n" +
                "      \"color\": \"#00c2d4\",\n" +
                "      \"fillColor\": \"rgba(233, 250, 255, 0.73)\",\n" +
                "      \"fillOpacity\": 1\n" +
                "    },\n" +
                "    \"series\": {\n" +
                "      \"marker\": {\n" +
                "        \"enabled\": true,\n" +
                "        \"fillColor\": \"#FFFFFF\",\n" +
                "        \"lineWidth\": 4,\n" +
                "        \"lineColor\": \"#785bec\"\n" +
                "      },\n" +
                "      \"states\": {\n" +
                "        \"inactive\": {\n" +
                "          \"opacity\": 1\n" +
                "        },\n" +
                "        \"hover\": {\n" +
                "          \"lineWidth\": 2,\n" +
                "          \"halo\": {\n" +
                "            \"size\": 0\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"series\": [\n" +
                "    {\n" +
                "      \"type\": \"area\",\n" +
                "      \"marker\": {\n" +
                "        \"enabled\": false\n" +
                "      },\n" +
                "      \"tooltip\": {\n" +
                "        \"headerFormat\": \"{point.key}\"\n" +
                "      },\n" +
                "      \"name\": \"Wert\",\n" +
                "      \"data\": [\n" +
                "        [\n" +
                "          1.62389E12,\n" +
                "          48872.0\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62397E12,\n" +
                "          49003.17\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62423E12,\n" +
                "          48555.33\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62432E12,\n" +
                "          48868.86\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62441E12,\n" +
                "          49092.65\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62449E12,\n" +
                "          48959.05\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62458E12,\n" +
                "          49283.68\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62484E12,\n" +
                "          49390.87\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62492E12,\n" +
                "          49462.44\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62501E12,\n" +
                "          49536.66\n" +
                "        ],\n" +
                "        [\n" +
                "          1.6251E12,\n" +
                "          49456.82\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62518E12,\n" +
                "          49610.27\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62544E12,\n" +
                "          49754.84\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62553E12,\n" +
                "          49700.05\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62562E12,\n" +
                "          49659.4\n" +
                "        ],\n" +
                "        [\n" +
                "          1.6257E12,\n" +
                "          49880.23\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62579E12,\n" +
                "          49229.84\n" +
                "        ],\n" +
                "        [\n" +
                "          1.62968E12,\n" +
                "          50341.59\n" +
                "        ],\n" +
                "        [\n" +
                "          1.63054E12,\n" +
                "          51171.43\n" +
                "        ],\n" +
                "        [\n" +
                "          1.63115E12,\n" +
                "          50991.41\n" +
                "        ],\n" +
                "        [\n" +
                "          1.63175E12,\n" +
                "          50632.27\n" +
                "        ]\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"scatter\",\n" +
                "      \"marker\": {\n" +
                "        \"enabled\": true,\n" +
                "        \"symbol\": \"arrow-up\"\n" +
                "      },\n" +
                "      \"name\": \"Einzahlung\",\n" +
                "      \"data\": []\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"scatter\",\n" +
                "      \"marker\": {\n" +
                "        \"enabled\": true,\n" +
                "        \"symbol\": \"arrow-down\"\n" +
                "      },\n" +
                "      \"name\": \"Auszahlung\",\n" +
                "      \"data\": []\n" +
                "    }\n" +
                "  ],\n" +
                "  \"responsive\": {\n" +
                "    \"rules\": [\n" +
                "      {\n" +
                "        \"condition\": {\n" +
                "          \"maxWidth\": 800\n" +
                "        },\n" +
                "        \"chartOptions\": {\n" +
                "          \"chart\": {\n" +
                "            \"height\": \"50%\"\n" +
                "          },\n" +
                "          \"yAxis\": {\n" +
                "            \"opposite\": false,\n" +
                "            \"labels\": {\n" +
                "              \"align\": \"right\"\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"condition\": {\n" +
                "          \"maxWidth\": 500\n" +
                "        },\n" +
                "        \"chartOptions\": {\n" +
                "          \"chart\": {\n" +
                "            \"height\": \"75%\"\n" +
                "          },\n" +
                "          \"yAxis\": {\n" +
                "            \"offset\": -25,\n" +
                "            \"labels\": {\n" +
                "              \"align\": \"left\",\n" +
                "              \"style\": {\n" +
                "                \"color\": \"#00c2d4\"\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"xAxis\": {\n" +
                "            \"dateTimeLabelFormats\": {\n" +
                "              \"week\": \"%b\",\n" +
                "              \"month\": \"%b %y\",\n" +
                "              \"year\": \"%Y\"\n" +
                "            },\n" +
                "            \"labels\": {\n" +
                "              \"step\": 0\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> jsonOptions = new Gson().fromJson(jsonStr, mapType);

//        chartView.loadJSONOptions(new HashMap<>(jsonOptions));

        findViewById(R.id.btn).setOnClickListener(view -> {
            chartView.loadJSONOptions(new HashMap<>(jsonOptions));
            chartView.invalidate();
        });
    }
}
