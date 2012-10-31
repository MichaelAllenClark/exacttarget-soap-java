/*
 * XML Type:  AsyncResponse
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AsyncResponse
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AsyncResponse(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AsyncResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AsyncResponse
{
    
    public AsyncResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSETYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResponseType");
    private static final javax.xml.namespace.QName RESPONSEADDRESS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResponseAddress");
    private static final javax.xml.namespace.QName RESPONDWHEN$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RespondWhen");
    private static final javax.xml.namespace.QName INCLUDERESULTS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IncludeResults");
    private static final javax.xml.namespace.QName INCLUDEOBJECTS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IncludeObjects");
    private static final javax.xml.namespace.QName ONLYINCLUDEBASE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OnlyIncludeBase");
    
    
    /**
     * Gets the "ResponseType" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponseType.Enum getResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.AsyncResponseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponseType xgetResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponseType target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponseType)get_store().find_element_user(RESPONSETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResponseType" element
     */
    public void setResponseType(com.exacttarget.wsdl.partnerapi.AsyncResponseType.Enum responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSETYPE$0);
            }
            target.setEnumValue(responseType);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    public void xsetResponseType(com.exacttarget.wsdl.partnerapi.AsyncResponseType responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponseType target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponseType)get_store().find_element_user(RESPONSETYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AsyncResponseType)get_store().add_element_user(RESPONSETYPE$0);
            }
            target.set(responseType);
        }
    }
    
    /**
     * Gets the "ResponseAddress" element
     */
    public java.lang.String getResponseAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResponseAddress" element
     */
    public void setResponseAddress(java.lang.String responseAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSEADDRESS$2);
            }
            target.setStringValue(responseAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseAddress" element
     */
    public void xsetResponseAddress(org.apache.xmlbeans.XmlString responseAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSEADDRESS$2);
            }
            target.set(responseAddress);
        }
    }
    
    /**
     * Gets the "RespondWhen" element
     */
    public com.exacttarget.wsdl.partnerapi.RespondWhen.Enum getRespondWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONDWHEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RespondWhen.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RespondWhen" element
     */
    public com.exacttarget.wsdl.partnerapi.RespondWhen xgetRespondWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RespondWhen target = null;
            target = (com.exacttarget.wsdl.partnerapi.RespondWhen)get_store().find_element_user(RESPONDWHEN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RespondWhen" element
     */
    public boolean isSetRespondWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONDWHEN$4) != 0;
        }
    }
    
    /**
     * Sets the "RespondWhen" element
     */
    public void setRespondWhen(com.exacttarget.wsdl.partnerapi.RespondWhen.Enum respondWhen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONDWHEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONDWHEN$4);
            }
            target.setEnumValue(respondWhen);
        }
    }
    
    /**
     * Sets (as xml) the "RespondWhen" element
     */
    public void xsetRespondWhen(com.exacttarget.wsdl.partnerapi.RespondWhen respondWhen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RespondWhen target = null;
            target = (com.exacttarget.wsdl.partnerapi.RespondWhen)get_store().find_element_user(RESPONDWHEN$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RespondWhen)get_store().add_element_user(RESPONDWHEN$4);
            }
            target.set(respondWhen);
        }
    }
    
    /**
     * Unsets the "RespondWhen" element
     */
    public void unsetRespondWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONDWHEN$4, 0);
        }
    }
    
    /**
     * Gets the "IncludeResults" element
     */
    public boolean getIncludeResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDERESULTS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncludeResults" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDERESULTS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncludeResults" element
     */
    public boolean isSetIncludeResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDERESULTS$6) != 0;
        }
    }
    
    /**
     * Sets the "IncludeResults" element
     */
    public void setIncludeResults(boolean includeResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDERESULTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDERESULTS$6);
            }
            target.setBooleanValue(includeResults);
        }
    }
    
    /**
     * Sets (as xml) the "IncludeResults" element
     */
    public void xsetIncludeResults(org.apache.xmlbeans.XmlBoolean includeResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDERESULTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDERESULTS$6);
            }
            target.set(includeResults);
        }
    }
    
    /**
     * Unsets the "IncludeResults" element
     */
    public void unsetIncludeResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDERESULTS$6, 0);
        }
    }
    
    /**
     * Gets the "IncludeObjects" element
     */
    public boolean getIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEOBJECTS$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncludeObjects" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEOBJECTS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncludeObjects" element
     */
    public boolean isSetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDEOBJECTS$8) != 0;
        }
    }
    
    /**
     * Sets the "IncludeObjects" element
     */
    public void setIncludeObjects(boolean includeObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEOBJECTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEOBJECTS$8);
            }
            target.setBooleanValue(includeObjects);
        }
    }
    
    /**
     * Sets (as xml) the "IncludeObjects" element
     */
    public void xsetIncludeObjects(org.apache.xmlbeans.XmlBoolean includeObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEOBJECTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEOBJECTS$8);
            }
            target.set(includeObjects);
        }
    }
    
    /**
     * Unsets the "IncludeObjects" element
     */
    public void unsetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDEOBJECTS$8, 0);
        }
    }
    
    /**
     * Gets the "OnlyIncludeBase" element
     */
    public boolean getOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYINCLUDEBASE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OnlyIncludeBase" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYINCLUDEBASE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "OnlyIncludeBase" element
     */
    public boolean isSetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONLYINCLUDEBASE$10) != 0;
        }
    }
    
    /**
     * Sets the "OnlyIncludeBase" element
     */
    public void setOnlyIncludeBase(boolean onlyIncludeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYINCLUDEBASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONLYINCLUDEBASE$10);
            }
            target.setBooleanValue(onlyIncludeBase);
        }
    }
    
    /**
     * Sets (as xml) the "OnlyIncludeBase" element
     */
    public void xsetOnlyIncludeBase(org.apache.xmlbeans.XmlBoolean onlyIncludeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYINCLUDEBASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ONLYINCLUDEBASE$10);
            }
            target.set(onlyIncludeBase);
        }
    }
    
    /**
     * Unsets the "OnlyIncludeBase" element
     */
    public void unsetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONLYINCLUDEBASE$10, 0);
        }
    }
}
