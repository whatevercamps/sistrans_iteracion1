package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class ProductoBase
{	
	

	
	/**
	 * Id del producto.
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre del producto.
	 */
	@JsonProperty(value="nombre")
	private String nombre;
	
	
	@JsonProperty(value = "descripcionEspaniol")
	private String descripcionEspaniol;
	
	/**
	 * Descripcion en Ingl�s del producto.
	 */
	@JsonProperty(value = "descripcionIngles")
	private String descripcionIngles;
	
	@JsonProperty(value = "categoria")
	private String categoria;
	
	public ProductoBase() {
		
	}
	
	public ProductoBase(Long id, String nombre, String descripcionEspaniol, String descripcionIngles, Integer categoria)
	{
		this.descripcionEspaniol = descripcionEspaniol;
		this.descripcionIngles = descripcionIngles;
		this.id = id;
		this.nombre = nombre;		
		this.categoria = RotondAndes.categoria[categoria - 1]; 
	}
	
	
	/**
	 * M�todo que obtiene el ID.
	 * @return Long, ID de este Producto.
	 */
	public Long getId()
	{
		return this.id;
	}
	/**
	 * M�todo que establece el ID de este producto.
	 * @param id Long, ID del producto.
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * M�todo que obtiene el nombre del producto.
	 * @return String, nombre de este producto.
	 */
	public String getNombre()
	{
		return this.nombre;
	}
	/**
	 * M�todo que establece el nombre de este producto.
	 * @param nombre String, Nombre nuevo del producto.
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que obtiene la descripci�n de este producto en espa�ol.
	 * @return String, descripci�n del producto en espa�ol.
	 */
	public String getDescripcionEspaniol()
	{
		return this.descripcionEspaniol;
	}
	/**
	 * M�todo que establece la descripci�n de este producto en espa�ol.
	 * @param descripcionEspaniol String, Nueva descripci�n del producto en espa�ol.
	 */
	public void setDescripcionEspaniol(String descripcionEspaniol)
	{
		this.descripcionEspaniol = descripcionEspaniol;
	}
	/**
	 * M�todo que obtiene la descripci�n de este producto en ingles.
	 * @return String, descripci�n del producto en espa�ol.
	 */
	public String getDescripcionIngles()
	{
		return this.descripcionIngles;
	}
	/**
	 * M�todo que establece la descripci�n de este producto en espa�ol.
	 * @param descripcionEspaniol String, Nueva descripci�n del producto en ingles.
	 */
	public void setDescripcionIngles(String descripcionIngles)
	{
		this.descripcionIngles = descripcionIngles;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Integer categoria) {
		this.categoria = RotondAndes.categoria[categoria - 1];
	}
	
}
