/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.Accounts;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.DataLakeAnalyticsAccount;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.AddStorageAccountParameters;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.AddDataLakeStoreParameters;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.StorageAccountInfo;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.BlobContainer;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.SasTokenInfo;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.DataLakeStoreAccountInfo;

class AccountsImpl extends GroupableResourcesCoreImpl<DataLakeAnalyticsAccount, DataLakeAnalyticsAccountImpl, DataLakeAnalyticsAccountInner, AccountsInner, DataLakeAnalyticsManager>  implements Accounts {
    protected AccountsImpl(DataLakeAnalyticsManager manager) {
        super(manager.inner().accounts(), manager);
    }

    @Override
    protected Observable<DataLakeAnalyticsAccountInner> getInnerAsync(String resourceGroupName, String name) {
        AccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AccountsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<DataLakeAnalyticsAccount> listByResourceGroup(String resourceGroupName) {
        AccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DataLakeAnalyticsAccount> listByResourceGroupAsync(String resourceGroupName) {
        AccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DataLakeAnalyticsAccountInner>, Iterable<DataLakeAnalyticsAccountInner>>() {
            @Override
            public Iterable<DataLakeAnalyticsAccountInner> call(Page<DataLakeAnalyticsAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataLakeAnalyticsAccountInner, DataLakeAnalyticsAccount>() {
            @Override
            public DataLakeAnalyticsAccount call(DataLakeAnalyticsAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DataLakeAnalyticsAccount> list() {
        AccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DataLakeAnalyticsAccount> listAsync() {
        AccountsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DataLakeAnalyticsAccountInner>, Iterable<DataLakeAnalyticsAccountInner>>() {
            @Override
            public Iterable<DataLakeAnalyticsAccountInner> call(Page<DataLakeAnalyticsAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataLakeAnalyticsAccountInner, DataLakeAnalyticsAccount>() {
            @Override
            public DataLakeAnalyticsAccount call(DataLakeAnalyticsAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DataLakeAnalyticsAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable addStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName, AddStorageAccountParameters parameters) {
        AccountsInner client = this.inner();
        return client.addStorageAccountAsync(resourceGroupName, accountName, storageAccountName, parameters).toCompletable();
    }

    @Override
    public Completable addDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters) {
        AccountsInner client = this.inner();
        return client.addDataLakeStoreAccountAsync(resourceGroupName, accountName, dataLakeStoreAccountName, parameters).toCompletable();
    }

    @Override
    protected DataLakeAnalyticsAccountImpl wrapModel(DataLakeAnalyticsAccountInner inner) {
        return  new DataLakeAnalyticsAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected DataLakeAnalyticsAccountImpl wrapModel(String name) {
        return new DataLakeAnalyticsAccountImpl(name, new DataLakeAnalyticsAccountInner(), this.manager());
    }

    private StorageAccountInfoImpl wrapStorageAccountInfoModel(StorageAccountInfoInner inner) {
        return  new StorageAccountInfoImpl(inner, manager());
    }

    private BlobContainerImpl wrapBlobContainerModel(BlobContainerInner inner) {
        return  new BlobContainerImpl(inner, manager());
    }

    private DataLakeStoreAccountInfoImpl wrapDataLakeStoreAccountInfoModel(DataLakeStoreAccountInfoInner inner) {
        return  new DataLakeStoreAccountInfoImpl(inner, manager());
    }

    private Observable<StorageAccountInfoInner> getStorageAccountInfoInnerUsingAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "accounts");
        String storageAccountName = IdParsingUtils.getValueFromIdByName(id, "StorageAccounts");
        AccountsInner client = this.inner();
        return client.getStorageAccountAsync(resourceGroupName, accountName, storageAccountName);
    }

    private Observable<BlobContainerInner> getBlobContainerInnerUsingAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "accounts");
        String storageAccountName = IdParsingUtils.getValueFromIdByName(id, "StorageAccounts");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "Containers");
        AccountsInner client = this.inner();
        return client.getStorageContainerAsync(resourceGroupName, accountName, storageAccountName, containerName);
    }

    private Observable<DataLakeStoreAccountInfoInner> getDataLakeStoreAccountInfoInnerUsingAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "accounts");
        String dataLakeStoreAccountName = IdParsingUtils.getValueFromIdByName(id, "DataLakeStoreAccounts");
        AccountsInner client = this.inner();
        return client.getDataLakeStoreAccountAsync(resourceGroupName, accountName, dataLakeStoreAccountName);
    }

    @Override
    public Observable<StorageAccountInfo> getStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName) {
        AccountsInner client = this.inner();
        return client.getStorageAccountAsync(resourceGroupName, accountName, storageAccountName)
        .map(new Func1<StorageAccountInfoInner, StorageAccountInfo>() {
            @Override
            public StorageAccountInfo call(StorageAccountInfoInner inner) {
                return wrapStorageAccountInfoModel(inner);
            }
       });
    }

    @Override
    public Observable<StorageAccountInfo> listStorageAccountsAsync(final String resourceGroupName, final String accountName) {
        AccountsInner client = this.inner();
        return client.listStorageAccountsAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<StorageAccountInfoInner>, Iterable<StorageAccountInfoInner>>() {
            @Override
            public Iterable<StorageAccountInfoInner> call(Page<StorageAccountInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageAccountInfoInner, StorageAccountInfo>() {
            @Override
            public StorageAccountInfo call(StorageAccountInfoInner inner) {
                return wrapStorageAccountInfoModel(inner);
            }
        });
    }

    @Override
    public Completable deleteStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName) {
        AccountsInner client = this.inner();
        return client.deleteStorageAccountAsync(resourceGroupName, accountName, storageAccountName).toCompletable();
    }

    @Override
    public Completable updateStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName, AddStorageAccountParameters parameters) {
        AccountsInner client = this.inner();
        return client.updateStorageAccountAsync(resourceGroupName, accountName, storageAccountName, parameters).toCompletable();
    }

    @Override
    public Observable<BlobContainer> getStorageContainerAsync(String resourceGroupName, String accountName, String storageAccountName, String containerName) {
        AccountsInner client = this.inner();
        return client.getStorageContainerAsync(resourceGroupName, accountName, storageAccountName, containerName)
        .map(new Func1<BlobContainerInner, BlobContainer>() {
            @Override
            public BlobContainer call(BlobContainerInner inner) {
                return wrapBlobContainerModel(inner);
            }
       });
    }

    @Override
    public Observable<BlobContainer> listStorageContainersAsync(final String resourceGroupName, final String accountName, final String storageAccountName) {
        AccountsInner client = this.inner();
        return client.listStorageContainersAsync(resourceGroupName, accountName, storageAccountName)
        .flatMapIterable(new Func1<Page<BlobContainerInner>, Iterable<BlobContainerInner>>() {
            @Override
            public Iterable<BlobContainerInner> call(Page<BlobContainerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BlobContainerInner, BlobContainer>() {
            @Override
            public BlobContainer call(BlobContainerInner inner) {
                return wrapBlobContainerModel(inner);
            }
        });
    }

    @Override
    public Observable<SasTokenInfo> listSasTokensAsync(final String resourceGroupName, final String accountName, final String storageAccountName, final String containerName) {
        AccountsInner client = this.inner();
        return client.listSasTokensAsync(resourceGroupName, accountName, storageAccountName, containerName)
        .flatMapIterable(new Func1<Page<SasTokenInfoInner>, Iterable<SasTokenInfoInner>>() {
            @Override
            public Iterable<SasTokenInfoInner> call(Page<SasTokenInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SasTokenInfoInner, SasTokenInfo>() {
            @Override
            public SasTokenInfo call(SasTokenInfoInner inner) {
                return new SasTokenInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DataLakeStoreAccountInfo> getDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName) {
        AccountsInner client = this.inner();
        return client.getDataLakeStoreAccountAsync(resourceGroupName, accountName, dataLakeStoreAccountName)
        .map(new Func1<DataLakeStoreAccountInfoInner, DataLakeStoreAccountInfo>() {
            @Override
            public DataLakeStoreAccountInfo call(DataLakeStoreAccountInfoInner inner) {
                return wrapDataLakeStoreAccountInfoModel(inner);
            }
       });
    }

    @Override
    public Observable<DataLakeStoreAccountInfo> listDataLakeStoreAccountsAsync(final String resourceGroupName, final String accountName) {
        AccountsInner client = this.inner();
        return client.listDataLakeStoreAccountsAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<DataLakeStoreAccountInfoInner>, Iterable<DataLakeStoreAccountInfoInner>>() {
            @Override
            public Iterable<DataLakeStoreAccountInfoInner> call(Page<DataLakeStoreAccountInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataLakeStoreAccountInfoInner, DataLakeStoreAccountInfo>() {
            @Override
            public DataLakeStoreAccountInfo call(DataLakeStoreAccountInfoInner inner) {
                return wrapDataLakeStoreAccountInfoModel(inner);
            }
        });
    }

    @Override
    public Completable deleteDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName) {
        AccountsInner client = this.inner();
        return client.deleteDataLakeStoreAccountAsync(resourceGroupName, accountName, dataLakeStoreAccountName).toCompletable();
    }

}
