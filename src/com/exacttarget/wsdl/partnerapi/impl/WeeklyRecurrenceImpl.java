/*
 * XML Type:  WeeklyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.WeeklyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML WeeklyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class WeeklyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.WeeklyRecurrence
{
    
    public WeeklyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEEKLYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "WeeklyRecurrencePatternType");
    private static final javax.xml.namespace.QName WEEKINTERVAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "WeekInterval");
    private static final javax.xml.namespace.QName SUNDAY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Sunday");
    private static final javax.xml.namespace.QName MONDAY$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Monday");
    private static final javax.xml.namespace.QName TUESDAY$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Tuesday");
    private static final javax.xml.namespace.QName WEDNESDAY$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Wednesday");
    private static final javax.xml.namespace.QName THURSDAY$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Thursday");
    private static final javax.xml.namespace.QName FRIDAY$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Friday");
    private static final javax.xml.namespace.QName SATURDAY$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Saturday");
    
    
    /**
     * Gets the "WeeklyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum.Enum getWeeklyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WeeklyRecurrencePatternType" element
     */
    public com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum xgetWeeklyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum)get_store().find_element_user(WEEKLYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "WeeklyRecurrencePatternType" element
     */
    public boolean isSetWeeklyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKLYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "WeeklyRecurrencePatternType" element
     */
    public void setWeeklyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum.Enum weeklyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKLYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(weeklyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "WeeklyRecurrencePatternType" element
     */
    public void xsetWeeklyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum weeklyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum)get_store().find_element_user(WEEKLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.WeeklyRecurrencePatternTypeEnum)get_store().add_element_user(WEEKLYRECURRENCEPATTERNTYPE$0);
            }
            target.set(weeklyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "WeeklyRecurrencePatternType" element
     */
    public void unsetWeeklyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKLYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "WeekInterval" element
     */
    public int getWeekInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKINTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "WeekInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetWeekInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKINTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "WeekInterval" element
     */
    public boolean isSetWeekInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKINTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "WeekInterval" element
     */
    public void setWeekInterval(int weekInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKINTERVAL$2);
            }
            target.setIntValue(weekInterval);
        }
    }
    
    /**
     * Sets (as xml) the "WeekInterval" element
     */
    public void xsetWeekInterval(org.apache.xmlbeans.XmlInt weekInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKINTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WEEKINTERVAL$2);
            }
            target.set(weekInterval);
        }
    }
    
    /**
     * Unsets the "WeekInterval" element
     */
    public void unsetWeekInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKINTERVAL$2, 0);
        }
    }
    
    /**
     * Gets the "Sunday" element
     */
    public boolean getSunday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUNDAY$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sunday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSunday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUNDAY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sunday" element
     */
    public boolean isSetSunday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUNDAY$4) != 0;
        }
    }
    
    /**
     * Sets the "Sunday" element
     */
    public void setSunday(boolean sunday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUNDAY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUNDAY$4);
            }
            target.setBooleanValue(sunday);
        }
    }
    
    /**
     * Sets (as xml) the "Sunday" element
     */
    public void xsetSunday(org.apache.xmlbeans.XmlBoolean sunday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUNDAY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUNDAY$4);
            }
            target.set(sunday);
        }
    }
    
    /**
     * Unsets the "Sunday" element
     */
    public void unsetSunday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUNDAY$4, 0);
        }
    }
    
    /**
     * Gets the "Monday" element
     */
    public boolean getMonday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONDAY$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Monday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMonday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MONDAY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Monday" element
     */
    public boolean isSetMonday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONDAY$6) != 0;
        }
    }
    
    /**
     * Sets the "Monday" element
     */
    public void setMonday(boolean monday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONDAY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONDAY$6);
            }
            target.setBooleanValue(monday);
        }
    }
    
    /**
     * Sets (as xml) the "Monday" element
     */
    public void xsetMonday(org.apache.xmlbeans.XmlBoolean monday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MONDAY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MONDAY$6);
            }
            target.set(monday);
        }
    }
    
    /**
     * Unsets the "Monday" element
     */
    public void unsetMonday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONDAY$6, 0);
        }
    }
    
    /**
     * Gets the "Tuesday" element
     */
    public boolean getTuesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TUESDAY$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tuesday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTuesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TUESDAY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Tuesday" element
     */
    public boolean isSetTuesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TUESDAY$8) != 0;
        }
    }
    
    /**
     * Sets the "Tuesday" element
     */
    public void setTuesday(boolean tuesday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TUESDAY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TUESDAY$8);
            }
            target.setBooleanValue(tuesday);
        }
    }
    
    /**
     * Sets (as xml) the "Tuesday" element
     */
    public void xsetTuesday(org.apache.xmlbeans.XmlBoolean tuesday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TUESDAY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TUESDAY$8);
            }
            target.set(tuesday);
        }
    }
    
    /**
     * Unsets the "Tuesday" element
     */
    public void unsetTuesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TUESDAY$8, 0);
        }
    }
    
    /**
     * Gets the "Wednesday" element
     */
    public boolean getWednesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEDNESDAY$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Wednesday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWednesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEDNESDAY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Wednesday" element
     */
    public boolean isSetWednesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEDNESDAY$10) != 0;
        }
    }
    
    /**
     * Sets the "Wednesday" element
     */
    public void setWednesday(boolean wednesday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEDNESDAY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEDNESDAY$10);
            }
            target.setBooleanValue(wednesday);
        }
    }
    
    /**
     * Sets (as xml) the "Wednesday" element
     */
    public void xsetWednesday(org.apache.xmlbeans.XmlBoolean wednesday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEDNESDAY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WEDNESDAY$10);
            }
            target.set(wednesday);
        }
    }
    
    /**
     * Unsets the "Wednesday" element
     */
    public void unsetWednesday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEDNESDAY$10, 0);
        }
    }
    
    /**
     * Gets the "Thursday" element
     */
    public boolean getThursday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THURSDAY$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Thursday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetThursday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(THURSDAY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Thursday" element
     */
    public boolean isSetThursday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THURSDAY$12) != 0;
        }
    }
    
    /**
     * Sets the "Thursday" element
     */
    public void setThursday(boolean thursday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THURSDAY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THURSDAY$12);
            }
            target.setBooleanValue(thursday);
        }
    }
    
    /**
     * Sets (as xml) the "Thursday" element
     */
    public void xsetThursday(org.apache.xmlbeans.XmlBoolean thursday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(THURSDAY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(THURSDAY$12);
            }
            target.set(thursday);
        }
    }
    
    /**
     * Unsets the "Thursday" element
     */
    public void unsetThursday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THURSDAY$12, 0);
        }
    }
    
    /**
     * Gets the "Friday" element
     */
    public boolean getFriday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDAY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Friday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFriday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FRIDAY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Friday" element
     */
    public boolean isSetFriday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRIDAY$14) != 0;
        }
    }
    
    /**
     * Sets the "Friday" element
     */
    public void setFriday(boolean friday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIDAY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIDAY$14);
            }
            target.setBooleanValue(friday);
        }
    }
    
    /**
     * Sets (as xml) the "Friday" element
     */
    public void xsetFriday(org.apache.xmlbeans.XmlBoolean friday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FRIDAY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FRIDAY$14);
            }
            target.set(friday);
        }
    }
    
    /**
     * Unsets the "Friday" element
     */
    public void unsetFriday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRIDAY$14, 0);
        }
    }
    
    /**
     * Gets the "Saturday" element
     */
    public boolean getSaturday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SATURDAY$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Saturday" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaturday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SATURDAY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Saturday" element
     */
    public boolean isSetSaturday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATURDAY$16) != 0;
        }
    }
    
    /**
     * Sets the "Saturday" element
     */
    public void setSaturday(boolean saturday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SATURDAY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SATURDAY$16);
            }
            target.setBooleanValue(saturday);
        }
    }
    
    /**
     * Sets (as xml) the "Saturday" element
     */
    public void xsetSaturday(org.apache.xmlbeans.XmlBoolean saturday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SATURDAY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SATURDAY$16);
            }
            target.set(saturday);
        }
    }
    
    /**
     * Unsets the "Saturday" element
     */
    public void unsetSaturday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATURDAY$16, 0);
        }
    }
}
