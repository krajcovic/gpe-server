/**
 * ValidationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.monetplus.gpe.potop.xsd;

public class ValidationData  extends cz.monetplus.gpe.potop.xsd.AbstractData  implements java.io.Serializable {
    private java.lang.String transactionId;

    private int amount;

    private cz.monetplus.gpe.potop.xsd.CurrencyType currency;

    private cz.monetplus.gpe.potop.xsd.OperatorCodeType operatorCode;

    private java.lang.String targetMsisdn;

    private java.lang.String sourceMsisdn;

    public ValidationData() {
    }

    public ValidationData(
           java.lang.String terminalId,
           java.util.Calendar messageTimestamp,
           java.lang.String transactionId,
           int amount,
           cz.monetplus.gpe.potop.xsd.CurrencyType currency,
           cz.monetplus.gpe.potop.xsd.OperatorCodeType operatorCode,
           java.lang.String targetMsisdn,
           java.lang.String sourceMsisdn) {
        super(
            terminalId,
            messageTimestamp);
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
        this.operatorCode = operatorCode;
        this.targetMsisdn = targetMsisdn;
        this.sourceMsisdn = sourceMsisdn;
    }


    /**
     * Gets the transactionId value for this ValidationData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ValidationData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the amount value for this ValidationData.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ValidationData.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this ValidationData.
     * 
     * @return currency
     */
    public cz.monetplus.gpe.potop.xsd.CurrencyType getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ValidationData.
     * 
     * @param currency
     */
    public void setCurrency(cz.monetplus.gpe.potop.xsd.CurrencyType currency) {
        this.currency = currency;
    }


    /**
     * Gets the operatorCode value for this ValidationData.
     * 
     * @return operatorCode
     */
    public cz.monetplus.gpe.potop.xsd.OperatorCodeType getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this ValidationData.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(cz.monetplus.gpe.potop.xsd.OperatorCodeType operatorCode) {
        this.operatorCode = operatorCode;
    }


    /**
     * Gets the targetMsisdn value for this ValidationData.
     * 
     * @return targetMsisdn
     */
    public java.lang.String getTargetMsisdn() {
        return targetMsisdn;
    }


    /**
     * Sets the targetMsisdn value for this ValidationData.
     * 
     * @param targetMsisdn
     */
    public void setTargetMsisdn(java.lang.String targetMsisdn) {
        this.targetMsisdn = targetMsisdn;
    }


    /**
     * Gets the sourceMsisdn value for this ValidationData.
     * 
     * @return sourceMsisdn
     */
    public java.lang.String getSourceMsisdn() {
        return sourceMsisdn;
    }


    /**
     * Sets the sourceMsisdn value for this ValidationData.
     * 
     * @param sourceMsisdn
     */
    public void setSourceMsisdn(java.lang.String sourceMsisdn) {
        this.sourceMsisdn = sourceMsisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidationData)) return false;
        ValidationData other = (ValidationData) obj;
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
            this.amount == other.getAmount() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.operatorCode==null && other.getOperatorCode()==null) || 
             (this.operatorCode!=null &&
              this.operatorCode.equals(other.getOperatorCode()))) &&
            ((this.targetMsisdn==null && other.getTargetMsisdn()==null) || 
             (this.targetMsisdn!=null &&
              this.targetMsisdn.equals(other.getTargetMsisdn()))) &&
            ((this.sourceMsisdn==null && other.getSourceMsisdn()==null) || 
             (this.sourceMsisdn!=null &&
              this.sourceMsisdn.equals(other.getSourceMsisdn())));
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
        _hashCode += getAmount();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getOperatorCode() != null) {
            _hashCode += getOperatorCode().hashCode();
        }
        if (getTargetMsisdn() != null) {
            _hashCode += getTargetMsisdn().hashCode();
        }
        if (getSourceMsisdn() != null) {
            _hashCode += getSourceMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "ValidationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "currencyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:potopWSComProcessing_v_01_01_xsd", "operatorCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceMsisdn"));
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
