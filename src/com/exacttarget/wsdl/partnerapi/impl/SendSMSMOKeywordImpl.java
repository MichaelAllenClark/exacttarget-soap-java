/*
 * XML Type:  SendSMSMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendSMSMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendSMSMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendSMSMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.BaseMOKeywordImpl implements com.exacttarget.wsdl.partnerapi.SendSMSMOKeyword
{
    
    public SendSMSMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEXTMOKEYWORD$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NextMOKeyword");
    private static final javax.xml.namespace.QName MESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Message");
    private static final javax.xml.namespace.QName SCRIPTERRORMESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScriptErrorMessage");
    
    
    /**
     * Gets the "NextMOKeyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword getNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NextMOKeyword" element
     */
    public boolean isSetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTMOKEYWORD$0) != 0;
        }
    }
    
    /**
     * Sets the "NextMOKeyword" element
     */
    public void setNextMOKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword nextMOKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$0);
            }
            target.set(nextMOKeyword);
        }
    }
    
    /**
     * Appends and returns a new empty "NextMOKeyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "NextMOKeyword" element
     */
    public void unsetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTMOKEYWORD$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
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
            return get_store().count_elements(MESSAGE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
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
            get_store().remove_element(MESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "ScriptErrorMessage" element
     */
    public java.lang.String getScriptErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRIPTERRORMESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScriptErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetScriptErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRIPTERRORMESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScriptErrorMessage" element
     */
    public boolean isSetScriptErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPTERRORMESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "ScriptErrorMessage" element
     */
    public void setScriptErrorMessage(java.lang.String scriptErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRIPTERRORMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRIPTERRORMESSAGE$4);
            }
            target.setStringValue(scriptErrorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ScriptErrorMessage" element
     */
    public void xsetScriptErrorMessage(org.apache.xmlbeans.XmlString scriptErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRIPTERRORMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCRIPTERRORMESSAGE$4);
            }
            target.set(scriptErrorMessage);
        }
    }
    
    /**
     * Unsets the "ScriptErrorMessage" element
     */
    public void unsetScriptErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPTERRORMESSAGE$4, 0);
        }
    }
}
