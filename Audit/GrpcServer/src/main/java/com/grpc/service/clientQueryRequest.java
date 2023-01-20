//package com.grpc.service;
//
//
//
//import com.grpc.resources.FileDetailsQueryGrpc;
//import com.grpc.resources.FileDetailsResponse;
//import com.grpc.resources.FileId;
//import com.datdyn.client.ConnectionProfile;
//import com.datdyn.client.ClientApp;
//import io.grpc.stub.StreamObserver;
//import org.hyperledger.fabric.gateway.Contract;
//
//
//public class clientQueryRequest extends FileDetailsQueryGrpc.FileDetailsQueryImplBase {
//
//    @Override
//
//    public void queryDetails(FileId request, StreamObserver<FileDetailsResponse> responseObserver) {
//        FileDetailsResponse.Builder response = FileDetailsResponse.newBuilder();
//        try {
//            ClientApp clientapp = new ClientApp();
//            Contract contractInstance = null;
//            contractInstance = ConnectionProfile.getContractInstance();
//            String result = clientapp.QueryFileDetails(contractInstance, request.getIdentifier());
//          System.out.println(" the results are ########################## "+result);
////            System.out.println("the getmessage"+response.setMessage(result).getMessage());
//            response.setMessage(result);
//
//            responseObserver.onNext(response.build());
//            responseObserver.onCompleted();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}

package com.grpc.service;


import com.grpc.resources.FileDetailsQueryGrpc;
import com.datdyn.client.ClientApp;
import com.datdyn.client.ConnectionProfile;
import com.grpc.resources.FileDetailsResponse;
import com.grpc.resources.FileId;
import io.grpc.stub.StreamObserver;
import org.hyperledger.fabric.gateway.Contract;

public class clientQueryRequest extends FileDetailsQueryGrpc.FileDetailsQueryImplBase {

    @Override
    public void queryDetails(FileId request, StreamObserver<FileDetailsResponse> responseObserver ){

        FileDetailsResponse.Builder response = FileDetailsResponse.newBuilder();
        System.out.println(" the request passed by me is ....................................."+request);
        try {
            ClientApp clientapp = new ClientApp();
            Contract contractInstance = null;
            contractInstance = ConnectionProfile.getContractInstance();
            String result = clientapp.queryFileDetails(contractInstance, request.getFileResearchHash());
            System.out.println(" the result is"+result);
            response.setMessage(result);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}