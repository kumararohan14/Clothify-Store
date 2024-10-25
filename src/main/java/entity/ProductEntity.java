package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity {
    private Integer productId;
    private String Description;
    private String productName;
    private LocalDate date;
    private Double cost_price;
    private Double retails_price;
    private Integer qty;
    private Integer catogoryId;
    private Integer brandId;
    private Integer sizeId;
    private Integer colourId;
    private Integer suppilerId;
    private String status;
    private String barcode;
}
