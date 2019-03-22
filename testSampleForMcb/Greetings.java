package com.eidikointernal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.eidikointernal.utility.UtilityProvider;

@WebService(targetNamespace = "http://eidikointernal.com/", portName = "GreetingsPort", serviceName = "GreetingsService", wsdlLocation = "wsdl/greetings.wsdl")

/**
 * Service Provider Class with JPA
 * @author Administrator
 *
 */
public class Greetings {

	@WebMethod(operationName = "sayHello", action = "urn:SayHello")
	@RequestWrapper(className = "com.eidikointernal.jaxws.SayHello", localName = "sayHello", targetNamespace = "http://eidikointernal.com/")
	@ResponseWrapper(className = "com.eidikointernal.jaxws.SayHelloResponse", localName = "sayHelloResponse", targetNamespace = "http://eidikointernal.com/")
	@WebResult(name = "return")

	public String sayHello(@WebParam(name = "arg0") String name) {
		UtilityProvider utilityProvider = new UtilityProvider();
		System.out.println("***");

		String myResponseForGreeting = "Hello from Sreenivas to " + name;

		System.out.println(myResponseForGreeting);
		return myResponseForGreeting;
	}

}
