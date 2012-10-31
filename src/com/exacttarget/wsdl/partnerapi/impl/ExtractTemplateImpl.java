/*
 * XML Type:  ExtractTemplate
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractTemplate
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractTemplate(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractTemplateImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ExtractTemplate
{
    
    public ExtractTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName CONFIGURATIONPAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ConfigurationPage");
    private static final javax.xml.namespace.QName PACKAGEKEY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PackageKey");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "ConfigurationPage" element
     */
    public java.lang.String getConfigurationPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGURATIONPAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfigurationPage" element
     */
    public org.apache.xmlbeans.XmlString xgetConfigurationPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfigurationPage" element
     */
    public boolean isSetConfigurationPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGURATIONPAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "ConfigurationPage" element
     */
    public void setConfigurationPage(java.lang.String configurationPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGURATIONPAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIGURATIONPAGE$2);
            }
            target.setStringValue(configurationPage);
        }
    }
    
    /**
     * Sets (as xml) the "ConfigurationPage" element
     */
    public void xsetConfigurationPage(org.apache.xmlbeans.XmlString configurationPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIGURATIONPAGE$2);
            }
            target.set(configurationPage);
        }
    }
    
    /**
     * Unsets the "ConfigurationPage" element
     */
    public void unsetConfigurationPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGURATIONPAGE$2, 0);
        }
    }
    
    /**
     * Gets the "PackageKey" element
     */
    public java.lang.String getPackageKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEKEY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PackageKey" element
     */
    public org.apache.xmlbeans.XmlString xgetPackageKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEKEY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PackageKey" element
     */
    public boolean isSetPackageKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEKEY$4) != 0;
        }
    }
    
    /**
     * Sets the "PackageKey" element
     */
    public void setPackageKey(java.lang.String packageKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGEKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGEKEY$4);
            }
            target.setStringValue(packageKey);
        }
    }
    
    /**
     * Sets (as xml) the "PackageKey" element
     */
    public void xsetPackageKey(org.apache.xmlbeans.XmlString packageKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGEKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGEKEY$4);
            }
            target.set(packageKey);
        }
    }
    
    /**
     * Unsets the "PackageKey" element
     */
    public void unsetPackageKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEKEY$4, 0);
        }
    }
}
