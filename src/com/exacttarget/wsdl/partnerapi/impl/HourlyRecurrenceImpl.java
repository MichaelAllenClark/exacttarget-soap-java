/*
 * XML Type:  HourlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.HourlyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML HourlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class HourlyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.HourlyRecurrence
{
    
    public HourlyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOURLYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HourlyRecurrencePatternType");
    private static final javax.xml.namespace.QName HOURINTERVAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HourInterval");
    
    
    /**
     * Gets the "HourlyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum.Enum getHourlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HourlyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum xgetHourlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum)get_store().find_element_user(HOURLYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "HourlyRecurrencePatternType" element
     */
    public boolean isSetHourlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOURLYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "HourlyRecurrencePatternType" element
     */
    public void setHourlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum.Enum hourlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOURLYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(hourlyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "HourlyRecurrencePatternType" element
     */
    public void xsetHourlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum hourlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum)get_store().find_element_user(HOURLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.HourlyRecurrencePatternTypeEnum)get_store().add_element_user(HOURLYRECURRENCEPATTERNTYPE$0);
            }
            target.set(hourlyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "HourlyRecurrencePatternType" element
     */
    public void unsetHourlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOURLYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "HourInterval" element
     */
    public int getHourInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURINTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HourInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetHourInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURINTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "HourInterval" element
     */
    public boolean isSetHourInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOURINTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "HourInterval" element
     */
    public void setHourInterval(int hourInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOURINTERVAL$2);
            }
            target.setIntValue(hourInterval);
        }
    }
    
    /**
     * Sets (as xml) the "HourInterval" element
     */
    public void xsetHourInterval(org.apache.xmlbeans.XmlInt hourInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOURINTERVAL$2);
            }
            target.set(hourInterval);
        }
    }
    
    /**
     * Unsets the "HourInterval" element
     */
    public void unsetHourInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOURINTERVAL$2, 0);
        }
    }
}
