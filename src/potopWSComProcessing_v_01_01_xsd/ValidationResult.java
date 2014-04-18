/**
 * ValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package potopWSComProcessing_v_01_01_xsd;

public class ValidationResult  extends potopWSComProcessing_v_01_01_xsd.AbstractResult  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String taxNo;

    public ValidationResult() {
    }

    public ValidationResult(
           java.lang.String terminalId,
           java.util.Calendar messageTimestamp,
           int responseCode,
           java.lang.String responseString,
           java.lang.String transactionId,
           java.lang.String taxNo) {
        super(
            terminalId,
            messageTimestamp,
            responseCode,
            responseString);
        this.transactionId = transactionId;
        this.taxNo = taxNo;
    }


    /**
     * Gets the transactionId value for this ValidationResult.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ValidationResult.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the taxNo value for this ValidationResult.
     * 
     * @return taxNo
     */
    public java.lang.String getTaxNo() {
        return taxNo;
    }


    /**
     * Sets the taxNo value for this ValidationResult.
     * 
     * @param taxNo
     */
    public void setTaxNo(java.lang.String taxNo) {
        this.taxNo = taxNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidationResult)) return false;
        ValidationResult other = (ValidationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.taxNo==null && other.getTaxNo()==null) || 
             (this.taxNo!=null &&
              this.taxNo.equals(other.getTaxNo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTaxNo() != null) {
            _hashCode += getTaxNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "ValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
