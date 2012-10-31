/*
 * XML Type:  SendSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SendSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SendSummary extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("sendsummaryf20atype");
    
    /**
     * Gets the "AccountID" element
     */
    int getAccountID();
    
    /**
     * Gets (as xml) the "AccountID" element
     */
    org.apache.xmlbeans.XmlInt xgetAccountID();
    
    /**
     * True if has "AccountID" element
     */
    boolean isSetAccountID();
    
    /**
     * Sets the "AccountID" element
     */
    void setAccountID(int accountID);
    
    /**
     * Sets (as xml) the "AccountID" element
     */
    void xsetAccountID(org.apache.xmlbeans.XmlInt accountID);
    
    /**
     * Unsets the "AccountID" element
     */
    void unsetAccountID();
    
    /**
     * Gets the "AccountName" element
     */
    java.lang.String getAccountName();
    
    /**
     * Gets (as xml) the "AccountName" element
     */
    org.apache.xmlbeans.XmlString xgetAccountName();
    
    /**
     * True if has "AccountName" element
     */
    boolean isSetAccountName();
    
    /**
     * Sets the "AccountName" element
     */
    void setAccountName(java.lang.String accountName);
    
    /**
     * Sets (as xml) the "AccountName" element
     */
    void xsetAccountName(org.apache.xmlbeans.XmlString accountName);
    
    /**
     * Unsets the "AccountName" element
     */
    void unsetAccountName();
    
    /**
     * Gets the "AccountEmail" element
     */
    java.lang.String getAccountEmail();
    
    /**
     * Gets (as xml) the "AccountEmail" element
     */
    org.apache.xmlbeans.XmlString xgetAccountEmail();
    
    /**
     * True if has "AccountEmail" element
     */
    boolean isSetAccountEmail();
    
    /**
     * Sets the "AccountEmail" element
     */
    void setAccountEmail(java.lang.String accountEmail);
    
    /**
     * Sets (as xml) the "AccountEmail" element
     */
    void xsetAccountEmail(org.apache.xmlbeans.XmlString accountEmail);
    
    /**
     * Unsets the "AccountEmail" element
     */
    void unsetAccountEmail();
    
    /**
     * Gets the "IsTestAccount" element
     */
    boolean getIsTestAccount();
    
    /**
     * Gets (as xml) the "IsTestAccount" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTestAccount();
    
    /**
     * True if has "IsTestAccount" element
     */
    boolean isSetIsTestAccount();
    
    /**
     * Sets the "IsTestAccount" element
     */
    void setIsTestAccount(boolean isTestAccount);
    
    /**
     * Sets (as xml) the "IsTestAccount" element
     */
    void xsetIsTestAccount(org.apache.xmlbeans.XmlBoolean isTestAccount);
    
    /**
     * Unsets the "IsTestAccount" element
     */
    void unsetIsTestAccount();
    
    /**
     * Gets the "SendID" element
     */
    int getSendID();
    
    /**
     * Gets (as xml) the "SendID" element
     */
    org.apache.xmlbeans.XmlInt xgetSendID();
    
    /**
     * True if has "SendID" element
     */
    boolean isSetSendID();
    
    /**
     * Sets the "SendID" element
     */
    void setSendID(int sendID);
    
    /**
     * Sets (as xml) the "SendID" element
     */
    void xsetSendID(org.apache.xmlbeans.XmlInt sendID);
    
    /**
     * Unsets the "SendID" element
     */
    void unsetSendID();
    
    /**
     * Gets the "DeliveredTime" element
     */
    java.lang.String getDeliveredTime();
    
    /**
     * Gets (as xml) the "DeliveredTime" element
     */
    org.apache.xmlbeans.XmlString xgetDeliveredTime();
    
    /**
     * True if has "DeliveredTime" element
     */
    boolean isSetDeliveredTime();
    
    /**
     * Sets the "DeliveredTime" element
     */
    void setDeliveredTime(java.lang.String deliveredTime);
    
    /**
     * Sets (as xml) the "DeliveredTime" element
     */
    void xsetDeliveredTime(org.apache.xmlbeans.XmlString deliveredTime);
    
    /**
     * Unsets the "DeliveredTime" element
     */
    void unsetDeliveredTime();
    
    /**
     * Gets the "TotalSent" element
     */
    int getTotalSent();
    
    /**
     * Gets (as xml) the "TotalSent" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalSent();
    
    /**
     * True if has "TotalSent" element
     */
    boolean isSetTotalSent();
    
    /**
     * Sets the "TotalSent" element
     */
    void setTotalSent(int totalSent);
    
    /**
     * Sets (as xml) the "TotalSent" element
     */
    void xsetTotalSent(org.apache.xmlbeans.XmlInt totalSent);
    
    /**
     * Unsets the "TotalSent" element
     */
    void unsetTotalSent();
    
    /**
     * Gets the "Transactional" element
     */
    int getTransactional();
    
    /**
     * Gets (as xml) the "Transactional" element
     */
    org.apache.xmlbeans.XmlInt xgetTransactional();
    
    /**
     * True if has "Transactional" element
     */
    boolean isSetTransactional();
    
    /**
     * Sets the "Transactional" element
     */
    void setTransactional(int transactional);
    
    /**
     * Sets (as xml) the "Transactional" element
     */
    void xsetTransactional(org.apache.xmlbeans.XmlInt transactional);
    
    /**
     * Unsets the "Transactional" element
     */
    void unsetTransactional();
    
    /**
     * Gets the "NonTransactional" element
     */
    int getNonTransactional();
    
    /**
     * Gets (as xml) the "NonTransactional" element
     */
    org.apache.xmlbeans.XmlInt xgetNonTransactional();
    
    /**
     * True if has "NonTransactional" element
     */
    boolean isSetNonTransactional();
    
    /**
     * Sets the "NonTransactional" element
     */
    void setNonTransactional(int nonTransactional);
    
    /**
     * Sets (as xml) the "NonTransactional" element
     */
    void xsetNonTransactional(org.apache.xmlbeans.XmlInt nonTransactional);
    
    /**
     * Unsets the "NonTransactional" element
     */
    void unsetNonTransactional();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SendSummary newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
