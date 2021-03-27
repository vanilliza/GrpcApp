package com.example.utils.generated.heater;

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
    comments = "Source: HeatingDevice.proto")
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterStatusRequest,
      com.example.utils.generated.heater.HeaterStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = com.example.utils.generated.heater.HeaterStatusRequest.class,
      responseType = com.example.utils.generated.heater.HeaterStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterStatusRequest,
      com.example.utils.generated.heater.HeaterStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterStatusRequest, com.example.utils.generated.heater.HeaterStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
          HeaterServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.HeaterStatusRequest, com.example.utils.generated.heater.HeaterStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetTempatureHighMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTempatureHigh",
      requestType = com.example.utils.generated.heater.HeaterUpdateRequest.class,
      responseType = com.example.utils.generated.heater.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetTempatureHighMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse> getSetTempatureHighMethod;
    if ((getSetTempatureHighMethod = HeaterServiceGrpc.getSetTempatureHighMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempatureHighMethod = HeaterServiceGrpc.getSetTempatureHighMethod) == null) {
          HeaterServiceGrpc.getSetTempatureHighMethod = getSetTempatureHighMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "setTempatureHigh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setTempatureHigh"))
                  .build();
          }
        }
     }
     return getSetTempatureHighMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetTempaturelowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTempaturelow",
      requestType = com.example.utils.generated.heater.HeaterUpdateRequest.class,
      responseType = com.example.utils.generated.heater.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetTempaturelowMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse> getSetTempaturelowMethod;
    if ((getSetTempaturelowMethod = HeaterServiceGrpc.getSetTempaturelowMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempaturelowMethod = HeaterServiceGrpc.getSetTempaturelowMethod) == null) {
          HeaterServiceGrpc.getSetTempaturelowMethod = getSetTempaturelowMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "setTempaturelow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setTempaturelow"))
                  .build();
          }
        }
     }
     return getSetTempaturelowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.exact_temp,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetExactTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setExactTemp",
      requestType = com.example.utils.generated.heater.exact_temp.class,
      responseType = com.example.utils.generated.heater.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.exact_temp,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetExactTempMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.exact_temp, com.example.utils.generated.heater.HeaterDetailResponse> getSetExactTempMethod;
    if ((getSetExactTempMethod = HeaterServiceGrpc.getSetExactTempMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetExactTempMethod = HeaterServiceGrpc.getSetExactTempMethod) == null) {
          HeaterServiceGrpc.getSetExactTempMethod = getSetExactTempMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.exact_temp, com.example.utils.generated.heater.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "setExactTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.exact_temp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setExactTemp"))
                  .build();
          }
        }
     }
     return getSetExactTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOff",
      requestType = com.example.utils.generated.heater.HeaterUpdateRequest.class,
      responseType = com.example.utils.generated.heater.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetOffMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse> getSetOffMethod;
    if ((getSetOffMethod = HeaterServiceGrpc.getSetOffMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetOffMethod = HeaterServiceGrpc.getSetOffMethod) == null) {
          HeaterServiceGrpc.getSetOffMethod = getSetOffMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "setOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setOff"))
                  .build();
          }
        }
     }
     return getSetOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOn",
      requestType = com.example.utils.generated.heater.HeaterUpdateRequest.class,
      responseType = com.example.utils.generated.heater.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest,
      com.example.utils.generated.heater.HeaterDetailResponse> getSetOnMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse> getSetOnMethod;
    if ((getSetOnMethod = HeaterServiceGrpc.getSetOnMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetOnMethod = HeaterServiceGrpc.getSetOnMethod) == null) {
          HeaterServiceGrpc.getSetOnMethod = getSetOnMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.heater.HeaterUpdateRequest, com.example.utils.generated.heater.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.HeaterService", "setOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.heater.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setOn"))
                  .build();
          }
        }
     }
     return getSetOnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeaterServiceStub newStub(io.grpc.Channel channel) {
    return new HeaterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeaterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeaterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeaterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeaterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeaterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.example.utils.generated.heater.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setTempatureHigh(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempatureHighMethod(), responseObserver);
    }

    /**
     */
    public void setTempaturelow(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempaturelowMethod(), responseObserver);
    }

    /**
     */
    public void setExactTemp(com.example.utils.generated.heater.exact_temp request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetExactTempMethod(), responseObserver);
    }

    /**
     */
    public void setOff(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOffMethod(), responseObserver);
    }

    /**
     */
    public void setOn(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOnMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.HeaterStatusRequest,
                com.example.utils.generated.heater.HeaterStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetTempatureHighMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.HeaterUpdateRequest,
                com.example.utils.generated.heater.HeaterDetailResponse>(
                  this, METHODID_SET_TEMPATURE_HIGH)))
          .addMethod(
            getSetTempaturelowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.HeaterUpdateRequest,
                com.example.utils.generated.heater.HeaterDetailResponse>(
                  this, METHODID_SET_TEMPATURELOW)))
          .addMethod(
            getSetExactTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.exact_temp,
                com.example.utils.generated.heater.HeaterDetailResponse>(
                  this, METHODID_SET_EXACT_TEMP)))
          .addMethod(
            getSetOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.HeaterUpdateRequest,
                com.example.utils.generated.heater.HeaterDetailResponse>(
                  this, METHODID_SET_OFF)))
          .addMethod(
            getSetOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.heater.HeaterUpdateRequest,
                com.example.utils.generated.heater.HeaterDetailResponse>(
                  this, METHODID_SET_ON)))
          .build();
    }
  }

  /**
   */
  public static final class HeaterServiceStub extends io.grpc.stub.AbstractStub<HeaterServiceStub> {
    private HeaterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.example.utils.generated.heater.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempatureHigh(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempatureHighMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempaturelow(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempaturelowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setExactTemp(com.example.utils.generated.heater.exact_temp request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetExactTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOff(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOn(com.example.utils.generated.heater.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeaterServiceBlockingStub extends io.grpc.stub.AbstractStub<HeaterServiceBlockingStub> {
    private HeaterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterStatusResponse showStatus(com.example.utils.generated.heater.HeaterStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterDetailResponse setTempatureHigh(com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempatureHighMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterDetailResponse setTempaturelow(com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempaturelowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterDetailResponse setExactTemp(com.example.utils.generated.heater.exact_temp request) {
      return blockingUnaryCall(
          getChannel(), getSetExactTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterDetailResponse setOff(com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.heater.HeaterDetailResponse setOn(com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOnMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeaterServiceFutureStub extends io.grpc.stub.AbstractStub<HeaterServiceFutureStub> {
    private HeaterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterStatusResponse> showStatus(
        com.example.utils.generated.heater.HeaterStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterDetailResponse> setTempatureHigh(
        com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempatureHighMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterDetailResponse> setTempaturelow(
        com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempaturelowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterDetailResponse> setExactTemp(
        com.example.utils.generated.heater.exact_temp request) {
      return futureUnaryCall(
          getChannel().newCall(getSetExactTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterDetailResponse> setOff(
        com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.heater.HeaterDetailResponse> setOn(
        com.example.utils.generated.heater.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_TEMPATURE_HIGH = 1;
  private static final int METHODID_SET_TEMPATURELOW = 2;
  private static final int METHODID_SET_EXACT_TEMP = 3;
  private static final int METHODID_SET_OFF = 4;
  private static final int METHODID_SET_ON = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeaterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeaterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.example.utils.generated.heater.HeaterStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterStatusResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPATURE_HIGH:
          serviceImpl.setTempatureHigh((com.example.utils.generated.heater.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPATURELOW:
          serviceImpl.setTempaturelow((com.example.utils.generated.heater.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_EXACT_TEMP:
          serviceImpl.setExactTemp((com.example.utils.generated.heater.exact_temp) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_OFF:
          serviceImpl.setOff((com.example.utils.generated.heater.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_ON:
          serviceImpl.setOn((com.example.utils.generated.heater.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.heater.HeaterDetailResponse>) responseObserver);
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

  private static abstract class HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.utils.generated.heater.HeatingDevice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeaterService");
    }
  }

  private static final class HeaterServiceFileDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier {
    HeaterServiceFileDescriptorSupplier() {}
  }

  private static final class HeaterServiceMethodDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeaterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeaterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeaterServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetTempatureHighMethod())
              .addMethod(getSetTempaturelowMethod())
              .addMethod(getSetExactTempMethod())
              .addMethod(getSetOffMethod())
              .addMethod(getSetOnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
