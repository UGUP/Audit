package org.hyperledger.fileaudit;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

@DataType()
public final class File {
  @Property()
    private String identifier;
  @Property()
    private String fileSizeInBytes;
  @Property()
    private String nfsUserId;
  @Property()
    private String nfsGroupId;
  @Property()
    private String filePermission;
  @Property()
    private String mTime;
  @Property()
    private String aTime;
  @Property()
    private String FileFormat;
  @Property()
    private String creationTime;
  @Property()
    private String auditedOn;
  @Property()
    private String fileResearchHash;
  @Property()
    private String currentParty;



    public String getIdentifier() {
        return identifier;
    }


    //Getters generated for all the attributes
    public String getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public String getNfsUserId() {
        return nfsUserId;
    }

    public String getNfsGroupId() {
        return nfsGroupId;
    }

    public String getFilePermission() {
        return filePermission;
    }

    public String getmTime() {
        return mTime;
    }

    public String getaTime() {
        return aTime;
    }

    public String getFileFormat() {
        return FileFormat;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public String getAuditedOn() {
        return auditedOn;
    }

    public String getFileResearchHash() {
        return fileResearchHash;
    }

    public String getCurrentParty() {
        return currentParty;
    }

    //Constructor created for assert which in our case is the file
    public File(String identifier, String fileSizeInBytes, String nfsUserId, String nfsGroupId, String filePermission,
                String mTime, String aTime, String fileFormat, String creationTime, String auditedOn, String fileResearchHash,
                String currentParty) {
        this.identifier = identifier;
        this.fileSizeInBytes = fileSizeInBytes;
        this.nfsUserId = nfsUserId;
        this.nfsGroupId = nfsGroupId;
        this.filePermission = filePermission;
        this.mTime = mTime;
        this.aTime = aTime;
        this.FileFormat = fileFormat;
        this.creationTime = creationTime;
        this.auditedOn = auditedOn;
        this.fileResearchHash = fileResearchHash;
        this.currentParty = currentParty;
    }







}
