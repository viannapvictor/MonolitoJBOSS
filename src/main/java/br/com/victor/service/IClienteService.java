/**
 * 
 */
package br.com.victor.service;

import br.com.victor.domain.Cliente;
import br.com.victor.exceptions.DAOException;
import br.com.victor.services.generic.IGenericService;

/**
 * @author victor
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
