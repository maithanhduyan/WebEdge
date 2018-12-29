/**
 * WebEdge 2018
 */
package com.webedge.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Mai Thành Duy An
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WEServices {

	@WebMethod
	public String getSystemTime();
}
