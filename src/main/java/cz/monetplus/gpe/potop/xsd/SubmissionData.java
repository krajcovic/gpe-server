/**
 * SubmissionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.monetplus.gpe.potop.xsd;

public class SubmissionData  extends cz.monetplus.gpe.potop.xsd.AbstractData  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.Integer paymentType;

    private java.util.Calendar settlementDate;

    public SubmissionData() {
    }

    public SubmissionData(
           java.lang.String terminalId,
           java.util.Calendar messageTimestamp,
           java.lang.String transactionId,
           java.lang.Integer paymentType,
           java.util.Calendar settlementDate) {
        super(
            terminalId,
            messageTimestamp);
        this.transactionId = transactionId;
        this.paymentType = paymentType;
        this.settlementDate = settlementDate;
    }


    /**
     * Gets the transactionId value for this SubmissionData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SubmissionData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the paymentType value for this SubmissionData.
     * 
     * @return paymentType
     */
    public java.lang.Integer getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this SubmissionData.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Integer paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the settlementDate value for this SubmissionData.
     * 
     * @return settlementDate
     */
    public java.util.Calendar getSettlementDate() {
        return settlementDate;
    }


    /**
     * Sets the settlementDate value for this SubmissionData.
     * 
     * @param settlementDate
     */
    public void setSettlementDate(java.util.Calendar settlementDate) {
        this.settlementDate = settlementDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmissionData)) return false;
        SubmissionData other = (SubmissionData) obj;
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
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.settlementDate==null && other.getSettlementDate()==null) || 
             (this.settlementDate!=null &&
              this.settlementDate.equals(other.getSettlementDate())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getSettlementDate() != null) {
            _hashCode += getSettlementDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmissionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "SubmissionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
