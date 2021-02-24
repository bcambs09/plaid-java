package com.plaid.client;

import com.plaid.client.request.AccountsBalanceGetRequest;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.AssetReportAuditCopyCreateRequest;
import com.plaid.client.request.AssetReportAuditCopyGetRequest;
import com.plaid.client.request.AssetReportAuditCopyRemoveRequest;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.AssetReportFilterRequest;
import com.plaid.client.request.AssetReportGetRequest;
import com.plaid.client.request.AssetReportPdfGetRequest;
import com.plaid.client.request.AssetReportRefreshRequest;
import com.plaid.client.request.AssetReportRemoveRequest;
import com.plaid.client.request.banktransfer.BankTransferBalanceGetRequest;
import com.plaid.client.request.banktransfer.BankTransferCancelRequest;
import com.plaid.client.request.banktransfer.BankTransferCreateRequest;
import com.plaid.client.request.banktransfer.BankTransferEventListRequest;
import com.plaid.client.request.banktransfer.BankTransferEventSyncRequest;
import com.plaid.client.request.banktransfer.BankTransferGetRequest;
import com.plaid.client.request.banktransfer.BankTransferListRequest;
import com.plaid.client.request.banktransfer.BankTransferMigrateAccountRequest;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.CategoriesGetRequest;
import com.plaid.client.request.CreditDetailsGetRequest;
import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.IncomeGetRequest;
import com.plaid.client.request.InstitutionsGetByIdRequest;
import com.plaid.client.request.InstitutionsGetRequest;
import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.InvestmentsHoldingsGetRequest;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import com.plaid.client.request.ItemAccessTokenInvalidateRequest;
import com.plaid.client.request.ItemApexProcessorTokenCreateRequest;
import com.plaid.client.request.ItemDwollaProcessorTokenCreateRequest;
import com.plaid.client.request.ItemGetRequest;
import com.plaid.client.request.ItemImportRequest;
import com.plaid.client.request.ItemPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.ItemRemoveRequest;
import com.plaid.client.request.ItemStripeTokenCreateRequest;
import com.plaid.client.request.ItemWebhookUpdateRequest;
import com.plaid.client.request.LiabilitiesGetRequest;
import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.LinkTokenGetRequest;
import com.plaid.client.request.SandboxBankTransferSimulateRequest;
import com.plaid.client.request.SandboxItemFireWebhookRequest;
import com.plaid.client.request.SandboxItemResetLoginRequest;
import com.plaid.client.request.SandboxItemSetVerificationStatusRequest;
import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.request.TransactionsRefreshRequest;
import com.plaid.client.request.WebhookVerificationKeyGetRequest;
import com.plaid.client.response.AccountsBalanceGetResponse;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.AssetReportAuditCopyCreateResponse;
import com.plaid.client.response.AssetReportAuditCopyRemoveResponse;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import com.plaid.client.response.AssetReportRemoveResponse;
import com.plaid.client.response.AuthGetResponse;
import com.plaid.client.response.banktransfer.BankTransferBalanceGetResponse;
import com.plaid.client.response.banktransfer.BankTransferCancelResponse;
import com.plaid.client.response.banktransfer.BankTransferCreateResponse;
import com.plaid.client.response.banktransfer.BankTransferEventListResponse;
import com.plaid.client.response.banktransfer.BankTransferEventSyncResponse;
import com.plaid.client.response.banktransfer.BankTransferGetResponse;
import com.plaid.client.response.banktransfer.BankTransferListResponse;
import com.plaid.client.response.banktransfer.BankTransferMigrateAccountResponse;
import com.plaid.client.response.CategoriesGetResponse;
import com.plaid.client.response.CreditDetailsGetResponse;
import com.plaid.client.response.IdentityGetResponse;
import com.plaid.client.response.IncomeGetResponse;
import com.plaid.client.response.InstitutionsGetByIdResponse;
import com.plaid.client.response.InstitutionsGetResponse;
import com.plaid.client.response.InstitutionsSearchResponse;
import com.plaid.client.response.InvestmentsHoldingsGetResponse;
import com.plaid.client.response.InvestmentsTransactionsGetResponse;
import com.plaid.client.response.ItemAccessTokenInvalidateResponse;
import com.plaid.client.response.ItemApexProcessorTokenCreateResponse;
import com.plaid.client.response.ItemDwollaProcessorTokenCreateResponse;
import com.plaid.client.response.ItemGetResponse;
import com.plaid.client.response.ItemImportResponse;
import com.plaid.client.response.ItemPublicTokenCreateResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.ItemRemoveResponse;
import com.plaid.client.response.ItemStripeTokenCreateResponse;
import com.plaid.client.response.ItemWebhookUpdateResponse;
import com.plaid.client.response.LiabilitiesGetResponse;
import com.plaid.client.response.LinkTokenCreateResponse;
import com.plaid.client.response.LinkTokenGetResponse;
import com.plaid.client.response.SandboxBankTransferSimulateResponse;
import com.plaid.client.response.SandboxItemFireWebhookResponse;
import com.plaid.client.response.SandboxItemResetLoginResponse;
import com.plaid.client.response.SandboxItemSetVerificationStatusResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import com.plaid.client.response.TransactionsGetResponse;
import com.plaid.client.response.TransactionsRefreshResponse;
import com.plaid.client.response.WebhookVerificationKeyGetResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import com.plaid.client.request.depositswitch.DepositSwitchCreateRequest;
import com.plaid.client.request.depositswitch.DepositSwitchGetRequest;
import com.plaid.client.request.depositswitch.DepositSwitchTokenCreateRequest;
import com.plaid.client.request.paymentinitiation.PaymentCreateRequest;
import com.plaid.client.request.paymentinitiation.PaymentGetRequest;
import com.plaid.client.request.paymentinitiation.PaymentListRequest;
import com.plaid.client.request.paymentinitiation.PaymentTokenCreateRequest;
import com.plaid.client.request.paymentinitiation.RecipientCreateRequest;
import com.plaid.client.request.paymentinitiation.RecipientGetRequest;
import com.plaid.client.request.paymentinitiation.RecipientListRequest;

import com.plaid.client.response.depositswitch.DepositSwitchCreateResponse;
import com.plaid.client.response.depositswitch.DepositSwitchGetResponse;
import com.plaid.client.response.depositswitch.DepositSwitchTokenCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentGetResponse;
import com.plaid.client.response.paymentinitiation.PaymentListResponse;
import com.plaid.client.response.paymentinitiation.PaymentTokenCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientGetResponse;
import com.plaid.client.response.paymentinitiation.RecipientListResponse;

public interface PlaidApiService {

  // item, link, and credentials calls
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/item/get")
  Call<ItemGetResponse> itemGet(@Body ItemGetRequest request);

  @POST("/link/token/create")
  Call<LinkTokenCreateResponse> linkTokenCreate(@Body LinkTokenCreateRequest request);

  @POST("/link/token/get")
  Call<LinkTokenGetResponse> linkTokenGet(@Body LinkTokenGetRequest request);

  @POST("/item/public_token/exchange")
  Call<ItemPublicTokenExchangeResponse> itemPublicTokenExchange(
    @Body ItemPublicTokenExchangeRequest request);

  // Warning: this method will be deprecated in a future version. To replace the public_token for
  // initializing Link, look into the link_token at https://plaid.com/docs/api/tokens/#linktokencreate.
  @POST("/item/public_token/create")
  Call<ItemPublicTokenCreateResponse> itemPublicTokenCreate(
    @Body ItemPublicTokenCreateRequest request);

  @POST("/processor/stripe/bank_account_token/create")
  Call<ItemStripeTokenCreateResponse> itemStripeTokenCreate(
    @Body ItemStripeTokenCreateRequest request);

  @POST("/processor/apex/processor_token/create")
  Call<ItemApexProcessorTokenCreateResponse> itemApexProcessorTokenCreate(
    @Body ItemApexProcessorTokenCreateRequest request);

  @POST("/processor/dwolla/processor_token/create")
  Call<ItemDwollaProcessorTokenCreateResponse> itemDwollaProcessorTokenCreate(
    @Body ItemDwollaProcessorTokenCreateRequest request);

  @POST("/item/access_token/invalidate")
  Call<ItemAccessTokenInvalidateResponse> itemAccessTokenInvalidate(
    @Body ItemAccessTokenInvalidateRequest request);

  @POST("/item/remove")
  Call<ItemRemoveResponse> itemRemove(@Body ItemRemoveRequest request);

  @POST("/item/import")
  Call<ItemImportResponse> itemImport(@Body ItemImportRequest request);

  @POST("/item/webhook/update")
  Call<ItemWebhookUpdateResponse> itemWebhookUpdate(@Body ItemWebhookUpdateRequest request);

  // sandbox-only endpoints
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/sandbox/bank_transfer/simulate")
  Call<SandboxBankTransferSimulateResponse> sandboxBankTransferSimulate(
    @Body SandboxBankTransferSimulateRequest request);

  @POST("/sandbox/item/fire_webhook")
  Call<SandboxItemFireWebhookResponse> sandboxItemFireWebhook(
    @Body SandboxItemFireWebhookRequest request);

  @POST("/sandbox/item/reset_login")
  Call<SandboxItemResetLoginResponse> sandboxItemResetLogin(
    @Body SandboxItemResetLoginRequest request);

  @POST("/sandbox/item/set_verification_status")
  Call<SandboxItemSetVerificationStatusResponse> sandboxItemSetVerificationStatus(
    @Body SandboxItemSetVerificationStatusRequest request);

  @POST("/sandbox/public_token/create")
  Call<SandboxPublicTokenCreateResponse> sandboxPublicTokenCreate(
    @Body SandboxPublicTokenCreateRequest request);

  // products
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/accounts/get")
  Call<AccountsGetResponse> accountsGet(@Body AccountsGetRequest request);

  @POST("/accounts/balance/get")
  Call<AccountsBalanceGetResponse> accountsBalanceGet(@Body AccountsBalanceGetRequest request);

  @POST("/asset_report/create")
  Call<AssetReportCreateResponse> assetReportCreate(@Body AssetReportCreateRequest request);

  @POST("/asset_report/get")
  Call<AssetReportGetResponse> assetReportGet(@Body AssetReportGetRequest request);

  // This returns raw bytes so we don't have a wrapper class
  @POST("/asset_report/pdf/get")
  Call<ResponseBody> assetReportPdfGet(@Body AssetReportPdfGetRequest request);

  @POST("/asset_report/remove")
  Call<AssetReportRemoveResponse> assetReportRemove(@Body AssetReportRemoveRequest request);

  @POST("/asset_report/audit_copy/create")
  Call<AssetReportAuditCopyCreateResponse> assetReportAuditCopyCreate(
    @Body AssetReportAuditCopyCreateRequest request);

  @POST("/asset_report/audit_copy/remove")
  Call<AssetReportAuditCopyRemoveResponse> assetReportAuditCopyRemove(
    @Body AssetReportAuditCopyRemoveRequest request);

  @POST("/asset_report/audit_copy/get")
  Call<AssetReportGetResponse> assetReportAuditCopyGet(
    @Body AssetReportAuditCopyGetRequest request);

  @POST("/asset_report/refresh")
  Call<AssetReportCreateResponse> assetReportRefresh(
    @Body AssetReportRefreshRequest assetReportRefreshRequest);

  @POST("/asset_report/filter")
  Call<AssetReportCreateResponse> assetReportFilter(
    @Body AssetReportFilterRequest assetReportFilterRequest);

  @POST("/auth/get")
  Call<AuthGetResponse> authGet(@Body AuthGetRequest request);

  @POST("/bank_transfer/balance/get")
  Call<BankTransferBalanceGetResponse> bankTransferBalanceGet(
    @Body BankTransferBalanceGetRequest request);

  @POST("/bank_transfer/cancel")
  Call<BankTransferCancelResponse> bankTransferCancel(
    @Body BankTransferCancelRequest request);

  @POST("/bank_transfer/create")
  Call<BankTransferCreateResponse> bankTransferCreate(
    @Body BankTransferCreateRequest request);

  @POST("/bank_transfer/event/list")
  Call<BankTransferEventListResponse> bankTransferEventList(
    @Body BankTransferEventListRequest request);

  @POST("/bank_transfer/event/sync")
  Call<BankTransferEventSyncResponse> bankTransferEventSync(
    @Body BankTransferEventSyncRequest request);

  @POST("/bank_transfer/get")
  Call<BankTransferGetResponse> bankTransferGet(
    @Body BankTransferGetRequest request);

  @POST("/bank_transfer/list")
  Call<BankTransferListResponse> bankTransferList(
    @Body BankTransferListRequest request);

  @POST("/bank_transfer/migrate_account")
  Call<BankTransferMigrateAccountResponse> bankTransferMigrateAccount(
    @Body BankTransferMigrateAccountRequest request);

  @POST("/deposit_switch/get")
  Call<DepositSwitchGetResponse> depositSwitchGet(@Body DepositSwitchGetRequest request);

  @POST("/deposit_switch/create")
  Call<DepositSwitchCreateResponse> depositSwitchCreate(@Body DepositSwitchCreateRequest request);

  @POST("/deposit_switch/token/create")
  Call<DepositSwitchTokenCreateResponse> depositSwitchTokenCreate(
    @Body DepositSwitchTokenCreateRequest request);

  @POST("/identity/get")
  Call<IdentityGetResponse> identityGet(@Body IdentityGetRequest request);

  @POST("/income/get")
  Call<IncomeGetResponse> incomeGet(@Body IncomeGetRequest request);

  @POST("/investments/holdings/get")
  Call<InvestmentsHoldingsGetResponse> investmentsHoldingsGet(
    @Body InvestmentsHoldingsGetRequest request);

  @POST("/investments/transactions/get")
  Call<InvestmentsTransactionsGetResponse> investmentsTransactionsGet(
    @Body InvestmentsTransactionsGetRequest request);

  @POST("/transactions/get")
  Call<TransactionsGetResponse> transactionsGet(@Body TransactionsGetRequest request);

  @POST("/transactions/refresh")
  Call<TransactionsRefreshResponse> transactionsRefresh(@Body TransactionsRefreshRequest request);

  @POST("/liabilities/get")
  Call<LiabilitiesGetResponse> liabilitiesGet(@Body LiabilitiesGetRequest request);

  @POST("/payment_initiation/recipient/create")
  Call<RecipientCreateResponse> recipientCreate(@Body RecipientCreateRequest request);

  @POST("/payment_initiation/recipient/get")
  Call<RecipientGetResponse> recipientGet(@Body RecipientGetRequest request);

  @POST("/payment_initiation/recipient/list")
  Call<RecipientListResponse> recipientList(@Body RecipientListRequest request);

  @POST("/payment_initiation/payment/create")
  Call<PaymentCreateResponse> paymentCreate(@Body PaymentCreateRequest request);

  // Warning: this method will be deprecated in a future version. To replace the payment_token,
  // look into the link_token at https://plaid.com/docs/api/tokens/#linktokencreate.
  @POST("/payment_initiation/payment/token/create")
  Call<PaymentTokenCreateResponse> paymentTokenCreate(@Body PaymentTokenCreateRequest request);

  @POST("/payment_initiation/payment/get")
  Call<PaymentGetResponse> paymentGet(@Body PaymentGetRequest request);

  @POST("/payment_initiation/payment/list")
  Call<PaymentListResponse> paymentList(@Body PaymentListRequest request);

  @POST("/credit_details/get")
  Call<CreditDetailsGetResponse> creditDetailsGet(@Body CreditDetailsGetRequest request);

  @POST("/categories/get")
  Call<CategoriesGetResponse> categoriesGet(@Body CategoriesGetRequest request);

  // institutions
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/institutions/get")
  Call<InstitutionsGetResponse> institutionsGet(@Body InstitutionsGetRequest request);

  @POST("/institutions/get_by_id")
  Call<InstitutionsGetByIdResponse> institutionsGetById(@Body InstitutionsGetByIdRequest request);

  @POST("/institutions/search")
  Call<InstitutionsSearchResponse> institutionsSearch(@Body InstitutionsSearchRequest request);

  // webhooks
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/webhook_verification_key/get")
  Call<WebhookVerificationKeyGetResponse> getWebhookVerificationKey(
    @Body WebhookVerificationKeyGetRequest request);
}
