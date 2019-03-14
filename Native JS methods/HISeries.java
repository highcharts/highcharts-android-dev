/**
 * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
 * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
 */
public void addPoint(HIData options){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "addPoint0");
    put("id", uuid);
    put("params", Collections.singletonList(options.getParams()));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
 * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
 * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
 */
public void addPoint(HIData options, boolean redraw){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "addPoint1");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
 * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
 * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
 * @param shift If true, a point is shifted off the start of the series as one is appended to the end.
 */
public void addPoint(HIData options, boolean redraw, boolean shift){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "addPoint2");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw, shift)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
 * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
 * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
 * @param shift If true, a point is shifted off the start of the series as one is appended to the end.
 * @param animation Whether to apply animation, and optionally animation configuration.
 */
public void addPoint(HIData options, boolean redraw, boolean shift, HIAnimationOptionsObject animation){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "addPoint3");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw, shift, animation)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Animate in the series. Called internally twice. First with the init parameter set to true, which sets up the initial state of the animation. Then when ready, it is called with the init parameter undefined, in order to perform the actual animation. After the second run, the function is removed.
 * @param init Initialize the animation.
 */
public void animate(boolean init){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "animate");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(init)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Draw the graph. Called internally when rendering line-like series types. The first time it generates the series.graph item and optionally other series-wide items like series.area for area charts. On subsequent calls these items are updated with new positions and attributes.
 */
public void drawGraph(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "drawGraph");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Draw the markers for line-like series types, and columns or other graphical representation for Highcharts.Point objects for other series types. The resulting element is typically stored as Highcharts.Point.graphic, and is created on the first call and updated and moved on subsequent calls.
 */
public void drawPoints(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "drawPoints");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Hide the series if visible. If the chart.ignoreHiddenSeries option is true, the chart is redrawn without this series.
 */
public void hide(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "hide");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Runs on mouse over the series graphical items.
 */
public void onMouseOver(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "onMouseOver");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Runs on mouse out of the series graphical items.
 */
public void onMouseOut() {
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "onMouseOut");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a series and optionally redraw the chart.
 */
public void remove(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "remove0");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a series and optionally redraw the chart.
 * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
 */
public void remove(boolean redraw){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "remove1");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a series and optionally redraw the chart.
 * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
 * @param animation Whether to apply animation, and optionally animation configuration.
 */
public void remove(boolean redraw, HIAnimationOptionsObject animation){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "remove2");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(redraw, animation)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a series and optionally redraw the chart.
 * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
 * @param animation Whether to apply animation, and optionally animation configuration.
 * @param withEvents Used internally, whether to fire the series remove event.
 */
public void remove(boolean redraw, HIAnimationOptionsObject animation, boolean withEvents){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "remove3");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(redraw, animation, withEvents)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
 * @param i The index of the point in the data array.
 */
public void removePoint(Number i){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "removePoint0");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(i)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
 * @param i The index of the point in the data array.
 * @param redraw Whether to redraw the chart after the point is added. When removing more than one point, it is highly recommended that the redraw option be set to false, and instead HIChartView redraw() is explicitly called after the adding of points is finished.
 */
public void removePoint(Number i, boolean redraw){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "removePoint1");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(i, redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}


/**
 * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
 * @param i The index of the point in the data array.
 * @param redraw Whether to redraw the chart after the point is added. When removing more than one point, it is highly recommended that the redraw option be set to false, and instead HIChartView redraw() is explicitly called after the adding of points is finished.
 * @param animation Whether and optionally how the series should be animated.
 */
public void removePoint(Number i, boolean redraw, HIAnimationOptionsObject animation){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "removePoint2");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(i, redraw, animation)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Render the graph and markers. Called internally when first rendering and later when redrawing the chart. This function can be extended in plugins, but normally shouldn't be called directly.
 */
public void render(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "render");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Select or unselect the series. This means its selected property is set, the checkbox in the legend is toggled.
 */
public void select(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "select0");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Select or unselect the series. This means its selected property is set, the checkbox in the legend is toggled.
 * @param selected True to select the series, false to unselect.
 */
public void select(boolean selected){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "select1");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(selected)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
 *
 * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
 * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
 */
public void setSeriesData(List data){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setData0");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(data)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
 *
 * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
 * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
 * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
 */
public void setSeriesData(List data, boolean redraw){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setData1");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(data, redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
 *
 * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
 * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
 * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
 * @param animation When the updated data is the same length as the existing data, points will be updated by default, and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
 */
public void setSeriesData(List data, boolean redraw, HIAnimationOptionsObject animation){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setData2");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(data, redraw, animation)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
 *
 * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
 * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
 * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
 * @param animation When the updated data is the same length as the existing data, points will be updated by default, and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
 * @param updatePoints When this is true, points will be updated instead of replaced whenever possible. This occurs a) when the updated data is the same length as the existing data, b) when points are matched by their id's, or c) when points can be matched by X values. This allows updating with animation and performs better. In this case, the original array is not passed by reference. Set false to prevent.
 */
public void setSeriesData(List data, boolean redraw, HIAnimationOptionsObject animation, boolean updatePoints){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setData3");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(data, redraw, animation, updatePoints)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Set the series options by merging from the options tree. Called internally on initializing and updating series. This function will not redraw the series. For API usage, use HISeries update().
 * @param itemOptions The series options.
 */
public void setOptions(HISeries itemOptions){
  Map itemOtionsCopy = itemOptions.getParams();
  itemOtionsCopy.remove("_wrapperID");
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setOptions");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(itemOtionsCopy)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Set the state of the series. Called internally on mouse interaction operations, but it can also be called directly to visually highlight a series.
 */
public void setState(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setState1");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Set the state of the series. Called internally on mouse interaction operations, but it can also be called directly to visually highlight a series.
 * @param state Can be either hover or undefined to set to normal state.
 */
public void setState(String state){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setState1");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(state)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Show or hide the series.
 */
public void setSeriesVisible(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setVisible0");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Show or hide the series.
 * @param visible True to show the series, false to hide. If undefined, the visibility is toggled.
 */
public void setSeriesVisible(boolean visible){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setVisible1");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(visible)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Show or hide the series.
 * @param visible True to show the series, false to hide. If undefined, the visibility is toggled.
 * @param redraw Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
 */
public void setSeriesVisible(boolean visible, boolean redraw){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "setVisible2");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(visible, redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Show the series if hidden.
 */
public void show(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "show");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Sonify a series.
 * @param options The options for sonifying this series.
 */
public void sonify(Map options){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "sonify");
    put("id", uuid);
    put("params", options);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Translate data points from raw data values to chart specific positioning data needed later in the drawPoints and drawGraph functions. This function can be overridden in plugins and custom series type implementations.
 */
public void translate(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "sonify");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series are removed, and it is initialized from scratch. Therefore, this method is more performance expensive than some other utility methods like HISeries setData() or HISeries setSeriesVisible().
 * @param options New options that will be merged with the series' existing options.
 */
public void update(HISeries options){
  Map optionsCopy = options.getParams();
  optionsCopy.remove("_wrapperID");
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "update0");
    put("id", uuid);
    put("params", new ArrayList<>(Collections.singletonList(optionsCopy)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series are removed, and it is initialized from scratch. Therefore, this method is more performance expensive than some other utility methods like HISeries setData() or HISeries setSeriesVisible().
 * @param options New options that will be merged with the series' existing options.
 * @param redraw Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
 */
public void update(HISeries options, boolean redraw){
  Map optionsCopy = options.getParams();
  optionsCopy.remove("_wrapperID");
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Series");
    put("method", "update1");
    put("id", uuid);
    put("params", new ArrayList<>(Arrays.asList(optionsCopy, redraw)));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}
