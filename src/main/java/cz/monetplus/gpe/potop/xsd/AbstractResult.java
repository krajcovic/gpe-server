/**
 * AbstractResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.monetplus.gpe.potop.xsd;

public abstract class AbstractResult  implements java.io.Serializable {
    private java.lang.String terminalId;

    private java.util.Calendar messageTimestamp;

    private int responseCode;

    private java.lang.String responseString;

    public AbstractResult() {
    }

    public AbstractResult(
           java.lang.String terminalId,
           java.util.Calendar messageTimestamp,
           int responseCode,
           java.lang.String responseString) {
           this.terminalId = terminalId;
           this.messageTimestamp = messageTimestamp;
           this.responseCode = responseCode;
           this.responseString = responseString;
    }


    /**
     * Gets the terminalId value for this AbstractResult.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this AbstractResult.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the messageTimestamp value for this AbstractResult.
     * 
     * @return messageTimestamp
     */
    public java.util.Calendar getMessageTimestamp() {
        return messageTimestamp;
    }


    /**
     * Sets the messageTimestamp value for this AbstractResult.
     * 
     * @param messageTimestamp
     */
    public void setMessageTimestamp(java.util.Calendar messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }


    /**
     * Gets the responseCode value for this AbstractResult.
     * 
     * @return responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this AbstractResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseString value for this AbstractResult.
     * 
     * @return responseString
     */
    public java.lang.String getResponseString() {
        return responseString;
    }


    /**
     * Sets the responseString value for this AbstractResult.
     * 
     * @param responseString
     */
    public void setResponseString(java.lang.String responseString) {
        this.responseString = responseString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractResult)) return false;
        AbstractResult other = (AbstractResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.messageTimestamp==null && other.getMessageTimestamp()==null) || 
             (this.messageTimestamp!=null &&
              this.messageTimestamp.equals(other.getMessageTimestamp()))) &&
            this.responseCode == other.getResponseCode() &&
            ((this.responseString==null && other.getResponseString()==null) || 
             (this.responseString!=null &&
              this.responseString.equals(other.getResponseString())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getMessageTimestamp() != null) {
            _hashCode += getMessageTimestamp().hashCode();
        }
        _hashCode += getResponseCode();
        if (getResponseString() != null) {
            _hashCode += getResponseString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "AbstractResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
