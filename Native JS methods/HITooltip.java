/**
 In case no user defined formatter is given, this will be used. Note that the context here is an object holding point, series, x, y etc.
 @param tooltip Tooltip
 */
public void defaultFormatter(HITooltip tooltip){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "defaultFormatter");
    put("id", uuid);
    put("params", Collections.singletonList(tooltip.getParams()));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Removes and destroys the tooltip and its elements.
 */
public void destroy(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "destroy");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}


/**
 Creates the Tooltip label element if it does not exist.
 */
public void getLabel(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "getLabel");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Hides the tooltip with a fade out animation.
 */
public void hide(){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "hide0");
    put("id", uuid);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Hides the tooltip with a fade out animation.
 @param delay The fade out in milliseconds. If no value is provided the value of the tooltip.hideDelay option is used. A value of 0 disables the fade out animation.
 */
public void hide(Number delay){
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "hide1");
    put("id", uuid);
    put("params", Collections.singletonList(delay));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Refresh the tooltip's text and position.
 @param point A point.
 */
public void refreshByPoint(HIPoint point){
  Map<String, Object> params = point.getParams();
  String pointID = params.getObject("_wrapperID");
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "refreshByPoint");
    put("id", uuid);
    put("pointID", pointID);
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
Refresh the tooltip's text and position.
@param points An array of points.
*/
public void refreshByPoints(ArrayList<HIPoint> points){
  ArrayList<String> pointIDs = new ArrayList<>();
  for(HIPoint point in points){
  	Map<String, Object> params = point.getParams();
	pointIDs.add(params.getObject("_wrapperID"));
  }
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "refreshByPoints");
    put("id", uuid);
    put("params", Collections.singletonList(options.getParams()));
    pit("pointIDs", pointIDs.toString());
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}

/**
 Updates the tooltip with the provided tooltip options.
 @param options The tooltip options to update.
 */
public void update(HITooltip options){
  Map<String, Object> params = options.getParams();
  params.remove("_wrapperID");
  this.jsClassMethod = new HashMap<String, Object>() {{
    put("class", "Tooltip");
    put("method", "update");
    put("id", uuid);
    put("params", Collections.singletonList(params));
  }};
  this.setChanged();
  this.notifyObservers(jsClassMethod);
}
