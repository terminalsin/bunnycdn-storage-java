package net.bunny.api;

import net.bunny.api.storage.StorageAPI;

public interface BunnyClient {
    /**
     * Provides a new Storage API manager which handles all connection linked
     * to BunnyCDN storage. This simplifies a lot of the handling and is just
     * overall a cute thing.
     * @param region Region for the CDN
     * @return Storage API manager
     */
    StorageAPI getStorageAPI(String region);
}
