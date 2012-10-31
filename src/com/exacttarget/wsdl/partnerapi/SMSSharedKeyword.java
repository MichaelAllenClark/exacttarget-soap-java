/*
 * XML Type:  SMSSharedKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSSharedKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SMSSharedKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SMSSharedKeyword extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SMSSharedKeyword.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("smssharedkeyword5c8btype");
    
    /**
     * Gets the "ShortCode" element
     */
    java.lang.String getShortCode();
    
    /**
     * Gets (as xml) the "ShortCode" element
     */
    org.apache.xmlbeans.XmlString xgetShortCode();
    
    /**
     * Sets the "ShortCode" element
     */
    void setShortCode(java.lang.String shortCode);
    
    /**
     * Sets (as xml) the "ShortCode" element
     */
    void xsetShortCode(org.apache.xmlbeans.XmlString shortCode);
    
    /**
     * Gets the "SharedKeyword" element
     */
    java.lang.String getSharedKeyword();
    
    /**
     * Gets (as xml) the "SharedKeyword" element
     */
    org.apache.xmlbeans.XmlString xgetSharedKeyword();
    
    /**
     * Sets the "SharedKeyword" element
     */
    void setSharedKeyword(java.lang.String sharedKeyword);
    
    /**
     * Sets (as xml) the "SharedKeyword" element
     */
    void xsetSharedKeyword(org.apache.xmlbeans.XmlString sharedKeyword);
    
    /**
     * Gets the "RequestDate" element
     */
    java.util.Calendar getRequestDate();
    
    /**
     * Gets (as xml) the "RequestDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetRequestDate();
    
    /**
     * True if has "RequestDate" element
     */
    boolean isSetRequestDate();
    
    /**
     * Sets the "RequestDate" element
     */
    void setRequestDate(java.util.Calendar requestDate);
    
    /**
     * Sets (as xml) the "RequestDate" element
     */
    void xsetRequestDate(org.apache.xmlbeans.XmlDateTime requestDate);
    
    /**
     * Unsets the "RequestDate" element
     */
    void unsetRequestDate();
    
    /**
     * Gets the "EffectiveDate" element
     */
    java.util.Calendar getEffectiveDate();
    
    /**
     * Gets (as xml) the "EffectiveDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEffectiveDate();
    
    /**
     * True if has "EffectiveDate" element
     */
    boolean isSetEffectiveDate();
    
    /**
     * Sets the "EffectiveDate" element
     */
    void setEffectiveDate(java.util.Calendar effectiveDate);
    
    /**
     * Sets (as xml) the "EffectiveDate" element
     */
    void xsetEffectiveDate(org.apache.xmlbeans.XmlDateTime effectiveDate);
    
    /**
     * Unsets the "EffectiveDate" element
     */
    void unsetEffectiveDate();
    
    /**
     * Gets the "ExpireDate" element
     */
    java.util.Calendar getExpireDate();
    
    /**
     * Gets (as xml) the "ExpireDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExpireDate();
    
    /**
     * True if has "ExpireDate" element
     */
    boolean isSetExpireDate();
    
    /**
     * Sets the "ExpireDate" element
     */
    void setExpireDate(java.util.Calendar expireDate);
    
    /**
     * Sets (as xml) the "ExpireDate" element
     */
    void xsetExpireDate(org.apache.xmlbeans.XmlDateTime expireDate);
    
    /**
     * Unsets the "ExpireDate" element
     */
    void unsetExpireDate();
    
    /**
     * Gets the "ReturnToPoolDate" element
     */
    java.util.Calendar getReturnToPoolDate();
    
    /**
     * Gets (as xml) the "ReturnToPoolDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetReturnToPoolDate();
    
    /**
     * True if has "ReturnToPoolDate" element
     */
    boolean isSetReturnToPoolDate();
    
    /**
     * Sets the "ReturnToPoolDate" element
     */
    void setReturnToPoolDate(java.util.Calendar returnToPoolDate);
    
    /**
     * Sets (as xml) the "ReturnToPoolDate" element
     */
    void xsetReturnToPoolDate(org.apache.xmlbeans.XmlDateTime returnToPoolDate);
    
    /**
     * Unsets the "ReturnToPoolDate" element
     */
    void unsetReturnToPoolDate();
    
    /**
     * Gets the "CountryCode" element
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    org.apache.xmlbeans.XmlString xgetCountryCode();
    
    /**
     * True if has "CountryCode" element
     */
    boolean isSetCountryCode();
    
    /**
     * Sets the "CountryCode" element
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode);
    
    /**
     * Unsets the "CountryCode" element
     */
    void unsetCountryCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SMSSharedKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SMSSharedKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
