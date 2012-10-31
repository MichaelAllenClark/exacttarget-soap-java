/*
 * XML Type:  Subscription
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Subscription
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Subscription(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Subscription
{
    
    public SubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriptionID");
    private static final javax.xml.namespace.QName EMAILSPURCHASED$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailsPurchased");
    private static final javax.xml.namespace.QName ACCOUNTSPURCHASED$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountsPurchased");
    private static final javax.xml.namespace.QName ADVACCOUNTSPURCHASED$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AdvAccountsPurchased");
    private static final javax.xml.namespace.QName LPACCOUNTSPURCHASED$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LPAccountsPurchased");
    private static final javax.xml.namespace.QName DOTOACCOUNTSPURCHASED$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DOTOAccountsPurchased");
    private static final javax.xml.namespace.QName BUACCOUNTSPURCHASED$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BUAccountsPurchased");
    private static final javax.xml.namespace.QName BEGINDATE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BeginDate");
    private static final javax.xml.namespace.QName ENDDATE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EndDate");
    private static final javax.xml.namespace.QName NOTES$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Notes");
    private static final javax.xml.namespace.QName PERIOD$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Period");
    private static final javax.xml.namespace.QName NOTIFICATIONTITLE$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationTitle");
    private static final javax.xml.namespace.QName NOTIFICATIONMESSAGE$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationMessage");
    private static final javax.xml.namespace.QName NOTIFICATIONFLAG$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationFlag");
    private static final javax.xml.namespace.QName NOTIFICATIONEXPDATE$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationExpDate");
    private static final javax.xml.namespace.QName FORACCOUNTING$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ForAccounting");
    private static final javax.xml.namespace.QName HASPURCHASEDEMAILS$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HasPurchasedEmails");
    private static final javax.xml.namespace.QName CONTRACTNUMBER$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContractNumber");
    private static final javax.xml.namespace.QName CONTRACTMODIFIER$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContractModifier");
    private static final javax.xml.namespace.QName ISRENEWAL$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsRenewal");
    private static final javax.xml.namespace.QName NUMBEROFEMAILS$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberofEmails");
    
    
    /**
     * Gets the "SubscriptionID" element
     */
    public int getSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriptionID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SubscriptionID" element
     */
    public boolean isNilSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SubscriptionID" element
     */
    public boolean isSetSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "SubscriptionID" element
     */
    public void setSubscriptionID(int subscriptionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONID$0);
            }
            target.setIntValue(subscriptionID);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriptionID" element
     */
    public void xsetSubscriptionID(org.apache.xmlbeans.XmlInt subscriptionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUBSCRIPTIONID$0);
            }
            target.set(subscriptionID);
        }
    }
    
    /**
     * Nils the "SubscriptionID" element
     */
    public void setNilSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUBSCRIPTIONID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SubscriptionID" element
     */
    public void unsetSubscriptionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONID$0, 0);
        }
    }
    
    /**
     * Gets the "EmailsPurchased" element
     */
    public int getEmailsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSPURCHASED$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetEmailsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMAILSPURCHASED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EmailsPurchased" element
     */
    public void setEmailsPurchased(int emailsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSPURCHASED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILSPURCHASED$2);
            }
            target.setIntValue(emailsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "EmailsPurchased" element
     */
    public void xsetEmailsPurchased(org.apache.xmlbeans.XmlInt emailsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMAILSPURCHASED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EMAILSPURCHASED$2);
            }
            target.set(emailsPurchased);
        }
    }
    
    /**
     * Gets the "AccountsPurchased" element
     */
    public int getAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTSPURCHASED$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTSPURCHASED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccountsPurchased" element
     */
    public void setAccountsPurchased(int accountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTSPURCHASED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTSPURCHASED$4);
            }
            target.setIntValue(accountsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "AccountsPurchased" element
     */
    public void xsetAccountsPurchased(org.apache.xmlbeans.XmlInt accountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTSPURCHASED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTSPURCHASED$4);
            }
            target.set(accountsPurchased);
        }
    }
    
    /**
     * Gets the "AdvAccountsPurchased" element
     */
    public int getAdvAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVACCOUNTSPURCHASED$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdvAccountsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetAdvAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADVACCOUNTSPURCHASED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdvAccountsPurchased" element
     */
    public void setAdvAccountsPurchased(int advAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVACCOUNTSPURCHASED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADVACCOUNTSPURCHASED$6);
            }
            target.setIntValue(advAccountsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "AdvAccountsPurchased" element
     */
    public void xsetAdvAccountsPurchased(org.apache.xmlbeans.XmlInt advAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADVACCOUNTSPURCHASED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ADVACCOUNTSPURCHASED$6);
            }
            target.set(advAccountsPurchased);
        }
    }
    
    /**
     * Gets the "LPAccountsPurchased" element
     */
    public int getLPAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPACCOUNTSPURCHASED$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LPAccountsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetLPAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LPACCOUNTSPURCHASED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LPAccountsPurchased" element
     */
    public void setLPAccountsPurchased(int lpAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPACCOUNTSPURCHASED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LPACCOUNTSPURCHASED$8);
            }
            target.setIntValue(lpAccountsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "LPAccountsPurchased" element
     */
    public void xsetLPAccountsPurchased(org.apache.xmlbeans.XmlInt lpAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LPACCOUNTSPURCHASED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LPACCOUNTSPURCHASED$8);
            }
            target.set(lpAccountsPurchased);
        }
    }
    
    /**
     * Gets the "DOTOAccountsPurchased" element
     */
    public int getDOTOAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOTOACCOUNTSPURCHASED$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DOTOAccountsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetDOTOAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DOTOACCOUNTSPURCHASED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DOTOAccountsPurchased" element
     */
    public void setDOTOAccountsPurchased(int dotoAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOTOACCOUNTSPURCHASED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOTOACCOUNTSPURCHASED$10);
            }
            target.setIntValue(dotoAccountsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "DOTOAccountsPurchased" element
     */
    public void xsetDOTOAccountsPurchased(org.apache.xmlbeans.XmlInt dotoAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DOTOACCOUNTSPURCHASED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DOTOACCOUNTSPURCHASED$10);
            }
            target.set(dotoAccountsPurchased);
        }
    }
    
    /**
     * Gets the "BUAccountsPurchased" element
     */
    public int getBUAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUACCOUNTSPURCHASED$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BUAccountsPurchased" element
     */
    public org.apache.xmlbeans.XmlInt xgetBUAccountsPurchased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUACCOUNTSPURCHASED$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BUAccountsPurchased" element
     */
    public void setBUAccountsPurchased(int buAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUACCOUNTSPURCHASED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUACCOUNTSPURCHASED$12);
            }
            target.setIntValue(buAccountsPurchased);
        }
    }
    
    /**
     * Sets (as xml) the "BUAccountsPurchased" element
     */
    public void xsetBUAccountsPurchased(org.apache.xmlbeans.XmlInt buAccountsPurchased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUACCOUNTSPURCHASED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BUACCOUNTSPURCHASED$12);
            }
            target.set(buAccountsPurchased);
        }
    }
    
    /**
     * Gets the "BeginDate" element
     */
    public java.util.Calendar getBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BeginDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BeginDate" element
     */
    public void setBeginDate(java.util.Calendar beginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINDATE$14);
            }
            target.setCalendarValue(beginDate);
        }
    }
    
    /**
     * Sets (as xml) the "BeginDate" element
     */
    public void xsetBeginDate(org.apache.xmlbeans.XmlDateTime beginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINDATE$14);
            }
            target.set(beginDate);
        }
    }
    
    /**
     * Gets the "EndDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$16);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$16);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Gets the "Notes" element
     */
    public java.lang.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Notes" element
     */
    public org.apache.xmlbeans.XmlString xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Notes" element
     */
    public boolean isNilNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$18) != 0;
        }
    }
    
    /**
     * Sets the "Notes" element
     */
    public void setNotes(java.lang.String notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$18);
            }
            target.setStringValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "Notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlString notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$18);
            }
            target.set(notes);
        }
    }
    
    /**
     * Nils the "Notes" element
     */
    public void setNilNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$18, 0);
        }
    }
    
    /**
     * Gets the "Period" element
     */
    public java.lang.String getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Period" element
     */
    public org.apache.xmlbeans.XmlString xgetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIOD$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Period" element
     */
    public void setPeriod(java.lang.String period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$20);
            }
            target.setStringValue(period);
        }
    }
    
    /**
     * Sets (as xml) the "Period" element
     */
    public void xsetPeriod(org.apache.xmlbeans.XmlString period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIOD$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERIOD$20);
            }
            target.set(period);
        }
    }
    
    /**
     * Gets the "NotificationTitle" element
     */
    public java.lang.String getNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationTitle" element
     */
    public org.apache.xmlbeans.XmlString xgetNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NotificationTitle" element
     */
    public boolean isNilNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NotificationTitle" element
     */
    public boolean isSetNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONTITLE$22) != 0;
        }
    }
    
    /**
     * Sets the "NotificationTitle" element
     */
    public void setNotificationTitle(java.lang.String notificationTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONTITLE$22);
            }
            target.setStringValue(notificationTitle);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationTitle" element
     */
    public void xsetNotificationTitle(org.apache.xmlbeans.XmlString notificationTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONTITLE$22);
            }
            target.set(notificationTitle);
        }
    }
    
    /**
     * Nils the "NotificationTitle" element
     */
    public void setNilNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONTITLE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONTITLE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NotificationTitle" element
     */
    public void unsetNotificationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONTITLE$22, 0);
        }
    }
    
    /**
     * Gets the "NotificationMessage" element
     */
    public java.lang.String getNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NotificationMessage" element
     */
    public boolean isNilNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NotificationMessage" element
     */
    public boolean isSetNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONMESSAGE$24) != 0;
        }
    }
    
    /**
     * Sets the "NotificationMessage" element
     */
    public void setNotificationMessage(java.lang.String notificationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONMESSAGE$24);
            }
            target.setStringValue(notificationMessage);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationMessage" element
     */
    public void xsetNotificationMessage(org.apache.xmlbeans.XmlString notificationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONMESSAGE$24);
            }
            target.set(notificationMessage);
        }
    }
    
    /**
     * Nils the "NotificationMessage" element
     */
    public void setNilNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONMESSAGE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONMESSAGE$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NotificationMessage" element
     */
    public void unsetNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONMESSAGE$24, 0);
        }
    }
    
    /**
     * Gets the "NotificationFlag" element
     */
    public java.lang.String getNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationFlag" element
     */
    public org.apache.xmlbeans.XmlString xgetNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NotificationFlag" element
     */
    public boolean isNilNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NotificationFlag" element
     */
    public boolean isSetNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONFLAG$26) != 0;
        }
    }
    
    /**
     * Sets the "NotificationFlag" element
     */
    public void setNotificationFlag(java.lang.String notificationFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONFLAG$26);
            }
            target.setStringValue(notificationFlag);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationFlag" element
     */
    public void xsetNotificationFlag(org.apache.xmlbeans.XmlString notificationFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONFLAG$26);
            }
            target.set(notificationFlag);
        }
    }
    
    /**
     * Nils the "NotificationFlag" element
     */
    public void setNilNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONFLAG$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONFLAG$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NotificationFlag" element
     */
    public void unsetNotificationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONFLAG$26, 0);
        }
    }
    
    /**
     * Gets the "NotificationExpDate" element
     */
    public java.util.Calendar getNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationExpDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NotificationExpDate" element
     */
    public boolean isNilNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NotificationExpDate" element
     */
    public boolean isSetNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONEXPDATE$28) != 0;
        }
    }
    
    /**
     * Sets the "NotificationExpDate" element
     */
    public void setNotificationExpDate(java.util.Calendar notificationExpDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONEXPDATE$28);
            }
            target.setCalendarValue(notificationExpDate);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationExpDate" element
     */
    public void xsetNotificationExpDate(org.apache.xmlbeans.XmlDateTime notificationExpDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NOTIFICATIONEXPDATE$28);
            }
            target.set(notificationExpDate);
        }
    }
    
    /**
     * Nils the "NotificationExpDate" element
     */
    public void setNilNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONEXPDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NOTIFICATIONEXPDATE$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NotificationExpDate" element
     */
    public void unsetNotificationExpDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONEXPDATE$28, 0);
        }
    }
    
    /**
     * Gets the "ForAccounting" element
     */
    public java.lang.String getForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORACCOUNTING$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForAccounting" element
     */
    public org.apache.xmlbeans.XmlString xgetForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORACCOUNTING$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ForAccounting" element
     */
    public boolean isNilForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORACCOUNTING$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ForAccounting" element
     */
    public boolean isSetForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORACCOUNTING$30) != 0;
        }
    }
    
    /**
     * Sets the "ForAccounting" element
     */
    public void setForAccounting(java.lang.String forAccounting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORACCOUNTING$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORACCOUNTING$30);
            }
            target.setStringValue(forAccounting);
        }
    }
    
    /**
     * Sets (as xml) the "ForAccounting" element
     */
    public void xsetForAccounting(org.apache.xmlbeans.XmlString forAccounting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORACCOUNTING$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORACCOUNTING$30);
            }
            target.set(forAccounting);
        }
    }
    
    /**
     * Nils the "ForAccounting" element
     */
    public void setNilForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORACCOUNTING$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORACCOUNTING$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ForAccounting" element
     */
    public void unsetForAccounting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORACCOUNTING$30, 0);
        }
    }
    
    /**
     * Gets the "HasPurchasedEmails" element
     */
    public boolean getHasPurchasedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPURCHASEDEMAILS$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasPurchasedEmails" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasPurchasedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPURCHASEDEMAILS$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HasPurchasedEmails" element
     */
    public void setHasPurchasedEmails(boolean hasPurchasedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPURCHASEDEMAILS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASPURCHASEDEMAILS$32);
            }
            target.setBooleanValue(hasPurchasedEmails);
        }
    }
    
    /**
     * Sets (as xml) the "HasPurchasedEmails" element
     */
    public void xsetHasPurchasedEmails(org.apache.xmlbeans.XmlBoolean hasPurchasedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASPURCHASEDEMAILS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASPURCHASEDEMAILS$32);
            }
            target.set(hasPurchasedEmails);
        }
    }
    
    /**
     * Gets the "ContractNumber" element
     */
    public java.lang.String getContractNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTNUMBER$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContractNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetContractNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTNUMBER$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContractNumber" element
     */
    public boolean isSetContractNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTNUMBER$34) != 0;
        }
    }
    
    /**
     * Sets the "ContractNumber" element
     */
    public void setContractNumber(java.lang.String contractNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTNUMBER$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTNUMBER$34);
            }
            target.setStringValue(contractNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ContractNumber" element
     */
    public void xsetContractNumber(org.apache.xmlbeans.XmlString contractNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTNUMBER$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRACTNUMBER$34);
            }
            target.set(contractNumber);
        }
    }
    
    /**
     * Unsets the "ContractNumber" element
     */
    public void unsetContractNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTNUMBER$34, 0);
        }
    }
    
    /**
     * Gets the "ContractModifier" element
     */
    public java.lang.String getContractModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTMODIFIER$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContractModifier" element
     */
    public org.apache.xmlbeans.XmlString xgetContractModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTMODIFIER$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContractModifier" element
     */
    public boolean isSetContractModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTMODIFIER$36) != 0;
        }
    }
    
    /**
     * Sets the "ContractModifier" element
     */
    public void setContractModifier(java.lang.String contractModifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTMODIFIER$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTMODIFIER$36);
            }
            target.setStringValue(contractModifier);
        }
    }
    
    /**
     * Sets (as xml) the "ContractModifier" element
     */
    public void xsetContractModifier(org.apache.xmlbeans.XmlString contractModifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTMODIFIER$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRACTMODIFIER$36);
            }
            target.set(contractModifier);
        }
    }
    
    /**
     * Unsets the "ContractModifier" element
     */
    public void unsetContractModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTMODIFIER$36, 0);
        }
    }
    
    /**
     * Gets the "IsRenewal" element
     */
    public boolean getIsRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRENEWAL$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRenewal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRENEWAL$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRenewal" element
     */
    public boolean isSetIsRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRENEWAL$38) != 0;
        }
    }
    
    /**
     * Sets the "IsRenewal" element
     */
    public void setIsRenewal(boolean isRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRENEWAL$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRENEWAL$38);
            }
            target.setBooleanValue(isRenewal);
        }
    }
    
    /**
     * Sets (as xml) the "IsRenewal" element
     */
    public void xsetIsRenewal(org.apache.xmlbeans.XmlBoolean isRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRENEWAL$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRENEWAL$38);
            }
            target.set(isRenewal);
        }
    }
    
    /**
     * Unsets the "IsRenewal" element
     */
    public void unsetIsRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRENEWAL$38, 0);
        }
    }
    
    /**
     * Gets the "NumberofEmails" element
     */
    public long getNumberofEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFEMAILS$40, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberofEmails" element
     */
    public org.apache.xmlbeans.XmlLong xgetNumberofEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFEMAILS$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberofEmails" element
     */
    public void setNumberofEmails(long numberofEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFEMAILS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFEMAILS$40);
            }
            target.setLongValue(numberofEmails);
        }
    }
    
    /**
     * Sets (as xml) the "NumberofEmails" element
     */
    public void xsetNumberofEmails(org.apache.xmlbeans.XmlLong numberofEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFEMAILS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBEROFEMAILS$40);
            }
            target.set(numberofEmails);
        }
    }
}
