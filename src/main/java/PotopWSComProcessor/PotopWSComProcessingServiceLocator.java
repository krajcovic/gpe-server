/**
 * PotopWSComProcessingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PotopWSComProcessor;

public class PotopWSComProcessingServiceLocator extends org.apache.axis.client.Service implements PotopWSComProcessor.PotopWSComProcessingService {

    public PotopWSComProcessingServiceLocator() {
    }


    public PotopWSComProcessingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PotopWSComProcessingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PotopWSComProcessor
    private java.lang.String PotopWSComProcessor_address = "https://potopws.test.gpe.cz:443/potopws/potopWSComProcessing";

    public java.lang.String getPotopWSComProcessorAddress() {
        return PotopWSComProcessor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PotopWSComProcessorWSDDServiceName = "PotopWSComProcessor";

    public java.lang.String getPotopWSComProcessorWSDDServiceName() {
        return PotopWSComProcessorWSDDServiceName;
    }

    public void setPotopWSComProcessorWSDDServiceName(java.lang.String name) {
        PotopWSComProcessorWSDDServiceName = name;
    }

    public PotopWSComProcessor.PotopWSComProcessorPort getPotopWSComProcessor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PotopWSComProcessor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPotopWSComProcessor(endpoint);
    }

    public PotopWSComProcessor.PotopWSComProcessorPort getPotopWSComProcessor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PotopWSComProcessor.PotopWSComProcessorSoapBindingStub _stub = new PotopWSComProcessor.PotopWSComProcessorSoapBindingStub(portAddress, this);
            _stub.setPortName(getPotopWSComProcessorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPotopWSComProcessorEndpointAddress(java.lang.String address) {
        PotopWSComProcessor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PotopWSComProcessor.PotopWSComProcessorPort.class.isAssignableFrom(serviceEndpointInterface)) {
                PotopWSComProcessor.PotopWSComProcessorSoapBindingStub _stub = new PotopWSComProcessor.PotopWSComProcessorSoapBindingStub(new java.net.URL(PotopWSComProcessor_address), this);
                _stub.setPortName(getPotopWSComProcessorWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PotopWSComProcessor".equals(inputPortName)) {
            return getPotopWSComProcessor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:PotopWSComProcessor", "PotopWSComProcessingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "PotopWSComProcessor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PotopWSComProcessor".equals(portName)) {
            setPotopWSComProcessorEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
