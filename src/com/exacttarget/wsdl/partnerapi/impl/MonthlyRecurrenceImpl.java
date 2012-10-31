/*
 * XML Type:  MonthlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MonthlyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML MonthlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class MonthlyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.MonthlyRecurrence
{
    
    public MonthlyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONTHLYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MonthlyRecurrencePatternType");
    private static final javax.xml.namespace.QName MONTHLYINTERVAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MonthlyInterval");
    private static final javax.xml.namespace.QName SCHEDULEDDAY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledDay");
    private static final javax.xml.namespace.QName SCHEDULEDWEEK$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledWeek");
    private static final javax.xml.namespace.QName SCHEDULEDDAYOFWEEK$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledDayOfWeek");
    
    
    /**
     * Gets the "MonthlyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum.Enum getMonthlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MonthlyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum xgetMonthlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum)get_store().find_element_user(MONTHLYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MonthlyRecurrencePatternType" element
     */
    public boolean isSetMonthlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONTHLYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "MonthlyRecurrencePatternType" element
     */
    public void setMonthlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum.Enum monthlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTHLYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(monthlyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "MonthlyRecurrencePatternType" element
     */
    public void xsetMonthlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum monthlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum)get_store().find_element_user(MONTHLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum)get_store().add_element_user(MONTHLYRECURRENCEPATTERNTYPE$0);
            }
            target.set(monthlyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "MonthlyRecurrencePatternType" element
     */
    public void unsetMonthlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONTHLYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "MonthlyInterval" element
     */
    public int getMonthlyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHLYINTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MonthlyInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetMonthlyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONTHLYINTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MonthlyInterval" element
     */
    public boolean isSetMonthlyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONTHLYINTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "MonthlyInterval" element
     */
    public void setMonthlyInterval(int monthlyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHLYINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTHLYINTERVAL$2);
            }
            target.setIntValue(monthlyInterval);
        }
    }
    
    /**
     * Sets (as xml) the "MonthlyInterval" element
     */
    public void xsetMonthlyInterval(org.apache.xmlbeans.XmlInt monthlyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONTHLYINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONTHLYINTERVAL$2);
            }
            target.set(monthlyInterval);
        }
    }
    
    /**
     * Unsets the "MonthlyInterval" element
     */
    public void unsetMonthlyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONTHLYINTERVAL$2, 0);
        }
    }
    
    /**
     * Gets the "ScheduledDay" element
     */
    public int getScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAY$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledDay" element
     */
    public org.apache.xmlbeans.XmlInt xgetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCHEDULEDDAY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledDay" element
     */
    public boolean isSetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDDAY$4) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledDay" element
     */
    public void setScheduledDay(int scheduledDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDDAY$4);
            }
            target.setIntValue(scheduledDay);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledDay" element
     */
    public void xsetScheduledDay(org.apache.xmlbeans.XmlInt scheduledDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCHEDULEDDAY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCHEDULEDDAY$4);
            }
            target.set(scheduledDay);
        }
    }
    
    /**
     * Unsets the "ScheduledDay" element
     */
    public void unsetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDDAY$4, 0);
        }
    }
    
    /**
     * Gets the "ScheduledWeek" element
     */
    public com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum getScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDWEEK$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledWeek" element
     */
    public com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum xgetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().find_element_user(SCHEDULEDWEEK$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledWeek" element
     */
    public boolean isSetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDWEEK$6) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledWeek" element
     */
    public void setScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum scheduledWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDWEEK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDWEEK$6);
            }
            target.setEnumValue(scheduledWeek);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledWeek" element
     */
    public void xsetScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum scheduledWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().find_element_user(SCHEDULEDWEEK$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().add_element_user(SCHEDULEDWEEK$6);
            }
            target.set(scheduledWeek);
        }
    }
    
    /**
     * Unsets the "ScheduledWeek" element
     */
    public void unsetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDWEEK$6, 0);
        }
    }
    
    /**
     * Gets the "ScheduledDayOfWeek" element
     */
    public com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum getScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledDayOfWeek" element
     */
    public com.exacttarget.wsdl.partnerapi.DayOfWeekEnum xgetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DayOfWeekEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledDayOfWeek" element
     */
    public boolean isSetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDDAYOFWEEK$8) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledDayOfWeek" element
     */
    public void setScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum scheduledDayOfWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDDAYOFWEEK$8);
            }
            target.setEnumValue(scheduledDayOfWeek);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledDayOfWeek" element
     */
    public void xsetScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum scheduledDayOfWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DayOfWeekEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().add_element_user(SCHEDULEDDAYOFWEEK$8);
            }
            target.set(scheduledDayOfWeek);
        }
    }
    
    /**
     * Unsets the "ScheduledDayOfWeek" element
     */
    public void unsetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDDAYOFWEEK$8, 0);
        }
    }
}
