/*
 * XML Type:  TriggeredSendStatusEnum
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML TriggeredSendStatusEnum(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is an atomic type that is a restriction of com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.
 */
public interface TriggeredSendStatusEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriggeredSendStatusEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("triggeredsendstatusenumdb16type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NEW = Enum.forString("New");
    static final Enum INACTIVE = Enum.forString("Inactive");
    static final Enum ACTIVE = Enum.forString("Active");
    static final Enum CANCELED = Enum.forString("Canceled");
    static final Enum DELETED = Enum.forString("Deleted");
    static final Enum MOVED = Enum.forString("Moved");
    
    static final int INT_NEW = Enum.INT_NEW;
    static final int INT_INACTIVE = Enum.INT_INACTIVE;
    static final int INT_ACTIVE = Enum.INT_ACTIVE;
    static final int INT_CANCELED = Enum.INT_CANCELED;
    static final int INT_DELETED = Enum.INT_DELETED;
    static final int INT_MOVED = Enum.INT_MOVED;
    
    /**
     * Enumeration value class for com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NEW
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_NEW = 1;
        static final int INT_INACTIVE = 2;
        static final int INT_ACTIVE = 3;
        static final int INT_CANCELED = 4;
        static final int INT_DELETED = 5;
        static final int INT_MOVED = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("New", INT_NEW),
                new Enum("Inactive", INT_INACTIVE),
                new Enum("Active", INT_ACTIVE),
                new Enum("Canceled", INT_CANCELED),
                new Enum("Deleted", INT_DELETED),
                new Enum("Moved", INT_MOVED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum newValue(java.lang.Object obj) {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) type.newValue( obj ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum newInstance() {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
