package org.isd.bankgrpcservice.grpc.stub;

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
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBankAccount",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest, org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;
    if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
          BankServiceGrpc.getGetBankAccountMethod = getGetBankAccountMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest, org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBankAccount"))
                  .build();
          }
        }
     }
     return getGetBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest, org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest, org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
                  .build();
          }
        }
     }
     return getConvertCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfTransactions",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest,
      org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest, org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod;
    if ((getGetStreamOfTransactionsMethod = BankServiceGrpc.getGetStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfTransactionsMethod = BankServiceGrpc.getGetStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfTransactionsMethod = getGetStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest, org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse> getPerformStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStreamOfTransactions",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse> getPerformStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction, org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse> getPerformStreamOfTransactionsMethod;
    if ((getPerformStreamOfTransactionsMethod = BankServiceGrpc.getPerformStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamOfTransactionsMethod = BankServiceGrpc.getPerformStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getPerformStreamOfTransactionsMethod = getPerformStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction, org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "performStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getPerformStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteStreamOfTransaction",
      requestType = org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      responseType = org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction, org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction, org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "ExecuteStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("ExecuteStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBankAccount(org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     */
    public void convertCurrency(org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void getStreamOfTransactions(org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> performStreamOfTransactions(
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *BI-directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
                org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>(
                  this, METHODID_GET_BANK_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest,
                org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getConvertCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
                org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_CURRENCY)))
          .addMethod(
            getGetStreamOfTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest,
                org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_GET_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getPerformStreamOfTransactionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
                org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse>(
                  this, METHODID_PERFORM_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.isd.bankgrpcservice.grpc.stub.Bank.Transaction,
                org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBankAccount(org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertCurrency(org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void getStreamOfTransactions(org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest request,
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> performStreamOfTransactions(
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *BI-directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse getBankAccount(org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse getListAccounts(org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse convertCurrency(org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public java.util.Iterator<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction> getStreamOfTransactions(
        org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getBankAccount(
        org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse> getListAccounts(
        org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> convertCurrency(
        org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_ACCOUNT = 0;
  private static final int METHODID_GET_LIST_ACCOUNTS = 1;
  private static final int METHODID_CONVERT_CURRENCY = 2;
  private static final int METHODID_GET_STREAM_OF_TRANSACTIONS = 3;
  private static final int METHODID_PERFORM_STREAM_OF_TRANSACTIONS = 4;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_ACCOUNT:
          serviceImpl.getBankAccount((org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.GetListAccountsResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_TRANSACTIONS:
          serviceImpl.getStreamOfTransactions((org.isd.bankgrpcservice.grpc.stub.Bank.GetStreamTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>) responseObserver);
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
        case METHODID_PERFORM_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStreamOfTransactions(
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<org.isd.bankgrpcservice.grpc.stub.Bank.Transaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.isd.bankgrpcservice.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBankAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getConvertCurrencyMethod())
              .addMethod(getGetStreamOfTransactionsMethod())
              .addMethod(getPerformStreamOfTransactionsMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
