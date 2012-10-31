/*
 * An XML document type.
 * Localname: VersionInfoRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one VersionInfoRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class VersionInfoRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument
{
    
    public VersionInfoRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONINFOREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VersionInfoRequestMsg");
    
    
    /**
     * Gets the "VersionInfoRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg getVersionInfoRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg)get_store().find_element_user(VERSIONINFOREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VersionInfoRequestMsg" element
     */
    public void setVersionInfoRequestMsg(com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg versionInfoRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg)get_store().find_element_user(VERSIONINFOREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg)get_store().add_element_user(VERSIONINFOREQUESTMSG$0);
            }
            target.set(versionInfoRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "VersionInfoRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg addNewVersionInfoRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg)get_store().add_element_user(VERSIONINFOREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML VersionInfoRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class VersionInfoRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.VersionInfoRequestMsgDocument.VersionInfoRequestMsg
    {
        
        public VersionInfoRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDEVERSIONHISTORY$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IncludeVersionHistory");
        
        
        /**
         * Gets the "IncludeVersionHistory" element
         */
        public boolean getIncludeVersionHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEVERSIONHISTORY$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncludeVersionHistory" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncludeVersionHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEVERSIONHISTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncludeVersionHistory" element
         */
        public void setIncludeVersionHistory(boolean includeVersionHistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEVERSIONHISTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEVERSIONHISTORY$0);
                }
                target.setBooleanValue(includeVersionHistory);
            }
        }
        
        /**
         * Sets (as xml) the "IncludeVersionHistory" element
         */
        public void xsetIncludeVersionHistory(org.apache.xmlbeans.XmlBoolean includeVersionHistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEVERSIONHISTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEVERSIONHISTORY$0);
                }
                target.set(includeVersionHistory);
            }
        }
    }
}
