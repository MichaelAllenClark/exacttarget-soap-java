/*
 * XML Type:  ResultItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ResultItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ResultItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ResultItem extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("resultitem8e46type");
    
    /**
     * Gets the "RequestID" element
     */
    java.lang.String getRequestID();
    
    /**
     * Gets (as xml) the "RequestID" element
     */
    org.apache.xmlbeans.XmlString xgetRequestID();
    
    /**
     * True if has "RequestID" element
     */
    boolean isSetRequestID();
    
    /**
     * Sets the "RequestID" element
     */
    void setRequestID(java.lang.String requestID);
    
    /**
     * Sets (as xml) the "RequestID" element
     */
    void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
    
    /**
     * Unsets the "RequestID" element
     */
    void unsetRequestID();
    
    /**
     * Gets the "ConversationID" element
     */
    java.lang.String getConversationID();
    
    /**
     * Gets (as xml) the "ConversationID" element
     */
    org.apache.xmlbeans.XmlString xgetConversationID();
    
    /**
     * True if has "ConversationID" element
     */
    boolean isSetConversationID();
    
    /**
     * Sets the "ConversationID" element
     */
    void setConversationID(java.lang.String conversationID);
    
    /**
     * Sets (as xml) the "ConversationID" element
     */
    void xsetConversationID(org.apache.xmlbeans.XmlString conversationID);
    
    /**
     * Unsets the "ConversationID" element
     */
    void unsetConversationID();
    
    /**
     * Gets the "StatusCode" element
     */
    java.lang.String getStatusCode();
    
    /**
     * Gets (as xml) the "StatusCode" element
     */
    org.apache.xmlbeans.XmlString xgetStatusCode();
    
    /**
     * Sets the "StatusCode" element
     */
    void setStatusCode(java.lang.String statusCode);
    
    /**
     * Sets (as xml) the "StatusCode" element
     */
    void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode);
    
    /**
     * Gets the "StatusMessage" element
     */
    java.lang.String getStatusMessage();
    
    /**
     * Gets (as xml) the "StatusMessage" element
     */
    org.apache.xmlbeans.XmlString xgetStatusMessage();
    
    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(java.lang.String statusMessage);
    
    /**
     * Sets (as xml) the "StatusMessage" element
     */
    void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage);
    
    /**
     * Gets the "OrdinalID" element
     */
    int getOrdinalID();
    
    /**
     * Gets (as xml) the "OrdinalID" element
     */
    org.apache.xmlbeans.XmlInt xgetOrdinalID();
    
    /**
     * True if has "OrdinalID" element
     */
    boolean isSetOrdinalID();
    
    /**
     * Sets the "OrdinalID" element
     */
    void setOrdinalID(int ordinalID);
    
    /**
     * Sets (as xml) the "OrdinalID" element
     */
    void xsetOrdinalID(org.apache.xmlbeans.XmlInt ordinalID);
    
    /**
     * Unsets the "OrdinalID" element
     */
    void unsetOrdinalID();
    
    /**
     * Gets the "ErrorCode" element
     */
    int getErrorCode();
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    org.apache.xmlbeans.XmlInt xgetErrorCode();
    
    /**
     * True if has "ErrorCode" element
     */
    boolean isSetErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(int errorCode);
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode);
    
    /**
     * Unsets the "ErrorCode" element
     */
    void unsetErrorCode();
    
    /**
     * Gets the "RequestType" element
     */
    com.exacttarget.wsdl.partnerapi.RequestType.Enum getRequestType();
    
    /**
     * Gets (as xml) the "RequestType" element
     */
    com.exacttarget.wsdl.partnerapi.RequestType xgetRequestType();
    
    /**
     * True if has "RequestType" element
     */
    boolean isSetRequestType();
    
    /**
     * Sets the "RequestType" element
     */
    void setRequestType(com.exacttarget.wsdl.partnerapi.RequestType.Enum requestType);
    
    /**
     * Sets (as xml) the "RequestType" element
     */
    void xsetRequestType(com.exacttarget.wsdl.partnerapi.RequestType requestType);
    
    /**
     * Unsets the "RequestType" element
     */
    void unsetRequestType();
    
    /**
     * Gets the "RequestObjectType" element
     */
    java.lang.String getRequestObjectType();
    
    /**
     * Gets (as xml) the "RequestObjectType" element
     */
    org.apache.xmlbeans.XmlString xgetRequestObjectType();
    
    /**
     * True if has "RequestObjectType" element
     */
    boolean isSetRequestObjectType();
    
    /**
     * Sets the "RequestObjectType" element
     */
    void setRequestObjectType(java.lang.String requestObjectType);
    
    /**
     * Sets (as xml) the "RequestObjectType" element
     */
    void xsetRequestObjectType(org.apache.xmlbeans.XmlString requestObjectType);
    
    /**
     * Unsets the "RequestObjectType" element
     */
    void unsetRequestObjectType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ResultItem newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ResultItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
