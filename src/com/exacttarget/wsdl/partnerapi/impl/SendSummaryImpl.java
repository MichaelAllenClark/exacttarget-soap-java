/*
 * XML Type:  SendSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendSummaryImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SendSummary
{
    
    public SendSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountID");
    private static final javax.xml.namespace.QName ACCOUNTNAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountName");
    private static final javax.xml.namespace.QName ACCOUNTEMAIL$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountEmail");
    private static final javax.xml.namespace.QName ISTESTACCOUNT$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsTestAccount");
    private static final javax.xml.namespace.QName SENDID$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendID");
    private static final javax.xml.namespace.QName DELIVEREDTIME$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveredTime");
    private static final javax.xml.namespace.QName TOTALSENT$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TotalSent");
    private static final javax.xml.namespace.QName TRANSACTIONAL$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Transactional");
    private static final javax.xml.namespace.QName NONTRANSACTIONAL$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NonTransactional");
    
    
    /**
     * Gets the "AccountID" element
     */
    public int getAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountID" element
     */
    public org.apache.xmlbeans.XmlInt xgetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccountID" element
     */
    public boolean isSetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTID$0) != 0;
        }
    }
    
    /**
     * Sets the "AccountID" element
     */
    public void setAccountID(int accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$0);
            }
            target.setIntValue(accountID);
        }
    }
    
    /**
     * Sets (as xml) the "AccountID" element
     */
    public void xsetAccountID(org.apache.xmlbeans.XmlInt accountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTID$0);
            }
            target.set(accountID);
        }
    }
    
    /**
     * Unsets the "AccountID" element
     */
    public void unsetAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTID$0, 0);
        }
    }
    
    /**
     * Gets the "AccountName" element
     */
    public java.lang.String getAccountName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountName" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccountName" element
     */
    public boolean isSetAccountName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "AccountName" element
     */
    public void setAccountName(java.lang.String accountName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNAME$2);
            }
            target.setStringValue(accountName);
        }
    }
    
    /**
     * Sets (as xml) the "AccountName" element
     */
    public void xsetAccountName(org.apache.xmlbeans.XmlString accountName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTNAME$2);
            }
            target.set(accountName);
        }
    }
    
    /**
     * Unsets the "AccountName" element
     */
    public void unsetAccountName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "AccountEmail" element
     */
    public java.lang.String getAccountEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTEMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTEMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccountEmail" element
     */
    public boolean isSetAccountEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTEMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "AccountEmail" element
     */
    public void setAccountEmail(java.lang.String accountEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTEMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTEMAIL$4);
            }
            target.setStringValue(accountEmail);
        }
    }
    
    /**
     * Sets (as xml) the "AccountEmail" element
     */
    public void xsetAccountEmail(org.apache.xmlbeans.XmlString accountEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTEMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTEMAIL$4);
            }
            target.set(accountEmail);
        }
    }
    
    /**
     * Unsets the "AccountEmail" element
     */
    public void unsetAccountEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTEMAIL$4, 0);
        }
    }
    
    /**
     * Gets the "IsTestAccount" element
     */
    public boolean getIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTACCOUNT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTestAccount" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTACCOUNT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTestAccount" element
     */
    public boolean isSetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTESTACCOUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "IsTestAccount" element
     */
    public void setIsTestAccount(boolean isTestAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTACCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTESTACCOUNT$6);
            }
            target.setBooleanValue(isTestAccount);
        }
    }
    
    /**
     * Sets (as xml) the "IsTestAccount" element
     */
    public void xsetIsTestAccount(org.apache.xmlbeans.XmlBoolean isTestAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTACCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTESTACCOUNT$6);
            }
            target.set(isTestAccount);
        }
    }
    
    /**
     * Unsets the "IsTestAccount" element
     */
    public void unsetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTESTACCOUNT$6, 0);
        }
    }
    
    /**
     * Gets the "SendID" element
     */
    public int getSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendID" element
     */
    public boolean isSetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDID$8) != 0;
        }
    }
    
    /**
     * Sets the "SendID" element
     */
    public void setSendID(int sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDID$8);
            }
            target.setIntValue(sendID);
        }
    }
    
    /**
     * Sets (as xml) the "SendID" element
     */
    public void xsetSendID(org.apache.xmlbeans.XmlInt sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDID$8);
            }
            target.set(sendID);
        }
    }
    
    /**
     * Unsets the "SendID" element
     */
    public void unsetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDID$8, 0);
        }
    }
    
    /**
     * Gets the "DeliveredTime" element
     */
    public java.lang.String getDeliveredTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVEREDTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveredTime" element
     */
    public org.apache.xmlbeans.XmlString xgetDeliveredTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVEREDTIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveredTime" element
     */
    public boolean isSetDeliveredTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVEREDTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "DeliveredTime" element
     */
    public void setDeliveredTime(java.lang.String deliveredTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVEREDTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVEREDTIME$10);
            }
            target.setStringValue(deliveredTime);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveredTime" element
     */
    public void xsetDeliveredTime(org.apache.xmlbeans.XmlString deliveredTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVEREDTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELIVEREDTIME$10);
            }
            target.set(deliveredTime);
        }
    }
    
    /**
     * Unsets the "DeliveredTime" element
     */
    public void unsetDeliveredTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVEREDTIME$10, 0);
        }
    }
    
    /**
     * Gets the "TotalSent" element
     */
    public int getTotalSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALSENT$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalSent" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALSENT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalSent" element
     */
    public boolean isSetTotalSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALSENT$12) != 0;
        }
    }
    
    /**
     * Sets the "TotalSent" element
     */
    public void setTotalSent(int totalSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALSENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALSENT$12);
            }
            target.setIntValue(totalSent);
        }
    }
    
    /**
     * Sets (as xml) the "TotalSent" element
     */
    public void xsetTotalSent(org.apache.xmlbeans.XmlInt totalSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALSENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALSENT$12);
            }
            target.set(totalSent);
        }
    }
    
    /**
     * Unsets the "TotalSent" element
     */
    public void unsetTotalSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALSENT$12, 0);
        }
    }
    
    /**
     * Gets the "Transactional" element
     */
    public int getTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONAL$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Transactional" element
     */
    public org.apache.xmlbeans.XmlInt xgetTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONAL$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Transactional" element
     */
    public boolean isSetTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONAL$14) != 0;
        }
    }
    
    /**
     * Sets the "Transactional" element
     */
    public void setTransactional(int transactional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONAL$14);
            }
            target.setIntValue(transactional);
        }
    }
    
    /**
     * Sets (as xml) the "Transactional" element
     */
    public void xsetTransactional(org.apache.xmlbeans.XmlInt transactional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONAL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONAL$14);
            }
            target.set(transactional);
        }
    }
    
    /**
     * Unsets the "Transactional" element
     */
    public void unsetTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONAL$14, 0);
        }
    }
    
    /**
     * Gets the "NonTransactional" element
     */
    public int getNonTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONTRANSACTIONAL$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NonTransactional" element
     */
    public org.apache.xmlbeans.XmlInt xgetNonTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NONTRANSACTIONAL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "NonTransactional" element
     */
    public boolean isSetNonTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONTRANSACTIONAL$16) != 0;
        }
    }
    
    /**
     * Sets the "NonTransactional" element
     */
    public void setNonTransactional(int nonTransactional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONTRANSACTIONAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NONTRANSACTIONAL$16);
            }
            target.setIntValue(nonTransactional);
        }
    }
    
    /**
     * Sets (as xml) the "NonTransactional" element
     */
    public void xsetNonTransactional(org.apache.xmlbeans.XmlInt nonTransactional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NONTRANSACTIONAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NONTRANSACTIONAL$16);
            }
            target.set(nonTransactional);
        }
    }
    
    /**
     * Unsets the "NonTransactional" element
     */
    public void unsetNonTransactional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONTRANSACTIONAL$16, 0);
        }
    }
}
