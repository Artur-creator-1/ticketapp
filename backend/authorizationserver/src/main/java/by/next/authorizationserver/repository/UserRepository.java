package by.next.authorizationserver.repository;

import by.next.authorizationserver.model.User;

public interface UserRepository {
    User getUserByUuid(String userId);
    User getUserByEmail(String email);
    void resetLoginAttempts(String userUuid);
    void updateLoginAttempts(String email);
    void setLastLogin(Long userId);
    void addLoginDevice(Long userId, String device, String client, String ipAddress);
}