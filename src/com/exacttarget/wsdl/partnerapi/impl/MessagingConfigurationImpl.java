/*
 * XML Type:  MessagingConfiguration
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MessagingConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML MessagingConfiguration(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class MessagingConfigurationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.MessagingConfiguration
{
    
    public MessagingConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Code");
    private static final javax.xml.namespace.QName MESSAGINGVENDORKIND$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MessagingVendorKind");
    private static final javax.xml.namespace.QName ISACTIVE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Url");
    private static final javax.xml.namespace.QName USERNAME$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UserName");
    private static final javax.xml.namespace.QName PASSWORD$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Password");
    private static final javax.xml.namespace.QName PROFILEID$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ProfileID");
    private static final javax.xml.namespace.QName CALLBACKURL$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CallbackUrl");
    private static final javax.xml.namespace.QName MEDIATYPES$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MediaTypes");
    
    
    /**
     * Gets the "Code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" element
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "MessagingVendorKind" element
     */
    public com.exacttarget.wsdl.partnerapi.MessagingVendorKind getMessagingVendorKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MessagingVendorKind target = null;
            target = (com.exacttarget.wsdl.partnerapi.MessagingVendorKind)get_store().find_element_user(MESSAGINGVENDORKIND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessagingVendorKind" element
     */
    public void setMessagingVendorKind(com.exacttarget.wsdl.partnerapi.MessagingVendorKind messagingVendorKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MessagingVendorKind target = null;
            target = (com.exacttarget.wsdl.partnerapi.MessagingVendorKind)get_store().find_element_user(MESSAGINGVENDORKIND$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MessagingVendorKind)get_store().add_element_user(MESSAGINGVENDORKIND$2);
            }
            target.set(messagingVendorKind);
        }
    }
    
    /**
     * Appends and returns a new empty "MessagingVendorKind" element
     */
    public com.exacttarget.wsdl.partnerapi.MessagingVendorKind addNewMessagingVendorKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MessagingVendorKind target = null;
            target = (com.exacttarget.wsdl.partnerapi.MessagingVendorKind)get_store().add_element_user(MESSAGINGVENDORKIND$2);
            return target;
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(boolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$4);
            }
            target.setBooleanValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$4);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Gets the "Url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$6);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "Url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$6);
            }
            target.set(url);
        }
    }
    
    /**
     * Gets the "UserName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$8);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "UserName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$8);
            }
            target.set(userName);
        }
    }
    
    /**
     * Gets the "Password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$10);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "Password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$10);
            }
            target.set(password);
        }
    }
    
    /**
     * Gets the "ProfileID" element
     */
    public java.lang.String getProfileID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFILEID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProfileID" element
     */
    public org.apache.xmlbeans.XmlString xgetProfileID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFILEID$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProfileID" element
     */
    public void setProfileID(java.lang.String profileID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFILEID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFILEID$12);
            }
            target.setStringValue(profileID);
        }
    }
    
    /**
     * Sets (as xml) the "ProfileID" element
     */
    public void xsetProfileID(org.apache.xmlbeans.XmlString profileID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFILEID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROFILEID$12);
            }
            target.set(profileID);
        }
    }
    
    /**
     * Gets the "CallbackUrl" element
     */
    public java.lang.String getCallbackUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLBACKURL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallbackUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetCallbackUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLBACKURL$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallbackUrl" element
     */
    public boolean isSetCallbackUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLBACKURL$14) != 0;
        }
    }
    
    /**
     * Sets the "CallbackUrl" element
     */
    public void setCallbackUrl(java.lang.String callbackUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLBACKURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLBACKURL$14);
            }
            target.setStringValue(callbackUrl);
        }
    }
    
    /**
     * Sets (as xml) the "CallbackUrl" element
     */
    public void xsetCallbackUrl(org.apache.xmlbeans.XmlString callbackUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLBACKURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLBACKURL$14);
            }
            target.set(callbackUrl);
        }
    }
    
    /**
     * Unsets the "CallbackUrl" element
     */
    public void unsetCallbackUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLBACKURL$14, 0);
        }
    }
    
    /**
     * Gets the "MediaTypes" element
     */
    public java.lang.String getMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MediaTypes" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPES$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "MediaTypes" element
     */
    public boolean isSetMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIATYPES$16) != 0;
        }
    }
    
    /**
     * Sets the "MediaTypes" element
     */
    public void setMediaTypes(java.lang.String mediaTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPES$16);
            }
            target.setStringValue(mediaTypes);
        }
    }
    
    /**
     * Sets (as xml) the "MediaTypes" element
     */
    public void xsetMediaTypes(org.apache.xmlbeans.XmlString mediaTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPES$16);
            }
            target.set(mediaTypes);
        }
    }
    
    /**
     * Unsets the "MediaTypes" element
     */
    public void unsetMediaTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIATYPES$16, 0);
        }
    }
}
