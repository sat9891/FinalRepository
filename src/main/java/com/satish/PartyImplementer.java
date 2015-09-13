package com.satish;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.Party")
public class PartyImplementer implements Party {

	@WebMethod(operationName="partyInvoker")
	public String display(String name) {

		return "Provide Party name is"+name;
	}

}
