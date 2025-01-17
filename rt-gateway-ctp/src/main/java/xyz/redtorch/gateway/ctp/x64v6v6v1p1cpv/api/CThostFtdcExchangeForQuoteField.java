/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcExchangeForQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeForQuoteField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcExchangeForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setForQuoteLocalID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ForQuoteLocalID_set(swigCPtr, this, value);
  }

  public String getForQuoteLocalID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ForQuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_reserve1_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setForQuoteStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ForQuoteStatus_set(swigCPtr, this, value);
  }

  public char getForQuoteStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ForQuoteStatus_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeForQuoteField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcExchangeForQuoteField(), true);
  }

}
