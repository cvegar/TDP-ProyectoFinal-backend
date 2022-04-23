package com.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.colegio.entity.Opcion;
import com.colegio.entity.Rol;
import com.colegio.entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	@Query("Select x from Usuario x where x.login like :usu and x.password like :pass")
	public abstract Usuario login(@Param(value = "usu") String usu,@Param(value = "pass") String pass);
	
	@Query("Select p from Opcion p, RolHasOpcion pr, Rol r, UsuarioHasRol u where "
			+ " p.idOpcion = pr.opcion.idOpcion and "
			+ " pr.rol.idRol = r.idRol and "
			+ " r.idRol = u.rol.idRol and "
			+ " u.usuario.idUsuario = :var_idUsuario")
	public abstract List<Opcion> traerEnlacesDeUsuario(@Param("var_idUsuario") int idUsuario);

	@Query("Select r from Rol r, UsuarioHasRol u where "
			+ " r.idRol = u.rol.idRol and "
			+ " u.usuario.idUsuario = :var_idUsuario")
	public abstract List<Rol> traerRolesDeUsuario(@Param("var_idUsuario")int idUsuario);
	
	@Query("select x from Usuario x where x.nombres like %:var_parm%")
	public abstract List<Usuario> listaPorNombre(@Param("var_parm") String nombre);

	@Query("select x from Usuario x where x.idUsuario = :id")
	public abstract Usuario listaPorCodigo(@Param("id") int codigo);

	
	@Query("Select x from Usuario x where idTipoUsuario = 3 and estado like 'activo'")
	public abstract List<Usuario> listarAlumnos() ;
	
	@Query("Select x from Usuario x where idTipoUsuario = 2 and estado like 'activo'")
	public abstract List<Usuario> listarDocentes() ;
}
