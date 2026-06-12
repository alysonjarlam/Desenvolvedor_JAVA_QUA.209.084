package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageble;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;

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

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;


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

    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model) {
        model.AddAtribute("categorias", categoriaRepository.findAll());
        return "listar_produtos";
    }
      @GetMapping("/listarClientes")
    public String listarClientes(Model model, @RequestParam(defaultValue = "0") int pagina) {
        Pageable pageable = PageRequest.of(pagina, 50, Sort.by("codigoCliente").ascending());
        Page<Cliente> clientes = clienteRepository.findAll(pageable);

        model.addAttribute("clientes", clientes);
        model.addAttribute("paginaAtual", pagina);
        return "listar_clientes";
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
    
    @GetMapping("/atualizarCategoria")
    public String atualizarCategoria(@RequestParam("codigoCategoria")Long codigoCategoria, Model model){
        Categoria categoria = categoriaRepository.findById(CodigoCategoria).orElse(null);
        model.addAttribute("categora", categoria);
        return "atualizar_categoria";
    }

    @PostMapping("/atualizarCategoria")
    public String atualizarCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
        return "atualizar_categoria_sucesso";
    }
    @GetMapping("/atualizarProduto")
    public String atualizarProduto(@RequestParam("codigoProduto")long codigoProduto, Moddel model){
        produto produto = produtoRepository.findId(codigoProduto).orElse(null);
        model.addAttribute("produto", produto);
        model.addAttribute("categoria", categoriaRepository.findAll());
        return "atualizar_produto";
    }
    @PostMapping("/atualizarProduto")
    public String atualizarProduto(produto produto, @RequestParam("codigoProduto")Long categoria{
        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "atualizar_produto_sucesso"
    })

}
