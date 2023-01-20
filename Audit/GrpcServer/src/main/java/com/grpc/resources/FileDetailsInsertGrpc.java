package com.grpc.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: fileaudit.proto")
public final class FileDetailsInsertGrpc {

  private FileDetailsInsertGrpc() {}

  public static final String SERVICE_NAME = "FileDetailsInsert";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest,
      com.grpc.resources.FileDetailsResponse> getFileDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FileDetails",
      requestType = com.grpc.resources.FileDetailsRequest.class,
      responseType = com.grpc.resources.FileDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest,
      com.grpc.resources.FileDetailsResponse> getFileDetailsMethod() {
    io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest, com.grpc.resources.FileDetailsResponse> getFileDetailsMethod;
    if ((getFileDetailsMethod = FileDetailsInsertGrpc.getFileDetailsMethod) == null) {
      synchronized (FileDetailsInsertGrpc.class) {
        if ((getFileDetailsMethod = FileDetailsInsertGrpc.getFileDetailsMethod) == null) {
          FileDetailsInsertGrpc.getFileDetailsMethod = getFileDetailsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.resources.FileDetailsRequest, com.grpc.resources.FileDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FileDetailsInsert", "FileDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileDetailsInsertMethodDescriptorSupplier("FileDetails"))
                  .build();
          }
        }
     }
     return getFileDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileDetailsInsertStub newStub(io.grpc.Channel channel) {
    return new FileDetailsInsertStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileDetailsInsertBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileDetailsInsertBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileDetailsInsertFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileDetailsInsertFutureStub(channel);
  }

  /**
   */
  public static abstract class FileDetailsInsertImplBase implements io.grpc.BindableService {

    /**
     */
    public void fileDetails(com.grpc.resources.FileDetailsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFileDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFileDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.resources.FileDetailsRequest,
                com.grpc.resources.FileDetailsResponse>(
                  this, METHODID_FILE_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class FileDetailsInsertStub extends io.grpc.stub.AbstractStub<FileDetailsInsertStub> {
    private FileDetailsInsertStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsInsertStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsInsertStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsInsertStub(channel, callOptions);
    }

    /**
     */
    public void fileDetails(com.grpc.resources.FileDetailsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFileDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileDetailsInsertBlockingStub extends io.grpc.stub.AbstractStub<FileDetailsInsertBlockingStub> {
    private FileDetailsInsertBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsInsertBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsInsertBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsInsertBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.resources.FileDetailsResponse fileDetails(com.grpc.resources.FileDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getFileDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileDetailsInsertFutureStub extends io.grpc.stub.AbstractStub<FileDetailsInsertFutureStub> {
    private FileDetailsInsertFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsInsertFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsInsertFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsInsertFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.resources.FileDetailsResponse> fileDetails(
        com.grpc.resources.FileDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFileDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILE_DETAILS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileDetailsInsertImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileDetailsInsertImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILE_DETAILS:
          serviceImpl.fileDetails((com.grpc.resources.FileDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileDetailsInsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileDetailsInsertBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.resources.Fileaudit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileDetailsInsert");
    }
  }

  private static final class FileDetailsInsertFileDescriptorSupplier
      extends FileDetailsInsertBaseDescriptorSupplier {
    FileDetailsInsertFileDescriptorSupplier() {}
  }

  private static final class FileDetailsInsertMethodDescriptorSupplier
      extends FileDetailsInsertBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileDetailsInsertMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileDetailsInsertGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileDetailsInsertFileDescriptorSupplier())
              .addMethod(getFileDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
