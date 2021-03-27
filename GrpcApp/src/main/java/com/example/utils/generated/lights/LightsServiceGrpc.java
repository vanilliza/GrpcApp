package com.example.utils.generated.lights;

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
    comments = "Source: LightsDevice.proto")
public final class LightsServiceGrpc {

  private LightsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.LightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.lights.light_status_request,
      com.example.utils.generated.lights.lightStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = com.example.utils.generated.lights.light_status_request.class,
      responseType = com.example.utils.generated.lights.lightStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.lights.light_status_request,
      com.example.utils.generated.lights.lightStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.lights.light_status_request, com.example.utils.generated.lights.lightStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = LightsServiceGrpc.getShowStatusMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getShowStatusMethod = LightsServiceGrpc.getShowStatusMethod) == null) {
          LightsServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.lights.light_status_request, com.example.utils.generated.lights.lightStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.LightsService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.light_status_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.lightStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest,
      com.example.utils.generated.lights.lightDetailResponse> getLightsOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOn",
      requestType = com.example.utils.generated.lights.lightToUpdateRequest.class,
      responseType = com.example.utils.generated.lights.lightDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest,
      com.example.utils.generated.lights.lightDetailResponse> getLightsOnMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest, com.example.utils.generated.lights.lightDetailResponse> getLightsOnMethod;
    if ((getLightsOnMethod = LightsServiceGrpc.getLightsOnMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getLightsOnMethod = LightsServiceGrpc.getLightsOnMethod) == null) {
          LightsServiceGrpc.getLightsOnMethod = getLightsOnMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.lights.lightToUpdateRequest, com.example.utils.generated.lights.lightDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.LightsService", "lightsOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.lightToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.lightDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("lightsOn"))
                  .build();
          }
        }
     }
     return getLightsOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest,
      com.example.utils.generated.lights.lightDetailResponse> getLightsOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOff",
      requestType = com.example.utils.generated.lights.lightToUpdateRequest.class,
      responseType = com.example.utils.generated.lights.lightDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest,
      com.example.utils.generated.lights.lightDetailResponse> getLightsOffMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.lights.lightToUpdateRequest, com.example.utils.generated.lights.lightDetailResponse> getLightsOffMethod;
    if ((getLightsOffMethod = LightsServiceGrpc.getLightsOffMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getLightsOffMethod = LightsServiceGrpc.getLightsOffMethod) == null) {
          LightsServiceGrpc.getLightsOffMethod = getLightsOffMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.lights.lightToUpdateRequest, com.example.utils.generated.lights.lightDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.LightsService", "lightsOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.lightToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.lights.lightDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("lightsOff"))
                  .build();
          }
        }
     }
     return getLightsOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightsServiceStub newStub(io.grpc.Channel channel) {
    return new LightsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.example.utils.generated.lights.light_status_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void lightsOn(com.example.utils.generated.lights.lightToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOnMethod(), responseObserver);
    }

    /**
     */
    public void lightsOff(com.example.utils.generated.lights.lightToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.lights.light_status_request,
                com.example.utils.generated.lights.lightStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getLightsOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.lights.lightToUpdateRequest,
                com.example.utils.generated.lights.lightDetailResponse>(
                  this, METHODID_LIGHTS_ON)))
          .addMethod(
            getLightsOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.lights.lightToUpdateRequest,
                com.example.utils.generated.lights.lightDetailResponse>(
                  this, METHODID_LIGHTS_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class LightsServiceStub extends io.grpc.stub.AbstractStub<LightsServiceStub> {
    private LightsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.example.utils.generated.lights.light_status_request request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightsOn(com.example.utils.generated.lights.lightToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightsOff(com.example.utils.generated.lights.lightToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightsServiceBlockingStub extends io.grpc.stub.AbstractStub<LightsServiceBlockingStub> {
    private LightsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.utils.generated.lights.lightStatusResponse showStatus(com.example.utils.generated.lights.light_status_request request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.lights.lightDetailResponse lightsOn(com.example.utils.generated.lights.lightToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightsOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.lights.lightDetailResponse lightsOff(com.example.utils.generated.lights.lightToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightsOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightsServiceFutureStub extends io.grpc.stub.AbstractStub<LightsServiceFutureStub> {
    private LightsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.lights.lightStatusResponse> showStatus(
        com.example.utils.generated.lights.light_status_request request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.lights.lightDetailResponse> lightsOn(
        com.example.utils.generated.lights.lightToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.lights.lightDetailResponse> lightsOff(
        com.example.utils.generated.lights.lightToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_LIGHTS_ON = 1;
  private static final int METHODID_LIGHTS_OFF = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.example.utils.generated.lights.light_status_request) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightStatusResponse>) responseObserver);
          break;
        case METHODID_LIGHTS_ON:
          serviceImpl.lightsOn((com.example.utils.generated.lights.lightToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse>) responseObserver);
          break;
        case METHODID_LIGHTS_OFF:
          serviceImpl.lightsOff((com.example.utils.generated.lights.lightToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.lights.lightDetailResponse>) responseObserver);
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

  private static abstract class LightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.utils.generated.lights.LightsDevice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightsService");
    }
  }

  private static final class LightsServiceFileDescriptorSupplier
      extends LightsServiceBaseDescriptorSupplier {
    LightsServiceFileDescriptorSupplier() {}
  }

  private static final class LightsServiceMethodDescriptorSupplier
      extends LightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightsServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getLightsOnMethod())
              .addMethod(getLightsOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
