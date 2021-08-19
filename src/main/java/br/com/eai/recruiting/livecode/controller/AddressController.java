package br.com.eai.recruiting.livecode.controller;

import br.com.eai.recruiting.livecode.request.AddressRequest;
import br.com.eai.recruiting.livecode.request.AddressesRequest;
import br.com.eai.recruiting.livecode.response.AddressResponse;
import br.com.eai.recruiting.livecode.response.AddressesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    /*
        FIXME: Cadastro de um novo endereço. 
        
        > Cadastrar um novo endereço, integrando sua busca por cep conforme a versao abaixo:
        
         1 - viacep => https://viacep.com.br/
         2 - correiosapi => https://correiosapi.apphb.com/
         
         PS.: No caso da api dos correios fora do ar, favor utilizar o mock abaixo:
         
         mock-correios: https://47a87708-cae8-4787-b06b-41a457166084.mock.pstmn.io/api/correios-mock
     */
    @PostMapping
    public AddressResponse create(AddressRequest addressRequest) {

    	// TODO
    	
        return new AddressResponse();
    }

    /*
        FIXME: Criacao de endereços em lote
        
        > O servico devera cadastrar os enderecos recebidos na lista, validando a duplicidade de enderecos no request.
          No caso de duplicidade, devera retornar ERRO.
        
        PS.: A duplicidade se dara pela combinacao do cep e numero.
     */
    @PostMapping("/create_batch")
    public AddressesResponse creationBatch(AddressesRequest addressesRequest){

    	// TODO
    	
        return new AddressesResponse();
    }


    /*
        FIXME: Busca de enderecos paginada.
        
        > Realizar busca paginada por todos os enderecos cadastrados na base de dados, filtrando pelo CEP informado.
        
        PS.: A filtragem se dara caso seja informado um cep por parametro.
     */
    @GetMapping
    public AddressesResponse getAllByZipCode(String zipCode,
                                    Integer pageCurrent,
                                    Integer limit) {
    	
    	// TODO
    	
        return new AddressesResponse();
    }

}
