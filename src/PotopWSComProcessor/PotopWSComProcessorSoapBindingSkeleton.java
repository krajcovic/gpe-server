/**
 * PotopWSComProcessorSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PotopWSComProcessor;

public class PotopWSComProcessorSoapBindingSkeleton implements PotopWSComProcessor.PotopWSComProcessorPort, org.apache.axis.wsdl.Skeleton {
    private PotopWSComProcessor.PotopWSComProcessorPort impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "validationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "ValidationData"), potopWSComProcessing_v_01_01_xsd.ValidationData.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validate", _params, new javax.xml.namespace.QName("", "validateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "ValidationResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "validate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validate") == null) {
            _myOperations.put("validate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validate")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "submissionData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "SubmissionData"), potopWSComProcessing_v_01_01_xsd.SubmissionData.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("submit", _params, new javax.xml.namespace.QName("", "submitReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "SubmissionResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "submit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("submit") == null) {
            _myOperations.put("submit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("submit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancellationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "CancellationData"), potopWSComProcessing_v_01_01_xsd.CancellationData.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cancel", _params, new javax.xml.namespace.QName("", "cancelReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "CancellationResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "cancel"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cancel") == null) {
            _myOperations.put("cancel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cancel")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statusData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "StatusData"), potopWSComProcessing_v_01_01_xsd.StatusData.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("status", _params, new javax.xml.namespace.QName("", "statusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "StatusResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "status"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("status") == null) {
            _myOperations.put("status", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("status")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("echo", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:PotopWSComProcessor", "echo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("echo") == null) {
            _myOperations.put("echo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("echo")).add(_oper);
    }

    public PotopWSComProcessorSoapBindingSkeleton() {
        this.impl = new PotopWSComProcessor.PotopWSComProcessorSoapBindingImpl();
    }

    public PotopWSComProcessorSoapBindingSkeleton(PotopWSComProcessor.PotopWSComProcessorPort impl) {
        this.impl = impl;
    }
    public potopWSComProcessing_v_01_01_xsd.ValidationResult validate(potopWSComProcessing_v_01_01_xsd.ValidationData validationData) throws java.rmi.RemoteException
    {
        potopWSComProcessing_v_01_01_xsd.ValidationResult ret = impl.validate(validationData);
        return ret;
    }

    public potopWSComProcessing_v_01_01_xsd.SubmissionResult submit(potopWSComProcessing_v_01_01_xsd.SubmissionData submissionData) throws java.rmi.RemoteException
    {
        potopWSComProcessing_v_01_01_xsd.SubmissionResult ret = impl.submit(submissionData);
        return ret;
    }

    public potopWSComProcessing_v_01_01_xsd.CancellationResult cancel(potopWSComProcessing_v_01_01_xsd.CancellationData cancellationData) throws java.rmi.RemoteException
    {
        potopWSComProcessing_v_01_01_xsd.CancellationResult ret = impl.cancel(cancellationData);
        return ret;
    }

    public potopWSComProcessing_v_01_01_xsd.StatusResult status(potopWSComProcessing_v_01_01_xsd.StatusData statusData) throws java.rmi.RemoteException
    {
        potopWSComProcessing_v_01_01_xsd.StatusResult ret = impl.status(statusData);
        return ret;
    }

    public void echo() throws java.rmi.RemoteException
    {
        impl.echo();
    }

}
