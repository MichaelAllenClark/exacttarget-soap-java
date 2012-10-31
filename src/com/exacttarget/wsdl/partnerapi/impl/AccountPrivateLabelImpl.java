/*
 * XML Type:  AccountPrivateLabel
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AccountPrivateLabel
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AccountPrivateLabel(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AccountPrivateLabelImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.AccountPrivateLabel
{
    
    public AccountPrivateLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName OWNERMEMBERID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OwnerMemberID");
    private static final javax.xml.namespace.QName COLORPALETTEXML$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ColorPaletteXML");
    
    
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
     * Gets the "OwnerMemberID" element
     */
    public int getOwnerMemberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERMEMBERID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnerMemberID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOwnerMemberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNERMEMBERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OwnerMemberID" element
     */
    public void setOwnerMemberID(int ownerMemberID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERMEMBERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERMEMBERID$2);
            }
            target.setIntValue(ownerMemberID);
        }
    }
    
    /**
     * Sets (as xml) the "OwnerMemberID" element
     */
    public void xsetOwnerMemberID(org.apache.xmlbeans.XmlInt ownerMemberID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNERMEMBERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OWNERMEMBERID$2);
            }
            target.set(ownerMemberID);
        }
    }
    
    /**
     * Gets the "ColorPaletteXML" element
     */
    public java.lang.String getColorPaletteXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLORPALETTEXML$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColorPaletteXML" element
     */
    public org.apache.xmlbeans.XmlString xgetColorPaletteXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLORPALETTEXML$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ColorPaletteXML" element
     */
    public void setColorPaletteXML(java.lang.String colorPaletteXML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLORPALETTEXML$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLORPALETTEXML$4);
            }
            target.setStringValue(colorPaletteXML);
        }
    }
    
    /**
     * Sets (as xml) the "ColorPaletteXML" element
     */
    public void xsetColorPaletteXML(org.apache.xmlbeans.XmlString colorPaletteXML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLORPALETTEXML$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLORPALETTEXML$4);
            }
            target.set(colorPaletteXML);
        }
    }
}
