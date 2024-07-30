  /**
   * Add a plot band after render time.
   * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
   */
  public void addPlotBand(HIPlotBands options) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("method", "addPlotBand");
      put("axis", "y");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(options.getParams())));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }


  /**
   * Add a plot line after render time.
   * @param options A configuration object for the plot line, as defined in xAxis.plotLines.
   */
  public void addPlotLine(HIPlotLines options) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "addPlotLine");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(options.getParams())));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Adds the title defined in axis.options.title.
   * @param display Whether or not to display the title.
   */
  public void addTitle(Boolean display) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "addTitle");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(display)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Internal function to draw a crosshair.
   */
  public void drawCrosshair() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "drawCrosshair");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Hide the crosshair if visible.
   */
  public void hideCrosshair() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "hideCrosshair");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove the axis from the chart.
   */
  public void remove() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "remove0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove the axis from the chart.
   * @param redraw Whether to redraw the chart following the remove.
   */
  public void remove(Boolean redraw) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "remove1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a plot band by its id.
   * @param id The plot band's id as given in the original configuration object or in the addPlotBand option.
   */
  public void removePlotBand(String id) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "removePlotBand");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(id)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a plot line by its id.
   * @param id The plot line's id as given in the original configuration object or in the addPlotLine option.
   */
  public void removePlotLine(String id) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "removePlotLine");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(id)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Render the axis line. Called internally when rendering and redrawing the axis.
   */
  public void renderLine() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "renderLine");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Render a minor tick into the given position. If a minor tick already exists in this position, move it.
   * @param pos The position in axis values.
   */
  public void renderMinorTick(Number pos) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "renderMinorTick");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(pos)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Render a major tick into the given position. If a tick already exists in this position, move it.
   * @param pos The position in axis values.
   * @param i The tick index.
   */
  public void renderTick(Number pos, Number i) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "renderTick");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(pos, i)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set new axis categories and optionally redraw.
   * @param categories The new categories.
   */
  public void setCategories(List<String> categories) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setCategories0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(categories)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set new axis categories and optionally redraw.
   * @param categories The new categories.
   * @param redraw Whether to redraw the chart.
   */
  public void setCategories(List<String> categories, boolean redraw) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setCategories1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(categories, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
   */
  public void setExtremes() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setExtremes0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
   * @param newMin The new minimum value.
   */
  public void setExtremes(Number newMin) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setExtremes1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(newMin)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
   * @param newMin The new minimum value.
   * @param newMax The new maximum value.
   */
  public void setExtremes(Number newMin, Number newMax) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setExtremes2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(newMin, newMax)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
   * @param newMin The new minimum value.
   * @param newMax The new maximum value.
   * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
   */
  public void setExtremes(Number newMin, Number newMax, boolean redraw) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setExtremes3");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(newMin, newMax, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }


  /**
   * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
   * @param newMin The new minimum value.
   * @param newMax The new maximum value.
   * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
   * @param animation Enable or modify animations.
   */
  public void setExtremes(Number newMin, Number newMax, boolean redraw, HIAnimationOptionsObject animation) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setExtremes4");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(newMin, newMax, redraw, animation.getParams())));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Now we have computed the normalized tickInterval, get the tick positions
   */
  public void setTickPositions() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setTickPositions");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update the axis title by options after render time.
   * @param title The additional title options.
   */
  public void setAxisTitle(HITitle title) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setTitle0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(title)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update the axis title by options after render time.
   * @param title The additional title options.
   * @param redraw Whether to redraw the chart after setting the title.
   */
  public void setAxisTitle(HITitle title, boolean redraw) {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setTitle1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(title, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Translate a pixel position along the axis to a value in terms of axis units.
   * @param options The new options that will be merged in with existing options on the axis.
   */
  public void update(HIYAxis options) {
    Map<String, Object> params = options.getParams();
    params.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setTitle0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(params)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Translate a pixel position along the axis to a value in terms of axis units.
   * @param options The new options that will be merged in with existing options on the axis.
   * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call redraw() on HIChartView after.
   */
  public void update(HIYAxis options, boolean redraw) {
    Map<String, Object> params = options.getParams();
    params.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Axis");
      put("axis", "y");
      put("method", "setTitle1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(params, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }
