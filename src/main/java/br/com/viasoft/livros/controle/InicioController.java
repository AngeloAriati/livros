package br.com.viasoft.livros.controle;

import br.com.viasoft.livros.model.Cliente;
import br.com.viasoft.livros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InicioController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String getInicio(Model model){

        List<Cliente> cliente = clienteRepository.findAll();
        model.addAttribute("cliente", cliente );

        return "cliente";
    }

}
