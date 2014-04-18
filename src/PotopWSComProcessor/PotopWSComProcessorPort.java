/**
 * PotopWSComProcessorPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PotopWSComProcessor;

public interface PotopWSComProcessorPort extends java.rmi.Remote {
    public potopWSComProcessing_v_01_01_xsd.ValidationResult validate(potopWSComProcessing_v_01_01_xsd.ValidationData validationData) throws java.rmi.RemoteException;
    public potopWSComProcessing_v_01_01_xsd.SubmissionResult submit(potopWSComProcessing_v_01_01_xsd.SubmissionData submissionData) throws java.rmi.RemoteException;
    public potopWSComProcessing_v_01_01_xsd.CancellationResult cancel(potopWSComProcessing_v_01_01_xsd.CancellationData cancellationData) throws java.rmi.RemoteException;
    public potopWSComProcessing_v_01_01_xsd.StatusResult status(potopWSComProcessing_v_01_01_xsd.StatusData statusData) throws java.rmi.RemoteException;
    public void echo() throws java.rmi.RemoteException;
}
