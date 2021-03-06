package com.example.utils.generated.aircon;

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
    comments = "Source: AirConditioningDevice.proto")
public final class Airconditioning_serviceGrpc {

  private Airconditioning_serviceGrpc() {}

  public static final String SERVICE_NAME = "com.example.Airconditioning_service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getCurrentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "currentDetails",
      requestType = com.example.utils.generated.aircon.deviceIDRequest.class,
      responseType = com.example.utils.generated.aircon.ACResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getCurrentDetailsMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse> getCurrentDetailsMethod;
    if ((getCurrentDetailsMethod = Airconditioning_serviceGrpc.getCurrentDetailsMethod) == null) {
      synchronized (Airconditioning_serviceGrpc.class) {
        if ((getCurrentDetailsMethod = Airconditioning_serviceGrpc.getCurrentDetailsMethod) == null) {
          Airconditioning_serviceGrpc.getCurrentDetailsMethod = getCurrentDetailsMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.Airconditioning_service", "currentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.deviceIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.ACResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Airconditioning_serviceMethodDescriptorSupplier("currentDetails"))
                  .build();
          }
        }
     }
     return getCurrentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.aircon.TempRequest,
      com.example.utils.generated.aircon.ACResponse> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTemp",
      requestType = com.example.utils.generated.aircon.TempRequest.class,
      responseType = com.example.utils.generated.aircon.ACResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.aircon.TempRequest,
      com.example.utils.generated.aircon.ACResponse> getSetTempMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.aircon.TempRequest, com.example.utils.generated.aircon.ACResponse> getSetTempMethod;
    if ((getSetTempMethod = Airconditioning_serviceGrpc.getSetTempMethod) == null) {
      synchronized (Airconditioning_serviceGrpc.class) {
        if ((getSetTempMethod = Airconditioning_serviceGrpc.getSetTempMethod) == null) {
          Airconditioning_serviceGrpc.getSetTempMethod = getSetTempMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.aircon.TempRequest, com.example.utils.generated.aircon.ACResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.Airconditioning_service", "setTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.ACResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Airconditioning_serviceMethodDescriptorSupplier("setTemp"))
                  .build();
          }
        }
     }
     return getSetTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getSetOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOff",
      requestType = com.example.utils.generated.aircon.deviceIDRequest.class,
      responseType = com.example.utils.generated.aircon.ACResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getSetOffMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse> getSetOffMethod;
    if ((getSetOffMethod = Airconditioning_serviceGrpc.getSetOffMethod) == null) {
      synchronized (Airconditioning_serviceGrpc.class) {
        if ((getSetOffMethod = Airconditioning_serviceGrpc.getSetOffMethod) == null) {
          Airconditioning_serviceGrpc.getSetOffMethod = getSetOffMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.Airconditioning_service", "setOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.deviceIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.ACResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Airconditioning_serviceMethodDescriptorSupplier("setOff"))
                  .build();
          }
        }
     }
     return getSetOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getSetOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOn",
      requestType = com.example.utils.generated.aircon.deviceIDRequest.class,
      responseType = com.example.utils.generated.aircon.ACResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest,
      com.example.utils.generated.aircon.ACResponse> getSetOnMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse> getSetOnMethod;
    if ((getSetOnMethod = Airconditioning_serviceGrpc.getSetOnMethod) == null) {
      synchronized (Airconditioning_serviceGrpc.class) {
        if ((getSetOnMethod = Airconditioning_serviceGrpc.getSetOnMethod) == null) {
          Airconditioning_serviceGrpc.getSetOnMethod = getSetOnMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.aircon.deviceIDRequest, com.example.utils.generated.aircon.ACResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.Airconditioning_service", "setOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.deviceIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.aircon.ACResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Airconditioning_serviceMethodDescriptorSupplier("setOn"))
                  .build();
          }
        }
     }
     return getSetOnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Airconditioning_serviceStub newStub(io.grpc.Channel channel) {
    return new Airconditioning_serviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Airconditioning_serviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Airconditioning_serviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Airconditioning_serviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Airconditioning_serviceFutureStub(channel);
  }

  /**
   */
  public static abstract class Airconditioning_serviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void currentDetails(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentDetailsMethod(), responseObserver);
    }

    /**
     */
    public void setTemp(com.example.utils.generated.aircon.TempRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    /**
     */
    public void setOff(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOffMethod(), responseObserver);
    }

    /**
     */
    public void setOn(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOnMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCurrentDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.aircon.deviceIDRequest,
                com.example.utils.generated.aircon.ACResponse>(
                  this, METHODID_CURRENT_DETAILS)))
          .addMethod(
            getSetTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.aircon.TempRequest,
                com.example.utils.generated.aircon.ACResponse>(
                  this, METHODID_SET_TEMP)))
          .addMethod(
            getSetOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.aircon.deviceIDRequest,
                com.example.utils.generated.aircon.ACResponse>(
                  this, METHODID_SET_OFF)))
          .addMethod(
            getSetOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.aircon.deviceIDRequest,
                com.example.utils.generated.aircon.ACResponse>(
                  this, METHODID_SET_ON)))
          .build();
    }
  }

  /**
   */
  public static final class Airconditioning_serviceStub extends io.grpc.stub.AbstractStub<Airconditioning_serviceStub> {
    private Airconditioning_serviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Airconditioning_serviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Airconditioning_serviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Airconditioning_serviceStub(channel, callOptions);
    }

    /**
     */
    public void currentDetails(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemp(com.example.utils.generated.aircon.TempRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOff(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOn(com.example.utils.generated.aircon.deviceIDRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Airconditioning_serviceBlockingStub extends io.grpc.stub.AbstractStub<Airconditioning_serviceBlockingStub> {
    private Airconditioning_serviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Airconditioning_serviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Airconditioning_serviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Airconditioning_serviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.utils.generated.aircon.ACResponse currentDetails(com.example.utils.generated.aircon.deviceIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrentDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.aircon.ACResponse setTemp(com.example.utils.generated.aircon.TempRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.aircon.ACResponse setOff(com.example.utils.generated.aircon.deviceIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.aircon.ACResponse setOn(com.example.utils.generated.aircon.deviceIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOnMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Airconditioning_serviceFutureStub extends io.grpc.stub.AbstractStub<Airconditioning_serviceFutureStub> {
    private Airconditioning_serviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Airconditioning_serviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Airconditioning_serviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Airconditioning_serviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.aircon.ACResponse> currentDetails(
        com.example.utils.generated.aircon.deviceIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.aircon.ACResponse> setTemp(
        com.example.utils.generated.aircon.TempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.aircon.ACResponse> setOff(
        com.example.utils.generated.aircon.deviceIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.aircon.ACResponse> setOn(
        com.example.utils.generated.aircon.deviceIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CURRENT_DETAILS = 0;
  private static final int METHODID_SET_TEMP = 1;
  private static final int METHODID_SET_OFF = 2;
  private static final int METHODID_SET_ON = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Airconditioning_serviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Airconditioning_serviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CURRENT_DETAILS:
          serviceImpl.currentDetails((com.example.utils.generated.aircon.deviceIDRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((com.example.utils.generated.aircon.TempRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse>) responseObserver);
          break;
        case METHODID_SET_OFF:
          serviceImpl.setOff((com.example.utils.generated.aircon.deviceIDRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse>) responseObserver);
          break;
        case METHODID_SET_ON:
          serviceImpl.setOn((com.example.utils.generated.aircon.deviceIDRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.aircon.ACResponse>) responseObserver);
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

  private static abstract class Airconditioning_serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Airconditioning_serviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.utils.generated.aircon.AirConditioningDevice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Airconditioning_service");
    }
  }

  private static final class Airconditioning_serviceFileDescriptorSupplier
      extends Airconditioning_serviceBaseDescriptorSupplier {
    Airconditioning_serviceFileDescriptorSupplier() {}
  }

  private static final class Airconditioning_serviceMethodDescriptorSupplier
      extends Airconditioning_serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Airconditioning_serviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (Airconditioning_serviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Airconditioning_serviceFileDescriptorSupplier())
              .addMethod(getCurrentDetailsMethod())
              .addMethod(getSetTempMethod())
              .addMethod(getSetOffMethod())
              .addMethod(getSetOnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
