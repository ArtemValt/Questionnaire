package com.opencode.practice.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Artem
 */

@Configuration
public class MinioConfig {
    @Value("${minio.access.name}")
    String accessKey;
    @Value("${minio.access.secret}")
    String accessSecret;
    @Value("${minio.url}")
    String minioUrl;

    @Bean
    public MinioClient generateMinioClient() {
        try {
            MinioClient minioClient = MinioClient.builder().endpoint(minioUrl)
                    .credentials(accessKey, accessSecret).build();
            return minioClient;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}