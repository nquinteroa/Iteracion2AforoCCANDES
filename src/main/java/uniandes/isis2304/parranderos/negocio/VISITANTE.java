package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

import oracle.sql.TIMESTAMP;

public class VISITANTE implements VOVISITANTE{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * La cedula del visitante
	 */
	private float CEDULA;
	
	/**
	 * El nombre del visitante
	 */
	private String NOMBRE;
	
	/**
	 * Telefono del visitante
	 */
	private float TELEFONO;
	
	/**
	 * El nombre de un contacto del visitante
	 */
	private String NOMBRE_CONTACTO;
	/**
	 * Telefono de un contacto del visitante
	 */
	private float TELEFONO_CONTACTO;
	/**
	 * Posible codigo QR del visitante
	 */
	private String CODIGO_QR;
	/**
	 * El correo del visitante
	 */
	private String CORREO;
	/**
	 * Horario dispoible del usuario en el centro comercial
	 */
	private TIMESTAMP HORARIO_DISPONIBLE;
	/**
	 * El tipo de visitante
	 */
	private String TIPO_VISITANTE;
	/**
	 * El id del espacio
	 */
	private long IDESPACIO;
	
}
