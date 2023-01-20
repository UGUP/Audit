package com.grpc.service;

import com.grpc.resources.UpdateFileDetailsGrpc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.model.FileAudit;
import com.grpc.resources.FileDetailsRequest;
import com.grpc.resources.FileDetailsResponse;
import io.grpc.stub.StreamObserver;
import com.datdyn.client.ClientApp;
import com.datdyn.client.ConnectionProfile;
import org.hyperledger.fabric.gateway.Contract;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;


public class clientUpdateRequest extends UpdateFileDetailsGrpc.UpdateFileDetailsImplBase {

    @Override
    public void updateFile(FileDetailsRequest request, StreamObserver<FileDetailsResponse> responseObserver) {
        FileDetailsResponse.Builder response = FileDetailsResponse.newBuilder();
        FileAudit fileAudit = new FileAudit(request.getIdentifier(), request.getFileSizeInBytes(), request.getNfsUserId(), request.getNfsGroupId(), request.getFilePermission()
                , request.getMTime(), request.getATIme(), request.getFileFormat(), request.getCreationTime(), request.getAuditedOn(), request.getFileResearchHash(), request.getCurrentParty());

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("./fileAudit.json"), fileAudit);
            JSONParser parser = new JSONParser();
            Object requestObject = parser.parse(new FileReader("./fileAudit.json"));
            //System.out.println(" teh json object is read correctly "+requestObject);
            JSONObject obj = (JSONObject) requestObject;
            System.out.println(" teh json object is read correctly " + obj);
            ClientApp clientapp = new ClientApp();
            Contract contractInstance = null;
            contractInstance = ConnectionProfile.getContractInstance();
            String result = clientapp.updateFileDetails(contractInstance, obj);
            response.setMessage(result);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
