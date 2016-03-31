/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.batch.protocol.models.ApplicationGetHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationGetOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationListHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationListNextOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationListOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationSummary;
import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.batch.protocol.models.PageImpl;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplicationOperations.
 */
public final class ApplicationOperationsImpl implements ApplicationOperations {
    /** The Retrofit service to perform REST calls. */
    private ApplicationService service;
    /** The service client containing this operation class. */
    private BatchServiceClient client;

    /**
     * Initializes an instance of ApplicationOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApplicationOperationsImpl(Retrofit retrofit, BatchServiceClient client) {
        this.service = retrofit.create(ApplicationService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApplicationService {
        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET("applications")
        Call<ResponseBody> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("maxresults") Integer maxResults, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET("applications/{applicationId}")
        Call<ResponseBody> get(@Path("applicationId") String applicationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationSummary&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PagedList<ApplicationSummary>, ApplicationListHeaders> list() throws BatchErrorException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final ApplicationListOptions applicationListOptions = null;
        Integer maxResults = null;
        if (applicationListOptions != null) {
            maxResults = applicationListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (applicationListOptions != null) {
            timeout = applicationListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationListOptions != null) {
            clientRequestId = applicationListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListOptions != null) {
            returnClientRequestId = applicationListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListOptions != null) {
            ocpDate = applicationListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> response = listDelegate(call.execute());
        PagedList<ApplicationSummary> result = new PagedList<ApplicationSummary>(response.getBody()) {
            @Override
            public Page<ApplicationSummary> nextPage(String nextPageLink) throws BatchErrorException, IOException {
                ApplicationListNextOptions applicationListNextOptions = null;
                if (applicationListOptions != null) {
                    applicationListNextOptions = new ApplicationListNextOptions();
                    applicationListNextOptions.setClientRequestId(applicationListOptions.getClientRequestId());
                    applicationListNextOptions.setReturnClientRequestId(applicationListOptions.getReturnClientRequestId());
                    applicationListNextOptions.setOcpDate(applicationListOptions.getOcpDate());
                }
                return listNext(nextPageLink, applicationListNextOptions).getBody();
            }
        };
        return new ServiceResponseWithHeaders<>(result, response.getHeaders(), response.getResponse());
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final ListOperationCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final ApplicationListOptions applicationListOptions = null;
        Integer maxResults = null;
        if (applicationListOptions != null) {
            maxResults = applicationListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (applicationListOptions != null) {
            timeout = applicationListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationListOptions != null) {
            clientRequestId = applicationListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListOptions != null) {
            returnClientRequestId = applicationListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListOptions != null) {
            ocpDate = applicationListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<ApplicationSummary>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        ApplicationListNextOptions applicationListNextOptions = null;
                        if (applicationListOptions != null) {
                            applicationListNextOptions = new ApplicationListNextOptions();
                            applicationListNextOptions.setClientRequestId(applicationListOptions.getClientRequestId());
                            applicationListNextOptions.setReturnClientRequestId(applicationListOptions.getReturnClientRequestId());
                            applicationListNextOptions.setOcpDate(applicationListOptions.getOcpDate());
                        }
                        listNextAsync(result.getBody().getNextPageLink(), applicationListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationSummary&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PagedList<ApplicationSummary>, ApplicationListHeaders> list(final ApplicationListOptions applicationListOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(applicationListOptions);
        Integer maxResults = null;
        if (applicationListOptions != null) {
            maxResults = applicationListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (applicationListOptions != null) {
            timeout = applicationListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationListOptions != null) {
            clientRequestId = applicationListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListOptions != null) {
            returnClientRequestId = applicationListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListOptions != null) {
            ocpDate = applicationListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> response = listDelegate(call.execute());
        PagedList<ApplicationSummary> result = new PagedList<ApplicationSummary>(response.getBody()) {
            @Override
            public Page<ApplicationSummary> nextPage(String nextPageLink) throws BatchErrorException, IOException {
                ApplicationListNextOptions applicationListNextOptions = null;
                if (applicationListOptions != null) {
                    applicationListNextOptions = new ApplicationListNextOptions();
                    applicationListNextOptions.setClientRequestId(applicationListOptions.getClientRequestId());
                    applicationListNextOptions.setReturnClientRequestId(applicationListOptions.getReturnClientRequestId());
                    applicationListNextOptions.setOcpDate(applicationListOptions.getOcpDate());
                }
                return listNext(nextPageLink, applicationListNextOptions).getBody();
            }
        };
        return new ServiceResponseWithHeaders<>(result, response.getHeaders(), response.getResponse());
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final ApplicationListOptions applicationListOptions, final ListOperationCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(applicationListOptions, serviceCallback);
        Integer maxResults = null;
        if (applicationListOptions != null) {
            maxResults = applicationListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (applicationListOptions != null) {
            timeout = applicationListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationListOptions != null) {
            clientRequestId = applicationListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListOptions != null) {
            returnClientRequestId = applicationListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListOptions != null) {
            ocpDate = applicationListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<ApplicationSummary>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        ApplicationListNextOptions applicationListNextOptions = null;
                        if (applicationListOptions != null) {
                            applicationListNextOptions = new ApplicationListNextOptions();
                            applicationListNextOptions.setClientRequestId(applicationListOptions.getClientRequestId());
                            applicationListNextOptions.setReturnClientRequestId(applicationListOptions.getReturnClientRequestId());
                            applicationListNextOptions.setOcpDate(applicationListOptions.getOcpDate());
                        }
                        listNextAsync(result.getBody().getNextPageLink(), applicationListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> listDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationSummary>, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<ApplicationSummary>>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, ApplicationListHeaders.class);
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The id of the application.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationSummary object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders> get(String applicationId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final ApplicationGetOptions applicationGetOptions = null;
        Integer timeout = null;
        if (applicationGetOptions != null) {
            timeout = applicationGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationGetOptions != null) {
            clientRequestId = applicationGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationGetOptions != null) {
            returnClientRequestId = applicationGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationGetOptions != null) {
            ocpDate = applicationGetOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.get(applicationId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        return getDelegate(call.execute());
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The id of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String applicationId, final ServiceCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (applicationId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter applicationId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final ApplicationGetOptions applicationGetOptions = null;
        Integer timeout = null;
        if (applicationGetOptions != null) {
            timeout = applicationGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationGetOptions != null) {
            clientRequestId = applicationGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationGetOptions != null) {
            returnClientRequestId = applicationGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationGetOptions != null) {
            ocpDate = applicationGetOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.get(applicationId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ApplicationSummary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The id of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationSummary object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders> get(String applicationId, ApplicationGetOptions applicationGetOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (applicationId == null) {
            throw new IllegalArgumentException("Parameter applicationId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(applicationGetOptions);
        Integer timeout = null;
        if (applicationGetOptions != null) {
            timeout = applicationGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationGetOptions != null) {
            clientRequestId = applicationGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationGetOptions != null) {
            returnClientRequestId = applicationGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationGetOptions != null) {
            ocpDate = applicationGetOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.get(applicationId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        return getDelegate(call.execute());
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The id of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String applicationId, ApplicationGetOptions applicationGetOptions, final ServiceCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (applicationId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter applicationId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(applicationGetOptions, serviceCallback);
        Integer timeout = null;
        if (applicationGetOptions != null) {
            timeout = applicationGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (applicationGetOptions != null) {
            clientRequestId = applicationGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationGetOptions != null) {
            returnClientRequestId = applicationGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationGetOptions != null) {
            ocpDate = applicationGetOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.get(applicationId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ApplicationSummary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders> getDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ApplicationSummary, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ApplicationSummary>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, ApplicationGetHeaders.class);
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationSummary&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> listNext(final String nextPageLink) throws BatchErrorException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        final ApplicationListNextOptions applicationListNextOptions = null;
        String clientRequestId = null;
        if (applicationListNextOptions != null) {
            clientRequestId = applicationListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListNextOptions != null) {
            returnClientRequestId = applicationListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListNextOptions != null) {
            ocpDate = applicationListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        return listNextDelegate(call.execute());
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        final ApplicationListNextOptions applicationListNextOptions = null;
        String clientRequestId = null;
        if (applicationListNextOptions != null) {
            clientRequestId = applicationListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListNextOptions != null) {
            returnClientRequestId = applicationListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListNextOptions != null) {
            ocpDate = applicationListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<ApplicationSummary>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), applicationListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationSummary&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> listNext(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Validator.validate(applicationListNextOptions);
        String clientRequestId = null;
        if (applicationListNextOptions != null) {
            clientRequestId = applicationListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListNextOptions != null) {
            returnClientRequestId = applicationListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListNextOptions != null) {
            ocpDate = applicationListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        return listNextDelegate(call.execute());
    }

    /**
     * Lists all of the applications available in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions, final ServiceCall serviceCall, final ListOperationCallback<ApplicationSummary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Validator.validate(applicationListNextOptions, serviceCallback);
        String clientRequestId = null;
        if (applicationListNextOptions != null) {
            clientRequestId = applicationListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (applicationListNextOptions != null) {
            returnClientRequestId = applicationListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (applicationListNextOptions != null) {
            ocpDate = applicationListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = null;
        if (ocpDate != null) {
            ocpDateConverted = new DateTimeRfc1123(ocpDate);
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<ApplicationSummary>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), applicationListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<PageImpl<ApplicationSummary>, ApplicationListHeaders> listNextDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationSummary>, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<ApplicationSummary>>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, ApplicationListHeaders.class);
    }

}
