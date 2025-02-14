package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Order {
    private Integer orderId;
    private LocalDate date;
    private  String custId;
}
