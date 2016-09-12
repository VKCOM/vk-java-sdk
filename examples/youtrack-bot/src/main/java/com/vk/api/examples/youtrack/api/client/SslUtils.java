package com.vk.api.examples.youtrack.api.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/**
 * Created by Anton Tsivarev on 08.09.16.
 */
public class SslUtils {

    static KeyStore getStore(final String type, final String storeFileName, final String password) throws
            KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {

        final KeyStore store = KeyStore.getInstance(type);
        try (InputStream inputStream = new FileInputStream(storeFileName)) {
            store.load(inputStream, password.toCharArray());
        }

        return store;
    }
}
