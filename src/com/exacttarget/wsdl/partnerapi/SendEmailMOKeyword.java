/*
 * XML Type:  SendEmailMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SendEmailMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SendEmailMOKeyword extends com.exacttarget.wsdl.partnerapi.BaseMOKeyword
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendEmailMOKeyword.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("sendemailmokeywordc343type");
    
    /**
     * Gets the "SuccessMessage" element
     */
    java.lang.String getSuccessMessage();
    
    /**
     * Gets (as xml) the "SuccessMessage" element
     */
    org.apache.xmlbeans.XmlString xgetSuccessMessage();
    
    /**
     * True if has "SuccessMessage" element
     */
    boolean isSetSuccessMessage();
    
    /**
     * Sets the "SuccessMessage" element
     */
    void setSuccessMessage(java.lang.String successMessage);
    
    /**
     * Sets (as xml) the "SuccessMessage" element
     */
    void xsetSuccessMessage(org.apache.xmlbeans.XmlString successMessage);
    
    /**
     * Unsets the "SuccessMessage" element
     */
    void unsetSuccessMessage();
    
    /**
     * Gets the "MissingEmailMessage" element
     */
    java.lang.String getMissingEmailMessage();
    
    /**
     * Gets (as xml) the "MissingEmailMessage" element
     */
    org.apache.xmlbeans.XmlString xgetMissingEmailMessage();
    
    /**
     * True if has "MissingEmailMessage" element
     */
    boolean isSetMissingEmailMessage();
    
    /**
     * Sets the "MissingEmailMessage" element
     */
    void setMissingEmailMessage(java.lang.String missingEmailMessage);
    
    /**
     * Sets (as xml) the "MissingEmailMessage" element
     */
    void xsetMissingEmailMessage(org.apache.xmlbeans.XmlString missingEmailMessage);
    
    /**
     * Unsets the "MissingEmailMessage" element
     */
    void unsetMissingEmailMessage();
    
    /**
     * Gets the "FailureMessage" element
     */
    java.lang.String getFailureMessage();
    
    /**
     * Gets (as xml) the "FailureMessage" element
     */
    org.apache.xmlbeans.XmlString xgetFailureMessage();
    
    /**
     * True if has "FailureMessage" element
     */
    boolean isSetFailureMessage();
    
    /**
     * Sets the "FailureMessage" element
     */
    void setFailureMessage(java.lang.String failureMessage);
    
    /**
     * Sets (as xml) the "FailureMessage" element
     */
    void xsetFailureMessage(org.apache.xmlbeans.XmlString failureMessage);
    
    /**
     * Unsets the "FailureMessage" element
     */
    void unsetFailureMessage();
    
    /**
     * Gets the "TriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSend();
    
    /**
     * True if has "TriggeredSend" element
     */
    boolean isSetTriggeredSend();
    
    /**
     * Sets the "TriggeredSend" element
     */
    void setTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSend);
    
    /**
     * Appends and returns a new empty "TriggeredSend" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSend();
    
    /**
     * Unsets the "TriggeredSend" element
     */
    void unsetTriggeredSend();
    
    /**
     * Gets the "NextMOKeyword" element
     */
    com.exacttarget.wsdl.partnerapi.BaseMOKeyword getNextMOKeyword();
    
    /**
     * True if has "NextMOKeyword" element
     */
    boolean isSetNextMOKeyword();
    
    /**
     * Sets the "NextMOKeyword" element
     */
    void setNextMOKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword nextMOKeyword);
    
    /**
     * Appends and returns a new empty "NextMOKeyword" element
     */
    com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewNextMOKeyword();
    
    /**
     * Unsets the "NextMOKeyword" element
     */
    void unsetNextMOKeyword();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
