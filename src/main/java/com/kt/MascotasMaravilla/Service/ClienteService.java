package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.ClienteDTO;
import com.kt.MascotasMaravilla.Mapper.ClienteMapper;
import com.kt.MascotasMaravilla.Models.Cliente;
import com.kt.MascotasMaravilla.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    public void crear(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        clienteRepository.save(cliente);
    }

    public List<ClienteDTO> lista() {
        List<Cliente> clienteList = clienteRepository.findAll();
        return clienteMapper.toList(clienteList);
    }

    public ClienteDTO listaID(Integer ID) {
        Cliente cliente = clienteRepository.findById(ID).orElseThrow(() -> new RuntimeException("No encontrada lista de clientess"));
        return clienteMapper.toDTO(cliente);
    }

    public ClienteDTO editar(Integer ID, ClienteDTO clienteDTO) {
        Cliente cliente = clienteRepository.findById(ID).orElseThrow(() -> new RuntimeException("No encontre articuloos grr"));
        clienteMapper.updateCliente(clienteDTO, cliente);
        Cliente actualizado = clienteRepository.save(cliente);
        return clienteMapper.toDTO(actualizado);
    }

    public void borrar(Integer ID) {
        if (!clienteRepository.existsById(ID)) {
            throw new RuntimeException("No quiero borrar.");
        }
        clienteRepository.deleteById(ID);
    }
}
