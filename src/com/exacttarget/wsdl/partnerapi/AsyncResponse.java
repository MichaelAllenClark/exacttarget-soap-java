/*
 * XML Type:  AsyncResponse
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AsyncResponse
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML AsyncResponse(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface AsyncResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsyncResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("asyncresponse9f0btype");
    
    /**
     * Gets the "ResponseType" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponseType.Enum getResponseType();
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponseType xgetResponseType();
    
    /**
     * Sets the "ResponseType" element
     */
    void setResponseType(com.exacttarget.wsdl.partnerapi.AsyncResponseType.Enum responseType);
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    void xsetResponseType(com.exacttarget.wsdl.partnerapi.AsyncResponseType responseType);
    
    /**
     * Gets the "ResponseAddress" element
     */
    java.lang.String getResponseAddress();
    
    /**
     * Gets (as xml) the "ResponseAddress" element
     */
    org.apache.xmlbeans.XmlString xgetResponseAddress();
    
    /**
     * Sets the "ResponseAddress" element
     */
    void setResponseAddress(java.lang.String responseAddress);
    
    /**
     * Sets (as xml) the "ResponseAddress" element
     */
    void xsetResponseAddress(org.apache.xmlbeans.XmlString responseAddress);
    
    /**
     * Gets the "RespondWhen" element
     */
    com.exacttarget.wsdl.partnerapi.RespondWhen.Enum getRespondWhen();
    
    /**
     * Gets (as xml) the "RespondWhen" element
     */
    com.exacttarget.wsdl.partnerapi.RespondWhen xgetRespondWhen();
    
    /**
     * True if has "RespondWhen" element
     */
    boolean isSetRespondWhen();
    
    /**
     * Sets the "RespondWhen" element
     */
    void setRespondWhen(com.exacttarget.wsdl.partnerapi.RespondWhen.Enum respondWhen);
    
    /**
     * Sets (as xml) the "RespondWhen" element
     */
    void xsetRespondWhen(com.exacttarget.wsdl.partnerapi.RespondWhen respondWhen);
    
    /**
     * Unsets the "RespondWhen" element
     */
    void unsetRespondWhen();
    
    /**
     * Gets the "IncludeResults" element
     */
    boolean getIncludeResults();
    
    /**
     * Gets (as xml) the "IncludeResults" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeResults();
    
    /**
     * True if has "IncludeResults" element
     */
    boolean isSetIncludeResults();
    
    /**
     * Sets the "IncludeResults" element
     */
    void setIncludeResults(boolean includeResults);
    
    /**
     * Sets (as xml) the "IncludeResults" element
     */
    void xsetIncludeResults(org.apache.xmlbeans.XmlBoolean includeResults);
    
    /**
     * Unsets the "IncludeResults" element
     */
    void unsetIncludeResults();
    
    /**
     * Gets the "IncludeObjects" element
     */
    boolean getIncludeObjects();
    
    /**
     * Gets (as xml) the "IncludeObjects" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeObjects();
    
    /**
     * True if has "IncludeObjects" element
     */
    boolean isSetIncludeObjects();
    
    /**
     * Sets the "IncludeObjects" element
     */
    void setIncludeObjects(boolean includeObjects);
    
    /**
     * Sets (as xml) the "IncludeObjects" element
     */
    void xsetIncludeObjects(org.apache.xmlbeans.XmlBoolean includeObjects);
    
    /**
     * Unsets the "IncludeObjects" element
     */
    void unsetIncludeObjects();
    
    /**
     * Gets the "OnlyIncludeBase" element
     */
    boolean getOnlyIncludeBase();
    
    /**
     * Gets (as xml) the "OnlyIncludeBase" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOnlyIncludeBase();
    
    /**
     * True if has "OnlyIncludeBase" element
     */
    boolean isSetOnlyIncludeBase();
    
    /**
     * Sets the "OnlyIncludeBase" element
     */
    void setOnlyIncludeBase(boolean onlyIncludeBase);
    
    /**
     * Sets (as xml) the "OnlyIncludeBase" element
     */
    void xsetOnlyIncludeBase(org.apache.xmlbeans.XmlBoolean onlyIncludeBase);
    
    /**
     * Unsets the "OnlyIncludeBase" element
     */
    void unsetOnlyIncludeBase();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse newInstance() {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AsyncResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AsyncResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
