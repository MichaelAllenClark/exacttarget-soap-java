/*
 * XML Type:  PlatformApplicationPackage
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PlatformApplicationPackage(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PlatformApplicationPackageImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage
{
    
    public PlatformApplicationPackageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResourceSpecification");
    private static final javax.xml.namespace.QName SIGNINGKEY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SigningKey");
    private static final javax.xml.namespace.QName ISUPGRADE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsUpgrade");
    private static final javax.xml.namespace.QName DEVELOPERVERSION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeveloperVersion");
    
    
    /**
     * Gets the "ResourceSpecification" element
     */
    public com.exacttarget.wsdl.partnerapi.ResourceSpecification getResourceSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(RESOURCESPECIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceSpecification" element
     */
    public boolean isSetResourceSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESPECIFICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "ResourceSpecification" element
     */
    public void setResourceSpecification(com.exacttarget.wsdl.partnerapi.ResourceSpecification resourceSpecification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(RESOURCESPECIFICATION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(RESOURCESPECIFICATION$0);
            }
            target.set(resourceSpecification);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceSpecification" element
     */
    public com.exacttarget.wsdl.partnerapi.ResourceSpecification addNewResourceSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(RESOURCESPECIFICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceSpecification" element
     */
    public void unsetResourceSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESPECIFICATION$0, 0);
        }
    }
    
    /**
     * Gets the "SigningKey" element
     */
    public com.exacttarget.wsdl.partnerapi.PublicKeyManagement getSigningKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PublicKeyManagement target = null;
            target = (com.exacttarget.wsdl.partnerapi.PublicKeyManagement)get_store().find_element_user(SIGNINGKEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SigningKey" element
     */
    public boolean isSetSigningKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNINGKEY$2) != 0;
        }
    }
    
    /**
     * Sets the "SigningKey" element
     */
    public void setSigningKey(com.exacttarget.wsdl.partnerapi.PublicKeyManagement signingKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PublicKeyManagement target = null;
            target = (com.exacttarget.wsdl.partnerapi.PublicKeyManagement)get_store().find_element_user(SIGNINGKEY$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PublicKeyManagement)get_store().add_element_user(SIGNINGKEY$2);
            }
            target.set(signingKey);
        }
    }
    
    /**
     * Appends and returns a new empty "SigningKey" element
     */
    public com.exacttarget.wsdl.partnerapi.PublicKeyManagement addNewSigningKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PublicKeyManagement target = null;
            target = (com.exacttarget.wsdl.partnerapi.PublicKeyManagement)get_store().add_element_user(SIGNINGKEY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SigningKey" element
     */
    public void unsetSigningKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNINGKEY$2, 0);
        }
    }
    
    /**
     * Gets the "IsUpgrade" element
     */
    public boolean getIsUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPGRADE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsUpgrade" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPGRADE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsUpgrade" element
     */
    public boolean isSetIsUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISUPGRADE$4) != 0;
        }
    }
    
    /**
     * Sets the "IsUpgrade" element
     */
    public void setIsUpgrade(boolean isUpgrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPGRADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISUPGRADE$4);
            }
            target.setBooleanValue(isUpgrade);
        }
    }
    
    /**
     * Sets (as xml) the "IsUpgrade" element
     */
    public void xsetIsUpgrade(org.apache.xmlbeans.XmlBoolean isUpgrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPGRADE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISUPGRADE$4);
            }
            target.set(isUpgrade);
        }
    }
    
    /**
     * Unsets the "IsUpgrade" element
     */
    public void unsetIsUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISUPGRADE$4, 0);
        }
    }
    
    /**
     * Gets the "DeveloperVersion" element
     */
    public java.lang.String getDeveloperVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPERVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeveloperVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetDeveloperVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVELOPERVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeveloperVersion" element
     */
    public boolean isSetDeveloperVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVELOPERVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "DeveloperVersion" element
     */
    public void setDeveloperVersion(java.lang.String developerVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPERVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEVELOPERVERSION$6);
            }
            target.setStringValue(developerVersion);
        }
    }
    
    /**
     * Sets (as xml) the "DeveloperVersion" element
     */
    public void xsetDeveloperVersion(org.apache.xmlbeans.XmlString developerVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVELOPERVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEVELOPERVERSION$6);
            }
            target.set(developerVersion);
        }
    }
    
    /**
     * Unsets the "DeveloperVersion" element
     */
    public void unsetDeveloperVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVELOPERVERSION$6, 0);
        }
    }
}
