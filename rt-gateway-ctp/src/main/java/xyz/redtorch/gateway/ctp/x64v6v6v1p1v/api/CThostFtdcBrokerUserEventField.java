/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserEventField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public void setEventSequenceNo(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_set(swigCPtr, this, value);
  }

  public int getEventSequenceNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_EventTime_get(swigCPtr, this);
  }

  public void setUserEventInfo(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_set(swigCPtr, this, value);
  }

  public String getUserEventInfo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_reserve1_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcBrokerUserEventField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserEventField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcBrokerUserEventField(), true);
  }

}
