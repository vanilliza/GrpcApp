package com.example.utils.generated.carpark;

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
    comments = "Source: CarParkOperations.proto")
public final class carParkServiceGrpc {

  private carParkServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.carParkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.carpark.carparkRequest,
      com.example.utils.generated.carpark.carParkResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = com.example.utils.generated.carpark.carparkRequest.class,
      responseType = com.example.utils.generated.carpark.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.carpark.carparkRequest,
      com.example.utils.generated.carpark.carParkResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.carpark.carparkRequest, com.example.utils.generated.carpark.carParkResponse> getShowStatusMethod;
    if ((getShowStatusMethod = carParkServiceGrpc.getShowStatusMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getShowStatusMethod = carParkServiceGrpc.getShowStatusMethod) == null) {
          carParkServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.carpark.carparkRequest, com.example.utils.generated.carpark.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.carParkService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.carparkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest,
      com.example.utils.generated.carpark.carParkResponse> getSetFullMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setFull",
      requestType = com.example.utils.generated.carpark.CarParkToUpdateRequest.class,
      responseType = com.example.utils.generated.carpark.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest,
      com.example.utils.generated.carpark.carParkResponse> getSetFullMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest, com.example.utils.generated.carpark.carParkResponse> getSetFullMethod;
    if ((getSetFullMethod = carParkServiceGrpc.getSetFullMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getSetFullMethod = carParkServiceGrpc.getSetFullMethod) == null) {
          carParkServiceGrpc.getSetFullMethod = getSetFullMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.carpark.CarParkToUpdateRequest, com.example.utils.generated.carpark.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.carParkService", "setFull"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.CarParkToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("setFull"))
                  .build();
          }
        }
     }
     return getSetFullMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest,
      com.example.utils.generated.carpark.carParkResponse> getSetSpacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setSpaces",
      requestType = com.example.utils.generated.carpark.CarParkToUpdateRequest.class,
      responseType = com.example.utils.generated.carpark.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest,
      com.example.utils.generated.carpark.carParkResponse> getSetSpacesMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.carpark.CarParkToUpdateRequest, com.example.utils.generated.carpark.carParkResponse> getSetSpacesMethod;
    if ((getSetSpacesMethod = carParkServiceGrpc.getSetSpacesMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getSetSpacesMethod = carParkServiceGrpc.getSetSpacesMethod) == null) {
          carParkServiceGrpc.getSetSpacesMethod = getSetSpacesMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.carpark.CarParkToUpdateRequest, com.example.utils.generated.carpark.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.carParkService", "setSpaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.CarParkToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("setSpaces"))
                  .build();
          }
        }
     }
     return getSetSpacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.utils.generated.carpark.allCarp,
      com.example.utils.generated.carpark.carParkResponse> getAllCarParksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allCarParks",
      requestType = com.example.utils.generated.carpark.allCarp.class,
      responseType = com.example.utils.generated.carpark.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.utils.generated.carpark.allCarp,
      com.example.utils.generated.carpark.carParkResponse> getAllCarParksMethod() {
    io.grpc.MethodDescriptor<com.example.utils.generated.carpark.allCarp, com.example.utils.generated.carpark.carParkResponse> getAllCarParksMethod;
    if ((getAllCarParksMethod = carParkServiceGrpc.getAllCarParksMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getAllCarParksMethod = carParkServiceGrpc.getAllCarParksMethod) == null) {
          carParkServiceGrpc.getAllCarParksMethod = getAllCarParksMethod = 
              io.grpc.MethodDescriptor.<com.example.utils.generated.carpark.allCarp, com.example.utils.generated.carpark.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.carParkService", "allCarParks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.allCarp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.utils.generated.carpark.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("allCarParks"))
                  .build();
          }
        }
     }
     return getAllCarParksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static carParkServiceStub newStub(io.grpc.Channel channel) {
    return new carParkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static carParkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new carParkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static carParkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new carParkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class carParkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.example.utils.generated.carpark.carparkRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setFull(com.example.utils.generated.carpark.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetFullMethod(), responseObserver);
    }

    /**
     */
    public void setSpaces(com.example.utils.generated.carpark.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSpacesMethod(), responseObserver);
    }

    /**
     */
    public void allCarParks(com.example.utils.generated.carpark.allCarp request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllCarParksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.carpark.carparkRequest,
                com.example.utils.generated.carpark.carParkResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetFullMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.carpark.CarParkToUpdateRequest,
                com.example.utils.generated.carpark.carParkResponse>(
                  this, METHODID_SET_FULL)))
          .addMethod(
            getSetSpacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.utils.generated.carpark.CarParkToUpdateRequest,
                com.example.utils.generated.carpark.carParkResponse>(
                  this, METHODID_SET_SPACES)))
          .addMethod(
            getAllCarParksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.utils.generated.carpark.allCarp,
                com.example.utils.generated.carpark.carParkResponse>(
                  this, METHODID_ALL_CAR_PARKS)))
          .build();
    }
  }

  /**
   */
  public static final class carParkServiceStub extends io.grpc.stub.AbstractStub<carParkServiceStub> {
    private carParkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.example.utils.generated.carpark.carparkRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setFull(com.example.utils.generated.carpark.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetFullMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSpaces(com.example.utils.generated.carpark.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetSpacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allCarParks(com.example.utils.generated.carpark.allCarp request,
        io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllCarParksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class carParkServiceBlockingStub extends io.grpc.stub.AbstractStub<carParkServiceBlockingStub> {
    private carParkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.utils.generated.carpark.carParkResponse showStatus(com.example.utils.generated.carpark.carparkRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.carpark.carParkResponse setFull(com.example.utils.generated.carpark.CarParkToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetFullMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.utils.generated.carpark.carParkResponse setSpaces(com.example.utils.generated.carpark.CarParkToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetSpacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.utils.generated.carpark.carParkResponse> allCarParks(
        com.example.utils.generated.carpark.allCarp request) {
      return blockingServerStreamingCall(
          getChannel(), getAllCarParksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class carParkServiceFutureStub extends io.grpc.stub.AbstractStub<carParkServiceFutureStub> {
    private carParkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.carpark.carParkResponse> showStatus(
        com.example.utils.generated.carpark.carparkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.carpark.carParkResponse> setFull(
        com.example.utils.generated.carpark.CarParkToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetFullMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.utils.generated.carpark.carParkResponse> setSpaces(
        com.example.utils.generated.carpark.CarParkToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetSpacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_FULL = 1;
  private static final int METHODID_SET_SPACES = 2;
  private static final int METHODID_ALL_CAR_PARKS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final carParkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(carParkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.example.utils.generated.carpark.carparkRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse>) responseObserver);
          break;
        case METHODID_SET_FULL:
          serviceImpl.setFull((com.example.utils.generated.carpark.CarParkToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse>) responseObserver);
          break;
        case METHODID_SET_SPACES:
          serviceImpl.setSpaces((com.example.utils.generated.carpark.CarParkToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse>) responseObserver);
          break;
        case METHODID_ALL_CAR_PARKS:
          serviceImpl.allCarParks((com.example.utils.generated.carpark.allCarp) request,
              (io.grpc.stub.StreamObserver<com.example.utils.generated.carpark.carParkResponse>) responseObserver);
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

  private static abstract class carParkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    carParkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.utils.generated.carpark.CarParkOperations.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("carParkService");
    }
  }

  private static final class carParkServiceFileDescriptorSupplier
      extends carParkServiceBaseDescriptorSupplier {
    carParkServiceFileDescriptorSupplier() {}
  }

  private static final class carParkServiceMethodDescriptorSupplier
      extends carParkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    carParkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (carParkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new carParkServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetFullMethod())
              .addMethod(getSetSpacesMethod())
              .addMethod(getAllCarParksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
