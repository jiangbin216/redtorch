/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcTransferSerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferSerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferSerialField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcTransferSerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPlateSerial(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradingDay_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeCode_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_SessionID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankAccType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankSerial_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setFutureAccType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_FutureAccType_set(swigCPtr, this, value);
  }

  public char getFutureAccType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_FutureAccType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_AccountID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_InvestorID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_FutureSerial_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BrokerFee_get(swigCPtr, this);
  }

  public void setAvailabilityFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_AvailabilityFlag_set(swigCPtr, this, value);
  }

  public char getAvailabilityFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_AvailabilityFlag_get(swigCPtr, this);
  }

  public void setOperatorCode(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_OperatorCode_set(swigCPtr, this, value);
  }

  public String getOperatorCode() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_OperatorCode_get(swigCPtr, this);
  }

  public void setBankNewAccount(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankNewAccount_set(swigCPtr, this, value);
  }

  public String getBankNewAccount() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_BankNewAccount_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferSerialField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcTransferSerialField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcTransferSerialField(), true);
  }

}
