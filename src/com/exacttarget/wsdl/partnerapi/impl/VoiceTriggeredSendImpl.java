/*
 * XML Type:  VoiceTriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML VoiceTriggeredSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class VoiceTriggeredSendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.VoiceTriggeredSend
{
    
    public VoiceTriggeredSendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOICETRIGGEREDSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VoiceTriggeredSendDefinition");
    private static final javax.xml.namespace.QName SUBSCRIBER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Message");
    private static final javax.xml.namespace.QName NUMBER$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Number");
    private static final javax.xml.namespace.QName TRANSFERMESSAGE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TransferMessage");
    private static final javax.xml.namespace.QName TRANSFERNUMBER$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TransferNumber");
    
    
    /**
     * Gets the "VoiceTriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition getVoiceTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition)get_store().find_element_user(VOICETRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VoiceTriggeredSendDefinition" element
     */
    public boolean isSetVoiceTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOICETRIGGEREDSENDDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "VoiceTriggeredSendDefinition" element
     */
    public void setVoiceTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition voiceTriggeredSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition)get_store().find_element_user(VOICETRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition)get_store().add_element_user(VOICETRIGGEREDSENDDEFINITION$0);
            }
            target.set(voiceTriggeredSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "VoiceTriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition addNewVoiceTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.VoiceTriggeredSendDefinition)get_store().add_element_user(VOICETRIGGEREDSENDDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "VoiceTriggeredSendDefinition" element
     */
    public void unsetVoiceTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOICETRIGGEREDSENDDEFINITION$0, 0);
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
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$4, 0);
        }
    }
    
    /**
     * Gets the "Number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Number" element
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$6);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$6);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "Number" element
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "TransferMessage" element
     */
    public java.lang.String getTransferMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransferMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetTransferMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "TransferMessage" element
     */
    public boolean isSetTransferMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERMESSAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "TransferMessage" element
     */
    public void setTransferMessage(java.lang.String transferMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERMESSAGE$8);
            }
            target.setStringValue(transferMessage);
        }
    }
    
    /**
     * Sets (as xml) the "TransferMessage" element
     */
    public void xsetTransferMessage(org.apache.xmlbeans.XmlString transferMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSFERMESSAGE$8);
            }
            target.set(transferMessage);
        }
    }
    
    /**
     * Unsets the "TransferMessage" element
     */
    public void unsetTransferMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERMESSAGE$8, 0);
        }
    }
    
    /**
     * Gets the "TransferNumber" element
     */
    public java.lang.String getTransferNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransferNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetTransferNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERNUMBER$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "TransferNumber" element
     */
    public boolean isSetTransferNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERNUMBER$10) != 0;
        }
    }
    
    /**
     * Sets the "TransferNumber" element
     */
    public void setTransferNumber(java.lang.String transferNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERNUMBER$10);
            }
            target.setStringValue(transferNumber);
        }
    }
    
    /**
     * Sets (as xml) the "TransferNumber" element
     */
    public void xsetTransferNumber(org.apache.xmlbeans.XmlString transferNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSFERNUMBER$10);
            }
            target.set(transferNumber);
        }
    }
    
    /**
     * Unsets the "TransferNumber" element
     */
    public void unsetTransferNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERNUMBER$10, 0);
        }
    }
}
