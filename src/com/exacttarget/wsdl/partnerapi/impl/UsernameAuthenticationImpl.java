/*
 * XML Type:  UsernameAuthentication
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UsernameAuthentication
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML UsernameAuthentication(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class UsernameAuthenticationImpl extends com.exacttarget.wsdl.partnerapi.impl.AuthenticationImpl implements com.exacttarget.wsdl.partnerapi.UsernameAuthentication
{
    
    public UsernameAuthenticationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UserName");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PassWord");
    
    
    /**
     * Gets the "UserName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserName" element
     */
    public boolean isSetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERNAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
            }
            target.set(userName);
        }
    }
    
    /**
     * Unsets the "UserName" element
     */
    public void unsetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "PassWord" element
     */
    public java.lang.String getPassWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PassWord" element
     */
    public org.apache.xmlbeans.XmlString xgetPassWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PassWord" element
     */
    public boolean isSetPassWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSWORD$2) != 0;
        }
    }
    
    /**
     * Sets the "PassWord" element
     */
    public void setPassWord(java.lang.String passWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
            }
            target.setStringValue(passWord);
        }
    }
    
    /**
     * Sets (as xml) the "PassWord" element
     */
    public void xsetPassWord(org.apache.xmlbeans.XmlString passWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
            }
            target.set(passWord);
        }
    }
    
    /**
     * Unsets the "PassWord" element
     */
    public void unsetPassWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSWORD$2, 0);
        }
    }
}
