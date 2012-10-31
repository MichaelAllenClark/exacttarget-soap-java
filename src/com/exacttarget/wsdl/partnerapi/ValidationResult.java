/*
 * XML Type:  ValidationResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ValidationResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ValidationResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidationResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("validationresult0520type");
    
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
     * Gets the "CheckTime" element
     */
    java.util.Calendar getCheckTime();
    
    /**
     * Gets (as xml) the "CheckTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCheckTime();
    
    /**
     * True if has "CheckTime" element
     */
    boolean isSetCheckTime();
    
    /**
     * Sets the "CheckTime" element
     */
    void setCheckTime(java.util.Calendar checkTime);
    
    /**
     * Sets (as xml) the "CheckTime" element
     */
    void xsetCheckTime(org.apache.xmlbeans.XmlDateTime checkTime);
    
    /**
     * Unsets the "CheckTime" element
     */
    void unsetCheckTime();
    
    /**
     * Gets the "CheckTimeUTC" element
     */
    java.util.Calendar getCheckTimeUTC();
    
    /**
     * Gets (as xml) the "CheckTimeUTC" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCheckTimeUTC();
    
    /**
     * True if has "CheckTimeUTC" element
     */
    boolean isSetCheckTimeUTC();
    
    /**
     * Sets the "CheckTimeUTC" element
     */
    void setCheckTimeUTC(java.util.Calendar checkTimeUTC);
    
    /**
     * Sets (as xml) the "CheckTimeUTC" element
     */
    void xsetCheckTimeUTC(org.apache.xmlbeans.XmlDateTime checkTimeUTC);
    
    /**
     * Unsets the "CheckTimeUTC" element
     */
    void unsetCheckTimeUTC();
    
    /**
     * Gets the "IsResultValid" element
     */
    boolean getIsResultValid();
    
    /**
     * Gets (as xml) the "IsResultValid" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsResultValid();
    
    /**
     * True if has "IsResultValid" element
     */
    boolean isSetIsResultValid();
    
    /**
     * Sets the "IsResultValid" element
     */
    void setIsResultValid(boolean isResultValid);
    
    /**
     * Sets (as xml) the "IsResultValid" element
     */
    void xsetIsResultValid(org.apache.xmlbeans.XmlBoolean isResultValid);
    
    /**
     * Unsets the "IsResultValid" element
     */
    void unsetIsResultValid();
    
    /**
     * Gets the "IsSpam" element
     */
    boolean getIsSpam();
    
    /**
     * Gets (as xml) the "IsSpam" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSpam();
    
    /**
     * True if has "IsSpam" element
     */
    boolean isSetIsSpam();
    
    /**
     * Sets the "IsSpam" element
     */
    void setIsSpam(boolean isSpam);
    
    /**
     * Sets (as xml) the "IsSpam" element
     */
    void xsetIsSpam(org.apache.xmlbeans.XmlBoolean isSpam);
    
    /**
     * Unsets the "IsSpam" element
     */
    void unsetIsSpam();
    
    /**
     * Gets the "Score" element
     */
    double getScore();
    
    /**
     * Gets (as xml) the "Score" element
     */
    org.apache.xmlbeans.XmlDouble xgetScore();
    
    /**
     * True if has "Score" element
     */
    boolean isSetScore();
    
    /**
     * Sets the "Score" element
     */
    void setScore(double score);
    
    /**
     * Sets (as xml) the "Score" element
     */
    void xsetScore(org.apache.xmlbeans.XmlDouble score);
    
    /**
     * Unsets the "Score" element
     */
    void unsetScore();
    
    /**
     * Gets the "Threshold" element
     */
    double getThreshold();
    
    /**
     * Gets (as xml) the "Threshold" element
     */
    org.apache.xmlbeans.XmlDouble xgetThreshold();
    
    /**
     * True if has "Threshold" element
     */
    boolean isSetThreshold();
    
    /**
     * Sets the "Threshold" element
     */
    void setThreshold(double threshold);
    
    /**
     * Sets (as xml) the "Threshold" element
     */
    void xsetThreshold(org.apache.xmlbeans.XmlDouble threshold);
    
    /**
     * Unsets the "Threshold" element
     */
    void unsetThreshold();
    
    /**
     * Gets the "Message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "Message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "Message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "Message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "Message" element
     */
    void unsetMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ValidationResult newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ValidationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ValidationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
