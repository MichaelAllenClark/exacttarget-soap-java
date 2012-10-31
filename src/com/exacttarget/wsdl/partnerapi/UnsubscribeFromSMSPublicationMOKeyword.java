/*
 * XML Type:  UnsubscribeFromSMSPublicationMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML UnsubscribeFromSMSPublicationMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface UnsubscribeFromSMSPublicationMOKeyword extends com.exacttarget.wsdl.partnerapi.BaseMOKeyword
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnsubscribeFromSMSPublicationMOKeyword.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("unsubscribefromsmspublicationmokeyword8addtype");
    
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
     * Gets the "AllUnsubSuccessMessage" element
     */
    java.lang.String getAllUnsubSuccessMessage();
    
    /**
     * Gets (as xml) the "AllUnsubSuccessMessage" element
     */
    org.apache.xmlbeans.XmlString xgetAllUnsubSuccessMessage();
    
    /**
     * Sets the "AllUnsubSuccessMessage" element
     */
    void setAllUnsubSuccessMessage(java.lang.String allUnsubSuccessMessage);
    
    /**
     * Sets (as xml) the "AllUnsubSuccessMessage" element
     */
    void xsetAllUnsubSuccessMessage(org.apache.xmlbeans.XmlString allUnsubSuccessMessage);
    
    /**
     * Gets the "InvalidPublicationMessage" element
     */
    java.lang.String getInvalidPublicationMessage();
    
    /**
     * Gets (as xml) the "InvalidPublicationMessage" element
     */
    org.apache.xmlbeans.XmlString xgetInvalidPublicationMessage();
    
    /**
     * Sets the "InvalidPublicationMessage" element
     */
    void setInvalidPublicationMessage(java.lang.String invalidPublicationMessage);
    
    /**
     * Sets (as xml) the "InvalidPublicationMessage" element
     */
    void xsetInvalidPublicationMessage(org.apache.xmlbeans.XmlString invalidPublicationMessage);
    
    /**
     * Gets the "SingleUnsubSuccessMessage" element
     */
    java.lang.String getSingleUnsubSuccessMessage();
    
    /**
     * Gets (as xml) the "SingleUnsubSuccessMessage" element
     */
    org.apache.xmlbeans.XmlString xgetSingleUnsubSuccessMessage();
    
    /**
     * Sets the "SingleUnsubSuccessMessage" element
     */
    void setSingleUnsubSuccessMessage(java.lang.String singleUnsubSuccessMessage);
    
    /**
     * Sets (as xml) the "SingleUnsubSuccessMessage" element
     */
    void xsetSingleUnsubSuccessMessage(org.apache.xmlbeans.XmlString singleUnsubSuccessMessage);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword newInstance() {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.UnsubscribeFromSMSPublicationMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
