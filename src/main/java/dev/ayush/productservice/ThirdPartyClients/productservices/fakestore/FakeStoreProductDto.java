package dev.ayush.productservice.ThirdPartyClients.productservices.fakestore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {

    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}


