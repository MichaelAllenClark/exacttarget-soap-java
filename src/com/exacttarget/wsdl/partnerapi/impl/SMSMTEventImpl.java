/*
 * XML Type:  SMSMTEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSMTEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSMTEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSMTEventImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SMSMTEvent
{
    
    public SMSMTEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMSTRIGGEREDSEND$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SMSTriggeredSend");
    private static final javax.xml.namespace.QName SUBSCRIBER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName MOCODE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MOCode");
    private static final javax.xml.namespace.QName EVENTDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EventDate");
    private static final javax.xml.namespace.QName CARRIER$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Carrier");
    
    
    /**
     * Gets the "SMSTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.SMSTriggeredSend getSMSTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSend)get_store().find_element_user(SMSTRIGGEREDSEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SMSTriggeredSend" element
     */
    public boolean isSetSMSTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMSTRIGGEREDSEND$0) != 0;
        }
    }
    
    /**
     * Sets the "SMSTriggeredSend" element
     */
    public void setSMSTriggeredSend(com.exacttarget.wsdl.partnerapi.SMSTriggeredSend smsTriggeredSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSend)get_store().find_element_user(SMSTRIGGEREDSEND$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSend)get_store().add_element_user(SMSTRIGGEREDSEND$0);
            }
            target.set(smsTriggeredSend);
        }
    }
    
    /**
     * Appends and returns a new empty "SMSTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.SMSTriggeredSend addNewSMSTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSend target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSend)get_store().add_element_user(SMSTRIGGEREDSEND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SMSTriggeredSend" element
     */
    public void unsetSMSTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMSTRIGGEREDSEND$0, 0);
        }
    }
    
    /**
     * Gets the "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
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
            return get_store().count_elements(SUBSCRIBER$2) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
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
            get_store().remove_element(SUBSCRIBER$2, 0);
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
     * Gets the "Carrier" element
     */
    public java.lang.String getCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$8, 0);
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
            return get_store().count_elements(CARRIER$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRIER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARRIER$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARRIER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARRIER$8);
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
            get_store().remove_element(CARRIER$8, 0);
        }
    }
}
