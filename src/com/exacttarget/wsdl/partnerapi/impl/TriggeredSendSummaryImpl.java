/*
 * XML Type:  TriggeredSendSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TriggeredSendSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TriggeredSendSummaryImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendSummary
{
    
    public TriggeredSendSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinition");
    private static final javax.xml.namespace.QName SENT$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Sent");
    private static final javax.xml.namespace.QName NOTSENTDUETOOPTOUT$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotSentDueToOptOut");
    private static final javax.xml.namespace.QName NOTSENTDUETOUNDELIVERABLE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotSentDueToUndeliverable");
    private static final javax.xml.namespace.QName BOUNCES$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Bounces");
    private static final javax.xml.namespace.QName OPENS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Opens");
    private static final javax.xml.namespace.QName CLICKS$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Clicks");
    private static final javax.xml.namespace.QName UNIQUEOPENS$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueOpens");
    private static final javax.xml.namespace.QName UNIQUECLICKS$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueClicks");
    private static final javax.xml.namespace.QName OPTOUTS$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OptOuts");
    private static final javax.xml.namespace.QName SURVEYRESPONSES$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SurveyResponses");
    private static final javax.xml.namespace.QName FTAFREQUESTS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FTAFRequests");
    private static final javax.xml.namespace.QName FTAFEMAILSSENT$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FTAFEmailsSent");
    private static final javax.xml.namespace.QName FTAFOPTINS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FTAFOptIns");
    private static final javax.xml.namespace.QName CONVERSIONS$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Conversions");
    private static final javax.xml.namespace.QName UNIQUECONVERSIONS$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueConversions");
    private static final javax.xml.namespace.QName INPROCESS$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InProcess");
    private static final javax.xml.namespace.QName NOTSENTDUETOERROR$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotSentDueToError");
    private static final javax.xml.namespace.QName QUEUED$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Queued");
    
    
    /**
     * Gets the "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TriggeredSendDefinition" element
     */
    public boolean isSetTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGEREDSENDDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "TriggeredSendDefinition" element
     */
    public void setTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            }
            target.set(triggeredSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "TriggeredSendDefinition" element
     */
    public void unsetTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGEREDSENDDEFINITION$0, 0);
        }
    }
    
    /**
     * Gets the "Sent" element
     */
    public long getSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENT$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sent" element
     */
    public org.apache.xmlbeans.XmlLong xgetSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sent" element
     */
    public boolean isSetSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENT$2) != 0;
        }
    }
    
    /**
     * Sets the "Sent" element
     */
    public void setSent(long sent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENT$2);
            }
            target.setLongValue(sent);
        }
    }
    
    /**
     * Sets (as xml) the "Sent" element
     */
    public void xsetSent(org.apache.xmlbeans.XmlLong sent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SENT$2);
            }
            target.set(sent);
        }
    }
    
    /**
     * Unsets the "Sent" element
     */
    public void unsetSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENT$2, 0);
        }
    }
    
    /**
     * Gets the "NotSentDueToOptOut" element
     */
    public long getNotSentDueToOptOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOOPTOUT$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotSentDueToOptOut" element
     */
    public org.apache.xmlbeans.XmlLong xgetNotSentDueToOptOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOOPTOUT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotSentDueToOptOut" element
     */
    public boolean isSetNotSentDueToOptOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTSENTDUETOOPTOUT$4) != 0;
        }
    }
    
    /**
     * Sets the "NotSentDueToOptOut" element
     */
    public void setNotSentDueToOptOut(long notSentDueToOptOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOOPTOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTSENTDUETOOPTOUT$4);
            }
            target.setLongValue(notSentDueToOptOut);
        }
    }
    
    /**
     * Sets (as xml) the "NotSentDueToOptOut" element
     */
    public void xsetNotSentDueToOptOut(org.apache.xmlbeans.XmlLong notSentDueToOptOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOOPTOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NOTSENTDUETOOPTOUT$4);
            }
            target.set(notSentDueToOptOut);
        }
    }
    
    /**
     * Unsets the "NotSentDueToOptOut" element
     */
    public void unsetNotSentDueToOptOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTSENTDUETOOPTOUT$4, 0);
        }
    }
    
    /**
     * Gets the "NotSentDueToUndeliverable" element
     */
    public long getNotSentDueToUndeliverable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOUNDELIVERABLE$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotSentDueToUndeliverable" element
     */
    public org.apache.xmlbeans.XmlLong xgetNotSentDueToUndeliverable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOUNDELIVERABLE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotSentDueToUndeliverable" element
     */
    public boolean isSetNotSentDueToUndeliverable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTSENTDUETOUNDELIVERABLE$6) != 0;
        }
    }
    
    /**
     * Sets the "NotSentDueToUndeliverable" element
     */
    public void setNotSentDueToUndeliverable(long notSentDueToUndeliverable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOUNDELIVERABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTSENTDUETOUNDELIVERABLE$6);
            }
            target.setLongValue(notSentDueToUndeliverable);
        }
    }
    
    /**
     * Sets (as xml) the "NotSentDueToUndeliverable" element
     */
    public void xsetNotSentDueToUndeliverable(org.apache.xmlbeans.XmlLong notSentDueToUndeliverable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOUNDELIVERABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NOTSENTDUETOUNDELIVERABLE$6);
            }
            target.set(notSentDueToUndeliverable);
        }
    }
    
    /**
     * Unsets the "NotSentDueToUndeliverable" element
     */
    public void unsetNotSentDueToUndeliverable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTSENTDUETOUNDELIVERABLE$6, 0);
        }
    }
    
    /**
     * Gets the "Bounces" element
     */
    public long getBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCES$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Bounces" element
     */
    public org.apache.xmlbeans.XmlLong xgetBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BOUNCES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Bounces" element
     */
    public boolean isSetBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNCES$8) != 0;
        }
    }
    
    /**
     * Sets the "Bounces" element
     */
    public void setBounces(long bounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOUNCES$8);
            }
            target.setLongValue(bounces);
        }
    }
    
    /**
     * Sets (as xml) the "Bounces" element
     */
    public void xsetBounces(org.apache.xmlbeans.XmlLong bounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BOUNCES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BOUNCES$8);
            }
            target.set(bounces);
        }
    }
    
    /**
     * Unsets the "Bounces" element
     */
    public void unsetBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNCES$8, 0);
        }
    }
    
    /**
     * Gets the "Opens" element
     */
    public long getOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENS$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Opens" element
     */
    public org.apache.xmlbeans.XmlLong xgetOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OPENS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Opens" element
     */
    public boolean isSetOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPENS$10) != 0;
        }
    }
    
    /**
     * Sets the "Opens" element
     */
    public void setOpens(long opens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENS$10);
            }
            target.setLongValue(opens);
        }
    }
    
    /**
     * Sets (as xml) the "Opens" element
     */
    public void xsetOpens(org.apache.xmlbeans.XmlLong opens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OPENS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(OPENS$10);
            }
            target.set(opens);
        }
    }
    
    /**
     * Unsets the "Opens" element
     */
    public void unsetOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPENS$10, 0);
        }
    }
    
    /**
     * Gets the "Clicks" element
     */
    public long getClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICKS$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Clicks" element
     */
    public org.apache.xmlbeans.XmlLong xgetClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CLICKS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Clicks" element
     */
    public boolean isSetClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICKS$12) != 0;
        }
    }
    
    /**
     * Sets the "Clicks" element
     */
    public void setClicks(long clicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICKS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLICKS$12);
            }
            target.setLongValue(clicks);
        }
    }
    
    /**
     * Sets (as xml) the "Clicks" element
     */
    public void xsetClicks(org.apache.xmlbeans.XmlLong clicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CLICKS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CLICKS$12);
            }
            target.set(clicks);
        }
    }
    
    /**
     * Unsets the "Clicks" element
     */
    public void unsetClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICKS$12, 0);
        }
    }
    
    /**
     * Gets the "UniqueOpens" element
     */
    public long getUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$14, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    public org.apache.xmlbeans.XmlLong xgetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUEOPENS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueOpens" element
     */
    public boolean isSetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEOPENS$14) != 0;
        }
    }
    
    /**
     * Sets the "UniqueOpens" element
     */
    public void setUniqueOpens(long uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUEOPENS$14);
            }
            target.setLongValue(uniqueOpens);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    public void xsetUniqueOpens(org.apache.xmlbeans.XmlLong uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUEOPENS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(UNIQUEOPENS$14);
            }
            target.set(uniqueOpens);
        }
    }
    
    /**
     * Unsets the "UniqueOpens" element
     */
    public void unsetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEOPENS$14, 0);
        }
    }
    
    /**
     * Gets the "UniqueClicks" element
     */
    public long getUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    public org.apache.xmlbeans.XmlLong xgetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUECLICKS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueClicks" element
     */
    public boolean isSetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUECLICKS$16) != 0;
        }
    }
    
    /**
     * Sets the "UniqueClicks" element
     */
    public void setUniqueClicks(long uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECLICKS$16);
            }
            target.setLongValue(uniqueClicks);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    public void xsetUniqueClicks(org.apache.xmlbeans.XmlLong uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUECLICKS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(UNIQUECLICKS$16);
            }
            target.set(uniqueClicks);
        }
    }
    
    /**
     * Unsets the "UniqueClicks" element
     */
    public void unsetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUECLICKS$16, 0);
        }
    }
    
    /**
     * Gets the "OptOuts" element
     */
    public long getOptOuts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTOUTS$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "OptOuts" element
     */
    public org.apache.xmlbeans.XmlLong xgetOptOuts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OPTOUTS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "OptOuts" element
     */
    public boolean isSetOptOuts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTOUTS$18) != 0;
        }
    }
    
    /**
     * Sets the "OptOuts" element
     */
    public void setOptOuts(long optOuts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTOUTS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTOUTS$18);
            }
            target.setLongValue(optOuts);
        }
    }
    
    /**
     * Sets (as xml) the "OptOuts" element
     */
    public void xsetOptOuts(org.apache.xmlbeans.XmlLong optOuts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(OPTOUTS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(OPTOUTS$18);
            }
            target.set(optOuts);
        }
    }
    
    /**
     * Unsets the "OptOuts" element
     */
    public void unsetOptOuts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTOUTS$18, 0);
        }
    }
    
    /**
     * Gets the "SurveyResponses" element
     */
    public long getSurveyResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURVEYRESPONSES$20, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "SurveyResponses" element
     */
    public org.apache.xmlbeans.XmlLong xgetSurveyResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SURVEYRESPONSES$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SurveyResponses" element
     */
    public boolean isSetSurveyResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURVEYRESPONSES$20) != 0;
        }
    }
    
    /**
     * Sets the "SurveyResponses" element
     */
    public void setSurveyResponses(long surveyResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURVEYRESPONSES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURVEYRESPONSES$20);
            }
            target.setLongValue(surveyResponses);
        }
    }
    
    /**
     * Sets (as xml) the "SurveyResponses" element
     */
    public void xsetSurveyResponses(org.apache.xmlbeans.XmlLong surveyResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SURVEYRESPONSES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SURVEYRESPONSES$20);
            }
            target.set(surveyResponses);
        }
    }
    
    /**
     * Unsets the "SurveyResponses" element
     */
    public void unsetSurveyResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURVEYRESPONSES$20, 0);
        }
    }
    
    /**
     * Gets the "FTAFRequests" element
     */
    public long getFTAFRequests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFREQUESTS$22, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "FTAFRequests" element
     */
    public org.apache.xmlbeans.XmlLong xgetFTAFRequests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFREQUESTS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "FTAFRequests" element
     */
    public boolean isSetFTAFRequests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FTAFREQUESTS$22) != 0;
        }
    }
    
    /**
     * Sets the "FTAFRequests" element
     */
    public void setFTAFRequests(long ftafRequests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFREQUESTS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FTAFREQUESTS$22);
            }
            target.setLongValue(ftafRequests);
        }
    }
    
    /**
     * Sets (as xml) the "FTAFRequests" element
     */
    public void xsetFTAFRequests(org.apache.xmlbeans.XmlLong ftafRequests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFREQUESTS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(FTAFREQUESTS$22);
            }
            target.set(ftafRequests);
        }
    }
    
    /**
     * Unsets the "FTAFRequests" element
     */
    public void unsetFTAFRequests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FTAFREQUESTS$22, 0);
        }
    }
    
    /**
     * Gets the "FTAFEmailsSent" element
     */
    public long getFTAFEmailsSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFEMAILSSENT$24, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "FTAFEmailsSent" element
     */
    public org.apache.xmlbeans.XmlLong xgetFTAFEmailsSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFEMAILSSENT$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "FTAFEmailsSent" element
     */
    public boolean isSetFTAFEmailsSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FTAFEMAILSSENT$24) != 0;
        }
    }
    
    /**
     * Sets the "FTAFEmailsSent" element
     */
    public void setFTAFEmailsSent(long ftafEmailsSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFEMAILSSENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FTAFEMAILSSENT$24);
            }
            target.setLongValue(ftafEmailsSent);
        }
    }
    
    /**
     * Sets (as xml) the "FTAFEmailsSent" element
     */
    public void xsetFTAFEmailsSent(org.apache.xmlbeans.XmlLong ftafEmailsSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFEMAILSSENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(FTAFEMAILSSENT$24);
            }
            target.set(ftafEmailsSent);
        }
    }
    
    /**
     * Unsets the "FTAFEmailsSent" element
     */
    public void unsetFTAFEmailsSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FTAFEMAILSSENT$24, 0);
        }
    }
    
    /**
     * Gets the "FTAFOptIns" element
     */
    public long getFTAFOptIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFOPTINS$26, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "FTAFOptIns" element
     */
    public org.apache.xmlbeans.XmlLong xgetFTAFOptIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFOPTINS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "FTAFOptIns" element
     */
    public boolean isSetFTAFOptIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FTAFOPTINS$26) != 0;
        }
    }
    
    /**
     * Sets the "FTAFOptIns" element
     */
    public void setFTAFOptIns(long ftafOptIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTAFOPTINS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FTAFOPTINS$26);
            }
            target.setLongValue(ftafOptIns);
        }
    }
    
    /**
     * Sets (as xml) the "FTAFOptIns" element
     */
    public void xsetFTAFOptIns(org.apache.xmlbeans.XmlLong ftafOptIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FTAFOPTINS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(FTAFOPTINS$26);
            }
            target.set(ftafOptIns);
        }
    }
    
    /**
     * Unsets the "FTAFOptIns" element
     */
    public void unsetFTAFOptIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FTAFOPTINS$26, 0);
        }
    }
    
    /**
     * Gets the "Conversions" element
     */
    public long getConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSIONS$28, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Conversions" element
     */
    public org.apache.xmlbeans.XmlLong xgetConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONVERSIONS$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Conversions" element
     */
    public boolean isSetConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSIONS$28) != 0;
        }
    }
    
    /**
     * Sets the "Conversions" element
     */
    public void setConversions(long conversions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSIONS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONVERSIONS$28);
            }
            target.setLongValue(conversions);
        }
    }
    
    /**
     * Sets (as xml) the "Conversions" element
     */
    public void xsetConversions(org.apache.xmlbeans.XmlLong conversions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONVERSIONS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONVERSIONS$28);
            }
            target.set(conversions);
        }
    }
    
    /**
     * Unsets the "Conversions" element
     */
    public void unsetConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSIONS$28, 0);
        }
    }
    
    /**
     * Gets the "UniqueConversions" element
     */
    public long getUniqueConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECONVERSIONS$30, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueConversions" element
     */
    public org.apache.xmlbeans.XmlLong xgetUniqueConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUECONVERSIONS$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueConversions" element
     */
    public boolean isSetUniqueConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUECONVERSIONS$30) != 0;
        }
    }
    
    /**
     * Sets the "UniqueConversions" element
     */
    public void setUniqueConversions(long uniqueConversions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECONVERSIONS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECONVERSIONS$30);
            }
            target.setLongValue(uniqueConversions);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueConversions" element
     */
    public void xsetUniqueConversions(org.apache.xmlbeans.XmlLong uniqueConversions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UNIQUECONVERSIONS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(UNIQUECONVERSIONS$30);
            }
            target.set(uniqueConversions);
        }
    }
    
    /**
     * Unsets the "UniqueConversions" element
     */
    public void unsetUniqueConversions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUECONVERSIONS$30, 0);
        }
    }
    
    /**
     * Gets the "InProcess" element
     */
    public long getInProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPROCESS$32, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "InProcess" element
     */
    public org.apache.xmlbeans.XmlLong xgetInProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INPROCESS$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "InProcess" element
     */
    public boolean isSetInProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPROCESS$32) != 0;
        }
    }
    
    /**
     * Sets the "InProcess" element
     */
    public void setInProcess(long inProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPROCESS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPROCESS$32);
            }
            target.setLongValue(inProcess);
        }
    }
    
    /**
     * Sets (as xml) the "InProcess" element
     */
    public void xsetInProcess(org.apache.xmlbeans.XmlLong inProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INPROCESS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(INPROCESS$32);
            }
            target.set(inProcess);
        }
    }
    
    /**
     * Unsets the "InProcess" element
     */
    public void unsetInProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPROCESS$32, 0);
        }
    }
    
    /**
     * Gets the "NotSentDueToError" element
     */
    public long getNotSentDueToError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOERROR$34, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotSentDueToError" element
     */
    public org.apache.xmlbeans.XmlLong xgetNotSentDueToError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOERROR$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotSentDueToError" element
     */
    public boolean isSetNotSentDueToError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTSENTDUETOERROR$34) != 0;
        }
    }
    
    /**
     * Sets the "NotSentDueToError" element
     */
    public void setNotSentDueToError(long notSentDueToError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTSENTDUETOERROR$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTSENTDUETOERROR$34);
            }
            target.setLongValue(notSentDueToError);
        }
    }
    
    /**
     * Sets (as xml) the "NotSentDueToError" element
     */
    public void xsetNotSentDueToError(org.apache.xmlbeans.XmlLong notSentDueToError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOTSENTDUETOERROR$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NOTSENTDUETOERROR$34);
            }
            target.set(notSentDueToError);
        }
    }
    
    /**
     * Unsets the "NotSentDueToError" element
     */
    public void unsetNotSentDueToError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTSENTDUETOERROR$34, 0);
        }
    }
    
    /**
     * Gets the "Queued" element
     */
    public long getQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUED$36, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Queued" element
     */
    public org.apache.xmlbeans.XmlLong xgetQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(QUEUED$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "Queued" element
     */
    public boolean isSetQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUED$36) != 0;
        }
    }
    
    /**
     * Sets the "Queued" element
     */
    public void setQueued(long queued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUEUED$36);
            }
            target.setLongValue(queued);
        }
    }
    
    /**
     * Sets (as xml) the "Queued" element
     */
    public void xsetQueued(org.apache.xmlbeans.XmlLong queued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(QUEUED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(QUEUED$36);
            }
            target.set(queued);
        }
    }
    
    /**
     * Unsets the "Queued" element
     */
    public void unsetQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUED$36, 0);
        }
    }
}
