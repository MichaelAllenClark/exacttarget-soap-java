/*
 * XML Type:  ResultMessage
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ResultMessage(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ResultMessage extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("resultmessageac1etype");
    
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
     * Gets the "OverallStatusCode" element
     */
    java.lang.String getOverallStatusCode();
    
    /**
     * Gets (as xml) the "OverallStatusCode" element
     */
    org.apache.xmlbeans.XmlString xgetOverallStatusCode();
    
    /**
     * True if has "OverallStatusCode" element
     */
    boolean isSetOverallStatusCode();
    
    /**
     * Sets the "OverallStatusCode" element
     */
    void setOverallStatusCode(java.lang.String overallStatusCode);
    
    /**
     * Sets (as xml) the "OverallStatusCode" element
     */
    void xsetOverallStatusCode(org.apache.xmlbeans.XmlString overallStatusCode);
    
    /**
     * Unsets the "OverallStatusCode" element
     */
    void unsetOverallStatusCode();
    
    /**
     * Gets the "StatusCode" element
     */
    java.lang.String getStatusCode();
    
    /**
     * Gets (as xml) the "StatusCode" element
     */
    org.apache.xmlbeans.XmlString xgetStatusCode();
    
    /**
     * True if has "StatusCode" element
     */
    boolean isSetStatusCode();
    
    /**
     * Sets the "StatusCode" element
     */
    void setStatusCode(java.lang.String statusCode);
    
    /**
     * Sets (as xml) the "StatusCode" element
     */
    void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode);
    
    /**
     * Unsets the "StatusCode" element
     */
    void unsetStatusCode();
    
    /**
     * Gets the "StatusMessage" element
     */
    java.lang.String getStatusMessage();
    
    /**
     * Gets (as xml) the "StatusMessage" element
     */
    org.apache.xmlbeans.XmlString xgetStatusMessage();
    
    /**
     * True if has "StatusMessage" element
     */
    boolean isSetStatusMessage();
    
    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(java.lang.String statusMessage);
    
    /**
     * Sets (as xml) the "StatusMessage" element
     */
    void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage);
    
    /**
     * Unsets the "StatusMessage" element
     */
    void unsetStatusMessage();
    
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
     * Gets the "ResultType" element
     */
    java.lang.String getResultType();
    
    /**
     * Gets (as xml) the "ResultType" element
     */
    org.apache.xmlbeans.XmlString xgetResultType();
    
    /**
     * True if has "ResultType" element
     */
    boolean isSetResultType();
    
    /**
     * Sets the "ResultType" element
     */
    void setResultType(java.lang.String resultType);
    
    /**
     * Sets (as xml) the "ResultType" element
     */
    void xsetResultType(org.apache.xmlbeans.XmlString resultType);
    
    /**
     * Unsets the "ResultType" element
     */
    void unsetResultType();
    
    /**
     * Gets the "ResultDetailXML" element
     */
    java.lang.String getResultDetailXML();
    
    /**
     * Gets (as xml) the "ResultDetailXML" element
     */
    org.apache.xmlbeans.XmlString xgetResultDetailXML();
    
    /**
     * True if has "ResultDetailXML" element
     */
    boolean isSetResultDetailXML();
    
    /**
     * Sets the "ResultDetailXML" element
     */
    void setResultDetailXML(java.lang.String resultDetailXML);
    
    /**
     * Sets (as xml) the "ResultDetailXML" element
     */
    void xsetResultDetailXML(org.apache.xmlbeans.XmlString resultDetailXML);
    
    /**
     * Unsets the "ResultDetailXML" element
     */
    void unsetResultDetailXML();
    
    /**
     * Gets the "SequenceCode" element
     */
    int getSequenceCode();
    
    /**
     * Gets (as xml) the "SequenceCode" element
     */
    org.apache.xmlbeans.XmlInt xgetSequenceCode();
    
    /**
     * True if has "SequenceCode" element
     */
    boolean isSetSequenceCode();
    
    /**
     * Sets the "SequenceCode" element
     */
    void setSequenceCode(int sequenceCode);
    
    /**
     * Sets (as xml) the "SequenceCode" element
     */
    void xsetSequenceCode(org.apache.xmlbeans.XmlInt sequenceCode);
    
    /**
     * Unsets the "SequenceCode" element
     */
    void unsetSequenceCode();
    
    /**
     * Gets the "CallsInConversation" element
     */
    int getCallsInConversation();
    
    /**
     * Gets (as xml) the "CallsInConversation" element
     */
    org.apache.xmlbeans.XmlInt xgetCallsInConversation();
    
    /**
     * True if has "CallsInConversation" element
     */
    boolean isSetCallsInConversation();
    
    /**
     * Sets the "CallsInConversation" element
     */
    void setCallsInConversation(int callsInConversation);
    
    /**
     * Sets (as xml) the "CallsInConversation" element
     */
    void xsetCallsInConversation(org.apache.xmlbeans.XmlInt callsInConversation);
    
    /**
     * Unsets the "CallsInConversation" element
     */
    void unsetCallsInConversation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ResultMessage newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ResultMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ResultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
