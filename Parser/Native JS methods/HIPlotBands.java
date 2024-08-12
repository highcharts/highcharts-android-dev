  /**
   * Remove the plot band.
   */
  public void destroy() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "PlotLineOrBand");
      put("method", "destroy");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }
