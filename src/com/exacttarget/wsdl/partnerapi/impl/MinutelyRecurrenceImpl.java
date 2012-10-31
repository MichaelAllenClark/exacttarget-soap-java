/*
 * XML Type:  MinutelyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MinutelyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML MinutelyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class MinutelyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.MinutelyRecurrence
{
    
    public MinutelyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINUTELYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinutelyRecurrencePatternType");
    private static final javax.xml.namespace.QName MINUTEINTERVAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MinuteInterval");
    
    
    /**
     * Gets the "MinutelyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum.Enum getMinutelyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTELYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinutelyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum xgetMinutelyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum)get_store().find_element_user(MINUTELYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinutelyRecurrencePatternType" element
     */
    public boolean isSetMinutelyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINUTELYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "MinutelyRecurrencePatternType" element
     */
    public void setMinutelyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum.Enum minutelyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTELYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTELYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(minutelyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "MinutelyRecurrencePatternType" element
     */
    public void xsetMinutelyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum minutelyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum)get_store().find_element_user(MINUTELYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MinutelyRecurrencePatternTypeEnum)get_store().add_element_user(MINUTELYRECURRENCEPATTERNTYPE$0);
            }
            target.set(minutelyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "MinutelyRecurrencePatternType" element
     */
    public void unsetMinutelyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINUTELYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "MinuteInterval" element
     */
    public int getMinuteInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTEINTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinuteInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinuteInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTEINTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinuteInterval" element
     */
    public boolean isSetMinuteInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINUTEINTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "MinuteInterval" element
     */
    public void setMinuteInterval(int minuteInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTEINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTEINTERVAL$2);
            }
            target.setIntValue(minuteInterval);
        }
    }
    
    /**
     * Sets (as xml) the "MinuteInterval" element
     */
    public void xsetMinuteInterval(org.apache.xmlbeans.XmlInt minuteInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTEINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINUTEINTERVAL$2);
            }
            target.set(minuteInterval);
        }
    }
    
    /**
     * Unsets the "MinuteInterval" element
     */
    public void unsetMinuteInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINUTEINTERVAL$2, 0);
        }
    }
}
