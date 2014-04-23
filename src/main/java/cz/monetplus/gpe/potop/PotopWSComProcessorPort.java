/**
 * PotopWSComProcessorPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.monetplus.gpe.potop;

public interface PotopWSComProcessorPort extends java.rmi.Remote {
    public cz.monetplus.gpe.potop.xsd.ValidationResult validate(cz.monetplus.gpe.potop.xsd.ValidationData validationData) throws java.rmi.RemoteException;
    public cz.monetplus.gpe.potop.xsd.SubmissionResult submit(cz.monetplus.gpe.potop.xsd.SubmissionData submissionData) throws java.rmi.RemoteException;
    public cz.monetplus.gpe.potop.xsd.CancellationResult cancel(cz.monetplus.gpe.potop.xsd.CancellationData cancellationData) throws java.rmi.RemoteException;
    public cz.monetplus.gpe.potop.xsd.StatusResult status(cz.monetplus.gpe.potop.xsd.StatusData statusData) throws java.rmi.RemoteException;
    public void echo() throws java.rmi.RemoteException;
}
