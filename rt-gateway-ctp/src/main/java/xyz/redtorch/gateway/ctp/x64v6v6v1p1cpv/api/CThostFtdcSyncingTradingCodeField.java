/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcSyncingTradingCodeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingCodeField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcSyncingTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingCodeField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcSyncingTradingCodeField(), true);
  }

}
