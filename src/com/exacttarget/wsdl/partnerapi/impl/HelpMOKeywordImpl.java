/*
 * XML Type:  HelpMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.HelpMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML HelpMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class HelpMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.BaseMOKeywordImpl implements com.exacttarget.wsdl.partnerapi.HelpMOKeyword
{
    
    public HelpMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRIENDLYNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FriendlyName");
    private static final javax.xml.namespace.QName DEFAULTHELPMESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultHelpMessage");
    private static final javax.xml.namespace.QName MENUTEXT$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MenuText");
    private static final javax.xml.namespace.QName MORECHOICESPROMPT$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MoreChoicesPrompt");
    
    
    /**
     * Gets the "FriendlyName" element
     */
    public java.lang.String getFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    public org.apache.xmlbeans.XmlString xgetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "FriendlyName" element
     */
    public boolean isSetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRIENDLYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "FriendlyName" element
     */
    public void setFriendlyName(java.lang.String friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIENDLYNAME$0);
            }
            target.setStringValue(friendlyName);
        }
    }
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    public void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIENDLYNAME$0);
            }
            target.set(friendlyName);
        }
    }
    
    /**
     * Unsets the "FriendlyName" element
     */
    public void unsetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRIENDLYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "DefaultHelpMessage" element
     */
    public java.lang.String getDefaultHelpMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTHELPMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultHelpMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultHelpMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTHELPMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultHelpMessage" element
     */
    public boolean isSetDefaultHelpMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTHELPMESSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "DefaultHelpMessage" element
     */
    public void setDefaultHelpMessage(java.lang.String defaultHelpMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTHELPMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTHELPMESSAGE$2);
            }
            target.setStringValue(defaultHelpMessage);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultHelpMessage" element
     */
    public void xsetDefaultHelpMessage(org.apache.xmlbeans.XmlString defaultHelpMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTHELPMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTHELPMESSAGE$2);
            }
            target.set(defaultHelpMessage);
        }
    }
    
    /**
     * Unsets the "DefaultHelpMessage" element
     */
    public void unsetDefaultHelpMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTHELPMESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "MenuText" element
     */
    public java.lang.String getMenuText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MenuText" element
     */
    public org.apache.xmlbeans.XmlString xgetMenuText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "MenuText" element
     */
    public boolean isSetMenuText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENUTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "MenuText" element
     */
    public void setMenuText(java.lang.String menuText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENUTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENUTEXT$4);
            }
            target.setStringValue(menuText);
        }
    }
    
    /**
     * Sets (as xml) the "MenuText" element
     */
    public void xsetMenuText(org.apache.xmlbeans.XmlString menuText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENUTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENUTEXT$4);
            }
            target.set(menuText);
        }
    }
    
    /**
     * Unsets the "MenuText" element
     */
    public void unsetMenuText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENUTEXT$4, 0);
        }
    }
    
    /**
     * Gets the "MoreChoicesPrompt" element
     */
    public java.lang.String getMoreChoicesPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORECHOICESPROMPT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MoreChoicesPrompt" element
     */
    public org.apache.xmlbeans.XmlString xgetMoreChoicesPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MORECHOICESPROMPT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MoreChoicesPrompt" element
     */
    public boolean isSetMoreChoicesPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MORECHOICESPROMPT$6) != 0;
        }
    }
    
    /**
     * Sets the "MoreChoicesPrompt" element
     */
    public void setMoreChoicesPrompt(java.lang.String moreChoicesPrompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORECHOICESPROMPT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MORECHOICESPROMPT$6);
            }
            target.setStringValue(moreChoicesPrompt);
        }
    }
    
    /**
     * Sets (as xml) the "MoreChoicesPrompt" element
     */
    public void xsetMoreChoicesPrompt(org.apache.xmlbeans.XmlString moreChoicesPrompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MORECHOICESPROMPT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MORECHOICESPROMPT$6);
            }
            target.set(moreChoicesPrompt);
        }
    }
    
    /**
     * Unsets the "MoreChoicesPrompt" element
     */
    public void unsetMoreChoicesPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MORECHOICESPROMPT$6, 0);
        }
    }
}
