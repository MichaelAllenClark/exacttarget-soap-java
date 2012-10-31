/*
 * XML Type:  ValidationResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ValidationResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ValidationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ValidationResult
{
    
    public ValidationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName CHECKTIME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CheckTime");
    private static final javax.xml.namespace.QName CHECKTIMEUTC$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CheckTimeUTC");
    private static final javax.xml.namespace.QName ISRESULTVALID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsResultValid");
    private static final javax.xml.namespace.QName ISSPAM$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSpam");
    private static final javax.xml.namespace.QName SCORE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Score");
    private static final javax.xml.namespace.QName THRESHOLD$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Threshold");
    private static final javax.xml.namespace.QName MESSAGE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Message");
    
    
    /**
     * Gets the "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Subscriber" element
     */
    public boolean isSetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBER$0) != 0;
        }
    }
    
    /**
     * Sets the "Subscriber" element
     */
    public void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            }
            target.set(subscriber);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Subscriber" element
     */
    public void unsetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBER$0, 0);
        }
    }
    
    /**
     * Gets the "CheckTime" element
     */
    public java.util.Calendar getCheckTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CheckTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCheckTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CHECKTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CheckTime" element
     */
    public boolean isSetCheckTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "CheckTime" element
     */
    public void setCheckTime(java.util.Calendar checkTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKTIME$2);
            }
            target.setCalendarValue(checkTime);
        }
    }
    
    /**
     * Sets (as xml) the "CheckTime" element
     */
    public void xsetCheckTime(org.apache.xmlbeans.XmlDateTime checkTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CHECKTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CHECKTIME$2);
            }
            target.set(checkTime);
        }
    }
    
    /**
     * Unsets the "CheckTime" element
     */
    public void unsetCheckTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKTIME$2, 0);
        }
    }
    
    /**
     * Gets the "CheckTimeUTC" element
     */
    public java.util.Calendar getCheckTimeUTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKTIMEUTC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CheckTimeUTC" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCheckTimeUTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CHECKTIMEUTC$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CheckTimeUTC" element
     */
    public boolean isSetCheckTimeUTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKTIMEUTC$4) != 0;
        }
    }
    
    /**
     * Sets the "CheckTimeUTC" element
     */
    public void setCheckTimeUTC(java.util.Calendar checkTimeUTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKTIMEUTC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKTIMEUTC$4);
            }
            target.setCalendarValue(checkTimeUTC);
        }
    }
    
    /**
     * Sets (as xml) the "CheckTimeUTC" element
     */
    public void xsetCheckTimeUTC(org.apache.xmlbeans.XmlDateTime checkTimeUTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CHECKTIMEUTC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CHECKTIMEUTC$4);
            }
            target.set(checkTimeUTC);
        }
    }
    
    /**
     * Unsets the "CheckTimeUTC" element
     */
    public void unsetCheckTimeUTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKTIMEUTC$4, 0);
        }
    }
    
    /**
     * Gets the "IsResultValid" element
     */
    public boolean getIsResultValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESULTVALID$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsResultValid" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsResultValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESULTVALID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsResultValid" element
     */
    public boolean isSetIsResultValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRESULTVALID$6) != 0;
        }
    }
    
    /**
     * Sets the "IsResultValid" element
     */
    public void setIsResultValid(boolean isResultValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRESULTVALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRESULTVALID$6);
            }
            target.setBooleanValue(isResultValid);
        }
    }
    
    /**
     * Sets (as xml) the "IsResultValid" element
     */
    public void xsetIsResultValid(org.apache.xmlbeans.XmlBoolean isResultValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRESULTVALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRESULTVALID$6);
            }
            target.set(isResultValid);
        }
    }
    
    /**
     * Unsets the "IsResultValid" element
     */
    public void unsetIsResultValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRESULTVALID$6, 0);
        }
    }
    
    /**
     * Gets the "IsSpam" element
     */
    public boolean getIsSpam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPAM$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSpam" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSpam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSPAM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSpam" element
     */
    public boolean isSetIsSpam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSPAM$8) != 0;
        }
    }
    
    /**
     * Sets the "IsSpam" element
     */
    public void setIsSpam(boolean isSpam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPAM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSPAM$8);
            }
            target.setBooleanValue(isSpam);
        }
    }
    
    /**
     * Sets (as xml) the "IsSpam" element
     */
    public void xsetIsSpam(org.apache.xmlbeans.XmlBoolean isSpam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSPAM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSPAM$8);
            }
            target.set(isSpam);
        }
    }
    
    /**
     * Unsets the "IsSpam" element
     */
    public void unsetIsSpam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSPAM$8, 0);
        }
    }
    
    /**
     * Gets the "Score" element
     */
    public double getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Score" element
     */
    public org.apache.xmlbeans.XmlDouble xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SCORE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Score" element
     */
    public boolean isSetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$10) != 0;
        }
    }
    
    /**
     * Sets the "Score" element
     */
    public void setScore(double score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$10);
            }
            target.setDoubleValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "Score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlDouble score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SCORE$10);
            }
            target.set(score);
        }
    }
    
    /**
     * Unsets the "Score" element
     */
    public void unsetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$10, 0);
        }
    }
    
    /**
     * Gets the "Threshold" element
     */
    public double getThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLD$12, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Threshold" element
     */
    public org.apache.xmlbeans.XmlDouble xgetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(THRESHOLD$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Threshold" element
     */
    public boolean isSetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THRESHOLD$12) != 0;
        }
    }
    
    /**
     * Sets the "Threshold" element
     */
    public void setThreshold(double threshold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THRESHOLD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THRESHOLD$12);
            }
            target.setDoubleValue(threshold);
        }
    }
    
    /**
     * Sets (as xml) the "Threshold" element
     */
    public void xsetThreshold(org.apache.xmlbeans.XmlDouble threshold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(THRESHOLD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(THRESHOLD$12);
            }
            target.set(threshold);
        }
    }
    
    /**
     * Unsets the "Threshold" element
     */
    public void unsetThreshold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THRESHOLD$12, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$14) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$14);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$14);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$14, 0);
        }
    }
}
