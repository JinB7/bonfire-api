package io.github.jinb7.gamecuration.global.common;

import com.fasterxml.jackson.annotation.JsonInclude;

public record ApiResponse<T>(
        boolean success,
        T data,
        @JsonInclude(JsonInclude.Include.NON_NULL)String message) {

    public static <T> ApiResponse<T> ok(T data){
        return new ApiResponse<>(true, data, null);
    }

    public static <T> ApiResponse<T> ok(T data, String message){
        return new ApiResponse<>(true, data, message);
    }
}
