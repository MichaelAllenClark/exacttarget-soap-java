/*
 * XML Type:  SubscriberSendResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberSendResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SubscriberSendResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriberSendResultImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SubscriberSendResult
{
    
    public SubscriberSendResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEND$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    private static final javax.xml.namespace.QName EMAIL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName SUBSCRIBER$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName CLICKDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ClickDate");
    private static final javax.xml.namespace.QName BOUNCEDATE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BounceDate");
    private static final javax.xml.namespace.QName OPENDATE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OpenDate");
    private static final javax.xml.namespace.QName SENTDATE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SentDate");
    private static final javax.xml.namespace.QName LASTACTION$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LastAction");
    private static final javax.xml.namespace.QName UNSUBSCRIBEDATE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UnsubscribeDate");
    private static final javax.xml.namespace.QName FROMADDRESS$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName FROMNAME$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName TOTALCLICKS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TotalClicks");
    private static final javax.xml.namespace.QName UNIQUECLICKS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueClicks");
    private static final javax.xml.namespace.QName SUBJECT$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subject");
    private static final javax.xml.namespace.QName VIEWSENTEMAILURL$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ViewSentEmailURL");
    private static final javax.xml.namespace.QName HARDBOUNCES$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HardBounces");
    private static final javax.xml.namespace.QName SOFTBOUNCES$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SoftBounces");
    private static final javax.xml.namespace.QName OTHERBOUNCES$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OtherBounces");
    
    
    /**
     * Gets the "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send getSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Send" element
     */
    public boolean isSetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEND$0) != 0;
        }
    }
    
    /**
     * Sets the "Send" element
     */
    public void setSend(com.exacttarget.wsdl.partnerapi.Send send)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$0);
            }
            target.set(send);
        }
    }
    
    /**
     * Appends and returns a new empty "Send" element
     */
    public com.exacttarget.wsdl.partnerapi.Send addNewSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Send" element
     */
    public void unsetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEND$0, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(com.exacttarget.wsdl.partnerapi.Email email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
            }
            target.set(email);
        }
    }
    
    /**
     * Appends and returns a new empty "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$2, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$4, 0);
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
            return get_store().count_elements(SUBSCRIBER$4) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$4);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$4);
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
            get_store().remove_element(SUBSCRIBER$4, 0);
        }
    }
    
    /**
     * Gets the "ClickDate" element
     */
    public java.util.Calendar getClickDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICKDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClickDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetClickDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLICKDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClickDate" element
     */
    public boolean isSetClickDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICKDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "ClickDate" element
     */
    public void setClickDate(java.util.Calendar clickDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICKDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLICKDATE$6);
            }
            target.setCalendarValue(clickDate);
        }
    }
    
    /**
     * Sets (as xml) the "ClickDate" element
     */
    public void xsetClickDate(org.apache.xmlbeans.XmlDateTime clickDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLICKDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLICKDATE$6);
            }
            target.set(clickDate);
        }
    }
    
    /**
     * Unsets the "ClickDate" element
     */
    public void unsetClickDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICKDATE$6, 0);
        }
    }
    
    /**
     * Gets the "BounceDate" element
     */
    public java.util.Calendar getBounceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCEDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "BounceDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBounceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BOUNCEDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "BounceDate" element
     */
    public boolean isSetBounceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNCEDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "BounceDate" element
     */
    public void setBounceDate(java.util.Calendar bounceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCEDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOUNCEDATE$8);
            }
            target.setCalendarValue(bounceDate);
        }
    }
    
    /**
     * Sets (as xml) the "BounceDate" element
     */
    public void xsetBounceDate(org.apache.xmlbeans.XmlDateTime bounceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BOUNCEDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BOUNCEDATE$8);
            }
            target.set(bounceDate);
        }
    }
    
    /**
     * Unsets the "BounceDate" element
     */
    public void unsetBounceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNCEDATE$8, 0);
        }
    }
    
    /**
     * Gets the "OpenDate" element
     */
    public java.util.Calendar getOpenDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpenDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOpenDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPENDATE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "OpenDate" element
     */
    public boolean isSetOpenDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPENDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "OpenDate" element
     */
    public void setOpenDate(java.util.Calendar openDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENDATE$10);
            }
            target.setCalendarValue(openDate);
        }
    }
    
    /**
     * Sets (as xml) the "OpenDate" element
     */
    public void xsetOpenDate(org.apache.xmlbeans.XmlDateTime openDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPENDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(OPENDATE$10);
            }
            target.set(openDate);
        }
    }
    
    /**
     * Unsets the "OpenDate" element
     */
    public void unsetOpenDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPENDATE$10, 0);
        }
    }
    
    /**
     * Gets the "SentDate" element
     */
    public java.util.Calendar getSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SentDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SentDate" element
     */
    public boolean isSetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENTDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "SentDate" element
     */
    public void setSentDate(java.util.Calendar sentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTDATE$12);
            }
            target.setCalendarValue(sentDate);
        }
    }
    
    /**
     * Sets (as xml) the "SentDate" element
     */
    public void xsetSentDate(org.apache.xmlbeans.XmlDateTime sentDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENTDATE$12);
            }
            target.set(sentDate);
        }
    }
    
    /**
     * Unsets the "SentDate" element
     */
    public void unsetSentDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENTDATE$12, 0);
        }
    }
    
    /**
     * Gets the "LastAction" element
     */
    public java.lang.String getLastAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTACTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastAction" element
     */
    public org.apache.xmlbeans.XmlString xgetLastAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTACTION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastAction" element
     */
    public boolean isSetLastAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTACTION$14) != 0;
        }
    }
    
    /**
     * Sets the "LastAction" element
     */
    public void setLastAction(java.lang.String lastAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTACTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTACTION$14);
            }
            target.setStringValue(lastAction);
        }
    }
    
    /**
     * Sets (as xml) the "LastAction" element
     */
    public void xsetLastAction(org.apache.xmlbeans.XmlString lastAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTACTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTACTION$14);
            }
            target.set(lastAction);
        }
    }
    
    /**
     * Unsets the "LastAction" element
     */
    public void unsetLastAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTACTION$14, 0);
        }
    }
    
    /**
     * Gets the "UnsubscribeDate" element
     */
    public java.util.Calendar getUnsubscribeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBEDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnsubscribeDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUnsubscribeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNSUBSCRIBEDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnsubscribeDate" element
     */
    public boolean isSetUnsubscribeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUBSCRIBEDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "UnsubscribeDate" element
     */
    public void setUnsubscribeDate(java.util.Calendar unsubscribeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUBSCRIBEDATE$16);
            }
            target.setCalendarValue(unsubscribeDate);
        }
    }
    
    /**
     * Sets (as xml) the "UnsubscribeDate" element
     */
    public void xsetUnsubscribeDate(org.apache.xmlbeans.XmlDateTime unsubscribeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNSUBSCRIBEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UNSUBSCRIBEDATE$16);
            }
            target.set(unsubscribeDate);
        }
    }
    
    /**
     * Unsets the "UnsubscribeDate" element
     */
    public void unsetUnsubscribeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUBSCRIBEDATE$16, 0);
        }
    }
    
    /**
     * Gets the "FromAddress" element
     */
    public java.lang.String getFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromAddress" element
     */
    public boolean isSetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMADDRESS$18) != 0;
        }
    }
    
    /**
     * Sets the "FromAddress" element
     */
    public void setFromAddress(java.lang.String fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMADDRESS$18);
            }
            target.setStringValue(fromAddress);
        }
    }
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    public void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMADDRESS$18);
            }
            target.set(fromAddress);
        }
    }
    
    /**
     * Unsets the "FromAddress" element
     */
    public void unsetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMADDRESS$18, 0);
        }
    }
    
    /**
     * Gets the "FromName" element
     */
    public java.lang.String getFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromName" element
     */
    public org.apache.xmlbeans.XmlString xgetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromName" element
     */
    public boolean isSetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMNAME$20) != 0;
        }
    }
    
    /**
     * Sets the "FromName" element
     */
    public void setFromName(java.lang.String fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$20);
            }
            target.setStringValue(fromName);
        }
    }
    
    /**
     * Sets (as xml) the "FromName" element
     */
    public void xsetFromName(org.apache.xmlbeans.XmlString fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$20);
            }
            target.set(fromName);
        }
    }
    
    /**
     * Unsets the "FromName" element
     */
    public void unsetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMNAME$20, 0);
        }
    }
    
    /**
     * Gets the "TotalClicks" element
     */
    public int getTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCLICKS$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalClicks" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALCLICKS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalClicks" element
     */
    public boolean isSetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCLICKS$22) != 0;
        }
    }
    
    /**
     * Sets the "TotalClicks" element
     */
    public void setTotalClicks(int totalClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCLICKS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCLICKS$22);
            }
            target.setIntValue(totalClicks);
        }
    }
    
    /**
     * Sets (as xml) the "TotalClicks" element
     */
    public void xsetTotalClicks(org.apache.xmlbeans.XmlInt totalClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALCLICKS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALCLICKS$22);
            }
            target.set(totalClicks);
        }
    }
    
    /**
     * Unsets the "TotalClicks" element
     */
    public void unsetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCLICKS$22, 0);
        }
    }
    
    /**
     * Gets the "UniqueClicks" element
     */
    public int getUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    public org.apache.xmlbeans.XmlInt xgetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$24, 0);
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
            return get_store().count_elements(UNIQUECLICKS$24) != 0;
        }
    }
    
    /**
     * Sets the "UniqueClicks" element
     */
    public void setUniqueClicks(int uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECLICKS$24);
            }
            target.setIntValue(uniqueClicks);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    public void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUECLICKS$24);
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
            get_store().remove_element(UNIQUECLICKS$24, 0);
        }
    }
    
    /**
     * Gets the "Subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$26) != 0;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$26);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "Subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$26);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "Subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$26, 0);
        }
    }
    
    /**
     * Gets the "ViewSentEmailURL" element
     */
    public java.lang.String getViewSentEmailURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWSENTEMAILURL$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ViewSentEmailURL" element
     */
    public org.apache.xmlbeans.XmlString xgetViewSentEmailURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWSENTEMAILURL$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ViewSentEmailURL" element
     */
    public boolean isSetViewSentEmailURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEWSENTEMAILURL$28) != 0;
        }
    }
    
    /**
     * Sets the "ViewSentEmailURL" element
     */
    public void setViewSentEmailURL(java.lang.String viewSentEmailURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWSENTEMAILURL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWSENTEMAILURL$28);
            }
            target.setStringValue(viewSentEmailURL);
        }
    }
    
    /**
     * Sets (as xml) the "ViewSentEmailURL" element
     */
    public void xsetViewSentEmailURL(org.apache.xmlbeans.XmlString viewSentEmailURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWSENTEMAILURL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWSENTEMAILURL$28);
            }
            target.set(viewSentEmailURL);
        }
    }
    
    /**
     * Unsets the "ViewSentEmailURL" element
     */
    public void unsetViewSentEmailURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEWSENTEMAILURL$28, 0);
        }
    }
    
    /**
     * Gets the "HardBounces" element
     */
    public int getHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "HardBounces" element
     */
    public boolean isSetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HARDBOUNCES$30) != 0;
        }
    }
    
    /**
     * Sets the "HardBounces" element
     */
    public void setHardBounces(int hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HARDBOUNCES$30);
            }
            target.setIntValue(hardBounces);
        }
    }
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    public void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HARDBOUNCES$30);
            }
            target.set(hardBounces);
        }
    }
    
    /**
     * Unsets the "HardBounces" element
     */
    public void unsetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HARDBOUNCES$30, 0);
        }
    }
    
    /**
     * Gets the "SoftBounces" element
     */
    public int getSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "SoftBounces" element
     */
    public boolean isSetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTBOUNCES$32) != 0;
        }
    }
    
    /**
     * Sets the "SoftBounces" element
     */
    public void setSoftBounces(int softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFTBOUNCES$32);
            }
            target.setIntValue(softBounces);
        }
    }
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    public void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOFTBOUNCES$32);
            }
            target.set(softBounces);
        }
    }
    
    /**
     * Unsets the "SoftBounces" element
     */
    public void unsetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTBOUNCES$32, 0);
        }
    }
    
    /**
     * Gets the "OtherBounces" element
     */
    public int getOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    public org.apache.xmlbeans.XmlInt xgetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "OtherBounces" element
     */
    public boolean isSetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERBOUNCES$34) != 0;
        }
    }
    
    /**
     * Sets the "OtherBounces" element
     */
    public void setOtherBounces(int otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERBOUNCES$34);
            }
            target.setIntValue(otherBounces);
        }
    }
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    public void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OTHERBOUNCES$34);
            }
            target.set(otherBounces);
        }
    }
    
    /**
     * Unsets the "OtherBounces" element
     */
    public void unsetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERBOUNCES$34, 0);
        }
    }
}
