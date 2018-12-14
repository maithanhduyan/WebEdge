/**
 * WebEdge 2018
 */
package com.webedge.htmlfilter.model;

import java.math.MathContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mai Thành Duy An
 */
public class HTMLModel {

	public HTMLModel() {

	}

	private String topic;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public static String HTMLFilter(String source) {
		String regex = "<(/)?(/*)[\\sSsCcRrIiPpTt]*>";
		Pattern pattern = Pattern.compile(regex);
		if (source != null) {
			Matcher matcher = pattern.matcher(source);
			StringBuffer str = new StringBuffer();
			while (matcher.find()) {
				matcher.appendReplacement(str, matcher.quoteReplacement(""));
			}
			matcher.appendTail(str);
			return str.toString();
		}
		return "";
	}

}
