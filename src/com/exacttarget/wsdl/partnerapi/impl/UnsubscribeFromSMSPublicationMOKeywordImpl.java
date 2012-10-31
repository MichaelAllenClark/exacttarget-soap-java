/*
 * XML Type:  UnsubscribeFromSMSPublicationMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML UnsubscribeFromSMSPublicationMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class UnsubscribeFromSMSPublicationMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.BaseMOKeywordImpl implements com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword
{
    
    public UnsubscribeFromSMSPublicationMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEXTMOKEYWORD$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NextMOKeyword");
    private static final javax.xml.namespace.QName ALLUNSUBSUCCESSMESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AllUnsubSuccessMessage");
    private static final javax.xml.namespace.QName INVALIDPUBLICATIONMESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InvalidPublicationMessage");
    private static final javax.xml.namespace.QName SINGLEUNSUBSUCCESSMESSAGE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SingleUnsubSuccessMessage");
    
    
    /**
     * Gets the "NextMOKeyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword getNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NextMOKeyword" element
     */
    public boolean isSetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTMOKEYWORD$0) != 0;
        }
    }
    
    /**
     * Sets the "NextMOKeyword" element
     */
    public void setNextMOKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword nextMOKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$0);
            }
            target.set(nextMOKeyword);
        }
    }
    
    /**
     * Appends and returns a new empty "NextMOKeyword" element
     */
    public com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "NextMOKeyword" element
     */
    public void unsetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTMOKEYWORD$0, 0);
        }
    }
    
    /**
     * Gets the "AllUnsubSuccessMessage" element
     */
    public java.lang.String getAllUnsubSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLUNSUBSUCCESSMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllUnsubSuccessMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetAllUnsubSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLUNSUBSUCCESSMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AllUnsubSuccessMessage" element
     */
    public void setAllUnsubSuccessMessage(java.lang.String allUnsubSuccessMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLUNSUBSUCCESSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLUNSUBSUCCESSMESSAGE$2);
            }
            target.setStringValue(allUnsubSuccessMessage);
        }
    }
    
    /**
     * Sets (as xml) the "AllUnsubSuccessMessage" element
     */
    public void xsetAllUnsubSuccessMessage(org.apache.xmlbeans.XmlString allUnsubSuccessMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLUNSUBSUCCESSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLUNSUBSUCCESSMESSAGE$2);
            }
            target.set(allUnsubSuccessMessage);
        }
    }
    
    /**
     * Gets the "InvalidPublicationMessage" element
     */
    public java.lang.String getInvalidPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvalidPublicationMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetInvalidPublicationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvalidPublicationMessage" element
     */
    public void setInvalidPublicationMessage(java.lang.String invalidPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDPUBLICATIONMESSAGE$4);
            }
            target.setStringValue(invalidPublicationMessage);
        }
    }
    
    /**
     * Sets (as xml) the "InvalidPublicationMessage" element
     */
    public void xsetInvalidPublicationMessage(org.apache.xmlbeans.XmlString invalidPublicationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVALIDPUBLICATIONMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVALIDPUBLICATIONMESSAGE$4);
            }
            target.set(invalidPublicationMessage);
        }
    }
    
    /**
     * Gets the "SingleUnsubSuccessMessage" element
     */
    public java.lang.String getSingleUnsubSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEUNSUBSUCCESSMESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SingleUnsubSuccessMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetSingleUnsubSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUNSUBSUCCESSMESSAGE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SingleUnsubSuccessMessage" element
     */
    public void setSingleUnsubSuccessMessage(java.lang.String singleUnsubSuccessMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEUNSUBSUCCESSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLEUNSUBSUCCESSMESSAGE$6);
            }
            target.setStringValue(singleUnsubSuccessMessage);
        }
    }
    
    /**
     * Sets (as xml) the "SingleUnsubSuccessMessage" element
     */
    public void xsetSingleUnsubSuccessMessage(org.apache.xmlbeans.XmlString singleUnsubSuccessMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUNSUBSUCCESSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SINGLEUNSUBSUCCESSMESSAGE$6);
            }
            target.set(singleUnsubSuccessMessage);
        }
    }
}
