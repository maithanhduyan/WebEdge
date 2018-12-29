/**
 * WebEdge 2018
 */
package com.webedge.jaxws;

import com.webedge.jaxws.system.SystemInfoUtil;

/**
 * @author Mai Thành Duy An
 */

public class WEServicesImpl implements WEServices{

	@Override
	public String getSystemTime() {
		return SystemInfoUtil.getSystemTime();
	}

}
