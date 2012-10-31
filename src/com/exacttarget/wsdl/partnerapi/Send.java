/*
 * XML Type:  Send
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Send
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Send(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Send extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Send.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("send7dcetype");
    
    /**
     * Gets the "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email getEmail();
    
    /**
     * True if has "Email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(com.exacttarget.wsdl.partnerapi.Email email);
    
    /**
     * Appends and returns a new empty "Email" element
     */
    com.exacttarget.wsdl.partnerapi.Email addNewEmail();
    
    /**
     * Unsets the "Email" element
     */
    void unsetEmail();
    
    /**
     * Gets array of all "List" elements
     */
    com.exacttarget.wsdl.partnerapi.List[] getListArray();
    
    /**
     * Gets ith "List" element
     */
    com.exacttarget.wsdl.partnerapi.List getListArray(int i);
    
    /**
     * Returns number of "List" element
     */
    int sizeOfListArray();
    
    /**
     * Sets array of all "List" element
     */
    void setListArray(com.exacttarget.wsdl.partnerapi.List[] listArray);
    
    /**
     * Sets ith "List" element
     */
    void setListArray(int i, com.exacttarget.wsdl.partnerapi.List list);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "List" element
     */
    com.exacttarget.wsdl.partnerapi.List insertNewList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "List" element
     */
    com.exacttarget.wsdl.partnerapi.List addNewList();
    
    /**
     * Removes the ith "List" element
     */
    void removeList(int i);
    
    /**
     * Gets the "SendDate" element
     */
    java.util.Calendar getSendDate();
    
    /**
     * Gets (as xml) the "SendDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSendDate();
    
    /**
     * True if has "SendDate" element
     */
    boolean isSetSendDate();
    
    /**
     * Sets the "SendDate" element
     */
    void setSendDate(java.util.Calendar sendDate);
    
    /**
     * Sets (as xml) the "SendDate" element
     */
    void xsetSendDate(org.apache.xmlbeans.XmlDateTime sendDate);
    
    /**
     * Unsets the "SendDate" element
     */
    void unsetSendDate();
    
    /**
     * Gets the "FromAddress" element
     */
    java.lang.String getFromAddress();
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    org.apache.xmlbeans.XmlString xgetFromAddress();
    
    /**
     * True if has "FromAddress" element
     */
    boolean isSetFromAddress();
    
    /**
     * Sets the "FromAddress" element
     */
    void setFromAddress(java.lang.String fromAddress);
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress);
    
    /**
     * Unsets the "FromAddress" element
     */
    void unsetFromAddress();
    
    /**
     * Gets the "FromName" element
     */
    java.lang.String getFromName();
    
    /**
     * Gets (as xml) the "FromName" element
     */
    org.apache.xmlbeans.XmlString xgetFromName();
    
    /**
     * True if has "FromName" element
     */
    boolean isSetFromName();
    
    /**
     * Sets the "FromName" element
     */
    void setFromName(java.lang.String fromName);
    
    /**
     * Sets (as xml) the "FromName" element
     */
    void xsetFromName(org.apache.xmlbeans.XmlString fromName);
    
    /**
     * Unsets the "FromName" element
     */
    void unsetFromName();
    
    /**
     * Gets the "Duplicates" element
     */
    int getDuplicates();
    
    /**
     * Gets (as xml) the "Duplicates" element
     */
    org.apache.xmlbeans.XmlInt xgetDuplicates();
    
    /**
     * True if has "Duplicates" element
     */
    boolean isSetDuplicates();
    
    /**
     * Sets the "Duplicates" element
     */
    void setDuplicates(int duplicates);
    
    /**
     * Sets (as xml) the "Duplicates" element
     */
    void xsetDuplicates(org.apache.xmlbeans.XmlInt duplicates);
    
    /**
     * Unsets the "Duplicates" element
     */
    void unsetDuplicates();
    
    /**
     * Gets the "InvalidAddresses" element
     */
    int getInvalidAddresses();
    
    /**
     * Gets (as xml) the "InvalidAddresses" element
     */
    org.apache.xmlbeans.XmlInt xgetInvalidAddresses();
    
    /**
     * True if has "InvalidAddresses" element
     */
    boolean isSetInvalidAddresses();
    
    /**
     * Sets the "InvalidAddresses" element
     */
    void setInvalidAddresses(int invalidAddresses);
    
    /**
     * Sets (as xml) the "InvalidAddresses" element
     */
    void xsetInvalidAddresses(org.apache.xmlbeans.XmlInt invalidAddresses);
    
    /**
     * Unsets the "InvalidAddresses" element
     */
    void unsetInvalidAddresses();
    
    /**
     * Gets the "ExistingUndeliverables" element
     */
    int getExistingUndeliverables();
    
    /**
     * Gets (as xml) the "ExistingUndeliverables" element
     */
    org.apache.xmlbeans.XmlInt xgetExistingUndeliverables();
    
    /**
     * True if has "ExistingUndeliverables" element
     */
    boolean isSetExistingUndeliverables();
    
    /**
     * Sets the "ExistingUndeliverables" element
     */
    void setExistingUndeliverables(int existingUndeliverables);
    
    /**
     * Sets (as xml) the "ExistingUndeliverables" element
     */
    void xsetExistingUndeliverables(org.apache.xmlbeans.XmlInt existingUndeliverables);
    
    /**
     * Unsets the "ExistingUndeliverables" element
     */
    void unsetExistingUndeliverables();
    
    /**
     * Gets the "ExistingUnsubscribes" element
     */
    int getExistingUnsubscribes();
    
    /**
     * Gets (as xml) the "ExistingUnsubscribes" element
     */
    org.apache.xmlbeans.XmlInt xgetExistingUnsubscribes();
    
    /**
     * True if has "ExistingUnsubscribes" element
     */
    boolean isSetExistingUnsubscribes();
    
    /**
     * Sets the "ExistingUnsubscribes" element
     */
    void setExistingUnsubscribes(int existingUnsubscribes);
    
    /**
     * Sets (as xml) the "ExistingUnsubscribes" element
     */
    void xsetExistingUnsubscribes(org.apache.xmlbeans.XmlInt existingUnsubscribes);
    
    /**
     * Unsets the "ExistingUnsubscribes" element
     */
    void unsetExistingUnsubscribes();
    
    /**
     * Gets the "HardBounces" element
     */
    int getHardBounces();
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetHardBounces();
    
    /**
     * True if has "HardBounces" element
     */
    boolean isSetHardBounces();
    
    /**
     * Sets the "HardBounces" element
     */
    void setHardBounces(int hardBounces);
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces);
    
    /**
     * Unsets the "HardBounces" element
     */
    void unsetHardBounces();
    
    /**
     * Gets the "SoftBounces" element
     */
    int getSoftBounces();
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetSoftBounces();
    
    /**
     * True if has "SoftBounces" element
     */
    boolean isSetSoftBounces();
    
    /**
     * Sets the "SoftBounces" element
     */
    void setSoftBounces(int softBounces);
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces);
    
    /**
     * Unsets the "SoftBounces" element
     */
    void unsetSoftBounces();
    
    /**
     * Gets the "OtherBounces" element
     */
    int getOtherBounces();
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    org.apache.xmlbeans.XmlInt xgetOtherBounces();
    
    /**
     * True if has "OtherBounces" element
     */
    boolean isSetOtherBounces();
    
    /**
     * Sets the "OtherBounces" element
     */
    void setOtherBounces(int otherBounces);
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces);
    
    /**
     * Unsets the "OtherBounces" element
     */
    void unsetOtherBounces();
    
    /**
     * Gets the "ForwardedEmails" element
     */
    int getForwardedEmails();
    
    /**
     * Gets (as xml) the "ForwardedEmails" element
     */
    org.apache.xmlbeans.XmlInt xgetForwardedEmails();
    
    /**
     * True if has "ForwardedEmails" element
     */
    boolean isSetForwardedEmails();
    
    /**
     * Sets the "ForwardedEmails" element
     */
    void setForwardedEmails(int forwardedEmails);
    
    /**
     * Sets (as xml) the "ForwardedEmails" element
     */
    void xsetForwardedEmails(org.apache.xmlbeans.XmlInt forwardedEmails);
    
    /**
     * Unsets the "ForwardedEmails" element
     */
    void unsetForwardedEmails();
    
    /**
     * Gets the "UniqueClicks" element
     */
    int getUniqueClicks();
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueClicks();
    
    /**
     * True if has "UniqueClicks" element
     */
    boolean isSetUniqueClicks();
    
    /**
     * Sets the "UniqueClicks" element
     */
    void setUniqueClicks(int uniqueClicks);
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks);
    
    /**
     * Unsets the "UniqueClicks" element
     */
    void unsetUniqueClicks();
    
    /**
     * Gets the "UniqueOpens" element
     */
    int getUniqueOpens();
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    org.apache.xmlbeans.XmlInt xgetUniqueOpens();
    
    /**
     * True if has "UniqueOpens" element
     */
    boolean isSetUniqueOpens();
    
    /**
     * Sets the "UniqueOpens" element
     */
    void setUniqueOpens(int uniqueOpens);
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    void xsetUniqueOpens(org.apache.xmlbeans.XmlInt uniqueOpens);
    
    /**
     * Unsets the "UniqueOpens" element
     */
    void unsetUniqueOpens();
    
    /**
     * Gets the "NumberSent" element
     */
    int getNumberSent();
    
    /**
     * Gets (as xml) the "NumberSent" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberSent();
    
    /**
     * Tests for nil "NumberSent" element
     */
    boolean isNilNumberSent();
    
    /**
     * True if has "NumberSent" element
     */
    boolean isSetNumberSent();
    
    /**
     * Sets the "NumberSent" element
     */
    void setNumberSent(int numberSent);
    
    /**
     * Sets (as xml) the "NumberSent" element
     */
    void xsetNumberSent(org.apache.xmlbeans.XmlInt numberSent);
    
    /**
     * Nils the "NumberSent" element
     */
    void setNilNumberSent();
    
    /**
     * Unsets the "NumberSent" element
     */
    void unsetNumberSent();
    
    /**
     * Gets the "NumberDelivered" element
     */
    int getNumberDelivered();
    
    /**
     * Gets (as xml) the "NumberDelivered" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberDelivered();
    
    /**
     * Tests for nil "NumberDelivered" element
     */
    boolean isNilNumberDelivered();
    
    /**
     * True if has "NumberDelivered" element
     */
    boolean isSetNumberDelivered();
    
    /**
     * Sets the "NumberDelivered" element
     */
    void setNumberDelivered(int numberDelivered);
    
    /**
     * Sets (as xml) the "NumberDelivered" element
     */
    void xsetNumberDelivered(org.apache.xmlbeans.XmlInt numberDelivered);
    
    /**
     * Nils the "NumberDelivered" element
     */
    void setNilNumberDelivered();
    
    /**
     * Unsets the "NumberDelivered" element
     */
    void unsetNumberDelivered();
    
    /**
     * Gets the "Unsubscribes" element
     */
    int getUnsubscribes();
    
    /**
     * Gets (as xml) the "Unsubscribes" element
     */
    org.apache.xmlbeans.XmlInt xgetUnsubscribes();
    
    /**
     * True if has "Unsubscribes" element
     */
    boolean isSetUnsubscribes();
    
    /**
     * Sets the "Unsubscribes" element
     */
    void setUnsubscribes(int unsubscribes);
    
    /**
     * Sets (as xml) the "Unsubscribes" element
     */
    void xsetUnsubscribes(org.apache.xmlbeans.XmlInt unsubscribes);
    
    /**
     * Unsets the "Unsubscribes" element
     */
    void unsetUnsubscribes();
    
    /**
     * Gets the "MissingAddresses" element
     */
    int getMissingAddresses();
    
    /**
     * Gets (as xml) the "MissingAddresses" element
     */
    org.apache.xmlbeans.XmlInt xgetMissingAddresses();
    
    /**
     * True if has "MissingAddresses" element
     */
    boolean isSetMissingAddresses();
    
    /**
     * Sets the "MissingAddresses" element
     */
    void setMissingAddresses(int missingAddresses);
    
    /**
     * Sets (as xml) the "MissingAddresses" element
     */
    void xsetMissingAddresses(org.apache.xmlbeans.XmlInt missingAddresses);
    
    /**
     * Unsets the "MissingAddresses" element
     */
    void unsetMissingAddresses();
    
    /**
     * Gets the "Subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "Subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * True if has "Subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "Subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "Subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Unsets the "Subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "PreviewURL" element
     */
    java.lang.String getPreviewURL();
    
    /**
     * Gets (as xml) the "PreviewURL" element
     */
    org.apache.xmlbeans.XmlString xgetPreviewURL();
    
    /**
     * True if has "PreviewURL" element
     */
    boolean isSetPreviewURL();
    
    /**
     * Sets the "PreviewURL" element
     */
    void setPreviewURL(java.lang.String previewURL);
    
    /**
     * Sets (as xml) the "PreviewURL" element
     */
    void xsetPreviewURL(org.apache.xmlbeans.XmlString previewURL);
    
    /**
     * Unsets the "PreviewURL" element
     */
    void unsetPreviewURL();
    
    /**
     * Gets array of all "Links" elements
     */
    com.exacttarget.wsdl.partnerapi.Link[] getLinksArray();
    
    /**
     * Gets ith "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link getLinksArray(int i);
    
    /**
     * Returns number of "Links" element
     */
    int sizeOfLinksArray();
    
    /**
     * Sets array of all "Links" element
     */
    void setLinksArray(com.exacttarget.wsdl.partnerapi.Link[] linksArray);
    
    /**
     * Sets ith "Links" element
     */
    void setLinksArray(int i, com.exacttarget.wsdl.partnerapi.Link links);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link insertNewLinks(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Links" element
     */
    com.exacttarget.wsdl.partnerapi.Link addNewLinks();
    
    /**
     * Removes the ith "Links" element
     */
    void removeLinks(int i);
    
    /**
     * Gets array of all "Events" elements
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent[] getEventsArray();
    
    /**
     * Gets ith "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent getEventsArray(int i);
    
    /**
     * Returns number of "Events" element
     */
    int sizeOfEventsArray();
    
    /**
     * Sets array of all "Events" element
     */
    void setEventsArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] eventsArray);
    
    /**
     * Sets ith "Events" element
     */
    void setEventsArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent events);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Events" element
     */
    com.exacttarget.wsdl.partnerapi.TrackingEvent addNewEvents();
    
    /**
     * Removes the ith "Events" element
     */
    void removeEvents(int i);
    
    /**
     * Gets the "SentDate" element
     */
    java.util.Calendar getSentDate();
    
    /**
     * Gets (as xml) the "SentDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSentDate();
    
    /**
     * Tests for nil "SentDate" element
     */
    boolean isNilSentDate();
    
    /**
     * True if has "SentDate" element
     */
    boolean isSetSentDate();
    
    /**
     * Sets the "SentDate" element
     */
    void setSentDate(java.util.Calendar sentDate);
    
    /**
     * Sets (as xml) the "SentDate" element
     */
    void xsetSentDate(org.apache.xmlbeans.XmlDateTime sentDate);
    
    /**
     * Nils the "SentDate" element
     */
    void setNilSentDate();
    
    /**
     * Unsets the "SentDate" element
     */
    void unsetSentDate();
    
    /**
     * Gets the "EmailName" element
     */
    java.lang.String getEmailName();
    
    /**
     * Gets (as xml) the "EmailName" element
     */
    org.apache.xmlbeans.XmlString xgetEmailName();
    
    /**
     * True if has "EmailName" element
     */
    boolean isSetEmailName();
    
    /**
     * Sets the "EmailName" element
     */
    void setEmailName(java.lang.String emailName);
    
    /**
     * Sets (as xml) the "EmailName" element
     */
    void xsetEmailName(org.apache.xmlbeans.XmlString emailName);
    
    /**
     * Unsets the "EmailName" element
     */
    void unsetEmailName();
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "IsMultipart" element
     */
    boolean getIsMultipart();
    
    /**
     * Gets (as xml) the "IsMultipart" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMultipart();
    
    /**
     * True if has "IsMultipart" element
     */
    boolean isSetIsMultipart();
    
    /**
     * Sets the "IsMultipart" element
     */
    void setIsMultipart(boolean isMultipart);
    
    /**
     * Sets (as xml) the "IsMultipart" element
     */
    void xsetIsMultipart(org.apache.xmlbeans.XmlBoolean isMultipart);
    
    /**
     * Unsets the "IsMultipart" element
     */
    void unsetIsMultipart();
    
    /**
     * Gets the "SendLimit" element
     */
    int getSendLimit();
    
    /**
     * Gets (as xml) the "SendLimit" element
     */
    org.apache.xmlbeans.XmlInt xgetSendLimit();
    
    /**
     * True if has "SendLimit" element
     */
    boolean isSetSendLimit();
    
    /**
     * Sets the "SendLimit" element
     */
    void setSendLimit(int sendLimit);
    
    /**
     * Sets (as xml) the "SendLimit" element
     */
    void xsetSendLimit(org.apache.xmlbeans.XmlInt sendLimit);
    
    /**
     * Unsets the "SendLimit" element
     */
    void unsetSendLimit();
    
    /**
     * Gets the "SendWindowOpen" element
     */
    java.util.Calendar getSendWindowOpen();
    
    /**
     * Gets (as xml) the "SendWindowOpen" element
     */
    org.apache.xmlbeans.XmlTime xgetSendWindowOpen();
    
    /**
     * True if has "SendWindowOpen" element
     */
    boolean isSetSendWindowOpen();
    
    /**
     * Sets the "SendWindowOpen" element
     */
    void setSendWindowOpen(java.util.Calendar sendWindowOpen);
    
    /**
     * Sets (as xml) the "SendWindowOpen" element
     */
    void xsetSendWindowOpen(org.apache.xmlbeans.XmlTime sendWindowOpen);
    
    /**
     * Unsets the "SendWindowOpen" element
     */
    void unsetSendWindowOpen();
    
    /**
     * Gets the "SendWindowClose" element
     */
    java.util.Calendar getSendWindowClose();
    
    /**
     * Gets (as xml) the "SendWindowClose" element
     */
    org.apache.xmlbeans.XmlTime xgetSendWindowClose();
    
    /**
     * True if has "SendWindowClose" element
     */
    boolean isSetSendWindowClose();
    
    /**
     * Sets the "SendWindowClose" element
     */
    void setSendWindowClose(java.util.Calendar sendWindowClose);
    
    /**
     * Sets (as xml) the "SendWindowClose" element
     */
    void xsetSendWindowClose(org.apache.xmlbeans.XmlTime sendWindowClose);
    
    /**
     * Unsets the "SendWindowClose" element
     */
    void unsetSendWindowClose();
    
    /**
     * Gets the "IsAlwaysOn" element
     */
    boolean getIsAlwaysOn();
    
    /**
     * Gets (as xml) the "IsAlwaysOn" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAlwaysOn();
    
    /**
     * True if has "IsAlwaysOn" element
     */
    boolean isSetIsAlwaysOn();
    
    /**
     * Sets the "IsAlwaysOn" element
     */
    void setIsAlwaysOn(boolean isAlwaysOn);
    
    /**
     * Sets (as xml) the "IsAlwaysOn" element
     */
    void xsetIsAlwaysOn(org.apache.xmlbeans.XmlBoolean isAlwaysOn);
    
    /**
     * Unsets the "IsAlwaysOn" element
     */
    void unsetIsAlwaysOn();
    
    /**
     * Gets the "Sources" element
     */
    com.exacttarget.wsdl.partnerapi.Send.Sources getSources();
    
    /**
     * True if has "Sources" element
     */
    boolean isSetSources();
    
    /**
     * Sets the "Sources" element
     */
    void setSources(com.exacttarget.wsdl.partnerapi.Send.Sources sources);
    
    /**
     * Appends and returns a new empty "Sources" element
     */
    com.exacttarget.wsdl.partnerapi.Send.Sources addNewSources();
    
    /**
     * Unsets the "Sources" element
     */
    void unsetSources();
    
    /**
     * Gets the "NumberTargeted" element
     */
    int getNumberTargeted();
    
    /**
     * Gets (as xml) the "NumberTargeted" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberTargeted();
    
    /**
     * True if has "NumberTargeted" element
     */
    boolean isSetNumberTargeted();
    
    /**
     * Sets the "NumberTargeted" element
     */
    void setNumberTargeted(int numberTargeted);
    
    /**
     * Sets (as xml) the "NumberTargeted" element
     */
    void xsetNumberTargeted(org.apache.xmlbeans.XmlInt numberTargeted);
    
    /**
     * Unsets the "NumberTargeted" element
     */
    void unsetNumberTargeted();
    
    /**
     * Gets the "NumberErrored" element
     */
    int getNumberErrored();
    
    /**
     * Gets (as xml) the "NumberErrored" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberErrored();
    
    /**
     * True if has "NumberErrored" element
     */
    boolean isSetNumberErrored();
    
    /**
     * Sets the "NumberErrored" element
     */
    void setNumberErrored(int numberErrored);
    
    /**
     * Sets (as xml) the "NumberErrored" element
     */
    void xsetNumberErrored(org.apache.xmlbeans.XmlInt numberErrored);
    
    /**
     * Unsets the "NumberErrored" element
     */
    void unsetNumberErrored();
    
    /**
     * Gets the "NumberExcluded" element
     */
    int getNumberExcluded();
    
    /**
     * Gets (as xml) the "NumberExcluded" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberExcluded();
    
    /**
     * True if has "NumberExcluded" element
     */
    boolean isSetNumberExcluded();
    
    /**
     * Sets the "NumberExcluded" element
     */
    void setNumberExcluded(int numberExcluded);
    
    /**
     * Sets (as xml) the "NumberExcluded" element
     */
    void xsetNumberExcluded(org.apache.xmlbeans.XmlInt numberExcluded);
    
    /**
     * Unsets the "NumberExcluded" element
     */
    void unsetNumberExcluded();
    
    /**
     * Gets the "Additional" element
     */
    java.lang.String getAdditional();
    
    /**
     * Gets (as xml) the "Additional" element
     */
    org.apache.xmlbeans.XmlString xgetAdditional();
    
    /**
     * True if has "Additional" element
     */
    boolean isSetAdditional();
    
    /**
     * Sets the "Additional" element
     */
    void setAdditional(java.lang.String additional);
    
    /**
     * Sets (as xml) the "Additional" element
     */
    void xsetAdditional(org.apache.xmlbeans.XmlString additional);
    
    /**
     * Unsets the "Additional" element
     */
    void unsetAdditional();
    
    /**
     * Gets the "BccEmail" element
     */
    java.lang.String getBccEmail();
    
    /**
     * Gets (as xml) the "BccEmail" element
     */
    org.apache.xmlbeans.XmlString xgetBccEmail();
    
    /**
     * True if has "BccEmail" element
     */
    boolean isSetBccEmail();
    
    /**
     * Sets the "BccEmail" element
     */
    void setBccEmail(java.lang.String bccEmail);
    
    /**
     * Sets (as xml) the "BccEmail" element
     */
    void xsetBccEmail(org.apache.xmlbeans.XmlString bccEmail);
    
    /**
     * Unsets the "BccEmail" element
     */
    void unsetBccEmail();
    
    /**
     * Gets the "EmailSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.EmailSendDefinition getEmailSendDefinition();
    
    /**
     * True if has "EmailSendDefinition" element
     */
    boolean isSetEmailSendDefinition();
    
    /**
     * Sets the "EmailSendDefinition" element
     */
    void setEmailSendDefinition(com.exacttarget.wsdl.partnerapi.EmailSendDefinition emailSendDefinition);
    
    /**
     * Appends and returns a new empty "EmailSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.EmailSendDefinition addNewEmailSendDefinition();
    
    /**
     * Unsets the "EmailSendDefinition" element
     */
    void unsetEmailSendDefinition();
    
    /**
     * Gets the "SuppressionLists" element
     */
    com.exacttarget.wsdl.partnerapi.Send.SuppressionLists getSuppressionLists();
    
    /**
     * True if has "SuppressionLists" element
     */
    boolean isSetSuppressionLists();
    
    /**
     * Sets the "SuppressionLists" element
     */
    void setSuppressionLists(com.exacttarget.wsdl.partnerapi.Send.SuppressionLists suppressionLists);
    
    /**
     * Appends and returns a new empty "SuppressionLists" element
     */
    com.exacttarget.wsdl.partnerapi.Send.SuppressionLists addNewSuppressionLists();
    
    /**
     * Unsets the "SuppressionLists" element
     */
    void unsetSuppressionLists();
    
    /**
     * An XML Sources(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Sources extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sources.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("sourcese6d2elemtype");
        
        /**
         * Gets array of all "Source" elements
         */
        com.exacttarget.wsdl.partnerapi.APIObject[] getSourceArray();
        
        /**
         * Gets ith "Source" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject getSourceArray(int i);
        
        /**
         * Returns number of "Source" element
         */
        int sizeOfSourceArray();
        
        /**
         * Sets array of all "Source" element
         */
        void setSourceArray(com.exacttarget.wsdl.partnerapi.APIObject[] sourceArray);
        
        /**
         * Sets ith "Source" element
         */
        void setSourceArray(int i, com.exacttarget.wsdl.partnerapi.APIObject source);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Source" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject insertNewSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Source" element
         */
        com.exacttarget.wsdl.partnerapi.APIObject addNewSource();
        
        /**
         * Removes the ith "Source" element
         */
        void removeSource(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.Send.Sources newInstance() {
              return (com.exacttarget.wsdl.partnerapi.Send.Sources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.Send.Sources newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.Send.Sources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SuppressionLists(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface SuppressionLists extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SuppressionLists.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("suppressionlists082celemtype");
        
        /**
         * Gets array of all "SuppressionList" elements
         */
        com.exacttarget.wsdl.partnerapi.AudienceItem[] getSuppressionListArray();
        
        /**
         * Gets ith "SuppressionList" element
         */
        com.exacttarget.wsdl.partnerapi.AudienceItem getSuppressionListArray(int i);
        
        /**
         * Returns number of "SuppressionList" element
         */
        int sizeOfSuppressionListArray();
        
        /**
         * Sets array of all "SuppressionList" element
         */
        void setSuppressionListArray(com.exacttarget.wsdl.partnerapi.AudienceItem[] suppressionListArray);
        
        /**
         * Sets ith "SuppressionList" element
         */
        void setSuppressionListArray(int i, com.exacttarget.wsdl.partnerapi.AudienceItem suppressionList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SuppressionList" element
         */
        com.exacttarget.wsdl.partnerapi.AudienceItem insertNewSuppressionList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SuppressionList" element
         */
        com.exacttarget.wsdl.partnerapi.AudienceItem addNewSuppressionList();
        
        /**
         * Removes the ith "SuppressionList" element
         */
        void removeSuppressionList(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.Send.SuppressionLists newInstance() {
              return (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.Send.SuppressionLists newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.Send.SuppressionLists) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Send newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Send parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Send parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Send parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Send) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
