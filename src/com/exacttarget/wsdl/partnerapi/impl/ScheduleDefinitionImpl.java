/*
 * XML Type:  ScheduleDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ScheduleDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ScheduleDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ScheduleDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ScheduleDefinition
{
    
    public ScheduleDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName RECURRENCE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Recurrence");
    private static final javax.xml.namespace.QName RECURRENCETYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RecurrenceType");
    private static final javax.xml.namespace.QName RECURRENCERANGETYPE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RecurrenceRangeType");
    private static final javax.xml.namespace.QName STARTDATETIME$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StartDateTime");
    private static final javax.xml.namespace.QName ENDDATETIME$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EndDateTime");
    private static final javax.xml.namespace.QName OCCURRENCES$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Occurrences");
    private static final javax.xml.namespace.QName KEYWORD$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Keyword");
    private static final javax.xml.namespace.QName TIMEZONE$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TimeZone");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "Recurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.Recurrence getRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Recurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.Recurrence)get_store().find_element_user(RECURRENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Recurrence" element
     */
    public void setRecurrence(com.exacttarget.wsdl.partnerapi.Recurrence recurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Recurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.Recurrence)get_store().find_element_user(RECURRENCE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Recurrence)get_store().add_element_user(RECURRENCE$4);
            }
            target.set(recurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "Recurrence" element
     */
    public com.exacttarget.wsdl.partnerapi.Recurrence addNewRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Recurrence target = null;
            target = (com.exacttarget.wsdl.partnerapi.Recurrence)get_store().add_element_user(RECURRENCE$4);
            return target;
        }
    }
    
    /**
     * Gets the "RecurrenceType" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum getRecurrenceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceType" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum xgetRecurrenceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().find_element_user(RECURRENCETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecurrenceType" element
     */
    public boolean isSetRecurrenceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCETYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "RecurrenceType" element
     */
    public void setRecurrenceType(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum recurrenceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCETYPE$6);
            }
            target.setEnumValue(recurrenceType);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceType" element
     */
    public void xsetRecurrenceType(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum recurrenceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().find_element_user(RECURRENCETYPE$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().add_element_user(RECURRENCETYPE$6);
            }
            target.set(recurrenceType);
        }
    }
    
    /**
     * Unsets the "RecurrenceType" element
     */
    public void unsetRecurrenceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCETYPE$6, 0);
        }
    }
    
    /**
     * Gets the "RecurrenceRangeType" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum.Enum getRecurrenceRangeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCERANGETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceRangeType" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum xgetRecurrenceRangeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum)get_store().find_element_user(RECURRENCERANGETYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecurrenceRangeType" element
     */
    public boolean isSetRecurrenceRangeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCERANGETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "RecurrenceRangeType" element
     */
    public void setRecurrenceRangeType(com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum.Enum recurrenceRangeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCERANGETYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCERANGETYPE$8);
            }
            target.setEnumValue(recurrenceRangeType);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceRangeType" element
     */
    public void xsetRecurrenceRangeType(com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum recurrenceRangeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum)get_store().find_element_user(RECURRENCERANGETYPE$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum)get_store().add_element_user(RECURRENCERANGETYPE$8);
            }
            target.set(recurrenceRangeType);
        }
    }
    
    /**
     * Unsets the "RecurrenceRangeType" element
     */
    public void unsetRecurrenceRangeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCERANGETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "StartDateTime" element
     */
    public java.util.Calendar getStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATETIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartDateTime" element
     */
    public boolean isSetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATETIME$10) != 0;
        }
    }
    
    /**
     * Sets the "StartDateTime" element
     */
    public void setStartDateTime(java.util.Calendar startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATETIME$10);
            }
            target.setCalendarValue(startDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    public void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATETIME$10);
            }
            target.set(startDateTime);
        }
    }
    
    /**
     * Unsets the "StartDateTime" element
     */
    public void unsetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATETIME$10, 0);
        }
    }
    
    /**
     * Gets the "EndDateTime" element
     */
    public java.util.Calendar getEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATETIME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EndDateTime" element
     */
    public boolean isSetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "EndDateTime" element
     */
    public void setEndDateTime(java.util.Calendar endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATETIME$12);
            }
            target.setCalendarValue(endDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "EndDateTime" element
     */
    public void xsetEndDateTime(org.apache.xmlbeans.XmlDateTime endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATETIME$12);
            }
            target.set(endDateTime);
        }
    }
    
    /**
     * Unsets the "EndDateTime" element
     */
    public void unsetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "Occurrences" element
     */
    public int getOccurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCES$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Occurrences" element
     */
    public org.apache.xmlbeans.XmlInt xgetOccurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OCCURRENCES$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Occurrences" element
     */
    public boolean isSetOccurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OCCURRENCES$14) != 0;
        }
    }
    
    /**
     * Sets the "Occurrences" element
     */
    public void setOccurrences(int occurrences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCES$14);
            }
            target.setIntValue(occurrences);
        }
    }
    
    /**
     * Sets (as xml) the "Occurrences" element
     */
    public void xsetOccurrences(org.apache.xmlbeans.XmlInt occurrences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OCCURRENCES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OCCURRENCES$14);
            }
            target.set(occurrences);
        }
    }
    
    /**
     * Unsets the "Occurrences" element
     */
    public void unsetOccurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OCCURRENCES$14, 0);
        }
    }
    
    /**
     * Gets the "Keyword" element
     */
    public java.lang.String getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Keyword" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Keyword" element
     */
    public boolean isSetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$16) != 0;
        }
    }
    
    /**
     * Sets the "Keyword" element
     */
    public void setKeyword(java.lang.String keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORD$16);
            }
            target.setStringValue(keyword);
        }
    }
    
    /**
     * Sets (as xml) the "Keyword" element
     */
    public void xsetKeyword(org.apache.xmlbeans.XmlString keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORD$16);
            }
            target.set(keyword);
        }
    }
    
    /**
     * Unsets the "Keyword" element
     */
    public void unsetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$16, 0);
        }
    }
    
    /**
     * Gets the "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$18) != 0;
        }
    }
    
    /**
     * Sets the "TimeZone" element
     */
    public void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$18);
            }
            target.set(timeZone);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$18, 0);
        }
    }
}
