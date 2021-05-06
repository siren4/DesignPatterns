package com.siren.liu.sample.base.bridge;

import androidx.collection.ArrayMap;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;

public abstract class BaseBridgeHandler {
    private ArrayMap<String, Method> registerMethods = new ArrayMap();

    public void registerMethod(@NotNull Class<?>... clazz) {
        for (Class clz : clazz) {
            Method[] methods = clz.getMethods();
            for (Method method : methods) {
                registerMethods.put(method.getName(), method);
            }
        }
    }

    public boolean hasMethod(@NotNull String method) {
        return registerMethods.containsKey(method);
    }

    public <T> T invoke(@NotNull String method, Object obj, Object... parameter) {
        try {
            return (T) registerMethods.get(method).invoke(obj, parameter);
        } catch (Exception e) {
            throw new NotFoundMethodException(e.getMessage());
        }
    }

    public static class NotFoundMethodException extends RuntimeException {
        public NotFoundMethodException(String message) {
            super(message);
        }
    }
}


