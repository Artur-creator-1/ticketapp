package com.example.ticketservice.utils;

import dev.samstevens.totp.code.HashingAlgorithm;
import dev.samstevens.totp.exceptions.QrGenerationException;
import dev.samstevens.totp.qr.QrData;
import dev.samstevens.totp.qr.ZxingPngQrGenerator;
import dev.samstevens.totp.secret.DefaultSecretGenerator;
import com.example.ticketservice.exception.ApiException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;

import static dev.samstevens.totp.util.Utils.getDataUriForImage;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class TicketUtils {

    public static Supplier<String> randomUUID = () -> UUID.randomUUID().toString();

    public static String getFileUri(String filename) {
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("/ticket/files/" + filename).toUriString();
    }
}