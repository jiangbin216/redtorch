/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncDepositField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDepositField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_Deposit_get(swigCPtr, this);
  }

  public void setIsForce(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_IsForce_set(swigCPtr, this, value);
  }

  public int getIsForce() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_IsForce_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_CurrencyID_get(swigCPtr, this);
  }

  public void setIsFromSopt(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_IsFromSopt_set(swigCPtr, this, value);
  }

  public int getIsFromSopt() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_IsFromSopt_get(swigCPtr, this);
  }

  public void setTradingPassword(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_TradingPassword_set(swigCPtr, this, value);
  }

  public String getTradingPassword() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDepositField_TradingPassword_get(swigCPtr, this);
  }

  public CThostFtdcSyncDepositField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncDepositField(), true);
  }

}
