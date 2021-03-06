package com.mokhs00.spring_boot_monorepo_template.common.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mokhs00.spring_boot_monorepo_template.common.error.ErrorCode;
import com.mokhs00.spring_boot_monorepo_template.common.response.ErrorResponse;
import com.mokhs00.spring_boot_monorepo_template.user.domain.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtEntityNotFoundExceptionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (UserNotFoundException exception) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);

            ErrorResponse errorResponse = ErrorResponse.of(ErrorCode.INVALID_TOKEN);

            ObjectMapper objectMapper = new ObjectMapper();

            response.getWriter()
                    .write(objectMapper.writeValueAsString(errorResponse));

        }
    }
}
