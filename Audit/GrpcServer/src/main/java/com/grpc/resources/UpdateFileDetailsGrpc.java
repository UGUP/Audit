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
public final class UpdateFileDetailsGrpc {

  private UpdateFileDetailsGrpc() {}

  public static final String SERVICE_NAME = "UpdateFileDetails";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest,
      com.grpc.resources.FileDetailsResponse> getUpdateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFile",
      requestType = com.grpc.resources.FileDetailsRequest.class,
      responseType = com.grpc.resources.FileDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest,
      com.grpc.resources.FileDetailsResponse> getUpdateFileMethod() {
    io.grpc.MethodDescriptor<com.grpc.resources.FileDetailsRequest, com.grpc.resources.FileDetailsResponse> getUpdateFileMethod;
    if ((getUpdateFileMethod = UpdateFileDetailsGrpc.getUpdateFileMethod) == null) {
      synchronized (UpdateFileDetailsGrpc.class) {
        if ((getUpdateFileMethod = UpdateFileDetailsGrpc.getUpdateFileMethod) == null) {
          UpdateFileDetailsGrpc.getUpdateFileMethod = getUpdateFileMethod = 
              io.grpc.MethodDescriptor.<com.grpc.resources.FileDetailsRequest, com.grpc.resources.FileDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateFileDetails", "updateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateFileDetailsMethodDescriptorSupplier("updateFile"))
                  .build();
          }
        }
     }
     return getUpdateFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateFileDetailsStub newStub(io.grpc.Channel channel) {
    return new UpdateFileDetailsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateFileDetailsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateFileDetailsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateFileDetailsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateFileDetailsFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateFileDetailsImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateFile(com.grpc.resources.FileDetailsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.resources.FileDetailsRequest,
                com.grpc.resources.FileDetailsResponse>(
                  this, METHODID_UPDATE_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateFileDetailsStub extends io.grpc.stub.AbstractStub<UpdateFileDetailsStub> {
    private UpdateFileDetailsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateFileDetailsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateFileDetailsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateFileDetailsStub(channel, callOptions);
    }

    /**
     */
    public void updateFile(com.grpc.resources.FileDetailsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateFileDetailsBlockingStub extends io.grpc.stub.AbstractStub<UpdateFileDetailsBlockingStub> {
    private UpdateFileDetailsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateFileDetailsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateFileDetailsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateFileDetailsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.resources.FileDetailsResponse updateFile(com.grpc.resources.FileDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateFileDetailsFutureStub extends io.grpc.stub.AbstractStub<UpdateFileDetailsFutureStub> {
    private UpdateFileDetailsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateFileDetailsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateFileDetailsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateFileDetailsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.resources.FileDetailsResponse> updateFile(
        com.grpc.resources.FileDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_FILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateFileDetailsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateFileDetailsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_FILE:
          serviceImpl.updateFile((com.grpc.resources.FileDetailsRequest) request,
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

  private static abstract class UpdateFileDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateFileDetailsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.resources.Fileaudit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateFileDetails");
    }
  }

  private static final class UpdateFileDetailsFileDescriptorSupplier
      extends UpdateFileDetailsBaseDescriptorSupplier {
    UpdateFileDetailsFileDescriptorSupplier() {}
  }

  private static final class UpdateFileDetailsMethodDescriptorSupplier
      extends UpdateFileDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateFileDetailsMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateFileDetailsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateFileDetailsFileDescriptorSupplier())
              .addMethod(getUpdateFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
