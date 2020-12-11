package com.vk.api.sdk.objects;

import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.exceptions.RequiredFieldException;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

public interface Validable {

    default boolean validateRequired() throws RequiredFieldException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = this.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            Annotation annotation = field.getAnnotation(Required.class);
            if (annotation != null) {
                Required required = (Required) annotation;
                if (required.value()) {
                    field.setAccessible(true);
                    if (field.get(this) == null) {
                        throw new RequiredFieldException(this.getClass().getName() + "." + field.getName());
                    }
                }
            }
        }

        return true;
    }
}
