package com.grpc.server;



import com.grpc.service.clientInsertRequest;
import com.grpc.service.clientQueryFileHistory;
import com.grpc.service.clientQueryRequest;
import com.grpc.service.clientUpdateRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


public class GrpcServer {

    public static void main(String args []) throws IOException, InterruptedException {
        Server server=ServerBuilder.forPort(9091).addService(new clientInsertRequest())
               .addService( new clientQueryRequest())
                .addService(new clientUpdateRequest())
                .addService( new clientQueryFileHistory()).build();
           server.start();
           System.out.println("The server is up and running on port..."+server.getPort());
           server.awaitTermination();
    }


}
