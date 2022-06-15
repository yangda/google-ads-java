package com.google.ads.googleads.v11.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Audience Insights Service helps users find information about groups of
 * people and how they can be reached with Google Ads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v11/services/audience_insights_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudienceInsightsServiceGrpc {

  private AudienceInsightsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v11.services.AudienceInsightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest,
      com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateInsightsFinderReport",
      requestType = com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest.class,
      responseType = com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest,
      com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest, com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> getGenerateInsightsFinderReportMethod;
    if ((getGenerateInsightsFinderReportMethod = AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getGenerateInsightsFinderReportMethod = AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod) == null) {
          AudienceInsightsServiceGrpc.getGenerateInsightsFinderReportMethod = getGenerateInsightsFinderReportMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest, com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateInsightsFinderReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("GenerateInsightsFinderReport"))
              .build();
        }
      }
    }
    return getGenerateInsightsFinderReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest,
      com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudienceInsightsAttributes",
      requestType = com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest.class,
      responseType = com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest,
      com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest, com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> getListAudienceInsightsAttributesMethod;
    if ((getListAudienceInsightsAttributesMethod = AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod) == null) {
      synchronized (AudienceInsightsServiceGrpc.class) {
        if ((getListAudienceInsightsAttributesMethod = AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod) == null) {
          AudienceInsightsServiceGrpc.getListAudienceInsightsAttributesMethod = getListAudienceInsightsAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest, com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudienceInsightsAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudienceInsightsServiceMethodDescriptorSupplier("ListAudienceInsightsAttributes"))
              .build();
        }
      }
    }
    return getListAudienceInsightsAttributesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudienceInsightsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceStub>() {
        @java.lang.Override
        public AudienceInsightsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudienceInsightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceBlockingStub>() {
        @java.lang.Override
        public AudienceInsightsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceBlockingStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudienceInsightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudienceInsightsServiceFutureStub>() {
        @java.lang.Override
        public AudienceInsightsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudienceInsightsServiceFutureStub(channel, callOptions);
        }
      };
    return AudienceInsightsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads.
   * </pre>
   */
  public static abstract class AudienceInsightsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateInsightsFinderReport(com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateInsightsFinderReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void listAudienceInsightsAttributes(com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAudienceInsightsAttributesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateInsightsFinderReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest,
                com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse>(
                  this, METHODID_GENERATE_INSIGHTS_FINDER_REPORT)))
          .addMethod(
            getListAudienceInsightsAttributesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest,
                com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse>(
                  this, METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads.
   * </pre>
   */
  public static final class AudienceInsightsServiceStub extends io.grpc.stub.AbstractAsyncStub<AudienceInsightsServiceStub> {
    private AudienceInsightsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateInsightsFinderReport(com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateInsightsFinderReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void listAudienceInsightsAttributes(com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAudienceInsightsAttributesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads.
   * </pre>
   */
  public static final class AudienceInsightsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudienceInsightsServiceBlockingStub> {
    private AudienceInsightsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse generateInsightsFinderReport(com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateInsightsFinderReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse listAudienceInsightsAttributes(com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudienceInsightsAttributesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Audience Insights Service helps users find information about groups of
   * people and how they can be reached with Google Ads.
   * </pre>
   */
  public static final class AudienceInsightsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AudienceInsightsServiceFutureStub> {
    private AudienceInsightsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudienceInsightsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudienceInsightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a saved report that can be viewed in the Insights Finder tool.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse> generateInsightsFinderReport(
        com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateInsightsFinderReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for audience attributes that can be used to generate insights.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse> listAudienceInsightsAttributes(
        com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAudienceInsightsAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_INSIGHTS_FINDER_REPORT = 0;
  private static final int METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudienceInsightsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudienceInsightsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_INSIGHTS_FINDER_REPORT:
          serviceImpl.generateInsightsFinderReport((com.google.ads.googleads.v11.services.GenerateInsightsFinderReportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.GenerateInsightsFinderReportResponse>) responseObserver);
          break;
        case METHODID_LIST_AUDIENCE_INSIGHTS_ATTRIBUTES:
          serviceImpl.listAudienceInsightsAttributes((com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.ListAudienceInsightsAttributesResponse>) responseObserver);
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

  private static abstract class AudienceInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AudienceInsightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AudienceInsightsService");
    }
  }

  private static final class AudienceInsightsServiceFileDescriptorSupplier
      extends AudienceInsightsServiceBaseDescriptorSupplier {
    AudienceInsightsServiceFileDescriptorSupplier() {}
  }

  private static final class AudienceInsightsServiceMethodDescriptorSupplier
      extends AudienceInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AudienceInsightsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AudienceInsightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AudienceInsightsServiceFileDescriptorSupplier())
              .addMethod(getGenerateInsightsFinderReportMethod())
              .addMethod(getListAudienceInsightsAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
