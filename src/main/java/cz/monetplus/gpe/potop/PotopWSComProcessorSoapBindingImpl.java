/**
 * PotopWSComProcessorSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.monetplus.gpe.potop;

import java.util.GregorianCalendar;

public class PotopWSComProcessorSoapBindingImpl implements cz.monetplus.gpe.potop.PotopWSComProcessorPort{
    public cz.monetplus.gpe.potop.xsd.ValidationResult validate(cz.monetplus.gpe.potop.xsd.ValidationData data) throws java.rmi.RemoteException {
    	cz.monetplus.gpe.potop.xsd.ValidationResult result = new cz.monetplus.gpe.potop.xsd.ValidationResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	result.setTaxNo("20001");
    	
    	return result;
    }

    public cz.monetplus.gpe.potop.xsd.SubmissionResult submit(cz.monetplus.gpe.potop.xsd.SubmissionData data) throws java.rmi.RemoteException {
    	cz.monetplus.gpe.potop.xsd.SubmissionResult result = new cz.monetplus.gpe.potop.xsd.SubmissionResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	return result;
    }

    public cz.monetplus.gpe.potop.xsd.CancellationResult cancel(cz.monetplus.gpe.potop.xsd.CancellationData data) throws java.rmi.RemoteException {
    	cz.monetplus.gpe.potop.xsd.CancellationResult result = new cz.monetplus.gpe.potop.xsd.CancellationResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	return result;
    }

    public cz.monetplus.gpe.potop.xsd.StatusResult status(cz.monetplus.gpe.potop.xsd.StatusData data) throws java.rmi.RemoteException {
    	cz.monetplus.gpe.potop.xsd.StatusResult result = new cz.monetplus.gpe.potop.xsd.StatusResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	return result;
    }

    public void echo() throws java.rmi.RemoteException {
    }

}
