/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcQryExchangeOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeOrderActionField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcQryExchangeOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryExchangeOrderActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeOrderActionField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcQryExchangeOrderActionField(), true);
  }

}
