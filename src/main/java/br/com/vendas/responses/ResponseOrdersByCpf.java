package br.com.vendas.responses;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseOrdersByCpf {
	Integer orderId;
	List<ResponseOrderItems> orderItemsList; 
}
 