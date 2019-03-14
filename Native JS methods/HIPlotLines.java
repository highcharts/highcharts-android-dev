/**
 * Remove the plot line.
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
