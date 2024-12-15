package org.side.HotelReservationApplication.stub;
import jakarta.annotation.Generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service pour la gestion des réservations
 * </pre>
 */
//@javax.annotation.Generated(
       // value = "by gRPC proto compiler (version 1.53.0)",
       // comments = "Source: reservation.proto")

@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> getAddReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReservation",
      requestType = org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest.class,
      responseType = org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> getAddReservationMethod() {
    io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> getAddReservationMethod;
    if ((getAddReservationMethod = ReservationServiceGrpc.getAddReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAddReservationMethod = ReservationServiceGrpc.getAddReservationMethod) == null) {
          ReservationServiceGrpc.getAddReservationMethod = getAddReservationMethod =
              io.grpc.MethodDescriptor.<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AddReservation"))
              .build();
        }
      }
    }
    return getAddReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest.class,
      responseType = org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod =
              io.grpc.MethodDescriptor.<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
              .build();
        }
      }
    }
    return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest.class,
      responseType = org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod =
              io.grpc.MethodDescriptor.<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
              .build();
        }
      }
    }
    return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest.class,
      responseType = org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest,
      org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod =
              io.grpc.MethodDescriptor.<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest, org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
              .build();
        }
      }
    }
    return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service pour la gestion des réservations
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ajouter une nouvelle réservation
     * </pre>
     */
    public void addReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Consulter une réservation par ID
     * </pre>
     */
    public void getReservationById(org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mettre à jour une réservation existante
     * </pre>
     */
    public void updateReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddReservationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest,
                org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse>(
                  this, METHODID_ADD_RESERVATION)))
          .addMethod(
            getGetReservationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest,
                org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getUpdateReservationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest,
                org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest,
                org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service pour la gestion des réservations
   * </pre>
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ajouter une nouvelle réservation
     * </pre>
     */
    public void addReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Consulter une réservation par ID
     * </pre>
     */
    public void getReservationById(org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mettre à jour une réservation existante
     * </pre>
     */
    public void updateReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service pour la gestion des réservations
   * </pre>
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ajouter une nouvelle réservation
     * </pre>
     */
    public org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse addReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Consulter une réservation par ID
     * </pre>
     */
    public org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse getReservationById(org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mettre à jour une réservation existante
     * </pre>
     */
    public org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse updateReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse deleteReservation(org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service pour la gestion des réservations
   * </pre>
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ajouter une nouvelle réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse> addReservation(
        org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Consulter une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse> getReservationById(
        org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mettre à jour une réservation existante
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse> updateReservation(
        org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse> deleteReservation(
        org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_UPDATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RESERVATION:
          serviceImpl.addReservation((org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationRequest) request,
              (io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.AddReservationResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.UpdateReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<org.side.HotelReservationApplication.stub.ReservationOuterClass.DeleteReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.side.HotelReservationApplication.stub.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getAddReservationMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
