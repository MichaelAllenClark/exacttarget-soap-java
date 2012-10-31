/*
 * An XML document type.
 * Localname: VersionInfoResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one VersionInfoResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class VersionInfoResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument
{
    
    public VersionInfoResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONINFORESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VersionInfoResponseMsg");
    
    
    /**
     * Gets the "VersionInfoResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg getVersionInfoResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg)get_store().find_element_user(VERSIONINFORESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VersionInfoResponseMsg" element
     */
    public void setVersionInfoResponseMsg(com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg versionInfoResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg)get_store().find_element_user(VERSIONINFORESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg)get_store().add_element_user(VERSIONINFORESPONSEMSG$0);
            }
            target.set(versionInfoResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "VersionInfoResponseMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg addNewVersionInfoResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg)get_store().add_element_user(VERSIONINFORESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML VersionInfoResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class VersionInfoResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument.VersionInfoResponseMsg
    {
        
        public VersionInfoResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERSIONINFO$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "VersionInfo");
        private static final javax.xml.namespace.QName REQUESTID$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        
        
        /**
         * Gets the "VersionInfo" element
         */
        public com.exacttarget.wsdl.partnerapi.VersionInfoResponse getVersionInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().find_element_user(VERSIONINFO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "VersionInfo" element
         */
        public void setVersionInfo(com.exacttarget.wsdl.partnerapi.VersionInfoResponse versionInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().find_element_user(VERSIONINFO$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().add_element_user(VERSIONINFO$0);
                }
                target.set(versionInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "VersionInfo" element
         */
        public com.exacttarget.wsdl.partnerapi.VersionInfoResponse addNewVersionInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.VersionInfoResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.VersionInfoResponse)get_store().add_element_user(VERSIONINFO$0);
                return target;
            }
        }
        
        /**
         * Gets the "RequestID" element
         */
        public java.lang.String getRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        public org.apache.xmlbeans.XmlString xgetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestID" element
         */
        public boolean isSetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$2) != 0;
            }
        }
        
        /**
         * Sets the "RequestID" element
         */
        public void setRequestID(java.lang.String requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$2);
                }
                target.setStringValue(requestID);
            }
        }
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$2);
                }
                target.set(requestID);
            }
        }
        
        /**
         * Unsets the "RequestID" element
         */
        public void unsetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$2, 0);
            }
        }
    }
}
