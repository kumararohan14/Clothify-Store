package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierEntity {
    private Integer supId;
    private String supName;
    private String supNumber;
    private String productId;
    private String companyName;
    private String email;

}
