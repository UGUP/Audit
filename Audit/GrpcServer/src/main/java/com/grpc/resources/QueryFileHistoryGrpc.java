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
public final class QueryFileHistoryGrpc {

  private QueryFileHistoryGrpc() {}

  public static final String SERVICE_NAME = "QueryFileHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.resources.FileId,
      com.grpc.resources.FileDetailsResponse> getQueryFileHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryFileHistory",
      requestType = com.grpc.resources.FileId.class,
      responseType = com.grpc.resources.FileDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.resources.FileId,
      com.grpc.resources.FileDetailsResponse> getQueryFileHistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.resources.FileId, com.grpc.resources.FileDetailsResponse> getQueryFileHistoryMethod;
    if ((getQueryFileHistoryMethod = QueryFileHistoryGrpc.getQueryFileHistoryMethod) == null) {
      synchronized (QueryFileHistoryGrpc.class) {
        if ((getQueryFileHistoryMethod = QueryFileHistoryGrpc.getQueryFileHistoryMethod) == null) {
          QueryFileHistoryGrpc.getQueryFileHistoryMethod = getQueryFileHistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.resources.FileId, com.grpc.resources.FileDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryFileHistory", "queryFileHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.resources.FileDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryFileHistoryMethodDescriptorSupplier("queryFileHistory"))
                  .build();
          }
        }
     }
     return getQueryFileHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryFileHistoryStub newStub(io.grpc.Channel channel) {
    return new QueryFileHistoryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryFileHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryFileHistoryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFileHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryFileHistoryFutureStub(channel);
  }

  /**
   */
  public static abstract class QueryFileHistoryImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryFileHistory(com.grpc.resources.FileId request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryFileHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryFileHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.resources.FileId,
                com.grpc.resources.FileDetailsResponse>(
                  this, METHODID_QUERY_FILE_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class QueryFileHistoryStub extends io.grpc.stub.AbstractStub<QueryFileHistoryStub> {
    private QueryFileHistoryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFileHistoryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFileHistoryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFileHistoryStub(channel, callOptions);
    }

    /**
     */
    public void queryFileHistory(com.grpc.resources.FileId request,
        io.grpc.stub.StreamObserver<com.grpc.resources.FileDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryFileHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueryFileHistoryBlockingStub extends io.grpc.stub.AbstractStub<QueryFileHistoryBlockingStub> {
    private QueryFileHistoryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFileHistoryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFileHistoryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFileHistoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.resources.FileDetailsResponse queryFileHistory(com.grpc.resources.FileId request) {
      return blockingUnaryCall(
          getChannel(), getQueryFileHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueryFileHistoryFutureStub extends io.grpc.stub.AbstractStub<QueryFileHistoryFutureStub> {
    private QueryFileHistoryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFileHistoryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFileHistoryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFileHistoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.resources.FileDetailsResponse> queryFileHistory(
        com.grpc.resources.FileId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryFileHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_FILE_HISTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryFileHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryFileHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_FILE_HISTORY:
          serviceImpl.queryFileHistory((com.grpc.resources.FileId) request,
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

  private static abstract class QueryFileHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryFileHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.resources.Fileaudit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryFileHistory");
    }
  }

  private static final class QueryFileHistoryFileDescriptorSupplier
      extends QueryFileHistoryBaseDescriptorSupplier {
    QueryFileHistoryFileDescriptorSupplier() {}
  }

  private static final class QueryFileHistoryMethodDescriptorSupplier
      extends QueryFileHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryFileHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryFileHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileHistoryFileDescriptorSupplier())
              .addMethod(getQueryFileHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
