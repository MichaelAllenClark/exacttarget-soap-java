/*
 * XML Type:  HelpMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.HelpMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML HelpMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface HelpMOKeyword extends com.exacttarget.wsdl.partnerapi.BaseMOKeyword
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HelpMOKeyword.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("helpmokeywordde02type");
    
    /**
     * Gets the "FriendlyName" element
     */
    java.lang.String getFriendlyName();
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    org.apache.xmlbeans.XmlString xgetFriendlyName();
    
    /**
     * True if has "FriendlyName" element
     */
    boolean isSetFriendlyName();
    
    /**
     * Sets the "FriendlyName" element
     */
    void setFriendlyName(java.lang.String friendlyName);
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName);
    
    /**
     * Unsets the "FriendlyName" element
     */
    void unsetFriendlyName();
    
    /**
     * Gets the "DefaultHelpMessage" element
     */
    java.lang.String getDefaultHelpMessage();
    
    /**
     * Gets (as xml) the "DefaultHelpMessage" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultHelpMessage();
    
    /**
     * True if has "DefaultHelpMessage" element
     */
    boolean isSetDefaultHelpMessage();
    
    /**
     * Sets the "DefaultHelpMessage" element
     */
    void setDefaultHelpMessage(java.lang.String defaultHelpMessage);
    
    /**
     * Sets (as xml) the "DefaultHelpMessage" element
     */
    void xsetDefaultHelpMessage(org.apache.xmlbeans.XmlString defaultHelpMessage);
    
    /**
     * Unsets the "DefaultHelpMessage" element
     */
    void unsetDefaultHelpMessage();
    
    /**
     * Gets the "MenuText" element
     */
    java.lang.String getMenuText();
    
    /**
     * Gets (as xml) the "MenuText" element
     */
    org.apache.xmlbeans.XmlString xgetMenuText();
    
    /**
     * True if has "MenuText" element
     */
    boolean isSetMenuText();
    
    /**
     * Sets the "MenuText" element
     */
    void setMenuText(java.lang.String menuText);
    
    /**
     * Sets (as xml) the "MenuText" element
     */
    void xsetMenuText(org.apache.xmlbeans.XmlString menuText);
    
    /**
     * Unsets the "MenuText" element
     */
    void unsetMenuText();
    
    /**
     * Gets the "MoreChoicesPrompt" element
     */
    java.lang.String getMoreChoicesPrompt();
    
    /**
     * Gets (as xml) the "MoreChoicesPrompt" element
     */
    org.apache.xmlbeans.XmlString xgetMoreChoicesPrompt();
    
    /**
     * True if has "MoreChoicesPrompt" element
     */
    boolean isSetMoreChoicesPrompt();
    
    /**
     * Sets the "MoreChoicesPrompt" element
     */
    void setMoreChoicesPrompt(java.lang.String moreChoicesPrompt);
    
    /**
     * Sets (as xml) the "MoreChoicesPrompt" element
     */
    void xsetMoreChoicesPrompt(org.apache.xmlbeans.XmlString moreChoicesPrompt);
    
    /**
     * Unsets the "MoreChoicesPrompt" element
     */
    void unsetMoreChoicesPrompt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword newInstance() {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.HelpMOKeyword parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.HelpMOKeyword) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
