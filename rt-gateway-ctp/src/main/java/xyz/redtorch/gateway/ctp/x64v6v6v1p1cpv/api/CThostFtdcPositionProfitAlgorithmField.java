/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcPositionProfitAlgorithmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcPositionProfitAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPositionProfitAlgorithmField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcPositionProfitAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_AccountID_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_Algorithm_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_Memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_Memo_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcPositionProfitAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcPositionProfitAlgorithmField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcPositionProfitAlgorithmField(), true);
  }

}
