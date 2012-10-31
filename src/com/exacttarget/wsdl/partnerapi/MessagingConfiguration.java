/*
 * XML Type:  MessagingConfiguration
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MessagingConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML MessagingConfiguration(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface MessagingConfiguration extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessagingConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("messagingconfigurationc204type");
    
    /**
     * Gets the "Code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" element
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * Sets the "Code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "Code" element
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Gets the "MessagingVendorKind" element
     */
    com.exacttarget.wsdl.partnerapi.MessagingVendorKind getMessagingVendorKind();
    
    /**
     * Sets the "MessagingVendorKind" element
     */
    void setMessagingVendorKind(com.exacttarget.wsdl.partnerapi.MessagingVendorKind messagingVendorKind);
    
    /**
     * Appends and returns a new empty "MessagingVendorKind" element
     */
    com.exacttarget.wsdl.partnerapi.MessagingVendorKind addNewMessagingVendorKind();
    
    /**
     * Gets the "IsActive" element
     */
    boolean getIsActive();
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActive();
    
    /**
     * Sets the "IsActive" element
     */
    void setIsActive(boolean isActive);
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive);
    
    /**
     * Gets the "Url" element
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "Url" element
     */
    org.apache.xmlbeans.XmlString xgetUrl();
    
    /**
     * Sets the "Url" element
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "Url" element
     */
    void xsetUrl(org.apache.xmlbeans.XmlString url);
    
    /**
     * Gets the "UserName" element
     */
    java.lang.String getUserName();
    
    /**
     * Gets (as xml) the "UserName" element
     */
    org.apache.xmlbeans.XmlString xgetUserName();
    
    /**
     * Sets the "UserName" element
     */
    void setUserName(java.lang.String userName);
    
    /**
     * Sets (as xml) the "UserName" element
     */
    void xsetUserName(org.apache.xmlbeans.XmlString userName);
    
    /**
     * Gets the "Password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "Password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * Sets the "Password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "Password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Gets the "ProfileID" element
     */
    java.lang.String getProfileID();
    
    /**
     * Gets (as xml) the "ProfileID" element
     */
    org.apache.xmlbeans.XmlString xgetProfileID();
    
    /**
     * Sets the "ProfileID" element
     */
    void setProfileID(java.lang.String profileID);
    
    /**
     * Sets (as xml) the "ProfileID" element
     */
    void xsetProfileID(org.apache.xmlbeans.XmlString profileID);
    
    /**
     * Gets the "CallbackUrl" element
     */
    java.lang.String getCallbackUrl();
    
    /**
     * Gets (as xml) the "CallbackUrl" element
     */
    org.apache.xmlbeans.XmlString xgetCallbackUrl();
    
    /**
     * True if has "CallbackUrl" element
     */
    boolean isSetCallbackUrl();
    
    /**
     * Sets the "CallbackUrl" element
     */
    void setCallbackUrl(java.lang.String callbackUrl);
    
    /**
     * Sets (as xml) the "CallbackUrl" element
     */
    void xsetCallbackUrl(org.apache.xmlbeans.XmlString callbackUrl);
    
    /**
     * Unsets the "CallbackUrl" element
     */
    void unsetCallbackUrl();
    
    /**
     * Gets the "MediaTypes" element
     */
    java.lang.String getMediaTypes();
    
    /**
     * Gets (as xml) the "MediaTypes" element
     */
    org.apache.xmlbeans.XmlString xgetMediaTypes();
    
    /**
     * True if has "MediaTypes" element
     */
    boolean isSetMediaTypes();
    
    /**
     * Sets the "MediaTypes" element
     */
    void setMediaTypes(java.lang.String mediaTypes);
    
    /**
     * Sets (as xml) the "MediaTypes" element
     */
    void xsetMediaTypes(org.apache.xmlbeans.XmlString mediaTypes);
    
    /**
     * Unsets the "MediaTypes" element
     */
    void unsetMediaTypes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration newInstance() {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MessagingConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MessagingConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
