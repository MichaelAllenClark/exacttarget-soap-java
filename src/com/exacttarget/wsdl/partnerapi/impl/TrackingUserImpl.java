/*
 * XML Type:  TrackingUser
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TrackingUser
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TrackingUser(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TrackingUserImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.TrackingUser
{
    
    public TrackingUserImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISACTIVE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName EMPLOYEEID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmployeeID");
    
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$0, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActive" element
     */
    public boolean isSetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$0);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Unsets the "IsActive" element
     */
    public void unsetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVE$0, 0);
        }
    }
    
    /**
     * Gets the "EmployeeID" element
     */
    public int getEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmployeeID" element
     */
    public org.apache.xmlbeans.XmlInt xgetEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPLOYEEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmployeeID" element
     */
    public boolean isSetEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPLOYEEID$2) != 0;
        }
    }
    
    /**
     * Sets the "EmployeeID" element
     */
    public void setEmployeeID(int employeeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEEID$2);
            }
            target.setIntValue(employeeID);
        }
    }
    
    /**
     * Sets (as xml) the "EmployeeID" element
     */
    public void xsetEmployeeID(org.apache.xmlbeans.XmlInt employeeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPLOYEEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EMPLOYEEID$2);
            }
            target.set(employeeID);
        }
    }
    
    /**
     * Unsets the "EmployeeID" element
     */
    public void unsetEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPLOYEEID$2, 0);
        }
    }
}
