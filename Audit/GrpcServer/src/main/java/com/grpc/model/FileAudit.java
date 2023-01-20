
package com.grpc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileAudit {
    private @Getter @Setter String identifier;
    private @Getter @Setter String fileSizeInBytes;
    private @Getter @Setter String nfsUserId;
    private @Getter @Setter String nfsGroupId;
    private @Getter @Setter String filePermission;
    private @Getter @Setter String mTime;
    private @Getter @Setter String aTime;
    private @Getter @Setter String FileFormat;
    private @Getter @Setter String creationTime;
    private @Getter @Setter String auditedOn;
    private @Getter @Setter String fileResearchHash;
    private @Getter @Setter String currentParty;
}
