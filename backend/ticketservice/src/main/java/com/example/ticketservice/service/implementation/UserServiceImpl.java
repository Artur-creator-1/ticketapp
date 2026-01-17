package com.example.ticketservice.service.implementation;

import com.example.ticketservice.domain.Response;
import com.example.ticketservice.exception.ApiException;
import com.example.ticketservice.handler.RestClientInterceptor;
import com.example.ticketservice.model.User;
import com.example.ticketservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

import static com.example.ticketservice.utils.RequestUtils.convertResponse;
import static com.example.ticketservice.utils.RequestUtils.convertResponseList;
import static java.util.Map.of;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final RestClient restClient;

    public UserServiceImpl() {
        this.restClient = RestClient.builder()
                .requestFactory(new HttpComponentsClientHttpRequestFactory())
                .baseUrl("http://localhost:8085")
                //.defaultUriVariables(Map.of("some variable", "some value"))
                //.defaultHeader("AUTHORIZATION", "Bearer some value")
                .requestInterceptor(new RestClientInterceptor())
                //.requestInitializer(null)
                .build();
    }

    @Override
    public User getTicketUser(String ticketUuid) {
        try {
            var response = restClient.get().uri("/user/ticket/" + ticketUuid).retrieve().body(Response.class);
            return convertResponse(response, User.class, "user");
        } catch (AccessDeniedException exception) {
            log.error(exception.getMessage());
            throw new ApiException(exception.getMessage());
        } catch (Exception exception) {
            log.error(exception.getMessage());
            throw new ApiException("An error occurred. Please try again.");
        }
    }

    @Override
    public User getUserByUuid(String userUuid) {
        try {
            var response = restClient.get().uri("/user/profile").retrieve().body(Response.class);
            return convertResponse(response, User.class, "user");
        } catch (AccessDeniedException exception) {
            log.error(exception.getMessage());
            throw new ApiException(exception.getMessage());
        } catch (Exception exception) {
            log.error(exception.getMessage());
            throw new ApiException("An error occurred. Please try again.");
        }
    }

    @Override
    public User getAssignee(String ticketUuid) {
        try {
            var response = restClient.get().uri("/user/assignee/" + ticketUuid).retrieve().body(Response.class);
            return convertResponse(response, User.class, "user");
        } catch (AccessDeniedException exception) {
            log.error(exception.getMessage());
            throw new ApiException(exception.getMessage());
        } catch (Exception exception) {
            log.error(exception.getMessage());
            throw new ApiException("An error occurred. Please try again.");
        }
    }

    @Override
    public List<User> getTechSupports() {
        try {
            var response = restClient.get().uri("/user/techsupports").retrieve().body(Response.class);
            return convertResponseList(response, User.class, "techSupports");
        } catch (AccessDeniedException exception) {
            log.error(exception.getMessage());
            throw new ApiException(exception.getMessage());
        } catch (Exception exception) {
            log.error(exception.getMessage());
            throw new ApiException("An error occurred. Please try again.");
        }
    }
}