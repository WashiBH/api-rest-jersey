package com.apirest.ws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.apirest.ws.vo.VOUsuario;

@Path("/")
public class serviceLogin {
	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo) {
		vo.setUserValido(false);
		if(vo.getUsuario().equals("Java") && vo.getPassword().equals("12345")) {
			vo.setUserValido(true);
		}
		return vo;
	}
	@GET
	@Path("/obtieneUsuario")
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario obtenerUsuario() {
		VOUsuario vo =new VOUsuario();
		vo.setUsuario("Washi Blas");
		vo.setPassword("12345");
		vo.setUserValido(true);
		return vo;
	}
}
