package org.example.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse<T> {
    private T body;
    private HttpStatus status;
    private String errorMessage;

    public static <T> ApiResponse<T> ok(T body){
        ApiResponse<T> apiResponse = new ApiResponse<>();
        apiResponse.setBody(body);
        apiResponse.setStatus(HttpStatus.OK);
        return apiResponse;
    }

}
