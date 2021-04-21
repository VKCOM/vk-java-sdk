package com.vk.api.sdk.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Anton Tsivarev on 29.03.16.
 */
public class Utils {

    public static ParameterizedType buildParametrizedType(Type raw, Type... typeArguments) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return typeArguments;
            }

            @Override
            public Type getRawType() {
                return raw;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }

    public static String coverAccessToken(String token) {
        return String.format("%s...%s",
                token.substring(0, 3),
                token.substring(token.length() - 3));
    }
}
