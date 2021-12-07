CREATE TABLE recommendations
(
    recommendation_id BIGINT   AUTO_INCREMENT    NOT NULL,
    dest_id           BIGINT       NULL,
    author            VARCHAR(255) NULL,
    rate              INT          NULL,
    content           VARCHAR(255) NULL,
    CONSTRAINT pk_recommendations PRIMARY KEY (recommendation_id)
);