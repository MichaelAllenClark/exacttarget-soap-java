/*
 * XML Type:  PlatformApplication
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PlatformApplication
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PlatformApplication(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PlatformApplicationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.PlatformApplication
{
    
    public PlatformApplicationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Package");
    private static final javax.xml.namespace.QName PACKAGES$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Packages");
    private static final javax.xml.namespace.QName RESOURCESPECIFICATION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResourceSpecification");
    private static final javax.xml.namespace.QName DEVELOPERVERSION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeveloperVersion");
    
    
    /**
     * Gets the "Package" element
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Package" element
     */
    public void setPackage(com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().add_element_user(PACKAGE$0);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Appends and returns a new empty "Package" element
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage addNewPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().add_element_user(PACKAGE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Packages" elements
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[] getPackagesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PACKAGES$2, targetList);
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[] result = new com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Packages" element
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage getPackagesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().find_element_user(PACKAGES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Packages" element
     */
    public int sizeOfPackagesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGES$2);
        }
    }
    
    /**
     * Sets array of all "Packages" element
     */
    public void setPackagesArray(com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage[] packagesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(packagesArray, PACKAGES$2);
        }
    }
    
    /**
     * Sets ith "Packages" element
     */
    public void setPackagesArray(int i, com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage packages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().find_element_user(PACKAGES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(packages);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Packages" element
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage insertNewPackages(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().insert_element_user(PACKAGES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Packages" element
     */
    public com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage addNewPackages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage target = null;
            target = (com.exacttarget.wsdl.partnerapi.PlatformApplicationPackage)get_store().add_element_user(PACKAGES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Packages" element
     */
    public void removePackages(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGES$2, i);
        }
    }
    
    /**
     * Gets the "ResourceSpecification" element
     */
    public com.exacttarget.wsdl.partnerapi.ResourceSpecification getResourceSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(RESOURCESPECIFICATION$4, 0);
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
            return get_store().count_elements(RESOURCESPECIFICATION$4) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(RESOURCESPECIFICATION$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(RESOURCESPECIFICATION$4);
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
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(RESOURCESPECIFICATION$4);
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
            get_store().remove_element(RESOURCESPECIFICATION$4, 0);
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
