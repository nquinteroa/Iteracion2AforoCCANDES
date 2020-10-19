

package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;


public interface VOVISITA 
{
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * @return the fECHAYHORA_OP
	 */
	public Timestamp getFECHAYHORA_OP();
	/**
	 * @return the tIPO_OP
	 */
	public String getTIPO_OP();
	/**
	 * @return the hORAFIN_OP
	 */
	public Timestamp getHORAFIN_OP();
	/**
	 * @return the iDLECTOR
	 */
	public long getIDLECTOR();
	/**
	 * @return the iDCARNET
	 */
	public long getIDCARNET();
	/**
	 * @return the iDESPACIO
	 */
	public long getIDESPACIO();
}
