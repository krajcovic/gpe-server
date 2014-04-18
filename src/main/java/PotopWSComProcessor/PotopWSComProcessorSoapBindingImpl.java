/**
 * PotopWSComProcessorSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PotopWSComProcessor;

import java.util.GregorianCalendar;

public class PotopWSComProcessorSoapBindingImpl implements PotopWSComProcessor.PotopWSComProcessorPort{
    public potopWSComProcessing_v_01_01_xsd.ValidationResult validate(potopWSComProcessing_v_01_01_xsd.ValidationData data) throws java.rmi.RemoteException {
    	potopWSComProcessing_v_01_01_xsd.ValidationResult result = new potopWSComProcessing_v_01_01_xsd.ValidationResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	result.setTaxNo("20001");
    	
    	return result;
    }

    public potopWSComProcessing_v_01_01_xsd.SubmissionResult submit(potopWSComProcessing_v_01_01_xsd.SubmissionData data) throws java.rmi.RemoteException {
    	potopWSComProcessing_v_01_01_xsd.SubmissionResult result = new potopWSComProcessing_v_01_01_xsd.SubmissionResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	return result;
    }

    public potopWSComProcessing_v_01_01_xsd.CancellationResult cancel(potopWSComProcessing_v_01_01_xsd.CancellationData data) throws java.rmi.RemoteException {
    	potopWSComProcessing_v_01_01_xsd.CancellationResult result = new potopWSComProcessing_v_01_01_xsd.CancellationResult();
    	result.setTerminalId(data.getTerminalId());
    	result.setTransactionId(data.getTerminalId());
    	
    	result.setMessageTimestamp(new GregorianCalendar());
    	
    	result.setResponseCode(0);
    	result.setResponseString("OK");
    	
    	return result;
    }

    public potopWSComProcessing_v_01_01_xsd.StatusResult status(potopWSComProcessing_v_01_01_xsd.StatusData data) throws java.rmi.RemoteException {
    	potopWSComProcessing_v_01_01_xsd.StatusResult result = new potopWSComProcessing_v_01_01_xsd.StatusResult();
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
