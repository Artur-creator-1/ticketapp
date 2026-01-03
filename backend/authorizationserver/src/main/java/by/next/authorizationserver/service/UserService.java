package by.next.authorizationserver.service;

import by.next.authorizationserver.model.User;

public interface UserService {
    User getUserByEmail(String email);
    void resetLoginAttempts(String userUuid);
    void updateLoginAttempts(String email);
    boolean verifyQrCode(String userId, String code);
    void setLastLogin(Long userId);
    void addLoginDevice(Long userId, String deviceName, String client, String ipAddress);
}
