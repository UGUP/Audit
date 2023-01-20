package com.grpc.service;


import com.datdyn.client.ClientApp;
import com.datdyn.client.ConnectionProfile;

import com.grpc.resources.FileDetailsResponse;
import com.grpc.resources.FileId;
import com.grpc.resources.QueryFileHistoryGrpc;
import io.grpc.stub.StreamObserver;
import org.hyperledger.fabric.gateway.Contract;

public class clientQueryFileHistory extends QueryFileHistoryGrpc.QueryFileHistoryImplBase{

    public void queryFileHistory(FileId request, StreamObserver<FileDetailsResponse> responseObserver ){

        FileDetailsResponse.Builder response = FileDetailsResponse.newBuilder();
        System.out.println(" the request pass is"+request);
        try {
            ClientApp clientapp = new ClientApp();
            Contract contractInstance = null;
            contractInstance = ConnectionProfile.getContractInstance();
            String result = clientapp.getFileHistory(contractInstance,request.getFileResearchHash());
            System.out.println(" the result is"+result);
            response.setMessage(result);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}