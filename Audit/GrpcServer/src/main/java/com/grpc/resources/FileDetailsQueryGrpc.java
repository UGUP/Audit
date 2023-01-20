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
public final class FileDetailsQueryGrpc {

  private FileDetailsQueryGrpc() {}

  public static final String SERVICE_NAME = "FileDetailsQuery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.resources.FileId,
      com.grpc.resources.FileDetailsResponse> getQueryDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryDetails",
      requestType = com.grpc.resources.FileId.class,
      responseType = com.grpc.resources.FileDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.resources.FileId,
      com.grpc.resources.FileDetailsResponse> getQueryDetailsMethod() {
    io.grpc.MethodDescriptor<com.grpc.resources.FileId, com.grpc.resources.FileDetailsResponse> getQueryDetailsMethod;
    if ((getQueryDetailsMethod = FileDetailsQueryGrpc.getQueryDetailsMethod) == null) {
      synchronized (FileDetailsQueryGrpc.class) {
        if ((getQueryDetailsMethod = FileDetailsQueryGrpc.getQueryDetailsMethod) == null) {
          FileDetailsQueryGrpc.getQueryDetailsMethod = getQueryDetailsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.resources.FileId, com.grpc.resources.FileDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FileDetailsQuery", "queryDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileDetailsQueryMethodDescriptorSupplier("queryDetails"))
                  .build();
          }
        }
     }
     return getQueryDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileDetailsQueryStub newStub(io.grpc.Channel channel) {
    return new FileDetailsQueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileDetailsQueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileDetailsQueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileDetailsQueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileDetailsQueryFutureStub(channel);
  }

  /**
   */
  public static abstract class FileDetailsQueryImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryDetails(com.grpc.resources.FileId request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.resources.FileId,
                com.grpc.resources.FileDetailsResponse>(
                  this, METHODID_QUERY_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class FileDetailsQueryStub extends io.grpc.stub.AbstractStub<FileDetailsQueryStub> {
    private FileDetailsQueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsQueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsQueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsQueryStub(channel, callOptions);
    }

    /**
     */
    public void queryDetails(com.grpc.resources.FileId request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileDetailsQueryBlockingStub extends io.grpc.stub.AbstractStub<FileDetailsQueryBlockingStub> {
    private FileDetailsQueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsQueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsQueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsQueryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.resources.FileDetailsResponse queryDetails(com.grpc.resources.FileId request) {
      return blockingUnaryCall(
          getChannel(), getQueryDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileDetailsQueryFutureStub extends io.grpc.stub.AbstractStub<FileDetailsQueryFutureStub> {
    private FileDetailsQueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileDetailsQueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDetailsQueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileDetailsQueryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.resources.FileDetailsResponse> queryDetails(
        com.grpc.resources.FileId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_DETAILS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileDetailsQueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileDetailsQueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_DETAILS:
          serviceImpl.queryDetails((com.grpc.resources.FileId) request,
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

  private static abstract class FileDetailsQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileDetailsQueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.resources.Fileaudit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileDetailsQuery");
    }
  }

  private static final class FileDetailsQueryFileDescriptorSupplier
      extends FileDetailsQueryBaseDescriptorSupplier {
    FileDetailsQueryFileDescriptorSupplier() {}
  }

  private static final class FileDetailsQueryMethodDescriptorSupplier
      extends FileDetailsQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileDetailsQueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileDetailsQueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileDetailsQueryFileDescriptorSupplier())
              .addMethod(getQueryDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
