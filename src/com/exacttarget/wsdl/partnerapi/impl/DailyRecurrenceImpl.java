/*
 * XML Type:  DailyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DailyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DailyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DailyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.DailyRecurrence
{
    
    public DailyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAILYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DailyRecurrencePatternType");
    private static final javax.xml.namespace.QName DAYINTERVAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DayInterval");
    
    
    /**
     * Gets the "DailyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum.Enum getDailyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAILYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DailyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum xgetDailyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum)get_store().find_element_user(DAILYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DailyRecurrencePatternType" element
     */
    public boolean isSetDailyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAILYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "DailyRecurrencePatternType" element
     */
    public void setDailyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum.Enum dailyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAILYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAILYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(dailyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "DailyRecurrencePatternType" element
     */
    public void xsetDailyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum dailyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum)get_store().find_element_user(DAILYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DailyRecurrencePatternTypeEnum)get_store().add_element_user(DAILYRECURRENCEPATTERNTYPE$0);
            }
            target.set(dailyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "DailyRecurrencePatternType" element
     */
    public void unsetDailyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAILYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "DayInterval" element
     */
    public int getDayInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYINTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DayInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetDayInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYINTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DayInterval" element
     */
    public boolean isSetDayInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYINTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "DayInterval" element
     */
    public void setDayInterval(int dayInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYINTERVAL$2);
            }
            target.setIntValue(dayInterval);
        }
    }
    
    /**
     * Sets (as xml) the "DayInterval" element
     */
    public void xsetDayInterval(org.apache.xmlbeans.XmlInt dayInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DAYINTERVAL$2);
            }
            target.set(dayInterval);
        }
    }
    
    /**
     * Unsets the "DayInterval" element
     */
    public void unsetDayInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYINTERVAL$2, 0);
        }
    }
}
