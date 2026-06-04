package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.javalanches.models.Categoria;
import com.crud.javalances.models.Endereco;
import com.crud.javalanches.models.Produto;
import com.crud.javalances.models.Cliente;
import com.crud.javalanches.repository.CategoriaRepository;
import com.crud.javalances.repository.EnderecoRepository;
import com.crud.javalances.repository.ClienteRepository;
import com.crud.javalanches.repository.ProdutoRepository;


@Controller
public class javalanchesController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/novaCategoria")
    public String novaCategoria() {
        return "nova_categoria";        
    }
    @PostMapping("/novaCategoria")
    public String novaCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
        return "categoria_sucesso";

    }
    @GetMapping("/novoProduto")
    public String novoProduto(Model model) {
        model.addAttribute("Categoria", categoriaRepository.findAll());
        return "novo_produto";
    }
    
    @PostMapping("/novoProduto")
    public String novoProduto(Produto produto, @RequestParam("catedoriaID") Long categoriaID) {
        Categoria categoria = categoriaRepository.findById(categoriaID).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "produto_sucesso"
    }

    @GetMapping("listarProdutos")
    public String listarProdutos(Model model) {
        model.AddAtribute("categorias", categoriaRepository.findAll());
        return "listar_produtos";
    }
    @GetMapping("/novoCliente")
    public String novoCliente() {
        return "novo_cliente";
    }    

     @PostMapping("/novoCliente")
    public String novoCliente(Cliente cliente, Endereco endereco) {
        cliente.getEnderecos().add(endereco);
        endereco.getClientes().add(cliente);

        enderecoRepository.save(endereco);
        clienteRepository.save(cliente);
        return "cliente_sucesso";
    }
}
