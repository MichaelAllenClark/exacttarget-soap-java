/*
 * XML Type:  PrivateLabel
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PrivateLabel
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PrivateLabel(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PrivateLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PrivateLabel
{
    
    public PrivateLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName COLORPALETTEXML$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ColorPaletteXML");
    private static final javax.xml.namespace.QName LOGOFILE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LogoFile");
    private static final javax.xml.namespace.QName DELETE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Delete");
    private static final javax.xml.namespace.QName SETACTIVE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SetActive");
    
    
    /**
     * Gets the "ID" element
     */
    public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ID" element
     */
    public boolean isNilID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Nils the "ID" element
     */
    public void setNilID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
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
     * True if has "ColorPaletteXML" element
     */
    public boolean isSetColorPaletteXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORPALETTEXML$4) != 0;
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
    
    /**
     * Unsets the "ColorPaletteXML" element
     */
    public void unsetColorPaletteXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORPALETTEXML$4, 0);
        }
    }
    
    /**
     * Gets the "LogoFile" element
     */
    public java.lang.String getLogoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGOFILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogoFile" element
     */
    public org.apache.xmlbeans.XmlString xgetLogoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGOFILE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LogoFile" element
     */
    public boolean isSetLogoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGOFILE$6) != 0;
        }
    }
    
    /**
     * Sets the "LogoFile" element
     */
    public void setLogoFile(java.lang.String logoFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGOFILE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGOFILE$6);
            }
            target.setStringValue(logoFile);
        }
    }
    
    /**
     * Sets (as xml) the "LogoFile" element
     */
    public void xsetLogoFile(org.apache.xmlbeans.XmlString logoFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGOFILE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGOFILE$6);
            }
            target.set(logoFile);
        }
    }
    
    /**
     * Unsets the "LogoFile" element
     */
    public void unsetLogoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGOFILE$6, 0);
        }
    }
    
    /**
     * Gets the "Delete" element
     */
    public int getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Delete" element
     */
    public org.apache.xmlbeans.XmlInt xgetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELETE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Delete" element
     */
    public void setDelete(int delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETE$8);
            }
            target.setIntValue(delete);
        }
    }
    
    /**
     * Sets (as xml) the "Delete" element
     */
    public void xsetDelete(org.apache.xmlbeans.XmlInt delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELETE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DELETE$8);
            }
            target.set(delete);
        }
    }
    
    /**
     * Gets the "SetActive" element
     */
    public boolean getSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETACTIVE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SetActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SETACTIVE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SetActive" element
     */
    public boolean isSetSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETACTIVE$10) != 0;
        }
    }
    
    /**
     * Sets the "SetActive" element
     */
    public void setSetActive(boolean setActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETACTIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETACTIVE$10);
            }
            target.setBooleanValue(setActive);
        }
    }
    
    /**
     * Sets (as xml) the "SetActive" element
     */
    public void xsetSetActive(org.apache.xmlbeans.XmlBoolean setActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SETACTIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SETACTIVE$10);
            }
            target.set(setActive);
        }
    }
    
    /**
     * Unsets the "SetActive" element
     */
    public void unsetSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETACTIVE$10, 0);
        }
    }
}
