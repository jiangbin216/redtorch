/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncFundMortgageField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncFundMortgageField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncFundMortgageField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncFundMortgageField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMortgageSeqNo(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_set(swigCPtr, this, value);
  }

  public String getMortgageSeqNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setMortgageAmount(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_set(swigCPtr, this, value);
  }

  public double getMortgageAmount() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSyncFundMortgageField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncFundMortgageField(), true);
  }

}
