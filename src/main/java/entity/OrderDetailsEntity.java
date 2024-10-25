package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDetailsEntity {
    private Integer orderId;
    private Integer productId;
    private LocalDate date;
    private Integer qty;
    private Double discount;
}
