package com.example.utils.generated.tv;

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
    comments = "Source: TvDevice.proto")
public final class TVServiceGrpc {

  private TVServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.TVService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.tv.TVStatusRequest,
      com.example.utils.generated.tv.TVStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = com.example.utils.generated.tv.TVStatusRequest.class,
      responseType = com.example.utils.generated.tv.TVStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.tv.TVStatusRequest,
      com.example.utils.generated.tv.TVStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.tv.TVStatusRequest, com.example.utils.generated.tv.TVStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = TVServiceGrpc.getShowStatusMethod) == null) {
      synchronized (TVServiceGrpc.class) {
        if ((getShowStatusMethod = TVServiceGrpc.getShowStatusMethod) == null) {
          TVServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.tv.TVStatusRequest, com.example.utils.generated.tv.TVStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.TVService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.TVStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.TVStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TVServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.tv.exact_update,
      com.example.utils.generated.tv.TVDetailResponse> getSetExactVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setExactVolume",
      requestType = com.example.utils.generated.tv.exact_update.class,
      responseType = com.example.utils.generated.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.tv.exact_update,
      com.example.utils.generated.tv.TVDetailResponse> getSetExactVolumeMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.tv.exact_update, com.example.utils.generated.tv.TVDetailResponse> getSetExactVolumeMethod;
    if ((getSetExactVolumeMethod = TVServiceGrpc.getSetExactVolumeMethod) == null) {
      synchronized (TVServiceGrpc.class) {
        if ((getSetExactVolumeMethod = TVServiceGrpc.getSetExactVolumeMethod) == null) {
          TVServiceGrpc.getSetExactVolumeMethod = getSetExactVolumeMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.tv.exact_update, com.example.utils.generated.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.TVService", "setExactVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.exact_update.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TVServiceMethodDescriptorSupplier("setExactVolume"))
                  .build();
          }
        }
     }
     return getSetExactVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request,
      com.example.utils.generated.tv.TVDetailResponse> getTVOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tVOn",
      requestType = com.example.utils.generated.tv.update_request.class,
      responseType = com.example.utils.generated.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request,
      com.example.utils.generated.tv.TVDetailResponse> getTVOnMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request, com.example.utils.generated.tv.TVDetailResponse> getTVOnMethod;
    if ((getTVOnMethod = TVServiceGrpc.getTVOnMethod) == null) {
      synchronized (TVServiceGrpc.class) {
        if ((getTVOnMethod = TVServiceGrpc.getTVOnMethod) == null) {
          TVServiceGrpc.getTVOnMethod = getTVOnMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.tv.update_request, com.example.utils.generated.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.TVService", "tVOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.update_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TVServiceMethodDescriptorSupplier("tVOn"))
                  .build();
          }
        }
     }
     return getTVOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request,
      com.example.utils.generated.tv.TVDetailResponse> getTVOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tVOff",
      requestType = com.example.utils.generated.tv.update_request.class,
      responseType = com.example.utils.generated.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request,
      com.example.utils.generated.tv.TVDetailResponse> getTVOffMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.tv.update_request, com.example.utils.generated.tv.TVDetailResponse> getTVOffMethod;
    if ((getTVOffMethod = TVServiceGrpc.getTVOffMethod) == null) {
      synchronized (TVServiceGrpc.class) {
        if ((getTVOffMethod = TVServiceGrpc.getTVOffMethod) == null) {
          TVServiceGrpc.getTVOffMethod = getTVOffMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.tv.update_request, com.example.utils.generated.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.TVService", "tVOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.update_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TVServiceMethodDescriptorSupplier("tVOff"))
                  .build();
          }
        }
     }
     return getTVOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TVServiceStub newStub(io.grpc.Channel channel) {
    return new TVServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TVServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TVServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TVServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TVServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TVServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.example.utils.generated.tv.TVStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setExactVolume(com.example.utils.generated.tv.exact_update request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetExactVolumeMethod(), responseObserver);
    }

    /**
     */
    public void tVOn(com.example.utils.generated.tv.update_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTVOnMethod(), responseObserver);
    }

    /**
     */
    public void tVOff(com.example.utils.generated.tv.update_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTVOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.tv.TVStatusRequest,
                com.example.utils.generated.tv.TVStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetExactVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.tv.exact_update,
                com.example.utils.generated.tv.TVDetailResponse>(
                  this, METHODID_SET_EXACT_VOLUME)))
          .addMethod(
            getTVOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.tv.update_request,
                com.example.utils.generated.tv.TVDetailResponse>(
                  this, METHODID_T_VON)))
          .addMethod(
            getTVOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.tv.update_request,
                com.example.utils.generated.tv.TVDetailResponse>(
                  this, METHODID_T_VOFF)))
          .build();
    }
  }

  /**
   */
  public static final class TVServiceStub extends io.grpc.stub.AbstractStub<TVServiceStub> {
    private TVServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TVServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TVServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TVServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.example.utils.generated.tv.TVStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setExactVolume(com.example.utils.generated.tv.exact_update request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetExactVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tVOn(com.example.utils.generated.tv.update_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTVOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tVOff(com.example.utils.generated.tv.update_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTVOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TVServiceBlockingStub extends io.grpc.stub.AbstractStub<TVServiceBlockingStub> {
    private TVServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TVServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TVServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TVServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.utils.generated.tv.TVStatusResponse showStatus(com.example.utils.generated.tv.TVStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.tv.TVDetailResponse setExactVolume(com.example.utils.generated.tv.exact_update request) {
      return blockingUnaryCall(
          getChannel(), getSetExactVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.tv.TVDetailResponse tVOn(com.example.utils.generated.tv.update_request request) {
      return blockingUnaryCall(
          getChannel(), getTVOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.tv.TVDetailResponse tVOff(com.example.utils.generated.tv.update_request request) {
      return blockingUnaryCall(
          getChannel(), getTVOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TVServiceFutureStub extends io.grpc.stub.AbstractStub<TVServiceFutureStub> {
    private TVServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TVServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TVServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TVServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.tv.TVStatusResponse> showStatus(
        com.example.utils.generated.tv.TVStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.tv.TVDetailResponse> setExactVolume(
        com.example.utils.generated.tv.exact_update request) {
      return futureUnaryCall(
          getChannel().newCall(getSetExactVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.tv.TVDetailResponse> tVOn(
        com.example.utils.generated.tv.update_request request) {
      return futureUnaryCall(
          getChannel().newCall(getTVOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.tv.TVDetailResponse> tVOff(
        com.example.utils.generated.tv.update_request request) {
      return futureUnaryCall(
          getChannel().newCall(getTVOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_EXACT_VOLUME = 1;
  private static final int METHODID_T_VON = 2;
  private static final int METHODID_T_VOFF = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TVServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TVServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.example.utils.generated.tv.TVStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVStatusResponse>) responseObserver);
          break;
        case METHODID_SET_EXACT_VOLUME:
          serviceImpl.setExactVolume((com.example.utils.generated.tv.exact_update) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse>) responseObserver);
          break;
        case METHODID_T_VON:
          serviceImpl.tVOn((com.example.utils.generated.tv.update_request) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse>) responseObserver);
          break;
        case METHODID_T_VOFF:
          serviceImpl.tVOff((com.example.utils.generated.tv.update_request) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.tv.TVDetailResponse>) responseObserver);
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

  private static abstract class TVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TVServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.utils.generated.tv.TvDevice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TVService");
    }
  }

  private static final class TVServiceFileDescriptorSupplier
      extends TVServiceBaseDescriptorSupplier {
    TVServiceFileDescriptorSupplier() {}
  }

  private static final class TVServiceMethodDescriptorSupplier
      extends TVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TVServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TVServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TVServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetExactVolumeMethod())
              .addMethod(getTVOnMethod())
              .addMethod(getTVOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
