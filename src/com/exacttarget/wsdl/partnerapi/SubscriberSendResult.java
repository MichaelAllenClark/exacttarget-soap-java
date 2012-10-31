/*
 * XML Type:  SubscriberSendResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberSendResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SubscriberSendResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SubscriberSendResult extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriberSendResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("subscribersendresult9769type");
    
    /**
     * Gets the "Send" element
     */
    com.exacttarget.wsdl.partnerapi.Send getSend();
    
    /**
     * True if has "Send" element
     */
    boolean isSetSend();
    
    /**
     * Sets the "Send" element
     */
    void setSend(com.exacttarget.wsdl.partnerapi.Send send);
    
    /**
     * Appends and returns a new empty "Send" element
     */
    com.exacttarget.wsdl.partnerapi.Send addNewSend();
    
    /**
     * Unsets the "Send" element
     */
    void unsetSend();
    
    /**
     * Gets the "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email getEmail();
    
    /**
     * True if has "Email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(com.exacttarget.wsdl.partnerapi.Email email);
    
    /**
     * Appends and returns a new empty "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email addNewEmail();
    
    /**
     * Unsets the "Email" element
     */
    void unsetEmail();
    
    /**
     * Gets the "Subscriber" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber();
    
    /**
     * True if has "Subscriber" element
     */
    boolean isSetSubscriber();
    
    /**
     * Sets the "Subscriber" element
     */
    void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber);
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber();
    
    /**
     * Unsets the "Subscriber" element
     */
    void unsetSubscriber();
    
    /**
     * Gets the "ClickDate" element
     */
    java.util.Calendar getClickDate();
    
    /**
     * Gets (as xml) the "ClickDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetClickDate();
    
    /**
     * True if has "ClickDate" element
     */
    boolean isSetClickDate();
    
    /**
     * Sets the "ClickDate" element
     */
    void setClickDate(java.util.Calendar clickDate);
    
    /**
     * Sets (as xml) the "ClickDate" element
     */
    void xsetClickDate(org.apache.xmlbeans.XmlDateTime clickDate);
    
    /**
     * Unsets the "ClickDate" element
     */
    void unsetClickDate();
    
    /**
     * Gets the "BounceDate" element
     */
    java.util.Calendar getBounceDate();
    
    /**
     * Gets (as xml) the "BounceDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBounceDate();
    
    /**
     * True if has "BounceDate" element
     */
    boolean isSetBounceDate();
    
    /**
     * Sets the "BounceDate" element
     */
    void setBounceDate(java.util.Calendar bounceDate);
    
    /**
     * Sets (as xml) the "BounceDate" element
     */
    void xsetBounceDate(org.apache.xmlbeans.XmlDateTime bounceDate);
    
    /**
     * Unsets the "BounceDate" element
     */
    void unsetBounceDate();
    
    /**
     * Gets the "OpenDate" element
     */
    java.util.Calendar getOpenDate();
    
    /**
     * Gets (as xml) the "OpenDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetOpenDate();
    
    /**
     * True if has "OpenDate" element
     */
    boolean isSetOpenDate();
    
    /**
     * Sets the "OpenDate" element
     */
    void setOpenDate(java.util.Calendar openDate);
    
    /**
     * Sets (as xml) the "OpenDate" element
     */
    void xsetOpenDate(org.apache.xmlbeans.XmlDateTime openDate);
    
    /**
     * Unsets the "OpenDate" element
     */
    void unsetOpenDate();
    
    /**
     * Gets the "SentDate" element
     */
    java.util.Calendar getSentDate();
    
    /**
     * Gets (as xml) the "SentDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSentDate();
    
    /**
     * True if has "SentDate" element
     */
    boolean isSetSentDate();
    
    /**
     * Sets the "SentDate" element
     */
    void setSentDate(java.util.Calendar sentDate);
    
    /**
     * Sets (as xml) the "SentDate" element
     */
    void xsetSentDate(org.apache.xmlbeans.XmlDateTime sentDate);
    
    /**
     * Unsets the "SentDate" element
     */
    void unsetSentDate();
    
    /**
     * Gets the "LastAction" element
     */
    java.lang.String getLastAction();
    
    /**
     * Gets (as xml) the "LastAction" element
     */
    org.apache.xmlbeans.XmlString xgetLastAction();
    
    /**
     * True if has "LastAction" element
     */
    boolean isSetLastAction();
    
    /**
     * Sets the "LastAction" element
     */
    void setLastAction(java.lang.String lastAction);
    
    /**
     * Sets (as xml) the "LastAction" element
     */
    void xsetLastAction(org.apache.xmlbeans.XmlString lastAction);
    
    /**
     * Unsets the "LastAction" element
     */
    void unsetLastAction();
    
    /**
     * Gets the "UnsubscribeDate" element
     */
    java.util.Calendar getUnsubscribeDate();
    
    /**
     * Gets (as xml) the "UnsubscribeDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUnsubscribeDate();
    
    /**
     * True if has "UnsubscribeDate" element
     */
    boolean isSetUnsubscribeDate();
    
    /**
     * Sets the "UnsubscribeDate" element
     */
    void setUnsubscribeDate(java.util.Calendar unsubscribeDate);
    
    /**
     * Sets (as xml) the "UnsubscribeDate" element
     */
    void xsetUnsubscribeDate(org.apache.xmlbeans.XmlDateTime unsubscribeDate);
    
    /**
     * Unsets the "UnsubscribeDate" element
     */
    void unsetUnsubscribeDate();
    
    /**
     * Gets the "FromAddress" element
     */
    java.lang.String getFromAddress();
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    org.apache.xmlbeans.XmlString xgetFromAddress();
    
    /**
     * True if has "FromAddress" element
     */
    boolean isSetFromAddress();
    
    /**
     * Sets the "FromAddress" element
     */
    void setFromAddress(java.lang.String fromAddress);
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress);
    
    /**
     * Unsets the "FromAddress" element
     */
    void unsetFromAddress();
    
    /**
     * Gets the "FromName" element
     */
    java.lang.String getFromName();
    
    /**
     * Gets (as xml) the "FromName" element
     */
    org.apache.xmlbeans.XmlString xgetFromName();
    
    /**
     * True if has "FromName" element
     */
    boolean isSetFromName();
    
    /**
     * Sets the "FromName" element
     */
    void setFromName(java.lang.String fromName);
    
    /**
     * Sets (as xml) the "FromName" element
     */
    void xsetFromName(org.apache.xmlbeans.XmlString fromName);
    
    /**
     * Unsets the "FromName" element
     */
    void unsetFromName();
    
    /**
     * Gets the "TotalClicks" element
     */
    int getTotalClicks();
    
    /**
     * Gets (as xml) the "TotalClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalClicks();
    
    /**
     * True if has "TotalClicks" element
     */
    boolean isSetTotalClicks();
    
    /**
     * Sets the "TotalClicks" element
     */
    void setTotalClicks(int totalClicks);
    
    /**
     * Sets (as xml) the "TotalClicks" element
     */
    void xsetTotalClicks(org.apache.xmlbeans.XmlInt totalClicks);
    
    /**
     * Unsets the "TotalClicks" element
     */
    void unsetTotalClicks();
    
    /**
     * Gets the "UniqueClicks" element
     */
    int getUniqueClicks();
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueClicks();
    
    /**
     * True if has "UniqueClicks" element
     */
    boolean isSetUniqueClicks();
    
    /**
     * Sets the "UniqueClicks" element
     */
    void setUniqueClicks(int uniqueClicks);
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks);
    
    /**
     * Unsets the "UniqueClicks" element
     */
    void unsetUniqueClicks();
    
    /**
     * Gets the "Subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "Subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * True if has "Subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "Subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "Subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Unsets the "Subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "ViewSentEmailURL" element
     */
    java.lang.String getViewSentEmailURL();
    
    /**
     * Gets (as xml) the "ViewSentEmailURL" element
     */
    org.apache.xmlbeans.XmlString xgetViewSentEmailURL();
    
    /**
     * True if has "ViewSentEmailURL" element
     */
    boolean isSetViewSentEmailURL();
    
    /**
     * Sets the "ViewSentEmailURL" element
     */
    void setViewSentEmailURL(java.lang.String viewSentEmailURL);
    
    /**
     * Sets (as xml) the "ViewSentEmailURL" element
     */
    void xsetViewSentEmailURL(org.apache.xmlbeans.XmlString viewSentEmailURL);
    
    /**
     * Unsets the "ViewSentEmailURL" element
     */
    void unsetViewSentEmailURL();
    
    /**
     * Gets the "HardBounces" element
     */
    int getHardBounces();
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetHardBounces();
    
    /**
     * True if has "HardBounces" element
     */
    boolean isSetHardBounces();
    
    /**
     * Sets the "HardBounces" element
     */
    void setHardBounces(int hardBounces);
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces);
    
    /**
     * Unsets the "HardBounces" element
     */
    void unsetHardBounces();
    
    /**
     * Gets the "SoftBounces" element
     */
    int getSoftBounces();
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetSoftBounces();
    
    /**
     * True if has "SoftBounces" element
     */
    boolean isSetSoftBounces();
    
    /**
     * Sets the "SoftBounces" element
     */
    void setSoftBounces(int softBounces);
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces);
    
    /**
     * Unsets the "SoftBounces" element
     */
    void unsetSoftBounces();
    
    /**
     * Gets the "OtherBounces" element
     */
    int getOtherBounces();
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetOtherBounces();
    
    /**
     * True if has "OtherBounces" element
     */
    boolean isSetOtherBounces();
    
    /**
     * Sets the "OtherBounces" element
     */
    void setOtherBounces(int otherBounces);
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces);
    
    /**
     * Unsets the "OtherBounces" element
     */
    void unsetOtherBounces();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SubscriberSendResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SubscriberSendResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
