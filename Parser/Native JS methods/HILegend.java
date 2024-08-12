
	/**
	 * Set the legend item text.
	 * @param item The item for which to update the text in the legend.
	 */
	public void setPointText(HIPoint item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "setText");
			put("id", uuid);
			put("params", Collections.singletonList(item));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the legend item text.
	 * @param item The item for which to update the text in the legend.
	 */
	public void setSeriesText(HISeries item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "setText");
			put("id", uuid);
			put("params", Collections.singletonList(item));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the legend with new options. Equivalent to running chart.update with a legend configuration option.
	 * @param options Legend options.
	 */
	public void update(HILegend options){
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "update0");
			put("id", uuid);
			put("params", Collections.singletonList(params));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the legend with new options. Equivalent to running chart.update with a legend configuration option.
	 * @param options Legend options.
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after. Whether to redraw the chart.
	 */
	public void update(HILegend options, boolean redraw){
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "update1");
			put("id", uuid);
			put("params", Arrays.asList(params, redraw));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}
