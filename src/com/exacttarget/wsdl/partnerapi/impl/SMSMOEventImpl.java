/*
 * XML Type:  SMSMOEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSMOEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSMOEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSMOEventImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SMSMOEvent
{
    
    public SMSMOEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Keyword");
    private static final javax.xml.namespace.QName MOBILETELEPHONENUMBER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MobileTelephoneNumber");
    private static final javax.xml.namespace.QName MOCODE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MOCode");
    private static final javax.xml.namespace.QName EVENTDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EventDate");
    private static final javax.xml.namespace.QName MOMESSAGE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MOMessage");
    private static final javax.xml.namespace.QName MTMESSAGE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MTMessage");
    private static final javax.xml.namespace.QName CARRIER$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Carrier");
    
    
    /**
     * Gets the "Keyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(KEYWORD$0) != 0;
        }
    }
    
    /**
     * Sets the "Keyword" element
     */
    public void setKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(KEYWORD$0);
            }
            target.set(keyword);
        }
    }
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(KEYWORD$0);
            return target;
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
            get_store().remove_element(KEYWORD$0, 0);
        }
    }
    
    /**
     * Gets the "MobileTelephoneNumber" element
     */
    public java.lang.String getMobileTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILETELEPHONENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MobileTelephoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetMobileTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILETELEPHONENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MobileTelephoneNumber" element
     */
    public boolean isSetMobileTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILETELEPHONENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "MobileTelephoneNumber" element
     */
    public void setMobileTelephoneNumber(java.lang.String mobileTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILETELEPHONENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILETELEPHONENUMBER$2);
            }
            target.setStringValue(mobileTelephoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MobileTelephoneNumber" element
     */
    public void xsetMobileTelephoneNumber(org.apache.xmlbeans.XmlString mobileTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILETELEPHONENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILETELEPHONENUMBER$2);
            }
            target.set(mobileTelephoneNumber);
        }
    }
    
    /**
     * Unsets the "MobileTelephoneNumber" element
     */
    public void unsetMobileTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILETELEPHONENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "MOCode" element
     */
    public java.lang.String getMOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MOCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "MOCode" element
     */
    public boolean isSetMOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "MOCode" element
     */
    public void setMOCode(java.lang.String moCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOCODE$4);
            }
            target.setStringValue(moCode);
        }
    }
    
    /**
     * Sets (as xml) the "MOCode" element
     */
    public void xsetMOCode(org.apache.xmlbeans.XmlString moCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOCODE$4);
            }
            target.set(moCode);
        }
    }
    
    /**
     * Unsets the "MOCode" element
     */
    public void unsetMOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOCODE$4, 0);
        }
    }
    
    /**
     * Gets the "EventDate" element
     */
    public java.util.Calendar getEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EventDate" element
     */
    public boolean isSetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "EventDate" element
     */
    public void setEventDate(java.util.Calendar eventDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDATE$6);
            }
            target.setCalendarValue(eventDate);
        }
    }
    
    /**
     * Sets (as xml) the "EventDate" element
     */
    public void xsetEventDate(org.apache.xmlbeans.XmlDateTime eventDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTDATE$6);
            }
            target.set(eventDate);
        }
    }
    
    /**
     * Unsets the "EventDate" element
     */
    public void unsetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDATE$6, 0);
        }
    }
    
    /**
     * Gets the "MOMessage" element
     */
    public java.lang.String getMOMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MOMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetMOMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MOMessage" element
     */
    public boolean isSetMOMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOMESSAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "MOMessage" element
     */
    public void setMOMessage(java.lang.String moMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOMESSAGE$8);
            }
            target.setStringValue(moMessage);
        }
    }
    
    /**
     * Sets (as xml) the "MOMessage" element
     */
    public void xsetMOMessage(org.apache.xmlbeans.XmlString moMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOMESSAGE$8);
            }
            target.set(moMessage);
        }
    }
    
    /**
     * Unsets the "MOMessage" element
     */
    public void unsetMOMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOMESSAGE$8, 0);
        }
    }
    
    /**
     * Gets the "MTMessage" element
     */
    public java.lang.String getMTMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MTMESSAGE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MTMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetMTMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MTMESSAGE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MTMessage" element
     */
    public boolean isSetMTMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MTMESSAGE$10) != 0;
        }
    }
    
    /**
     * Sets the "MTMessage" element
     */
    public void setMTMessage(java.lang.String mtMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MTMESSAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MTMESSAGE$10);
            }
            target.setStringValue(mtMessage);
        }
    }
    
    /**
     * Sets (as xml) the "MTMessage" element
     */
    public void xsetMTMessage(org.apache.xmlbeans.XmlString mtMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MTMESSAGE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MTMESSAGE$10);
            }
            target.set(mtMessage);
        }
    }
    
    /**
     * Unsets the "MTMessage" element
     */
    public void unsetMTMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MTMESSAGE$10, 0);
        }
    }
    
    /**
     * Gets the "Carrier" element
     */
    public java.lang.String getCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Carrier" element
     */
    public org.apache.xmlbeans.XmlString xgetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Carrier" element
     */
    public boolean isSetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIER$12) != 0;
        }
    }
    
    /**
     * Sets the "Carrier" element
     */
    public void setCarrier(java.lang.String carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARRIER$12);
            }
            target.setStringValue(carrier);
        }
    }
    
    /**
     * Sets (as xml) the "Carrier" element
     */
    public void xsetCarrier(org.apache.xmlbeans.XmlString carrier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARRIER$12);
            }
            target.set(carrier);
        }
    }
    
    /**
     * Unsets the "Carrier" element
     */
    public void unsetCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIER$12, 0);
        }
    }
}
